package com.artlite.sharedpreferences.field.abs

import java.lang.ref.WeakReference

/**
 * Base manager.
 * @param T item type.
 */
internal abstract class BaseManager<T> : () -> T? {

    /**
     * Field [WeakReference] instance.
     */
    private var _field: WeakReference<T>? = null

    /**
     * Field value.
     */
    private var field: T?
        get() = _field?.get()
        set(value) {
            _field = WeakReference(value)
        }

    /**
     * Method which provide the update functional.
     * @param updater Function0<T?> updater function.
     */
    inline fun update(crossinline updater: () -> T?) {
        this.field = updater.invoke()
    }

    /**
     * Method which provide the invoke functional.
     * @return T? object instance.
     */
    override fun invoke(): T? = field

}