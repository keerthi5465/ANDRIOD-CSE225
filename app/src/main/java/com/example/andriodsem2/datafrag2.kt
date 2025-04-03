package com.example.andriodsem2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class datafrag2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.datafrag2,container,false)
        view.findViewById<Button>(R.id.btnback).setOnClickListener{
            val fragA = parentFragmentManager.findFragmentById(R.id.fragleft)as datafrag1
            fragA.reciveData("Keerthi")
        }
        return view
    }
    fun reciveData(inputData: String) {
        view?.findViewById<TextView>(R.id.txt)?.text = inputData


    }
}