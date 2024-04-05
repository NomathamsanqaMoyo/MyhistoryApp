package com.example.st10450061ass

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Declarations */

        val Enter = findViewById<Button>(R.id.Enter)
        val clear = findViewById<Button>(R.id.clear)
        val Name = findViewById<EditText>(R.id.Name)
        val Result = findViewById<TextView>(R.id.Result)
        Enter.setOnClickListener {

            /* if else statement */
            val age = Name.text.toString().toIntOrNull()
            if (age == null) {
                Result.text = "Please enter a valid age"


            } else {

                if (age < 20 || age > 100) {
                    Result.text = "please enter a valid age between 20 to 100"
                    Name.text.clear()
                } else {
                    /* 10 Dead Famous People I chose */
                    val result = when (age) {
                        65 ->"Cao Cao was the emperor of Wei the Chinese Han Dynasty"
                        60 ->"Odoacar was the German army leader , king of Italy"
                        21 ->" Zache was a Greek Italian Pope"
                        25 ->" Romanoas was a French nobleman and crusade"
                        31 ->"Wslter of Brienne was one of the greatest military leaders in history .His most famous campaigning took place during the second world war"
                        48 ->"Annibal Padoavo was theeperor of the Byzantine Empire from 920 to 944 ce"
                        72 ->"Jhon Davenport was an English Puritan clergyman and cp-founder of the American colony of new haven"
                        57 ->"Salvato Ros was an Italian Baroque painter, whose romanticized landscapes and history paintings"
                        95 ->"Nelson Mandela, was a South African president anti-apartheid, Politician and statman who served as the first black president "
                        23 ->"Hugh Masekela, was a South African trumpeter cornetist, singer and composer who was described as The father of South African Jazz"

                        else -> "No one died at this age, try a different age number "

                    }
                    Result.text = result


                }
                    

                }

            }
            clear.setOnClickListener {
                Name.text.clear()
                Result.text = ""
            }


        }


    }

















