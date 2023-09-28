package org.example;

import java.util.Scanner;

public class CalculatorMni {
    private double real;
    private double imaginary;

    /**
     * Создали временное хранилище для реальных и мнимых чисел
     */
    public CalculatorMni() {
        System.out.println("Введите комплексное число");
        this.real = getUserInput();
        this.imaginary = getUserInput();

    }

    /**
     * Создали метод для взятия значений введенных пользователем
     *
     * @return возвращает запрос на введение числа
     */
    public double getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        return scanner.nextDouble();
    }

    /**
     * @return возвращает реальное число
     */
    public double getReal() {
        return real;
    }

    /**
     * @return возвращает мнимое число
     */
    public double getImaginary() {
        return imaginary;
    }

    /**
     * Метод, который производит сложение реальных и мнимых чисел
     *
     * @param c переменная, которая хранит в себе значение, введённое пользователем
     */
    public void add(CalculatorMni c) {
        real += c.real;
        imaginary += c.imaginary;
    }

    /**
     * Метод, который производит вычитание реальных и мнимых чисел
     *
     * @param c переменная, которая хранит в себе значение, введённое пользователем
     */
    public void subtract(CalculatorMni c) {
        real -= c.real;
        imaginary -= c.imaginary;
    }

    /**
     * Метод, который производит умножение реальных и мнимых чисел
     *
     * @param c переменная, которая хранит в себе значение, введённое пользователем
     */
    public void multiply(CalculatorMni c) {
        double tempReal = real;
        double tempImaginary = imaginary;
        real = (tempReal * c.real) - (tempImaginary * c.imaginary);
        imaginary = (tempReal * c.imaginary) + (tempImaginary * c.real);
    }

    /**
     * Метод, который производит деление реальных и мнимых чисел
     *
     * @param c переменная, которая хранит в себе значение, введённое пользователем
     */
    public void divide(CalculatorMni c) {
        double tempReal = real;
        double tempImaginary = imaginary;
        double temp = (c.real * c.real) + (c.imaginary * c.imaginary);
        real = ((tempReal * c.real) + (tempImaginary * c.imaginary)) / temp;
        imaginary = ((tempImaginary * c.real) - (tempReal * c.imaginary)) / temp;
    }
}

class m {
    public static void main(String[] args) {
        CalculatorMni c1 = new CalculatorMni();
        CalculatorMni c2 = new CalculatorMni();

        c1.add(c2);

        System.out.println("Сумма реальных и мнимых чисел равна: " + c1.getReal() + " + " + c1.getImaginary() + "i");

        c1.subtract(c2);

        System.out.println("Разность реальных и мнимых чисел равна: " + c1.getReal() + " + " + c1.getImaginary() + "i");

        c1.multiply(c2);

        System.out.println("Произведение реальных и мнимых чисел равна: " + c1.getReal() + " + " + c1.getImaginary() + "i");

        c1.divide(c2);

        System.out.println("Частное реальных и мнимых чисел равна: " + c1.getReal() + " + " + c1.getImaginary() + "i");
    }
}
