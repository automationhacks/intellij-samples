package com.jetbrains.inspections;

import java.util.logging.Level;
import java.util.logging.Logger;

@SuppressWarnings("unused")
public class StructuralSearchReplace {

    private Logger logger = Logger.getLogger(StructuralSearchReplace.class.getName());

    public void logSomething() {
        logger.log(Level.INFO, "A log message");
    }

    public void logSomethingElse() {
        logger.log(Level.WARNING, "Another log message", new RuntimeException("Something went wrong"));
    }

}
