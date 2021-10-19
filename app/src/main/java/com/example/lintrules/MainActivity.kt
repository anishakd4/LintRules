package com.example.lintrules

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bark()
    }

    fun bark() {
        Log.d(TAG, "woof! woof!")
    }

    companion object {
        private const val TAG = "Sample"
    }
}
