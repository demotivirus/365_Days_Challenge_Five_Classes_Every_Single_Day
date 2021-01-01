package com.demotivirus.Day_010.main;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode{
    String value() default "CODE";
    String message() default "must start with CODE";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
