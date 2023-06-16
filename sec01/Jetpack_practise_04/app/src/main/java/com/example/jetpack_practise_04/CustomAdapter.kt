package com.example.jetpack_practise_04

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val dataSet: ArrayList<String>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){

        val myText: TextView


        init{

            myText = view.findViewById(R.id.tv_item)

        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row_text,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {

        holder.myText.text = dataSet[position]


    }

    override fun getItemCount(): Int {
         return dataSet.size
    }


}