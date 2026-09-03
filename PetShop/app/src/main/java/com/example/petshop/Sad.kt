package com.example.petshop

class Sad(date: String): Mood(date) {
    override fun repr(): String {
        return "Sad"
    }
}