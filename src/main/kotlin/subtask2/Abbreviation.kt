package subtask2

class Abbreviation {
    fun abbreviationFromA(a: String, b: String): String {
        val charSequence = b.toCharArray()
        val sourceString = a.toUpperCase()
        for (i in charSequence.indices)
            if (charSequence[i].toUpperCase() !in sourceString.substring(i))
                return "NO"
        return "YES"
    }
}
