package io.github.robertomessabrasil.datetimebeanvalidation.date;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateValidator
        implements ConstraintValidator<ValidDate, String> {

    private String template;

    public void initialize(ValidDate arg0) {
        template = arg0.template();
    }

    @Override
    public boolean isValid(String dateTime, ConstraintValidatorContext context) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(template);
            LocalDate localDate = LocalDate.parse(dateTime, formatter);
        } catch (DateTimeParseException ex) {
            return false;
        }
        return true;
    }
}
