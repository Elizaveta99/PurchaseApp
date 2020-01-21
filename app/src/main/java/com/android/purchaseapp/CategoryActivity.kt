package com.android.purchaseapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CategoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)
    }

    fun enterButton(view: View) {
        val intent = Intent(this, ListActivity::class.java)
        intent.putExtra("category","fruits");
        startActivity(intent)
    }
}