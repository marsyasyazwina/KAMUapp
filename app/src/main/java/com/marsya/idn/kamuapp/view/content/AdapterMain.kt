package com.marsya.idn.kamuapp.view.content

import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.marsya.idn.kamuapp.R
import com.marsya.idn.kamuapp.model.ResponseMain
import kotlinx.android.synthetic.main.item_row_kamu.view.*

class AdapterMain (
    val data : List<ResponseMain?>,
    val itemClick: OnClickListener
) : RecyclerView.Adapter<AdapterMain.ViewHolder>() {

    inner class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: ResponseMain){
            view.tv_name.text = item.Name

            view.setOnClickListener{
                itemClick.description(item)
            }
        }
    }
    interface OnClickListener {
        fun description (item: ResponseMain)
    }

    override fun onBindViewHolder(holder: AdapterMain.ViewHolder, position: Int) {
        val item = data?.get(position)

        holder.bind(item!!)
    }

    override fun getItemCount(): Int = data?.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterMain.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row_kamu, parent,false)
        return ViewHolder(view)
    }
}
