package com.example.myaplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewVal: TextView = findViewById(R.id.textView2)
        val text = "pop up message"
        val toastText: Toast = Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT)

        val buttonAction: Button = findViewById(R.id.button)
        buttonAction.setOnClickListener {
            textViewVal.text = "goodbye"
            toastText.show()
        }
    }
}