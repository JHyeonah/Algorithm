fun whatFlavors(cost: Array<Int>, money: Int): Unit {
    val map = HashMap<Int, Int>()
    
    for (i in 0 until cost.size) {
        if (map.containsKey(money - cost[i])) {
            println("${map.get(money - cost[i])} ${i+1}")
        } else {
            map.put(cost[i], i+1)
        }
    }
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val money = readLine()!!.trim().toInt()

        val n = readLine()!!.trim().toInt()

        val cost = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        whatFlavors(cost, money)
    }
}
