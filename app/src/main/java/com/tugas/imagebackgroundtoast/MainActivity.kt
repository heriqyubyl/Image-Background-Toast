package com.tugas.imagebackgroundtoast

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Iv_vespa01.setOnClickListener(){
            Iv_vespa01.setBackgroundColor(Color.BLUE)
            Iv_vespa02.setBackgroundColor(Color.WHITE)
            Toast.makeText(this,"Ini vespa Pertama", Toast.LENGTH_LONG).show()
        }

        Iv_vespa02.setOnClickListener(){
            Iv_vespa02.setBackgroundColor(Color.RED)
            Iv_vespa01.setBackgroundColor(Color.WHITE)
            Toast.makeText(this,"Ini vespa Kedua", Toast.LENGTH_LONG).show()
        }
    }
}