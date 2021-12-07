package com.yaninakud.myfirstapplicationversion2

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

private const val TAG = "MainActivity"

class Fragment1 : Fragment() {

    private var your_age: EditText? = null
    private var result_star: Button? = null
    private var KEY = "KEY"

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
        result_star = view.findViewById(R.id.btn)
        your_age = view.findViewById(R.id.age)

        onClickListener()
        Log.d(TAG, "Fragment1 - onCreateView")

        return view
    }
    val fragment = Fragment2()
    val bundle = Bundle()

    private fun onClickListener() = result_star?.setOnClickListener {
        if (your_age?.text?.toString()?.trim()?.equals("")!!)
            Toast.makeText(context, "Введите дату рождения", Toast.LENGTH_LONG).show()
        else {
            bundle.putString(KEY, your_age?.text.toString())
            fragment.arguments = bundle

            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_container, fragment)
                ?.addToBackStack(fragment.tag)
                ?.commit()
        }
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "Fragment1 - onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Fragment1 - onStart")
    }
}


