package com.example.homework12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnSingUp.setOnClickListener {
            navigateToSecondActivity()
        }
    }
    private val navigateToSecondActivity: () -> Unit = {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("NAME_EXTRA", etName.text.toString())
        intent.putExtra("LASTNAME_EXTRA", etLastname.text.toString())
        intent.putExtra("CITY_EXTRA", etCity.text.toString())
        startActivity(intent)
    }

}