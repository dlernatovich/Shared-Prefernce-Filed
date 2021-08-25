package com.artlite.sharedpreferences.field.abs

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Base delegator class.
 * @param T type of the delegate.
 * @property defaultValue T? default value.
 * @constructor
 */
abstract class BaseDelegator<T>(private val defaultValue: T? = null) : ReadOnlyProperty<Any?, T?> {

    /**
     * Instance of the field.
     */
    private var _field: T? = null

    /**
     * Returns the value of the property for the given object.
     * @param thisRef the object for which the value is requested.
     * @param property the metadata for the property.
     * @return the property value.
     */
    @Synchronized
    override fun getValue(thisRef: Any?, property: KProperty<*>): T? {
        if (_field == null) {
            _field = createField(thisRef, property) ?: defaultValue
        }
        return _field
    }

    /**
     * Method which provide to create field.
     * @param thisRef Any? owner reference.
     * @param property KProperty<*> instance.
     * @return T? value.
     */
    abstract fun createField(thisRef: Any?, property: KProperty<*>): T?

}

/**
 * Base delegator class.
 * @param T type of the delegate.
 * @property defaultValue T? default value.
 * @constructor
 */
abstract class BaseStrongDelegator<T>(private val defaultValue: T? = null) : ReadOnlyProperty<Any?, T?> {

    /**
     * Instance of the field.
     */
    private var _field: T? = null

    /**
     * Returns the value of the property for the given object.
     * @param thisRef the object for which the value is requested.
     * @param property the metadata for the property.
     * @return the property value.
     */
    @Synchronized
    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        if (_field == null) {
            _field = createField(thisRef, property) ?: defaultValue
        }
        return _field!!
    }

    /**
     * Method which provide to create field.
     * @param thisRef Any? owner reference.
     * @param property KProperty<*> instance.
     * @return T? value.
     */
    abstract fun createField(thisRef: Any?, property: KProperty<*>): T

}