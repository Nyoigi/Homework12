package com.example.homework12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tvName.text = intent.getStringExtra("NAME_EXTRA")
        tvLastName.text = intent.getStringExtra("LASTNAME_EXTRA")
        tvCity.text = intent.getStringExtra("CITY_EXTRA")
    }
}