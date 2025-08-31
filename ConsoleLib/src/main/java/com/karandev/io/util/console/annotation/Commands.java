/*
 * Copyleft (c) 1993 by C and System Programmers Association (CSD)
 * All Rights Free
 */
package com.karandev.io.util.console.annotation;

import java.lang.annotation.*;

/**
 * Container annotation for repeating {@link Command} annotations on a method.
 *
 * <p>This annotation allows multiple {@code @Command} annotations to be applied
 * to a single method, enabling the method to be registered under multiple command names.
 *
 * @see Command
 *
 * @author JavaApp2-Jan-2024 Group
 * @version 1.0.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Commands {
    Command [] value();
}