package com.example.question

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_q1.*
import kotlinx.android.synthetic.main.activity_q3.*

class q3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q3)

        q3a1.setOnClickListener {
            val not = Toast.makeText(applicationContext, "คำตอบผิด", Toast.LENGTH_LONG).show()
        }

        q3a2.setOnClickListener {
            val not = Toast.makeText(applicationContext, "คำตอบผิด", Toast.LENGTH_LONG).show()
        }

        q3a3.setOnClickListener {
            val not = Toast.makeText(applicationContext, "คำตอบผิด", Toast.LENGTH_LONG).show()
        }

        q3true.setOnClickListener {
            val it = Intent(this, q4::class.java)
            startActivity(it)
        }
    }
}