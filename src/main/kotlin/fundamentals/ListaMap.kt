package fundamentals

val x_point = 15
val ezListMapPoints: MutableMap<Int,Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)

fun ezReport(){
    ezListMapPoints.forEach { (t, u) -> println("Id: $t = $u points!") }
}

fun updatePoints(accountId: Int){
    if(ezListMapPoints.containsKey(accountId)){
        ezListMapPoints[accountId] = ezListMapPoints.getValue(accountId) + x_point
    }else{
        println("Error! Id: $accountId not exists!")
    }
}

fun main() {
    ezReport()
    updatePoints(1)
    updatePoints(1)
    updatePoints(5)
    ezReport()
}