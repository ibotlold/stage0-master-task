package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        StringBuilder builder = new StringBuilder().append("This animal is mostly ").append(color).append(". It has ").append(numberOfPaws).append(" ");
        if (numberOfPaws > 1) {
            builder.append("paws");
        } else {
            builder.append("paw");
        }
        builder.append(" and ");
        if (this.hasFur) {
            builder.append("a");
        } else {
            builder.append("no");
        }
        builder.append(" fur.");
        return builder.toString();
    }

}
