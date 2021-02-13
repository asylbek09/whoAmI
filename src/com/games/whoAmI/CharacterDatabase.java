package com.games.whoAmI;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CharacterDatabase implements Character {

    private List<Person> characterDB = Arrays.asList(
      new Person("Mahatma Gandi", false, HairLength.BOLD, true, false, false),
      new Person("Muhammad Ali", true, HairLength.SHORT, false, false, false),
      new Person("Marilyn Monroe", true, HairLength.MEDIUM, false, false, false),
      new Person("Abraham Lincoln", true, HairLength.SHORT, false, true, true),
      new Person("Mother Teresa", true, HairLength.LONG, false, true, false),
      new Person("Charles Darwin", false, HairLength.BOLD, false, false, true),
      new Person("Queen Victoria", true, HairLength.LONG, false, true, false),
      new Person("Leonardo da Vinci", false, HairLength.BOLD, false, false, true),
      new Person("Franklin Roosevelt", true, HairLength.SHORT, true, false, false),
      new Person("JK Rowling", true, HairLength.LONG, false, false, false)
    );

    @Override
    public Person findByName(String name) {
        return null;
    }

    @Override
    public Collection<Person> findByKeyword(String keyword) {
        return null;
    }

    @Override
    public Collection<Person> findByHairLength(HairLength hairLength) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Collection<Person> getAll() {
        return null;
    }
}