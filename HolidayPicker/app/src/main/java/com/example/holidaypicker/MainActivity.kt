package com.example.holidaypicker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.holidaypicker.ui.theme.HolidayPickerTheme

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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HolidayPickerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        HolidayPickerTheme {
            Greeting("Android")
        }
    }
}
