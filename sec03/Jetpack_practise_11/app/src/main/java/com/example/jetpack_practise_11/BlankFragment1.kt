package com.example.jetpack_practise_11

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.jetpack_practise_11.databinding.FragmentBlank1Binding


class BlankFragment1 : Fragment() {


    // 프래그먼트에서의 ViewBinding + LiveData


    private val TAG = "BlankFragment1"
    private var _binding: FragmentBlank1Binding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: BlankViewModel1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentBlank1Binding.inflate(inflater,container,false)
        val view = binding.root


        viewModel = ViewModelProvider(this).get(BlankViewModel1::class.java)


        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnFrag1.setOnClickListener{

            viewModel.plusCountValue()

        }

        // viewLifecycleOwner
        // fragment 에서 viewmodel observe 사용시 viewLifecycleOwner 적용
        // 프래그먼트의 고유 라이프사이클에서 발생하는 버그를 방지
        viewModel.liveCount.observe(viewLifecycleOwner,{

            binding.tvCount.text = it.toString()
        })


    }


    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG,"onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy")
    }


}