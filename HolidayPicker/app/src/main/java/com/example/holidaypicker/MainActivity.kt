package com.example.holidaypicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

/*
Prepare an application that, based on the (given by the user) name, selects a proposed holiday destination.
    * the user enters his/her name
    * information about the proposed departure destination appears on the screen
    * vacation destinations can be taken from l.o.t.r. locations (or any other idea)
    * each destination should include name + description
    * method of selection - any.
        ** e.g. by first letter of name, length of name, etc.
    * using activity lifecycle messages make the the application maintains its state even when, for example, changing the orientation of the screen
        ** e.g. using onSaveInstanceState
The placeholder description can be presented on a separate activity.
*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(onSaveInstanceState: Bundle?) {
        super.onCreate(onSaveInstanceState)
        setContentView(R.layout.activity_main)
        val userName: EditText = findViewById(R.id.userName)
        val userOutput: TextView = findViewById(R.id.userOutput)
        val button: Button = findViewById(R.id.button)
        val destinationClass = Destination()

        button.setOnClickListener {
            val name = userName.text.toString()
            userOutput.text = destinationClass.getDestination(name)
        }
    }
}