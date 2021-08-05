package com.p5.adoptions.model;

/**
 * An abstract class cannot be instantiated anymore
 *
 * Pluses over interface:
 *  - we can have fields (private static, non-static, protected
 *  - we can have body for functions
 *  - we can have abstract methods = interface methods
 *  - constructors
 *
 *  Minuses:
 *  - IMPORTANT!!! limits inheritance, because we need to extend this in child, AND WE CAN ONLY EXTENDS ONCE
 */
public abstract class AbstractAnimal {

    /**
     * An abstract method allows a method without body
     */

    protected String customField;

    public abstract String whatDoesItEat();

}
