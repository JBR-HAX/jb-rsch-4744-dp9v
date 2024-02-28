package org.jetbrains.assignment.models;


import jakarta.persistence.Entity;

@Entity
public class Move {
    private String direction;
    private int steps;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }
}
