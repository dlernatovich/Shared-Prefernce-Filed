package com.artlite.sharedpreferences.field.managers

import android.content.Context
import com.artlite.sharedpreferences.field.abs.BaseManager

/**
 * Manager which provide to keep of the application [Context] instance.
 * USAGE: ContextManager() for getting of the instance of the [Context].
 */
internal object ContextManager : BaseManager<Context>()