package com.example.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
    Write an application that displays a shopping list in a list form.
    Each user action (add, delete, etc.) should be confirmed by an appropriate Toast message
    (information about whether the the operation was successful or not)
    * ability to add things to the list (e.g. FAB or in the toolbar)
    * ability to remove things from the list
        ** the ability to undo the deletion (e.g., using the Snackbar action Snackbar)
    * ability to overwrite an application's theme with your own
    * custom toolbar
    * toolbar navigation
    * option to "share" the current list (from the toolbar)
    * ability to store only unique items
        ** user cannot enter the same item more than once element (e.g. 2 times "milk)
        ** inability to add an item if it is not unique (e.g. inability to click the button / corresponding message, etc.).
*/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}