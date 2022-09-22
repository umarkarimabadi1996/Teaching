package org.example.Lesson1;

public class Baller {
    public static void main(String[] args) {
        String umarsName = "Umar";
        int umarAbility = 9;

        String namzName = "Mohamed";
        int namzAbility = 9;

        String darrenname = "Darren";
        int darrenability = 2;

        String darrenlost = "darrenlost";
        String Umarlost = "Umarlost";
        String namzlost = "namzlost";

        String motaharsName = "Motahar";
        int motaharsAbility = 9;

        int potentialAbilityOfDarren = calculatePotentialAbility(darrenability, darrenname);

        System.out.println(potentialAbilityOfDarren);

    }

    public static int calculatePotentialAbility(int currentAbility, String name) {
        int potenialAbility =  currentAbility *2 + name.length() + 1;
        return potenialAbility;
    }



}