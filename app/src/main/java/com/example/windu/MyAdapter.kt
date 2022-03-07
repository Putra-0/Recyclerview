package com.example.windu

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(cnx: Context, dat: ArrayList<Data>) : RecyclerView.Adapter<MyAdapter.Myviewholder>() {
    val ctx=cnx;
    val dat=dat
    class Myviewholder(v:View):RecyclerView.ViewHolder(v) {
        var nama=v.findViewById(R.id.nama) as TextView
        var harga=v.findViewById(R.id.harga) as TextView
        var gambar=v.findViewById(R.id.gambar) as ImageView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false)
        return Myviewholder(itemView)
    }

    override fun onBindViewHolder(holder: Myviewholder, position: Int) {
        val x=dat[position]
        holder.nama.setText(x.nama)
        holder.harga.setText(x.harga)
        holder.gambar.setImageResource(x.gambar)
    }

    override fun getItemCount(): Int {
        return dat.size
    }
}