package com.example.common.delegate

import kotlin.properties.ObservableProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

inline fun<T> observer(
    initValue: T,
    crossinline onChange: (newValue: T)-> Unit
): ReadWriteProperty<Any?, T> =
    object : ObservableProperty<T>(initValue) {
        override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) =
            onChange(newValue)
    }