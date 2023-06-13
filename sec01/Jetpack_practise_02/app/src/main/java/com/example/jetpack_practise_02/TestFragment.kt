package com.example.jetpack_practise_02

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.jetpack_practise_02.databinding.FragmentTestBinding



class TestFragment : Fragment() {


    private lateinit var binding: FragmentTestBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // 프래그먼트에서의 databinding

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_test, container, false)

        binding.tvFragmentText.text = "i am databinding"


        return binding.root
    }


}