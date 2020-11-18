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
    println(auraColour)

    val healthStatus = if (healthPoints == 100) {

            "is in excellent condition!"

        } else if (healthPoints in 90..99) {
            "has a few scratches."
        } else if (healthPoints in 75..89) {
            if (isBlessed) {
                "has some minor wounds but is healing quite quickly!"
            } else {
                "has some minor wounds."
            }
        } else if (healthPoints in 15..74) {
            "looks pretty hurt."
        } else {
            "is in awful condition!"
        }
    //Player Status
    println(name + " " + healthStatus)
    }


