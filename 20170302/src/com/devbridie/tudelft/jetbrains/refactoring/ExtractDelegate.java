package com.devbridie.tudelft.jetbrains.refactoring;

/**
 * Demonstrates Extract Delegate.
 */
public class ExtractDelegate {
    public void createWindow() {
        new Window(10, 10, 30, 30);
    }
}

class Window {
    // TODO refactor x and y to a new class Position
    int x;
    int y;
    // TODO refactor w and h to a new class Dimension
    int w;
    int h;

    public Window(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
}
