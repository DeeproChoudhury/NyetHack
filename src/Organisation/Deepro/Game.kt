package Organisation.Deepro

fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 100
    healthPoints -= 11
    val isBlessed = true
    val isImmortal = false
    val auraColour = auraColour(isBlessed, healthPoints, isImmortal)


    printPlayerStatus(healthPoints, isBlessed, auraColour, name)
    castFireball()
}

private fun printPlayerStatus(
    healthPoints: Int,
    isBlessed: Boolean,
    auraColour: String,
    name: String)
{
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)
    println("(Aura: $auraColour) " + "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    //Player Status
    println("$name $healthStatus")
}

private fun auraColour(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean): String {
    //Aura
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColour = if (auraVisible) "GREEN" else "NONE"
    return auraColour
}

private fun castFireball(numFireballs: Int = 2) =
    println("A glass of fireball springs into existence. (x$numFireballs)")


private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
    when (healthPoints) {

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

