package com.example.autouzupenianie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val autotextView = findViewById<AutoCompleteTextView>(R.id.Autouzupełnianie)
        val Jezyki = resources.getStringArray(R.array.Państwa)

        val adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, Jezyki)
        autotextView.threshold = 0
        autotextView.setAdapter(adapter)
    }
}