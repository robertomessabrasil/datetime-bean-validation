package io.github.robertomessabrasil.datetimebeanvalidation.date;


public record InputRecord(
        @ValidDate(template = "yyyy-MM-dd")
        String date
) {
}
