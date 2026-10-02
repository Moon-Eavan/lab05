package com.example.androidcalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editNum1 = findViewById<EditText>(R.id.editNum1)
        val editNum2 = findViewById<EditText>(R.id.editNum2)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubtract = findViewById<Button>(R.id.btnSubtract)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)

        val textResult = findViewById<TextView>(R.id.textResult)

        btnAdd.setOnClickListener {
            val num1 = editNum1.text.toString().toDoubleOrNull()
            val num2 = editNum2.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                textResult.text = "결과: ${num1 + num2}"
            } else {
                textResult.text = "숫자를 입력하세요."
            }
        }

        btnSubtract.setOnClickListener {
            val num1 = editNum1.text.toString().toDoubleOrNull()
            val num2 = editNum2.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                textResult.text = "결과: ${num1 - num2}"
            } else {
                textResult.text = "숫자를 입력하세요."
            }
        }

        btnMultiply.setOnClickListener {
            val num1 = editNum1.text.toString().toDoubleOrNull()
            val num2 = editNum2.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                textResult.text = "결과: ${num1 * num2}"
            } else {
                textResult.text = "숫자를 입력하세요."
            }
        }

        btnDivide.setOnClickListener {
            val num1 = editNum1.text.toString().toDoubleOrNull()
            val num2 = editNum2.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                if (num2 == 0.0) {
                    textResult.text = "0으로 나눌 수 없습니다."
                } else {
                    textResult.text = "결과: ${num1 / num2}"
                }
            } else {
                textResult.text = "숫자를 입력하세요."
            }
        }
    }
}