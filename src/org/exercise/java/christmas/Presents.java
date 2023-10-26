package org.exercise.java.christmas;

public class Presents {
    private final String person;
    private final String description;

    public Presents(String person, String description) {
        this.person = person;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Presents{" +
                "person='" + person + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
