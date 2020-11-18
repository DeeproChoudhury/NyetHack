package Organisation.Deepro

fun main(args: Array<String>) {

        val greetingFunction = {
                playerName: String, numBuildings: Int ->
            val currentYear = 2020
            println("Adding $numBuildings houses")
            "Welcome to SimVillage, $playerName! (copyright $currentYear)"

        }


    runSimulation("Deepro", greetingFunction)
}

fun runSimulation (playerName: String, greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last() //randomly selects 1, 2 or 3
    println(greetingFunction(playerName, numBuildings))
}