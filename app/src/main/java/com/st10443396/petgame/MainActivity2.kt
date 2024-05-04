package com.st10443396.petgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {

    private var hungerLevel = 0
    private var bathLevel = 0
    private var playingLevel = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnFeed = findViewById<Button>(R.id.btnFeed)
        val btnBath = findViewById<Button>(R.id.btnBath)
        val btnFun = findViewById<Button>(R.id.btnFun)

        btnFeed.setOnClickListener {
            feedpet()
        }

        btnBath.setOnClickListener {
            bathPet()
        }

        btnFun.setOnClickListener {
            playWithPet()
        }


    }

    private fun playWithPet() {
        // Add logic to play with the pet
        playingLevel += 10
        updatePetStatus()
    }

    private fun bathPet() {
        // Add logic to bath the pet
        bathLevel += 10
        updatePetStatus()
    }

    private fun feedpet() {
        TODO("Not yet implemented")
        // Add logic to feed the pet
        hungerLevel -= 10
        updatePetStatus()
    }

    private fun updatePetStatus() {
        TODO("Not yet implemented")
        //Update UI to reflect pet's status
        //For instance, update TextView with play, bath, and feed Levels
    }
}