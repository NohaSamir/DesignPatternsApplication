package com.noha.designpatternsapplication.behavioral.observer

abstract class Subject {

    private val observers = mutableListOf<Observer>()

    fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    fun unregisterObserver(observer: Observer) {
        observers.remove(observer)
    }

    fun notifySubjectChanged() {
        observers.forEach {
            it.update(getState())
        }
    }

    abstract fun getState(): Any
}