package com.example.question

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_q1.*
import kotlinx.android.synthetic.main.activity_q2.*

class q2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q2)

        q2true.setOnClickListener {
            val it = Intent(this, q3::class.java)
            startActivity(it)
        }

        q2a2.setOnClickListener {
            val not = Toast.makeText(applicationContext, "คำตอบผิด", Toast.LENGTH_LONG).show()
        }

        q2a4.setOnClickListener {
            val not = Toast.makeText(applicationContext, "คำตอบผิด", Toast.LENGTH_LONG).show()
        }

        q2true2.setOnClickListener {
            val it = Intent(this, q3::class.java)
            startActivity(it)
        }
    }
}