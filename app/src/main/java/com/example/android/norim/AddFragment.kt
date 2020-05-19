package com.example.android.norim

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
//import com.example.android.norim.databinding.FragmentAddBinding


class AddFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add, container, false)
    }
}


//class AddFragment : Fragment() {
//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
//                              savedInstanceState: Bundle?): View? {
//        val binding: FragmentAddBinding = DataBindingUtil.inflate(
//            inflater, R.layout.fragment_add, container, false)
////        binding.aButton.setOnClickListener (Navigation.createNavigateOnClickListener(R.id.action_addFragment_to_testFragment))
//        return binding.root
//    }
//}

