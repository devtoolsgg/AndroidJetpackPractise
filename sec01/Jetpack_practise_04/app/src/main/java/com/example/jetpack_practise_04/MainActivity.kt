package com.example.jetpack_practise_04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


// ViewBinding + Adapter(Recyclerview)


class MainActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val array = ArrayList<String>()


        array.add("h")
        array.add("e")
        array.add("l")
        array.add("l")
        array.add("o")
        array.add("w")
        array.add("o")
        array.add("r")
        array.add("l")
        array.add("d")

        val customAdapter = CustomAdapter(array)

        val rvMain = findViewById<RecyclerView>(R.id.rc_main)

        rvMain.adapter = customAdapter
        rvMain.layoutManager = LinearLayoutManager(this)





    }
}