package com.games.whoAmI;

import java.util.Collection;

public interface Character {
    public Person findByName(String name);
    public Collection<Person> findByKeyword(String keyword);
    public Collection<Person> findByHairLength(HairLength hairLength);
    public int size();
    public Collection<Person> getAll();
}
