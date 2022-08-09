fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    var temp = Array<Int>(a.size){0}
    
    for (i in 0 until a.size) {
        var index = i - (d%a.size)
        if (index < 0) {
            index += a.size
        }
        temp[index] = a[i]
    }
    
    return temp
}
