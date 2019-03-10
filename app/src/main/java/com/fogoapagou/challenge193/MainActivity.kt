package com.fogoapagou.challenge193

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnRegister.setOnClickListener(this)
        btnLogin.setOnClickListener(this)
    }


    override fun onClick(btn: View?) {
        when (btn?.id) {
            btnRegister.id -> {
                val intentRegister = Intent(this, RegisterActivity::class.java)
                startActivity(intentRegister)
            }
            btnLogin.id -> {
                val intentLogin = Intent(this, LoginActivity::class.java)
                startActivity(intentLogin)
            }
        }
    }


}
