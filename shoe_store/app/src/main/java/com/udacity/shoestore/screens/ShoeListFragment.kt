package com.udacity.shoestore.screens

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.ShoeListLayoutBinding
import com.udacity.shoestore.databinding.ShoeSingleLayoutBinding
import com.udacity.shoestore.models.Shoe

class ShoeListFragment : Fragment() {

    private lateinit var binding: ShoeListLayoutBinding
    private lateinit var shoeListModel: ShoesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.shoe_list_layout,
            container,
            false
        )        //Inflate layout

        shoeListModel = ViewModelProvider(this)[ShoesViewModel::class.java]

        setHasOptionsMenu(true)


        //observers

        shoeListModel.shoesList.observe(viewLifecycleOwner) { list ->
            for (shoe in list) {
                addShoeToView(container, shoe)
            }
        }

        return binding.root
    }

    private fun addShoeToView(
        container: ViewGroup?,
        shoe: Shoe
    ) {

        val shoeBinding: ShoeSingleLayoutBinding = DataBindingUtil.inflate(
            layoutInflater, R.layout.shoe_single_layout, container, false
        )

        val shoesBinding: ShoeListLayoutBinding = DataBindingUtil.inflate(
            layoutInflater, R.layout.shoe_list_layout, container, false
        )
        shoesBinding.shoe = shoe
//        val includedView: View = shoesBinding.
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.manu_main, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        findNavController().navigate(ShoeListFragmentDirections.actionShoeListFragmentToLoginFragment())
        return true
    }
}
