package com.example.travelbuddy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import org.w3c.dom.Text

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val originInput: EditText = findViewById(R.id.origin_input)
        val destinationInput: EditText = findViewById(R.id.destination_input)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener{ view ->
            println("button clicked!")
            println(originInput.text.toString())
            println(destinationInput.text.toString())
        }
    }

    override fun onClick(v: View) {
    }
}