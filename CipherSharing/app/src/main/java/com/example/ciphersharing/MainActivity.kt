package com.example.ciphersharing

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import kotlin.random.Random


/*
    Write an application that allows you to encrypt (cipher), text given by the user.
    * user enters text
    * the user selects from the selector which cipher to use
    * the user clicks the button
    * the new activity presents the original text and its encrypted version
    * possibility to send the result of the application activity ("share" option)
        ** choice whether to share also the unencrypted fragment or not (e.g. SwitchButton)
    * the application should remember its state to be able to return to it (when the user returns to the application)
*/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userText: EditText = findViewById(R.id.userText)
        val encryptButton: Button = findViewById(R.id.encryptButton)
        val cipherSpinner: Spinner = findViewById(R.id.spinner)

        val ciphers = Ciphers()
        val ciphersArray = ciphers.ciphersList;

        ArrayAdapter.createFromResource(
            this,
            R.array.ciphersArray,
            R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)
            cipherSpinner.adapter = adapter
        }

        encryptButton.setOnClickListener {
            val intent = Intent(this, SecondaryActivity::class.java)
            intent.putExtra("userText", userText.text.toString())
            intent.putExtra("cipher", cipherSpinner.selectedItem.toString())
            startActivity(intent)
        }

    }
}