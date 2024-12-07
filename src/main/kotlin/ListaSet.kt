val issuesDesc = mutableSetOf("Issues1", "Issues2", "Issues3")

fun addNewIssues(desc: String) = issuesDesc.add(desc)
fun getStatus(isAdded: Boolean) = if (isAdded) "Has add with success!" else "Error! has not add. Duplicate!"

fun main() {
    val newIssues = "Issues4"
    val anNewIssues = "Issues2"

    issuesDesc.forEach { i -> println(i) }
    println("------------------------------------")

    println("${newIssues.toString()} >> ${getStatus(addNewIssues(newIssues))}")
    println("${anNewIssues.toString()} >> ${getStatus(addNewIssues(anNewIssues))}")

    println("------------------------------------")
    issuesDesc.forEach { i -> println(i) }
}