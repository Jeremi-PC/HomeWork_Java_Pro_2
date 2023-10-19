package org.example.strings;

import java.util.Scanner;

import static org.example.strings.Strings.*;

// Создайте утилитарный класс, который будет хранить полезные методы работы со строками.
// В нём будет один приватный конструктор по умолчанию, а также только статические методы:
//generateWord – генерирует строку заданной длины, состоящую только из букв английского
// алфавита
//generateNumeric – генерирует строку заданной длины, состоящую из цифр
//splitByFirst – находит в строке первый символ, который не является буквой
// или цифрой и разделяет строку на части, используя найденный символ
// в качестве разделителя. Например, splitByFirst(“Я люблю Java!”) вернёт массив строк
// [“Я”, “люблю”, “Java!”], а splitByFirst(“Люди! Я люблю Java! Ура!”) вернёт массив строк
// [“Люди”, “ Я люблю Java”, “ Ура”, “”]
//  isNumeric – проверяет, состоит ли данная строка только из
// цифр (может быть распознана как целое неотрицательное число)
//  Используйте все методы в коде метода main.
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pls input length of generic char string:");
        int lengthStringChars = sc.nextInt();
        generateWord(lengthStringChars);

        System.out.println("Pls input length of generic numeric string:");
        int lengthStringNumeric = sc.nextInt();
        generateNumeric(lengthStringNumeric);
        sc.nextLine(); // строка для очистки буфера

        System.out.println("Pls input custom string with separators:");
        String stringForSplit = sc.nextLine();
        splitByFirst(stringForSplit);

        System.out.println("Pls input custom string");
        String stringForCheckForNumeric = sc.nextLine();
        isNumeric(stringForCheckForNumeric);

    }


}