package com.example.appaboutme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {

            GoingToSecondActivity()
        }


        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {


            GoingThirdActivity()

        }
        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {


            GoingToFourthActivity()
        }
        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener {

        }
        GoingToFifthActivity()


    }


    private fun GoingThirdActivity() {

        val thirdActivity = Intent(this, Thirdactivity::class.java)
        startActivity(thirdActivity)
    }

    private fun GoingToSecondActivity() {

        val secondActivity = Intent(this, SecondActivity::class.java)
        startActivity(secondActivity)
    }

    private fun GoingToFourthActivity() {

        val fourthActivity = Intent(this, FourthActivity::class.java)
        startActivity(fourthActivity)
    }

    private fun GoingToFifthActivity() {

        val fifthActivity = Intent(this, FifthActivity::class.java)
        startActivity(fifthActivity)
    }

}