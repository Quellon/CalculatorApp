package com.fake.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnOne : Button
    private lateinit var etValueOne: EditText
    private lateinit var etValueTwo: EditText
    private lateinit var tvResult: TextView
    private lateinit var btnMinus: Button
    private lateinit var btnAdd: Button
    private lateinit var btnMulti: Button
    private lateinit var btnDiv: Button
    var sum: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnOne = findViewById(R.id.button)
        etValueOne = findViewById(R.id.etValOne)
        etValueTwo = findViewById(R.id.etValTwo)
        tvResult = findViewById(R.id.tvRes)
        btnMinus = findViewById(R.id.buttonMinus)
        btnAdd = findViewById(R.id.buttonAdd)
        btnMulti = findViewById(R.id.buttonMulti)
        btnDiv = findViewById(R.id.buttonDiv)

        btnDiv.setOnClickListener{
            val num1 = etValueOne.text.toString().toDouble()
            val num2 = etValueTwo.text.toString().toDouble()
            sum = num1 / num2
        }

        btnMulti.setOnClickListener {
            val num1 = etValueOne.text.toString().toDouble()
            val num2 = etValueTwo.text.toString().toDouble()
            sum = num1 * num2
        }


        btnMinus.setOnClickListener {
            val num1 = etValueOne.text.toString().toDouble()
            val num2 = etValueTwo.text.toString().toDouble()
            sum = num1 - num2
        }

        btnAdd.setOnClickListener{
            val num1 = etValueOne.text.toString().toDouble()
            val num2 = etValueTwo.text.toString().toDouble()
            sum = num1 + num2
        }

        btnOne.setOnClickListener {
            tvResult.text = sum.toString()
        }
    }
}