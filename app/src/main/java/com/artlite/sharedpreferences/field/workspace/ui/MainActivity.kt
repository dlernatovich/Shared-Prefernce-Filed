package com.artlite.sharedpreferences.field.workspace.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.artlite.sharedpreferences.field.workspace.R

/**
 * Main activity class.
 */
class MainActivity : AppCompatActivity() {

    /**
     * Method which provide action when activity created.
     * @param savedInstanceState Bundle? instance.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}