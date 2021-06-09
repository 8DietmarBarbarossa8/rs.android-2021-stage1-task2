package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

class DateFormatter {
    fun toTextDay(day: String, month: String, year: String): String =
        try {
            LocalDate.of(year.toInt(), month.toInt(), day.toInt())
                .format(DateTimeFormatter.ofPattern("d MMMM, EEEE")
                .withLocale(Locale.forLanguageTag("Ru")))
        } catch (e: Exception) { "Такого дня не существует" }
}