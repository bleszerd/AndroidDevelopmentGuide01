package com.github.bleszerd.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE = "com.github.bleszerd.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View){
        val editText = findViewById<EditText>(R.id.editText) //Get input text element
        val message = editText.text.toString() //Get text from input
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        } // Send EXTRA_MESSAGE (key to find text) to DisplayMessageActivity
        startActivity(intent)
    }
}