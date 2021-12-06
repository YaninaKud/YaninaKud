package com.yaninakud.myfirstapplicationversion2

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

private const val TAG = "MainActivity"

class Fragment1 : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "Fragment1 - onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Fragment1 - onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_1, container, false)
        val button: Button = view.findViewById(R.id.button)

        Log.d(TAG, "Fragment1 - onCreateView")

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "Fragment1 - onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Fragment1 - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Fragment1 - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Fragment1 - onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Fragment1 - onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "Fragment1 - onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Fragment1 - onDestroy")
    }
}