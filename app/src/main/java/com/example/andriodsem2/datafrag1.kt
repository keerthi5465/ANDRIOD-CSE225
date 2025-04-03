package com.example.andriodsem2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class datafrag1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.datafrag1,container,false)
        view.findViewById<Button>(R.id.btnnext).setOnClickListener{
            val inputData = view.findViewById<EditText>(R.id.edit1).text.toString()
            val fragB = parentFragmentManager.findFragmentById(R.id.fragright)as datafrag2
            fragB.reciveData(inputData)
        }
        return view

    }
    fun reciveData(data: String){
        view?.findViewById<EditText>(R.id.edit1)?.setText(data)
    }

}