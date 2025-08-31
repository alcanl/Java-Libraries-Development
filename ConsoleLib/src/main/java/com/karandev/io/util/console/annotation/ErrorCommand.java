/*
 * Copyleft (c) 1993 by C and System Programmers Association (CSD)
 * All Rights Free
 */
package com.karandev.io.util.console.annotation;

import java.lang.annotation.*;

/**
 * Annotation to mark a method as an error command in a console-based application.
 *
 * <p>Methods annotated with {@code @ErrorCommand} are intended to handle error scenarios
 * or provide error-specific command functionality within the console framework.
 *
 * @author JavaApp2-Jan-2024 Group
 * @version 1.0.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ErrorCommand {
}