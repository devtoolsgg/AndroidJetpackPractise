package com.example.jetpack_practise_04.viewBinding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jetpack_practise_04.R
import com.example.jetpack_practise_04.databinding.ItemRowTextBinding

class CustomViewAdapter (private val dataSet: ArrayList<String>): RecyclerView.Adapter<CustomViewAdapter.ViewHolder>() {


    // viewbinding 사용

    class ViewHolder(binding: ItemRowTextBinding): RecyclerView.ViewHolder(binding.root){

        val myText: TextView = binding.tvItem


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewAdapter.ViewHolder {

        //val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row_text,parent,false)

        // viewBinding 사용
        val view = ItemRowTextBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: CustomViewAdapter.ViewHolder, position: Int) {

        holder.myText.text = dataSet[position]


    }

    override fun getItemCount(): Int {
        return dataSet.size
    }


}