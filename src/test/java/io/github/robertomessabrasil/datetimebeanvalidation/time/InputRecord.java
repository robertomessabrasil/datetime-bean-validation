package io.github.robertomessabrasil.datetimebeanvalidation.time;


import io.github.robertomessabrasil.datetimebeanvalidation.datetime.ValidDateTime;

public record InputRecord(
        @ValidTime(template = "HH:mm")
        String time
) {
}
