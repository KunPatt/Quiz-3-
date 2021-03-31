package com.example.question

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_q1.*
import kotlinx.android.synthetic.main.activity_q1.q1a1
import kotlinx.android.synthetic.main.activity_q1.q1a2
import kotlinx.android.synthetic.main.activity_q1.q1a4
import kotlinx.android.synthetic.main.activity_q1.q1true
import kotlinx.android.synthetic.main.activity_q5.*

class q5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q5)

        q5true.setOnClickListener {
            val end = Toast.makeText(applicationContext, "ตอบคำถามครบทุกข้อแล้ว", Toast.LENGTH_LONG).show()
        }

        q5a1.setOnClickListener {
            val not = Toast.makeText(applicationContext, "คำตอบผิด", Toast.LENGTH_LONG).show()
        }

        q5a2.setOnClickListener {
            val not = Toast.makeText(applicationContext, "คำตอบผิด", Toast.LENGTH_LONG).show()
        }

        q5a4.setOnClickListener {
            val not = Toast.makeText(applicationContext, "คำตอบผิด", Toast.LENGTH_LONG).show()
        }


    }
}