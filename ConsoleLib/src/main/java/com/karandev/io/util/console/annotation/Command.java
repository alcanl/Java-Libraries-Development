package com.karandev.io.util.console.annotation;

import java.lang.annotation.*;

/**
 * Annotation to mark a method as a console command.
 *
 * <p>Methods annotated with {@code @Command} can be discovered and invoked as commands
 * in a console-based application. The annotation can be repeated on the same method
 * using the {@link Commands} container annotation.
 *
 * <p>Copyleft (c) 1993 by C and System Programmers Association (CSD)
 * All Rights Free
 *
 * @see Commands
 *
 * @author CSD Development Group
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(Commands.class)
public @interface Command {
    String value() default "";
}