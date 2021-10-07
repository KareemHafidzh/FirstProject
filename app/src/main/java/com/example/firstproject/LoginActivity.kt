package com.example.firstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class LoginActivity : AppCompatActivity() {

    private lateinit var dataEmail: Array<String>
    private lateinit var dataPassword: Array<String>
    private var progressBar: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val edtEmail : EditText = findViewById(R.id.edt_email)
        val edtpass : EditText = findViewById(R.id.edt_password)
        val btnlogin : Button = findViewById(R.id.btn_login)
        val btnregister : Button = findViewById(R.id.btn_register)
        progressBar = findViewById(R.id.progress_bar)
        val btnforgetpass : TextView = findViewById(R.id.forgetpassword)
        val radioremember : RadioButton = findViewById(R.id.rememberme)

        dataEmail = arrayOf("kareem","abdul","hafidzh")
        dataPassword =  arrayOf("1234","4321","1423")

        btnlogin.setOnClickListener{
            progressBar?.visibility = View.VISIBLE
            signIn(edtEmail.text.toString(), edtpass.text.toString())
        }

        btnregister.setOnClickListener{
            startActivity(Intent(this, RegisterActivity:: class.java))
        }
    }

    fun signIn (email: String, password: String){
        for(i in dataEmail.indices){
            val takeDataEmail = dataEmail.get(i)
            val takeDataPass = dataPassword.get(i)
            if (takeDataEmail == email || takeDataPass == password){
                Toast.makeText(this, "LogedIn", Toast.LENGTH_SHORT).show()
                progressBar?.visibility = View.GONE
                startActivity(Intent(this, HomeActivity::class.java))
                break
            }else{
                progressBar?.visibility = View.GONE
                Toast.makeText(this, "Akun Salah", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onStart(){
        super.onStart()
        Toast.makeText(this, "onStart terpanggil", Toast.LENGTH_SHORT).show()
    }

    override fun onResume(){
        super.onResume()
        Toast.makeText(this, "onResume terpanggil", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart(){
        super.onRestart()
        Toast.makeText(this, "onRestart terpanggil", Toast.LENGTH_SHORT).show()
    }

    override fun onPause(){
        super.onPause()
        Toast.makeText(this, "onPause terpanggil", Toast.LENGTH_SHORT).show()
    }

    override fun onStop(){
        super.onStop()
        Toast.makeText(this, "onStop terpanggil", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy(){
        super.onDestroy()
        Toast.makeText(this, "onDestroy terpanggil", Toast.LENGTH_SHORT).show()
    }
}