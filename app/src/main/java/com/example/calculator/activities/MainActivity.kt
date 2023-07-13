package com.example.calculator.activities

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.fragment.app.FragmentManager
import com.example.calculator.R
import com.example.calculator.fragments.ButtonsFragment
import com.example.calculator.fragments.ResultFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager: FragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.result, ResultFragment()).commit()
        fragmentManager.beginTransaction().replace(R.id.buttons, ButtonsFragment()).commit()

    }
}