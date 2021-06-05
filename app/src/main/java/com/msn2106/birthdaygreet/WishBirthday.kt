package com.msn2106.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_wish_birthday.*

class WishBirthday : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wish_birthday)

        val name = intent.getStringExtra(NAME_EXTRA)
        birthdayGreetings.text = "Happy Birthday\n\t$name!"

    }
}