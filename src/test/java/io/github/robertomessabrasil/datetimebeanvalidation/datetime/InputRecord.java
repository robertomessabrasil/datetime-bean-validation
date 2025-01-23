package io.github.robertomessabrasil.datetimebeanvalidation.datetime;


public record InputRecord(
        @ValidDateTime(template = "yyyy-MM-dd HH:mm")
        String dateTime
) {
}
