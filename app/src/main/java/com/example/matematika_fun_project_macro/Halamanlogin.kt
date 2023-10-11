package com.example.matematika_fun_project_macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Halamanlogin : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var tv :TextView
    private lateinit var tvlupapassword :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halamanlogin)
        button=findViewById(R.id.btnmasuk)
        tv = findViewById(R.id.tvlupapassword)
        tvlupapassword = findViewById(R.id.tvmendaftar)


        tv.setOnClickListener {
           startActivity(Intent(this,Lupakatasandi::class.java))
        }
        tvlupapassword.setOnClickListener {
            startActivity(Intent(this,BuatAkun::class.java))
        }

        button.setOnClickListener {
            val username = "admin"
            val password = "1234"
            val username2 = "202165012"
            val password2 = "1234"
            val txtusername = findViewById<EditText>(R.id.edt_masukanusername).text.toString()
            val txtpassword = findViewById<EditText>(R.id.edt_masukansandi).text.toString()
            if (username==txtusername&&password==txtpassword){
                startActivity(Intent(this, Home::class.java))
            }
            else if(username2==txtusername&&password2==txtpassword) {
                startActivity(Intent(this, MainActivity::class.java))
            }
            else{
                Toast.makeText(this, "username atau password salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}