package com.example.petshop

class Happy(date: String): Mood(date) {
    override fun repr(): String {
        return "Happy"
    }
}