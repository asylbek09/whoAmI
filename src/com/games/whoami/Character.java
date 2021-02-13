package com.games.whoami;

import java.util.Collection;

public interface Character {
    public Collection<Person> filterByName(String name);
    public Collection<Person> filterByHair(boolean hair);
    public Collection<Person> filterByHairLength(HairLength hairLength);
    public Collection<Person> filterByGlasses(boolean glasses);
    public Collection<Person> filterByCover(boolean cover);
    public Collection<Person> filterByBeard(boolean beard);
    public int size();
    public Collection<Person> getAll();
}
