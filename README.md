# datetime-bean-validation
Maven dependency with Bean Validation for datetime, date and time

# How to use
Get the current version from maven central and use it in your POM
[https://central.sonatype.com/artifact/io.github.robertomessabrasil/datetime-bean-validation](https://central.sonatype.com/artifact/io.github.robertomessabrasil/datetime-bean-validation)

# Examples
To validate date and time
```
public record InputRecord(
        @ValidDateTime(template = "yyyy-MM-dd HH:mm")
        String dateTime
) {
}
```
To validate date
```
public record InputRecord(
        @ValidDate(template = "yyyy-MM-dd")
        String date
) {
}
```
To validate time
```
public record InputRecord(
        @ValidTime(template = "HH:mm")
        String time
) {
}
```
# Motivation
[Date and Time validation for cluster environments](https://www.linkedin.com/article/edit/7288056814754000896/)
