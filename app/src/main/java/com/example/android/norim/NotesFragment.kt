package com.example.android.norim

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.android.norim.databinding.FragmentNotesBinding


class NotesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentNotesBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_notes, container, false
        )

        binding.addButton.setOnClickListener { view ->
            view.findNavController().navigate(R.id.addFragment)
        }

//        binding.addButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_notesFragment_to_addFragment))

        return binding.root
    }
}






//binding.addButton.setOnClickListener {
//    view
//
//    Toast.makeText(activity, "Click!", Toast.LENGTH_SHORT).show();
//    Log.d(TAG, " add button was clicked");


