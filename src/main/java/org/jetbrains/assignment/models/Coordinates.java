package org.jetbrains.assignment.models;


import jakarta.persistence.Entity;

@Entity
public class Coordinates {
    public int x;
    public int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
