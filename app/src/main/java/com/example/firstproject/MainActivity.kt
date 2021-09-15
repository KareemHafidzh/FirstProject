package com.example.firstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var dataEmail: Array<String>
    private lateinit var dataPassword: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtEmail : EditText = findViewById(R.id.edt_email)
        val edtpass : EditText = findViewById(R.id.edt_password)
        val btnlogin : Button = findViewById(R.id.btn_login)
        val btnregister : Button = findViewById(R.id.btn_register)
        val btnforgetpass : TextView = findViewById(R.id.forgetpassword)
        val radioremember : RadioButton = findViewById(R.id.rememberme)


        val dataEmail = arrayOf("kareem","abdul","hafidzh")
        val dataPassword =  arrayOf("1234","4321","1423")

        btnlogin.setOnClickListener{
            signIn(edtEmail.text.toString(), edtpass.text.toString())
        }
    }

    fun signIn (email: String, password: String){
        for(i in dataEmail.indices){
            val takeDataEmail = dataEmail.get(i)
            val takeDataPass = dataPassword.get(i)
            if (takeDataEmail == email || takeDataPass == password){
                Toast.makeText(this, "LogedIn", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Akun Salah", Toast.LENGTH_SHORT).show()
            }
        }
    }


}