package com.example.question

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_q1.*
import kotlinx.android.synthetic.main.activity_q1.q1a4
import kotlinx.android.synthetic.main.activity_q1.q1true
import kotlinx.android.synthetic.main.activity_q4.*

class q4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q4)

        q4a1.setOnClickListener {
            val not = Toast.makeText(applicationContext, "คำตอบผิด", Toast.LENGTH_LONG).show()
        }

        q4a2.setOnClickListener {
            val not = Toast.makeText(applicationContext, "คำตอบผิด", Toast.LENGTH_LONG).show()
        }

        q4a4.setOnClickListener {
            val not = Toast.makeText(applicationContext, "คำตอบผิด", Toast.LENGTH_LONG).show()
        }

        q4true.setOnClickListener {
            val it = Intent(this, q5::class.java)
            startActivity(it)
        }
    }
}