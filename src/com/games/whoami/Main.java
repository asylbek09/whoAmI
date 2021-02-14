package com.games.whoami;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Character character = new CharacterDatabase();

        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to the guess game: Who Am I?" +
                "\nRules: keep guessing until you find the person or try guessing the name directly!" +
                "\nGood luck!");

        System.out.println("\n**********\n" + listNames(character) + "\n**********\n");

        while (character.size() != 1) {
            System.out.println("Select one of the features by entering: " +
                    "\n 1 - Hair, 2 - HairLength, 3 - Glasses, 4 - Cover, 5 - Beard \n");

            int featureSelection = input.nextInt();
            System.out.println(playerSelection(featureSelection) + " selected.");

            if (featureSelection != 2) {
                System.out.println("\nNow please write: *true* if your character has " + playerSelection(featureSelection)
                        + " or *false* if he/she doesn't.");

                boolean playerInput = input.nextBoolean();
                List<String> currentNames = playerOptionNames(character, featureSelection, playerInput);

                System.out.println("\n**********\n" + currentNames + "\n**********\n");
            } else {
                System.out.println("\n What is the hair length: ");
            }
        }

    }

    public static List<String> playerOptionNames(Character character, int selection, boolean playerInput) {
        List<String> names = new ArrayList<>();
        Collection<Person> people = null;
        switch (selection) {
            case 1:
                people = character.filterByHair(playerInput);
                break;
            case 3:
                people = character.filterByGlasses(playerInput);
                break;
            case 4:
                people = character.filterByCover(playerInput);
                break;
            case 5:
                people = character.filterByBeard(playerInput);
                break;
        }

        people.forEach(name -> {
            if (name.getName().length() > 0) {
                names.add(name.getName());
            }
        });

        return names;
    }

    public static List<String> listNames(Character character) {
        List<String> names = new ArrayList<>();
        character.getAll().forEach(name -> {
            if (name.getName().length() > 0) {
                names.add(name.getName());
            }
        });

        return names;
    }

    public static String playerSelection(int selection) {
        String choice = null;
        switch (selection) {
            case 1:
                choice = "Hair";
                break;
            case 2:
                choice = "HairLength";
                break;
            case 3:
                choice = "Glasses";
                break;
            case 4:
                choice = "Cover";
                break;
            case 5:
                choice = "Beard";
                break;
        }
        return choice;
    }
}