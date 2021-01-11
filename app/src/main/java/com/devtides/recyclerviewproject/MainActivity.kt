package com.devtides.recyclerviewproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animalsRV.adapter = AnimalRVAdapter(DataProvider.provideData())
//        animalsRV.layoutManager = LinearLayoutManager(this)
//        animalsRV.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

        animalsRV.layoutManager = GridLayoutManager(this, 3)
    }
}