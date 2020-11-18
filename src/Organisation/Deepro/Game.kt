package Organisation.Deepro

fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 100
    healthPoints -= 11
    val isBlessed = true
    val isImmortal = false

    //Aura
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColour = if (auraVisible) "GREEN" else "NONE"

    val healthStatus = when (healthPoints) {

        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 ->
            if (isBlessed) {
                "has some minor wounds but is healing quite quickly!"
            } else {
                "has some minor wounds."
            }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }
    println("(Aura: $auraColour) " + "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    //Player Status
    println("$name $healthStatus")
}

