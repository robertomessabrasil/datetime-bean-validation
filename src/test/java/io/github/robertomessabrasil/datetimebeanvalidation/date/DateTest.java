package io.github.robertomessabrasil.datetimebeanvalidation.date;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class DateTest {
    @Test
    void whenValidStringGiven_ThenValidDate() {

        InputRecord inputRecord = new InputRecord("2025-01-01");

        Set<ConstraintViolation<InputRecord>> violations = Validation
                .buildDefaultValidatorFactory()
                .getValidator()
                .validate(inputRecord);

        Assertions.assertTrue(violations.isEmpty());
    }
}
