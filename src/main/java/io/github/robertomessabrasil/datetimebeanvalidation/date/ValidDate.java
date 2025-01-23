package io.github.robertomessabrasil.datetimebeanvalidation.date;

import jakarta.validation.Constraint;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {DateValidator.class})
@Documented
public @interface ValidDate {

    String message() default "Invalid date";

    Class[] groups() default {};

    Class[] payload() default {};

    String template() default "yyyy-MM-dd";

}
