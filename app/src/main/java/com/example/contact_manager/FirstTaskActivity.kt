package com.example.contact_manager

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FirstTaskActivity : AppCompatActivity() {
    private lateinit var buttonNav: Button
    private lateinit var implicitNav: Button
    private lateinit var backButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_task)
        buttonNav = findViewById(R.id.navigate_but_first)
        implicitNav = findViewById(R.id.implicit_nav)
        backButton = findViewById(R.id.back_but)
        buttonNav.setOnClickListener {
            val intent = Intent(this, SecoendActivity::class.java)
            startActivity(intent)
        }
        implicitNav.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, "Testing implicit intent")
            }
            startActivity(Intent.createChooser(shareIntent, "Share via"))
        }
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}