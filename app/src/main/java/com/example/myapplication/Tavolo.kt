package com.example.myapplication

import java.util.Scanner

data class Tavolo(val numero: Int, var occupato: Boolean = false)

class RistoranteSushi {
    private val tavoli = mutableListOf<Tavolo>()

    init {
        // Inizializzazione dei tavoli
        for (i in 1..10) {
            tavoli.add(Tavolo(i))
        }
    }

    fun visualizzaStatoTavoli() {
        for (tavolo in tavoli) {
            val stato = if (tavolo.occupato) "Occupato" else "Libero"
            println("Tavolo ${tavolo.numero}: $stato")
        }
    }

    fun prenotaTavolo(numeroTavolo: Int) {
        val tavolo = tavoli.find { it.numero == numeroTavolo }

        if (tavolo != null) {
            if (!tavolo.occupato) {
                tavolo.occupato = true
                println("Il tavolo ${tavolo.numero} è stato prenotato.")
            } else {
                println("Il tavolo ${tavolo.numero} è già occupato.")
            }
        } else {
            println("Tavolo non trovato.")
        }
    }

    fun liberaTavolo(numeroTavolo: Int) {
        val tavolo = tavoli.find { it.numero == numeroTavolo }

        if (tavolo != null) {
            if (tavolo.occupato) {
                tavolo.occupato = false
                println("Il tavolo ${tavolo.numero} è stato liberato.")
            } else {
                println("Il tavolo ${tavolo.numero} è già libero.")
            }
        } else {
            println("Tavolo non trovato.")
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val ristorante = RistoranteSushi()

    while (true) {
        println("1. Visualizza stato tavoli")
        println("2. Libera tavolo")
        println("3. Esci")

        print("Scelta: ")
        when (scanner.nextInt()) {
            1 -> ristorante.visualizzaStatoTavoli()
            2 -> {
                print("Inserisci il numero del tavolo da liberare: ")
                val numeroTavolo = scanner.nextInt()
                ristorante.liberaTavolo(numeroTavolo)
            }
            3 -> {
                println("Arrivederci!")
                return
            }
            else -> println("Scelta non valida. Riprova.")
        }
    }
}
