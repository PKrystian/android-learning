package com.example.ciphersharing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

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
    }
}