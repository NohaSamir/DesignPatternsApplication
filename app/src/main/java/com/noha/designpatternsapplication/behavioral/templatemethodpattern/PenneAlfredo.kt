package com.noha.designpatternsapplication.behavioral.templatemethodpattern

class PenneAlfredo : PastaDish() {

    private val tag = PenneAlfredo::class.simpleName

    override fun addPasta(): String {
        return ("$tag Add Pasta")
    }

    override fun addSauce(): String {
        return ("$tag Add Sauce")
    }

    override fun addProtein(): String {
        return ("$tag Add Protein")
    }

    override fun addGarnish(): String {
        return ("$tag Add Garnish")
    }
}