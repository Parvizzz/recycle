package com.example.m

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapterr(val array :ArrayList<Myclass>):RecyclerView.Adapter<Adapterr.MyVuewHolder>() {
    class MyVuewHolder(item:View):RecyclerView.ViewHolder(item){
        val image: ImageView = item.findViewById(R.id.image)
        val name:TextView = item.findViewById(R.id.tex)
        val family:EditText = item.findViewById(R.id.tex2)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyVuewHolder {
        val myViewHolder =
        LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return MyVuewHolder(myViewHolder)
    }

    override fun onBindViewHolder(holder: MyVuewHolder, position: Int) {
        holder.name.text = array[position].name
        holder.family.setText(array[position].familiya)
    }

    override fun getItemCount(): Int {
        return array.size
    }
}