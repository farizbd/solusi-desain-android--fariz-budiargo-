import java.util.Scanner;

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    print("masukkan baris angka pertama: ")
    val barisPertama = input.nextLine()

    print("masukkan baris angka kedua: ")
    val bariskedua = input.nextLine()

    print("masukkan baris angka ketiga: ")
    val barisketiga = input.nextLine()

    println("[[ $barisPertama ],[ $bariskedua ],[ $barisketiga ]]")

}