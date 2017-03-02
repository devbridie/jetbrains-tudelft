package com.devbridie.tudelft.jetbrains.refactoring;

/**
 * Demonstrates Replace Constructor with Builder/Factory.
 */
public class ReplaceConstructor {
    public Rectangle newRect() {
        return new Rectangle(0,0,20,20);
    }
}

class Rectangle {
    int x, y, w, h;

    /**
     * TODO: Code Review wants us to replace this constructor with
     * a builder or a factory!
     */
    public Rectangle(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }


}