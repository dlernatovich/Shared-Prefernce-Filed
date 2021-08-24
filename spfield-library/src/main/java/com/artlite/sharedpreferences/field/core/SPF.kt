package com.artlite.sharedpreferences.field.core

import android.content.Context
import com.artlite.sharedpreferences.field.managers.ContextManager

/**
 * Shared preferences field core module.
 */
object SPF {

    /**
     * Method which provide to configure of the SPF.
     * WARNING: SHOULD BE CALL IN APPLICATION DELEGATE.
     */
    @Synchronized
    fun spfConfigure(context: Context) {
        ContextManager.update { context }
    }

}