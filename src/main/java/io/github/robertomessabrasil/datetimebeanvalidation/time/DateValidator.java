package io.github.robertomessabrasil.datetimebeanvalidation.time;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateValidator
        implements ConstraintValidator<ValidTime, String> {

    private String template;

    public void initialize(ValidTime arg0) {
        template = arg0.template();
    }

    @Override
    public boolean isValid(String dateTime, ConstraintValidatorContext context) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(template);
            LocalTime localTime = LocalTime.parse(dateTime, formatter);
        } catch (DateTimeParseException ex) {
            return false;
        }
        return true;
    }
}
