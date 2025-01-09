import java.sql.Time

class ConfigurationConnect(val host: String, val port: String)

fun getExecutionTime(startTime: Long) {
    val endTime = System.currentTimeMillis()
    val elapsedTime = startTime - endTime
    println("Tempo de execução: $elapsedTime ms \n")
}

fun main() {
    var startTime = System.currentTimeMillis()

    val configuration = ConfigurationConnect("127.0.0.1", "8080")
    with(configuration) {
        println("$host:$port")
    }
    getExecutionTime(startTime)


    //alternative with run
    startTime = System.currentTimeMillis()
    configuration.run {
        println("$host:$port")
    }
    getExecutionTime(startTime)

    //alternative with let
    startTime = System.currentTimeMillis()
    configuration.let {
        println("${it.host}:${it.port}")
    }
    getExecutionTime(startTime)

    //others alternatives
    startTime = System.currentTimeMillis()
    with(ConfigurationConnect("127.0.0.1", "8080")) {
        println("$host:$port")
    }
    getExecutionTime(startTime)

    startTime = System.currentTimeMillis()
    ConfigurationConnect("192.168.1.1", "5000").run {
        println("$host:$port")
    }
    getExecutionTime(startTime)

    startTime = System.currentTimeMillis()
    ConfigurationConnect("192.168.1.1", "5000").let {
        println("${it.host}:${it.port}")
    }
    getExecutionTime(startTime)
}
