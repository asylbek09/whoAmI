package com.games.whoami.test;
import com.games.whoami.Character;
import com.games.whoami.CharacterDatabase;
import com.games.whoami.HairLength;

import java.util.Scanner;

public class CharacterDatabaseTest {

    public static void main(String[] args) {
        Character character = new CharacterDatabase();

        Scanner input = new Scanner(System.in);

        /*System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println(character.filterByName(name));*/

        /*System.out.println("Does he/she have hair: ");
        boolean hair = input.nextBoolean();
        System.out.println(character.filterByIsHair(hair));*/

        System.out.println("Glasses: ");
        boolean glass = input.nextBoolean();
        System.out.println(character.filterByGlasses(glass));

    }
}