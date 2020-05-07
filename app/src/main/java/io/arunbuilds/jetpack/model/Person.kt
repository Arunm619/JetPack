package io.arunbuilds.jetpack.model

import java.util.*

data class Person(val name: String, val age: Int)

fun getRandomPerson(): Person = Person(getRandomName(), getRandomAge())

fun getRandomAge(): Int {
    return Random().nextInt(30)
}

fun getRandomName(): String {
    return randomIdentifier()
}


const val lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890"

val rand = Random()

// consider using a Map<String,Boolean> to say whether the identifier is being used or not
val identifiers: Set<String> = HashSet()

fun randomIdentifier(): String {
    var builder = StringBuilder()
    while (builder.toString().isEmpty()) {
        val length = rand.nextInt(5) + 5
        for (i in 0 until length) {
            builder.append(lexicon[rand.nextInt(lexicon.length)])
        }
        if (identifiers.contains(builder.toString())) {
            builder = StringBuilder()
        }
    }
    return builder.toString()
}