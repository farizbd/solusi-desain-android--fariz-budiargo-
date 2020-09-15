import java.util.Scanner;

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    print("Nama: ")
    val nama = input.nextLine()

    if (nama == ""){
        println("Hello World")
    }
    else if (nama == " "){
        println("Hello World")
    }
    else {
        println("Hello $nama ")
    }
}