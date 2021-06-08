package com.mashmash.geoquizkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button_id)
        falseButton = findViewById(R.id.false_button_id)
        //Single Abstract method - SAM conversion
        trueButton.setOnClickListener { }
        trueButton.setOnClickListener {
            val myToast = Toast.makeText(
                this,
                R.string.correct_toast,
                Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
            myToast.show()
        }
        falseButton.setOnClickListener {
            val myToast = Toast.makeText(
                this,
                R.string.incorrect_toast,
                Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
            myToast.show()
        }
    }
}