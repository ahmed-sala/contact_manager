package com.example.contact_manager

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondTaskActivity : AppCompatActivity() {
    private lateinit var tvContactName:TextView
    private lateinit var etContactNotes:EditText
    private lateinit var btnSaveContact:Button
    private lateinit var tvContactResult:TextView
    private lateinit var backButton: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_task)
        tvContactName= findViewById(R.id.tv_contact_name)
        etContactNotes = findViewById(R.id.et_contact_notes)
        btnSaveContact = findViewById(R.id.btn_save_contact)
        tvContactResult = findViewById(R.id.result_text_view)
        backButton = findViewById(R.id.back_but)

        btnSaveContact.setOnClickListener {
            val contactName = tvContactName.text
            val contactNotes = etContactNotes.text.toString()
            if (contactName.isNotEmpty() && contactNotes.isNotEmpty()) {

                tvContactResult.text = "Contact Name: $contactName\nNotes: $contactNotes"
                tvContactResult.visibility = TextView.VISIBLE
            } else {
                tvContactResult.text = "Please fill the fields."
            }
        }
        backButton.setOnClickListener {
            finish()
        }


    }
}