package com.marsya.idn.kamuapp.view.content

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.marsya.idn.kamuapp.R
import com.marsya.idn.kamuapp.data.MakeUpData
import com.marsya.idn.kamuapp.data.MakeUpDataObject
import com.marsya.idn.kamuapp.model.ResponseMain
import com.marsya.idn.kamuapp.network.RetrofitClient
import com.marsya.idn.kamuapp.view.content.main.ListMakeUpAdapter
import com.marsya.idn.kamuapp.view.content.main.ViewModelMain
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Callback
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_kamu.setHasFixedSize(true)
        rv_kamu.layoutManager = LinearLayoutManager(this)

        RetrofitClient.instance.getPosts().enqunue(object : Callback<ArrayList<PostResponse>>(

        ))
    }
}
