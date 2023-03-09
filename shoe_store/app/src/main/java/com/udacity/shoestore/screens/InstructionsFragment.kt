package com.udacity.shoestore.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.udacity.shoestore.databinding.InstructionsScreenLayoutBinding

class InstructionsFragment : Fragment() {

    private lateinit var binding: InstructionsScreenLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = InstructionsScreenLayoutBinding.inflate(inflater)
        //Inflate layout
        return binding.root
    }
}
