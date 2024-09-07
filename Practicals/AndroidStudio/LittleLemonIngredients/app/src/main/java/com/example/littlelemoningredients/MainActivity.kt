package com.example.littlelemoningredients

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<View>(R.id.main_dish1).setOnClickListener{
            IngredientsActivity.start(this,"Hamburger")
        }
        findViewById<View>(R.id.main_dish2).setOnClickListener {
            IngredientsActivity.start(this,"Pasta")
        }
    }
}