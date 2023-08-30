package com.example.calculadora_v1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculadora_v1.ui.theme.Calculadora_V1Theme
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    var total : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun pressBtn1 (view: View) {
        var txt2: TextView = findViewById(R.id.txt2)

        txt2.text = txt2.text.toString() + "1"

        // comentario
    }

    fun pressBtn2 (view: View) {
        var txt2: TextView = findViewById(R.id.txt2)

        txt2.text = txt2.text.toString() + "2"
    }

    fun pressBtnMas (view: View) {
        var txt1: TextView = findViewById(R.id.txt1)
        var txt2: TextView = findViewById(R.id.txt2)

        total += txt2.text.toString().toInt()

        txt1.text = txt1.text.toString() + txt2.text.toString() + "+"
        txt2.text = ""
    }

    fun pressBtnEq (view: View) {
        var txt1: TextView = findViewById(R.id.txt1)
        var txt2: TextView = findViewById(R.id.txt2)

        total += txt2.text.toString().toInt()

        txt1.text = txt1.text.toString() + txt2.text.toString() + "="
        txt2.text = total.toString()
    }

    fun pressBtnC (view: View) {
        var txt1: TextView = findViewById(R.id.txt1)
        var txt2: TextView = findViewById(R.id.txt2)

        total = 0

        txt1.text = ""
        txt2.text = ""
    }

}