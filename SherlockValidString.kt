fun isValid(s: String): String {
    val map = HashMap<Char, Int>()
    
    for (ch in s) {
        map.put(ch, map.getOrDefault(ch, 0) + 1)
    }
    
    val freq = ArrayList<Int>()
    for ((key, value) in map) {
        freq.add(value)
    }
    
    val freqMap = HashMap<Int, Int>()
    for (i in freq) {
        freqMap.put(i, freqMap.getOrDefault(i, 0) + 1)
    }
    
    val valueList = ArrayList<Int>()
    val keyList = ArrayList<Int>()
    for ((key, value) in freqMap) {
        keyList.add(key)
        valueList.add(value)
    }
    
    if (valueList.size == 1) {
        return "YES"
    } else if (valueList.size == 2) {
        var oneCount = 0
        var oneKey = -1
        for (i in 0 until valueList.size) {
            if (valueList[i] == 1)  {
                oneCount++
                oneKey = keyList[i]   
            }
        }
        
        if (oneCount > 1 || oneCount == 0) {
            return "NO"
        } else {
            var abs = Math.abs(keyList[0] - keyList[1])
            if (abs == 1) 
                return "YES"
                
            if (oneKey == 1) 
                return "YES"
        }
    }
    
    return "NO"
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = isValid(s)

    println(result)
}
