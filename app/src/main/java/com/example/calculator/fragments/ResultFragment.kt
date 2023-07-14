package com.example.calculator.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.calculator.R
import com.example.calculator.callbacks.OnButtonsFragmentClicked
import java.lang.StringBuilder

class ResultFragment: Fragment(), OnButtonsFragmentClicked {

    lateinit var resultText: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        resultText = view.findViewById(R.id.tv_result)
    }

    override fun onButtonFragmentClicked(value: StringBuilder) {
        resultText.text = value
    }
}