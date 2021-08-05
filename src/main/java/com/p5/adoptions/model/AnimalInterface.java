package com.p5.adoptions.model;

/**
 * An interface defines behaviour
 * If there are fields they are public and static
 *
 * Pluses:
 * - generic method implementation
 * - defines a contract (defines methods available to be used after initialization)
 *
 * Minuses:
 * - only public static fields
 * - public methods
 */
public interface AnimalInterface {

    String hello = "Hello from animal kingdom";

    String makeSound();

    String howManyLegs();

    /**
     * Generic implementation does not depend on details at class level
     *
     */

    default String defauldMethod(){
        return "This is a default method.";
    }
}
