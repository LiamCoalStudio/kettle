package com.liamcoalstudio.kettle.logging

import kotlin.reflect.KClass

class ConsoleLogger(private val clazz: KClass<*>? = null) : Logger {
    override fun log(string: String): Boolean {
        println("${(System.nanoTime() - Logger.startTime).toDouble() / 1000000000.0} ${Thread.currentThread().name} ${clazz?.simpleName} > $string")
        System.out.flush()
        return true
    }
}