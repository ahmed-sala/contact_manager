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

        shoLogMessage("onCreate")

    }

    override fun onStart() {
        super.onStart()
        shoLogMessage("onStart")
    }
    override fun onResume() {
        super.onResume()
        shoLogMessage("onResume")
    }
    override fun onPause() {
        super.onPause()
        shoLogMessage("onPause")
    }
    override fun onStop() {
        super.onStop()
        shoLogMessage("onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        shoLogMessage("onDestroy")
    }
    override fun onRestart() {
        super.onRestart()
        shoLogMessage("onRestart")
    }
    private fun shoLogMessage(message: String) {
        Log.d("Activity Life Cycle", message)
    }
}
