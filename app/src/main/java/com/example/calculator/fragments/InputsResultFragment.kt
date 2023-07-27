package com.example.calculator.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.calculator.R
import com.example.calculator.callbacks.OnButtonsFragmentClicked

class InputsResultFragment : Fragment(), OnButtonsFragmentClicked {

    lateinit var userInput: TextView
    lateinit var result: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_inputs_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        userInput = view.findViewById(R.id.tv_user_input)
        result = view.findViewById(R.id.tv_result)
    }

    override fun onButtonFragmentClicked(value: StringBuilder) {
        userInput.text = value
        result.text = value
    }
}