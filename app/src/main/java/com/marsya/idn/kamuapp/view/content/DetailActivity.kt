package com.marsya.idn.kamuapp.view.content

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.content.Intent
import com.bumptech.glide.Glide
import com.marsya.idn.kamuapp.R
import com.marsya.idn.kamuapp.model.ResponseMain
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.item_row_kamu.*

class DetailActivity : AppCompatActivity() {

    private var item : ResponseMain? = null

    companion object{
        const val EXTRA_PHOTO = "extra_photo"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.title="Detail MakeUp"

        showMakeUpDetail()

        initView()
    }

    private fun initView() {
        item = intent?.getParcelableExtra("data")

        tv_detail_name.setText(item?.Name)
        tv_description.setText(item?.Description)
        tv_detail_harga.setText(item?.Price)
    }

    private fun showMakeUpDetail() {
        val tvImageReceived : ImageView = findViewById(R.id.iv_photo)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)
        tvImageReceived.setImageResource(photo)
    }

}