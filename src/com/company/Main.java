package com.company;

public class Main {
    public static void main(String[] args) {
        Father ObjectA = new Father(EyeColor.GRAY, "Тима", 31, new Job("Юрист"));
        Son ObjectB = new Son(EyeColor.GREEN, "Жакшылык", 15, new Job("Ученик"));
        Son ObjectC = new Son(EyeColor.BLACK, "Данияр", 21, new Job("Студент"));

        ObjectA.getInfo();
        ObjectB.getInfo();
        ObjectC.getInfo();
    }
}
