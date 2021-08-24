package com.artlite.sharedpreferences.field.workspace.core

import android.app.Application
import com.artlite.sharedpreferences.field.core.SPF

/**
 * Current application class.
 */
class CurrentApplication : Application() {

    /**
     * Method which provide to create application functional.
     */
    override fun onCreate() {
        super.onCreate()
        SPF.spfConfigure(this)
    }

}