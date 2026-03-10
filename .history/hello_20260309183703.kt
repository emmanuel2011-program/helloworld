fun main() {
    val studentName = "Okoye"
    val score = 85
    
    println("Assignment: Grade Checker")
    println("Student: $studentName")
    println("Score: $score")
    
    if (score >= 70) {
        println("Result: Distinction! Well done.")
    } else if (score >= 50) {
        println("Result: Pass.")
    } else {
        println("Result: Please try again.")
    }
}