package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vasatText.text = sum(4,9).toString()

        tay.setOnClickListener {
            val intent = Intent(this@MainActivity, PayActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "سلام", Toast.LENGTH_LONG).show()
            tay.text = "kkk"
            Toast.makeText(this, "salaam khoobi", Toast.LENGTH_LONG).show()
            AlertDialog.Builder(this).setTitle("hiiii").show()

        }
    }

    fun sum (x:Int,y:Int): Int {
        return x+y

    }
}
