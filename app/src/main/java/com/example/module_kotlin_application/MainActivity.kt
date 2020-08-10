package com.example.module_kotlin_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.module_text_example.Pokemon

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.helloWorld)

        //The following imports the class from the android library module `moudle-text-example`
        val pokemon = Pokemon("Pikachu", "Kanto")
        val descriptionResponse = pokemon.description()
        text.text = descriptionResponse
    }
}