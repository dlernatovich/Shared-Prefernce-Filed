package com.artlite.sharedpreferences.field.facade

import android.util.Log
import com.artlite.sharedpreferences.field.abs.BaseDelegator
import kotlin.reflect.KProperty

/**
 * Logger interface.
 */
interface Logger {

    /**
     * Method which provide to print of the error functionality.
     * @param error Throwable instance.
     */
    fun error(error: Throwable)

    /**
     * Method which provide to show error with format.
     * @param format String value.
     * @param error Throwable instance.
     */
    fun error(format: String, error: Throwable)

    /**
     * Method which provide to show of the message.
     * @param message String? value.
     */
    fun info(message: String?)

    /**
     * Method which provide to show of the message with format.
     * @param format String value.
     * @param values Array<out Any?> array.
     */
    fun info(format: String, vararg values: Any?)

}

/**
 * Logger implementation.
 * @property _tag String class tag.
 * @constructor
 */
internal class LoggerImpl(private val _tag: String) : Logger {

    /**
     * Prefix value.
     */
    private val kPrefix = " \n--------> "

    /**
     * Prefix text value.
     */
    private val kPrefixText = "\n          "

    /**
     * Method which provide to print of the error functionality.
     * @param error Throwable instance.
     */
    override fun error(error: Throwable) {
        Log.e(_tag, "$kPrefix[ERROR]$kPrefixText$error")
    }

    /**
     * Method which provide to show error with format.
     * @param format String value.
     * @param error Throwable instance.
     */
    override fun error(format: String, error: Throwable) {
        Log.e(_tag, "$kPrefix[ERROR]$kPrefixText${String.format(format, error)}")
    }

    /**
     * Method which provide to show of the message.
     * @param message String? value.
     */
    override fun info(message: String?) {
        Log.i(_tag, "$kPrefix[MESSAGE]$kPrefixText$message")
    }

    /**
     * Method which provide to show of the message with format.
     * @param format String value.
     * @param values Array<out Any?> array.
     */
    override fun info(format: String, vararg values: Any?) {
        Log.i(_tag, "$kPrefix[MESSAGE]$kPrefixText${String.format(format, *values)}")
    }

}