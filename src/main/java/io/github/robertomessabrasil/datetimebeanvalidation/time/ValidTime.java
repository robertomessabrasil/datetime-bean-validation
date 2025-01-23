package io.github.robertomessabrasil.datetimebeanvalidation.time;

import jakarta.validation.Constraint;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {DateValidator.class})
@Documented
public @interface ValidTime {

    String message() default "Invalid time";

    Class[] groups() default {};

    Class[] payload() default {};

    String template() default "HH:mm:ss";

}
