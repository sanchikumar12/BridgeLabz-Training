package com.oopspracticescenariobasedquestions.petpal;


public class Pet implements IInteractable {

    private String name;
    private String type;
    private int age;
    private int hunger;  // 0 = full, 100 = very hungry
    private int mood;    // 0 = sad, 100 = happy
    private int energy;  // 0 = tired, 100 = energetic

    public Pet() {
        this("xyz", "unknown", 1, 50, 50, 50);
    }

    public Pet(String name, String type, int age, int hunger, int mood, int energy) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.mood = mood;
        this.energy = energy;
    }


    public void feed() {
        hunger = Math.max(0, hunger - 10);
        mood = Math.min(100, mood + 5);
        System.out.println(name + " has been fed");
    }
    public void play() {
        energy = Math.max(0, energy - 10);
        mood = Math.min(100, mood + 10);
        hunger = Math.min(100, hunger + 5);
        System.out.println(name + " is playing");
    }
    @Override
    public void sleep() {
        energy = Math.min(100, energy + 20);
        hunger = Math.min(100, hunger + 5);
        System.out.println(name + " is sleeping");
    }

    public void makeSound() {
        System.out.println("Generic pet sound");
    }
    //only getters (no setters for mood/hunger/energy)
    public int getHunger() { return hunger; }
    public int getMood() { return mood; }
    public int getEnergy() { return energy; }
}
