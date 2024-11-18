package com.example.ogrenmebirimi4uygulama6

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun Giriş(view: View) {
        val aylar=findViewById<EditText>(R.id.editTextNumber).text.toString().toInt()
        val sonuc=findViewById<TextView>(R.id.textView)
        val mevsim=findViewById<TextView>(R.id.textView2)
        when(aylar){
            1 -> sonuc.setText("Ocak")
            2 -> sonuc.setText("Şubat")
            3 -> sonuc.setText("Mart")
            4 ->sonuc.setText("Nisan")
            5 -> sonuc.setText("Mayıs")
            6 -> sonuc.setText("Haziran")
            7 -> sonuc.setText("Temmuz")
            8 -> sonuc.setText("Agustos")
            9 -> sonuc.setText("Eylül")
            10-> sonuc.setText("Ekim")
            11-> sonuc.setText("Kasım")
            12-> sonuc.setText("Aralık")
            else -> sonuc.setText("Geçersiz Giriş")
        }
    when(aylar){
       in 1..2 -> mevsim.setText("kış")
        in 3..5 -> mevsim.setText("İlkbahar")
       in 6..8 -> mevsim.setText("Yaz")
       in 9..11 -> mevsim.setText("Sonbahar")
        12-> mevsim.setText("Kış")
        else -> mevsim.setText("Geçersiz Giriş")}
    }
}