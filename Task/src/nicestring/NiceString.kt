package nicestring

fun String.isNice() =
        listOf(containsAtLeastThreeVowels(), containsDoubleLetters(), doesNotContainIllegalSubstrings())
                .count { it } >= 2


private fun String.doesNotContainIllegalSubstrings() = setOf("bu", "ba", "be").all { it !in this }


private fun String.containsDoubleLetters() =
        this.foldIndexed(false) { index, acc, char ->
            (index != this.length - 1 && char == this[index + 1]) || acc
        }


private fun String.containsAtLeastThreeVowels() = this.count { it -> it.isVowel() } >= 3


private fun Char.isVowel() = this in setOf('a', 'e', 'i', 'o', 'u')

