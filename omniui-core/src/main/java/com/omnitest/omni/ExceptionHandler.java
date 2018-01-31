package com.omnitest.omni;

/**
 * Created by mgundala on 8/31/2017.
 */

public class ExceptionHandler extends Exception {


    public ExceptionHandler() {
        super("Pre Execution condition failed.");
    }

    public ExceptionHandler(String s) {
        super("Pre Execution condition failed." + s);
    }

    public ExceptionHandler(String s, Throwable throwable) {
        super(s, throwable);
    }

    public ExceptionHandler(Throwable throwable) {
        super(throwable);
    }

    protected ExceptionHandler(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}