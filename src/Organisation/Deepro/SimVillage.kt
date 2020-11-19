package Organisation.Deepro

fun main(args: Array<String>) {

        runSimulation("Deepro", ::printConstructionCost) {
                playerName, numBuildings ->
            val currentYear = 2020
            println("Adding $numBuildings houses")
            "Welcome to SimVillage, $playerName! (copyright $currentYear)"

        }



}

inline fun runSimulation (playerName: String, costPrinter: (Int) -> Unit, greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last() //randomly selects 1, 2 or 3
    costPrinter(numBuildings)
    println(greetingFunction(playerName, numBuildings))
}

fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuildings}")
}