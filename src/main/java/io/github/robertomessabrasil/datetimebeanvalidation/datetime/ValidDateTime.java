package io.github.robertomessabrasil.datetimebeanvalidation.datetime;

import jakarta.validation.Constraint;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {DateTimeValidator.class})
@Documented
public @interface ValidDateTime {

    String message() default "Invalid datetime";

    Class[] groups() default {};

    Class[] payload() default {};

    String template() default "yyyy-MM-dd HH:mm:ss";

}
