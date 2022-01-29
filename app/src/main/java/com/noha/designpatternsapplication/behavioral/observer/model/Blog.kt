package com.noha.designpatternsapplication.behavioral.observer.model

import com.noha.designpatternsapplication.behavioral.observer.Subject

object Blog : Subject() {

    var state: String = "Blog init"
        private set

    var blogTextView: String = "Blog text"

    var blogText: String = blogTextView
        private set

    fun editBlogText() {
        blogText = blogTextView
        state = "Blog updated"
        notifySubjectChanged()
    }

    override fun getState(): Any {
        return state
    }
}