package com.artlite.sharedpreferences.field.workspace.core

import android.app.Application
import com.artlite.sharedpreferences.field.core.SPF

/**
 * Current application class.
 */
class CurrentApplication : Application() {

    /**
     * Logger instance.
     */
    private val logger by SPF.Delegators.Login()

    /**
     * Method which provide to create application functional.
     */
    override fun onCreate() {
        super.onCreate()
        SPF.spfConfigure(this)
        logger.info("Application was created.")
    }

}