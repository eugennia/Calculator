package com.example.calculator.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.calculator.R
import com.example.calculator.callbacks.OnButtonsFragmentClicked

class ResultFragment: Fragment(), OnButtonsFragmentClicked {
    private var textView: TextView? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

    override fun onButtonFragmentClicked() {
        TODO("Not yet implemented")
    }
}