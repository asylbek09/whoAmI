package com.games.whoAmI;

public class Person {
    private String name;
    private boolean hair;
    private HairLength hairLength;
    private boolean glasses;
    private boolean cover;
    private boolean beard;

    public Person(String name) {
        this.name = name;
    }
    public Person(String name, boolean hair, HairLength hairLength, boolean glasses, boolean cover, boolean beard) {
        this(name);
        this.hair = hair;
        this.hairLength = hairLength;
        this.glasses = glasses;
        this.cover = cover;
        this.beard = beard;
    }
    public String getName() {
        return name;
    }
    public boolean isHair() {
        return hair;
    }

    public HairLength getHairLength() {
        return hairLength;
    }

    public boolean isGlasses() {
        return glasses;
    }

    public boolean isCover() {
        return cover;
    }

    public boolean isBeard() {
        return beard;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName()
                + ", hair=" + isHair() + ", hairLength=" + getHairLength()
                + ", glasses=" + isGlasses() + ", hat=" + isCover() +
                ", beard=" + isBeard();
    }
}