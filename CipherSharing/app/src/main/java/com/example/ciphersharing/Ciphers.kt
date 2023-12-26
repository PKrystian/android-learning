package com.example.ciphersharing

class Ciphers {

    var ciphersList = arrayOf("Caesar(3)", "Atbash", "ROT13", "Bacon")

    fun caesarCipher(text: String, shift: Int = 3): String {
        var result = ""
        for (element in text) {
            if (element.isLetter()) {
                var newElement = element + shift
                if (newElement > 'z') {
                    newElement -= 26
                }
                result += newElement
            } else {
                result += element
            }
        }
        return result
    }


    fun atbashCipher(text: String): String {
        var result = ""
        for (element in text) {
            if (element.isLetter()) {
                var newElement = 'z' - (element - 'a')
                result += newElement
            } else {
                result += element
            }
        }
        return result
    }

    fun rot13Cipher(text: String): String {
        var result = ""
        for (element in text) {
            if (element.isLetter()) {
                var newElement = element + 13
                if (newElement > 'z') {
                    newElement -= 26
                }
                result += newElement
            } else {
                result += element
            }
        }
        return result
    }

    fun baconCipher(text: String): String {
        var result = ""
        for (element in text) {
            if (element.isLetter()) {
                var newElement = ""
                if (element.isUpperCase()) {
                    newElement += "B"
                } else {
                    newElement += "A"
                }
                var binary = Integer.toBinaryString(element.toInt() - 'a'.toInt())
                while (binary.length < 5) {
                    binary = "0$binary"
                }
                newElement += binary
                result += newElement
            } else {
                result += element
            }
        }
        return result
    }
}