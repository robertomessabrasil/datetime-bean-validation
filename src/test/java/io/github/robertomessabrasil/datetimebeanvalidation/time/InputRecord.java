package io.github.robertomessabrasil.datetimebeanvalidation.time;


public record InputRecord(
        @ValidTime(template = "HH:mm")
        String time
) {
}
