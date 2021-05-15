package com.example.adventurersguild

import android.content.*
import androidx.appcompat.app.*
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.internal.ContextUtils
import kotlinx.android.synthetic.main.fragment_login.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This is for the login fragment button.
        login.setOnClickListener {
            onLoginButtonClicked(this.login)
        }
    }

    // This is for the login fragment button.
    fun onLoginButtonClicked(view: View) {
        var user=username.text.toString()
        var pass=password.text.toString()
        if (user.equals("test") && pass.equals("111111")) { //making a valid user
            // Success
            var intent= Intent(this, SecondActivity:: class.java)
            startActivity(intent)
        }
        else {
            // Fail
            Toast.makeText(this, "Login Failed.", Toast.LENGTH_SHORT).show()
        }
    }
}