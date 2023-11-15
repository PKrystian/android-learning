package com.example.holidaypicker
class Destination {
    data class DestinationInfo(val name: String, val description: String)

    private val destinationList = listOf(
        DestinationInfo("Mordor", "A land of shadow and fire"),
        DestinationInfo("Rivendell", "A land of peace and beauty"),
        DestinationInfo("Summoner's Rift", "A land of conflict"),
        DestinationInfo("Bandle City", "A land of yordles"),
        DestinationInfo("Baldurs Gate", "A land of adventure"),
        DestinationInfo("Backrooms", "???????"),
    )

    fun getDestination(name: String): String
    {
        var choice = name[0]
        choice = choice.lowercaseChar()
        return if (choice in 'a'..'e')
            this.destinationList[0].name + " " + this.destinationList[0].description
        else if (choice in 'f'..'j')
            this.destinationList[1].name + " " + this.destinationList[1].description
        else if (choice in 'k'..'o')
            this.destinationList[2].name + " " + this.destinationList[2].description
        else if (choice in 'p'..'t')
            this.destinationList[3].name + " " + this.destinationList[3].description
        else if (choice in 'u'..'z')
            this.destinationList[4].name + " " + this.destinationList[4].description
        else
            this.destinationList[5].name + " " + this.destinationList[5].description
    }
}