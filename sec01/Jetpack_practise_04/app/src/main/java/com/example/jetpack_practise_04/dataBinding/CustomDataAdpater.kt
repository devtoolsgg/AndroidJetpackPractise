package com.example.jetpack_practise_04.dataBinding

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.jetpack_practise_04.R
import com.example.jetpack_practise_04.databinding.ItemRowTextBinding

class CustomDataAdpater  (private val dataSet: ArrayList<String>): RecyclerView.Adapter<CustomDataAdpater.ViewHolder>() {


    // databinding 사용

    class ViewHolder(binding: ItemRowTextBinding): RecyclerView.ViewHolder(binding.root){

        val myText: TextView = binding.tvItem


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomDataAdpater.ViewHolder {

        //val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row_text,parent,false)
        // val view = ItemRowTextBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        // databinding 사용
        val view = DataBindingUtil.inflate<ItemRowTextBinding>(LayoutInflater.from(parent.context),
            R.layout.item_row_text, parent,false)

        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: CustomDataAdpater.ViewHolder, position: Int) {

        holder.myText.text = dataSet[position]


    }

    override fun getItemCount(): Int {
        return dataSet.size
    }


}