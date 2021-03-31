package com.example.question

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_q1.*

class q1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q1)



        q1a1.setOnClickListener {
            val not = Toast.makeText(applicationContext, "คำตอบผิด", Toast.LENGTH_LONG).show()
        }

        q1a2.setOnClickListener {
            val not = Toast.makeText(applicationContext, "คำตอบผิด", Toast.LENGTH_LONG).show()
        }

        q1a4.setOnClickListener {
            val not = Toast.makeText(applicationContext, "คำตอบผิด", Toast.LENGTH_LONG).show()
        }

        q1true.setOnClickListener {
            val it = Intent(this, q2::class.java)
            startActivity(it)
        }
    }
}