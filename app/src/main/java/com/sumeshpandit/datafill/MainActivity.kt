package com.sumeshpandit.datafill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fillingFragment=FillingFragment()
        supportFragmentManager.beginTransaction().replace(R.id.main_frame,fillingFragment).commit()
    }

}