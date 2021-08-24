package com.artlite.sharedpreferences.field.abs

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Base delegator class.
 * @param T type of the delegate.
 * @property defaultValue T? default value.
 * @constructor
 */
abstract class BaseDelegator<T>(private val defaultValue: T?) : ReadOnlyProperty<Any?, T?> {

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
            _field = createField() ?: defaultValue
        }
        return _field
    }

    /**
     * Method which provide to create field.
     * @return T?
     */
    abstract fun createField(): T?

}