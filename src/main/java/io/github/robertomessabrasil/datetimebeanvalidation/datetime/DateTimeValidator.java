package io.github.robertomessabrasil.datetimebeanvalidation.datetime;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateTimeValidator
        implements ConstraintValidator<ValidDateTime, String> {

    private String template;

    public void initialize(ValidDateTime arg0) {
        template = arg0.template();
    }

    @Override
    public boolean isValid(String dateTime, ConstraintValidatorContext context) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(template);
            LocalDateTime localDateTime = LocalDateTime.parse(dateTime, formatter);
        } catch (DateTimeParseException ex) {
            return false;
        }
        return true;
    }
}
