package com.coddelord.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import kotlinx.android.synthetic.main.activity_main.button
import kotlinx.android.synthetic.main.activity_main.button2
import kotlinx.android.synthetic.main.activity_main.button3
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val targetNumber = 20
    private var total = 0
    private var rollCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun zarAt(view:View){
        var sayac = 0
        var handler = Handler(Looper.getMainLooper())
        Thread {

            while (sayac < 10) {
                val sayi1 = Random.nextInt(1, 7)
                val sayi2 = Random.nextInt(1, 7)

                handler.post() {
                    button2.text = sayi1.toString()
                    button3.text = sayi2.toString()

                }
                sayac++
                Thread.sleep(150) // 200 milisaniye beklet
            }


        }.start()
    }



}