package com.example.jetpack_practise_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jetpack_practise_11.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    // Fragment 에서의 LiveData & viewLifecycleOwner

    private lateinit var binding: ActivityMainBinding



    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root



        binding.btn1.setOnClickListener{

            val transaction1 = manager.beginTransaction()
            val fragment1 = BlankFragment1()

            transaction1.replace(R.id.fcv_main,fragment1)
            transaction1.addToBackStack(null)
            transaction1.commit()

        }

        binding.btn2.setOnClickListener{

            val transaction2 = manager.beginTransaction()
            val fragment2 = BlankFragment2()

            transaction2.replace(R.id.fcv_main,fragment2)
            transaction2.addToBackStack(null)
            transaction2.commit()

        }

        setContentView(view)






    }
}