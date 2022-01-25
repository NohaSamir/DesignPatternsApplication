package com.noha.designpatternsapplication.behavioral.templatemethodpattern

/**
 * The template method defines an algorithm's steps generally, deferring the implementation of some steps to subclasses.
 * Behavioral design pattern is concerned with the assignment of responsibilities
 *
 * The template method can be helpful if you have two classes with similar functionality.
 * When you notice two classes with a very similar order of operations, you can choose to use a template method.
 * The template method pattern is a practical application of generalization and inheritance.
 * When writing software, you might notice two separate classes that share similarities like each having a method with a very similar algorithm.
 * Rather than making changes to these algorithms in two places, you can consolidate the algorithms to one place within a template method of a superclass for the two classes.
 * You generalize from two separate methods into one template method within a superclass which will be inherited by the two classes.
 * The differences in the algorithms would be done through calls to abstract methods whose implementations are provided by the subclasses.
 */
abstract class PastaDish {

    private val tag = PastaDish::class.simpleName

    // defines an algorithm's steps generally. This ensures consistency in the steps
    fun makeRecipe(): String {
        return "${boilWater()} \n\n" +
                "${addPasta()} \n\n" +
                "${cookPasta()} \n\n" +
                "${drainAndPlate()} \n\n" +
                "${addSauce()} \n\n" +
                "${addProtein()} \n\n" +
                addGarnish()
    }

    // Deferring the implementation of some common steps to super classes
    private fun boilWater(): String {
        return ("$tag Boil water")
    }

    private fun cookPasta(): String {
        return ("$tag Cook Pasta")
    }

    private fun drainAndPlate(): String {
        return ("$tag Drain And Plate")
    }


    // deferring the implementation of some steps to subclasses
    protected abstract fun addPasta(): String
    protected abstract fun addSauce(): String
    protected abstract fun addProtein(): String
    protected abstract fun addGarnish(): String

}