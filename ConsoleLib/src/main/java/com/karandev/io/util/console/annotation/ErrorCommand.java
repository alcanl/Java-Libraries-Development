package com.karandev.io.util.console.annotation;

import java.lang.annotation.*;

/**
 * Annotation to mark a method as an error command in a console-based application.
 *
 * <p>Methods annotated with {@code @ErrorCommand} are intended to handle error scenarios
 * or provide error-specific command functionality within the console framework.
 *
 * <p>Copyleft (c) 1993 by C and System Programmers Association (CSD)
 * All Rights Free
 *
 * @author CSD Development Group
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ErrorCommand {
}