package com.example.appaboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FifthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)


        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            finishAffinity()
        }
    }

    private fun finishActivity() {
        TODO("Not yet implemented")
    }
}