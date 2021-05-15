package com.example.adventurersguild

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
    }

    fun onSubmitButtonClicked(view: View) {
        var intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    // This is the help and settings menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    // This is the help and settings menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.questBoard->{var intent= Intent(this, SecondActivity:: class.java)
                startActivity(intent)
                return super.onOptionsItemSelected(item)
            }
            R.id.settings->{var intent= Intent(this, SettingsActivity:: class.java)
                startActivity(intent)
                return super.onOptionsItemSelected(item)
            }
            else->return super.onOptionsItemSelected(item)
        }
    }
}