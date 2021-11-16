package com.iesmurgi.org.u5actividadradiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            val tvMensaje: TextView = findViewById(R.id.tvMensaje)

            when (view.getId()) {
                R.id.rbLunes -> {
                    tvMensaje.text = "Ha marcado el Lunes"
                    Toast.makeText(this, "Ha seleccionado el Lunes", Toast.LENGTH_LONG).show()
                }

                R.id.rbMartes -> {
                    tvMensaje.text = "Ha marcado el Martes"
                    Toast.makeText(this,"Ha seleccionado el Martes", Toast.LENGTH_LONG).show()
                }

                R.id.rbMiercoles -> {
                    tvMensaje.text = "Ha marcado el Miércoles"
                    Toast.makeText(this, "Ha selecionado el Miercoles", Toast.LENGTH_LONG).show()
                }
                R.id.rbJueves -> {
                    tvMensaje.text = "Ha marcado el Jueves"
                    Toast.makeText(this, "Ha selecionado el Jueves", Toast.LENGTH_LONG).show()
                }

                R.id.rbViernes -> {
                    tvMensaje.text = "Ha marcado el Viernes"
                    Toast.makeText(this, "Ha selecionado el Viernes", Toast.LENGTH_LONG).show()
                }

                R.id.rbSabado -> {
                    tvMensaje.text = "Ha marcado el Sábado"
                    Toast.makeText(this, "Ha selecionado el Sábado", Toast.LENGTH_LONG).show()
                }

                R.id.rbDomingo -> {
                    tvMensaje.text = "Ha marcado el Domingo"
                    Toast.makeText(this, "Ha selecionado el Domingo", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}