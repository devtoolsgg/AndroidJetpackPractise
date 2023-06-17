package com.example.jetpack_practise_06

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.jetpack_practise_06.databinding.FragmentTestBinding


class TestFragment : Fragment() {
    // TODO: Rename and change types of parameters

    val TAG = "TestFragment"

    private lateinit var binding: FragmentTestBinding
    private lateinit var viewModel: TestFragmentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"onCreate")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG,"onCreateView")

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_test, container, false)

        // viewmodel 선언
        viewModel = ViewModelProvider(this).get(TestFragmentViewModel::class.java)





        binding.btnMinus.setOnClickListener{
//            countValue--
//            binding.tvCount.text = countValue.toString()

            viewModel.minus()
            binding.tvCount.text = viewModel.getCount().toString()


        }

        binding.btnPlus.setOnClickListener{
//            countValue++
//            binding.tvCount.text = countValue.toString()

            viewModel.plus()
            binding.tvCount.text = viewModel.getCount().toString()

        }




        return binding.root


    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop")
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