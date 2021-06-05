package com.msn2106.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {
//        creating toast message
//        val name = inputName.editableText.toString()
//        Toast.makeText(this,"Name is $name",Toast.LENGTH_LONG).show()

        val name = inputName.editableText.toString()
        val intent = Intent(this,WishBirthday::class.java)
        intent.putExtra(WishBirthday.NAME_EXTRA,name)
        startActivity(intent)
    }
}