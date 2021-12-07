package com.yaninakud.myfirstapplicationversion2

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var buttomNavigationMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttomNavigationMenu = findViewById(R.id.buttom)
        buttomNavigationMenu.setOnNavigationItemSelectedListener { item ->

            var fragment: Fragment? = null
            when (item.itemId) {
                R.id.fragment_btn_1 -> {
                    fragment = Fragment1()
                }
                R.id.fragment_btn_2 -> {
                    fragment = Fragment2()
                }
            }
            replaceFragment(fragment!!)
            true
        }
        buttomNavigationMenu.selectedItemId = R.id.fragment_btn_1
    }
    private fun replaceFragment(fragment: Fragment) {

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(fragment.tag)
            .commit()
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }
}