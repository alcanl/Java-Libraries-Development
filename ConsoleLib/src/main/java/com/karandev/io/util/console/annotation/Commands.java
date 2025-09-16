package com.karandev.io.util.console.annotation;

import java.lang.annotation.*;

/**
 * Container annotation for repeating {@link Command} annotations on a method.
 *
 * <p>This annotation allows multiple {@code @Command} annotations to be applied
 * to a single method, enabling the method to be registered under multiple command names.
 *
 * <p>Copyleft (c) 1993 by C and System Programmers Association (CSD)
 * All Rights Free
 *
 * @see Command
 *
 * @author CSD Development Group
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Commands {
    Command [] value();
}