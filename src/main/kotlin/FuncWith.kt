import java.sql.Time

class ConfigurationConnect(val host: String, val port: String)

fun getExecutionTime(startTime: Long) {
    val endTime = System.currentTimeMillis()
    val elapsedTime = startTime - endTime
    println("Tempo de execução: $elapsedTime ms \n")
}

fun main() {
    val startTime = System.currentTimeMillis()
    val configuration = ConfigurationConnect("127.0.0.1", "8080")
    
    with(configuration) {
        println("$host:$port")
    }


    //alternative with run
    configuration.run {
        println("$host:$port")
    }


    //alternative with let
    configuration.let {
        println("${it.host}:${it.port}")
    }


    //others alternatives
    with(ConfigurationConnect("127.0.0.1", "8080")) {
        println("$host:$port")
    }


    ConfigurationConnect("192.168.1.1", "5000").run {
        println("$host:$port")
    }


    ConfigurationConnect("192.168.1.1", "5000").let {
        println("${it.host}:${it.port}")
    }
    getExecutionTime(startTime)
}
