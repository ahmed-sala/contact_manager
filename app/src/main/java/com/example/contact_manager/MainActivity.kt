package com.example.contact_manager

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var firstTaskBut:Button
    private lateinit var SecondTaskBut:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstTaskBut = findViewById(R.id.first_button)
        SecondTaskBut = findViewById(R.id.second_button)
        firstTaskBut.setOnClickListener {
            val intent = Intent(this, FirstTaskActivity::class.java)
            startActivity(intent)
        }
        SecondTaskBut.setOnClickListener {
            val intent = Intent(this, SecondTaskActivity::class.java)
            startActivity(intent)
        }

        Log.d("MainActivity", "onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop called")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy called")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart called")
    }

}