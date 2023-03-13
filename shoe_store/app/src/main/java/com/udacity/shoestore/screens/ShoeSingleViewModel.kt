package com.udacity.shoestore.screens

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe
import timber.log.Timber

class ShoeSingleViewModel : ViewModel() {


    val shoeName = MutableLiveData<String>()
    val shoeSize = MutableLiveData<String>()
    val shoeCompany = MutableLiveData<String>()
    val shoeDescription = MutableLiveData<String>()

    fun validateFields() : Boolean {
        return fieldNotEmpty(shoeName) &&
                fieldNotEmpty(shoeSize) &&
                fieldNotEmpty(shoeCompany) &&
                fieldNotEmpty(shoeDescription)
    }

    private fun fieldNotEmpty(data: MutableLiveData<String>) : Boolean {
        return data.value != null && data.value?.isNotEmpty() == true
    }

    private fun shoeSizeAsDouble() : Double {
        if (!fieldNotEmpty(shoeSize)) return 0.0
        return shoeSize.value?.toDouble()!!
    }

    fun buildShoe() : Shoe {
        return Shoe(
            shoeName.value ?: "",
            shoeSizeAsDouble(),
            shoeCompany.value ?: "",
            shoeDescription.value ?: "")
    }
}
