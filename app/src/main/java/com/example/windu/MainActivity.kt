package com.example.windu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rv=findViewById(R.id.recycle) as RecyclerView
        val dat= arrayListOf<Data>()

        dat.add(Data("Lip Cream Soft Matte","Rp. 37.450", R.drawable.g1))
        dat.add(Data("Cushion","Rp. 57.250", R.drawable.g2))
        dat.add(Data("BB Cream","Rp. 29.900", R.drawable.g3))
        dat.add(Data("Blush On","Rp. 37.450", R.drawable.g4))
        dat.add(Data("Primer","Rp. 68.500", R.drawable.g5))
        dat.add(Data("Highlighter","Rp. 45.000", R.drawable.g6))
        dat.add(Data("Bedak","Rp. 65.000", R.drawable.g7))
        dat.add(Data("Bronzer","Rp. 119.000", R.drawable.g8))


        rv.layoutManager=LinearLayoutManager(this)

        rv.layoutManager=GridLayoutManager(this,2)
        val aa=MyAdapter(applicationContext,dat)
        rv.adapter=aa

    }
}