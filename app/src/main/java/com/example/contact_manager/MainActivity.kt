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
    private lateinit var buttonNav:Button
    private lateinit var implicitNav:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        buttonNav = findViewById(R.id.navigate_but_first)
        implicitNav = findViewById(R.id.implicit_nav)
        buttonNav.setOnClickListener {
            val intent = Intent(this, SecoendActivity::class.java)
            startActivity(intent)
        }
        //Add a share button that uses an implicit intent to share a message via available apps
        implicitNav.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, "Testing implicit intent")
            }
            startActivity(Intent.createChooser(shareIntent, "Share via"))
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