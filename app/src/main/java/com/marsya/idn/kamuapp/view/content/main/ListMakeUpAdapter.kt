package com.marsya.idn.kamuapp.view.content.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.GenericTransitionOptions.with
import com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions.with
import com.marsya.idn.kamuapp.R
import com.marsya.idn.kamuapp.data.MakeUpData
import com.squareup.picasso.Picasso
import javax.security.auth.callback.Callback

class ListMakeUpAdapter(private val listMakeUp : ArrayList<MakeUpData>)  : RecyclerView.Adapter<ListMakeUpAdapter.ListViewHolder>(){
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.iv_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_kamu, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val makeUp = listMakeUp[position]
        makeUp.photo?.let {
            Picasso.with(holder.itemView.context)
                .load(it)
                .resize(50, 50)
                .into(holder.imgPhoto)
        }
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClickedData(listMakeUp[holder.adapterPosition]) }

    }

    override fun getItemCount(): Int {
        return listMakeUp.size

    }


    interface OnItemClickCallback {
        fun onItemClickedData(data: MakeUpData)

    }
}
