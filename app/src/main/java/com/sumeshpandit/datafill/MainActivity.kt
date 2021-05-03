package com.sumeshpandit.datafill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity(), CommunicationInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fillingFragment=FillingFragment()
        supportFragmentManager.beginTransaction().replace(R.id.main_frame,fillingFragment).commit()
    }

    override fun passData(text: String) {

        val bundle=Bundle()
        bundle.putString("msg",text)

        val displayFragment=DisplayFragment()
        displayFragment.arguments=bundle

        supportFragmentManager.beginTransaction().replace(R.id.main_frame,displayFragment).commit()
    }

    override fun back() {
        val fillingFragment=FillingFragment()
        supportFragmentManager.beginTransaction().replace(R.id.main_frame,fillingFragment).commit()
    }
}