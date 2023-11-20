package com.example.randomencounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/*
    Prepare a program that the user will generate random encounters for RPG games RPG.
    The program should complete the sentence "During ... you meet ..."
    character and contain answers for <1-20> throws.
    For example, the user drew the numbers 1 and 3, which corresponds to the sentence:
    "During the journey to Bree, you meet bloodthirsty bandits".
    * the user clicks the "generate" button (or a similar name)
    * the screen shows the drawn sentence
    * the screen shows the results that were drawn (e.g., as Toast or text)
    * additional:
        ** using messages on the life cycle of case activity, make the application keep its state even during e.g. changing the screen orientation
        ** at the user's request, the screen can display the table
*/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}