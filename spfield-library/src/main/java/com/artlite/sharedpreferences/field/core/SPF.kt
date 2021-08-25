package com.artlite.sharedpreferences.field.core

import android.content.Context
import com.artlite.sharedpreferences.field.abs.BaseDelegator
import com.artlite.sharedpreferences.field.abs.BaseStrongDelegator
import com.artlite.sharedpreferences.field.facade.Logger
import com.artlite.sharedpreferences.field.facade.LoggerImpl
import com.artlite.sharedpreferences.field.managers.ContextManager
import kotlin.reflect.KProperty

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

    /**
     * Delegators.
     */
    object Delegators {

        /**
         * Login delegator.
         */
        class Login : BaseStrongDelegator<Logger>() {
            override fun createField(thisRef: Any?, property: KProperty<*>): Logger {
                return LoggerImpl(thisRef?.javaClass?.simpleName ?: "Unknown")
            }
        }

    }

}