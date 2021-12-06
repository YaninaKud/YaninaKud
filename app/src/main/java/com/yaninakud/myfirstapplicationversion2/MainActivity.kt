package com.yaninakud.myfirstapplicationversion2

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button


class MainActivity : AppCompatActivity() {

    lateinit var switchFragmentsButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switchFragmentsButton = findViewById(R.id.button)

        Log.d(TAG, "onCreate")

        val fragment1 = Fragment1()
        val fragment2 = Fragment2()

        switchFragmentsButton.setOnClickListener {
            val fragment =
                when (supportFragmentManager.findFragmentById(R.id.fragment_container)) {
                    is Fragment1 -> fragment2
                    is Fragment2 -> fragment1
                    else -> fragment1
                }
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()

        }
    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}

