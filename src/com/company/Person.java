package com.company;

public class Person {

    private String name;
    private int age;
    private boolean likeBardy;
    private boolean hasBardy;
    private int bardiesOwned;

    public Person(String name, int age, boolean likeBardy, boolean hasBardy, int bardiesOwned) {
        this.name = name;
        this.age = age;
        this.likeBardy = likeBardy;
        this.hasBardy = hasBardy;
        this.bardiesOwned = bardiesOwned;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLikeBardy() {
        return likeBardy;
    }

    public void setLikeBardy(boolean likeBardy) {
        this.likeBardy = likeBardy;
    }

    public boolean isHasBardy() {
        return hasBardy;
    }

    public void setHasBardy(boolean hasBardy) {
        this.hasBardy = hasBardy;
    }

    public int getBardiesOwned() {
        return bardiesOwned;
    }

    public void setBardiesOwned(int bardiesOwned) {
        this.bardiesOwned = bardiesOwned;
    }
}
