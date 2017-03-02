package com.devbridie.tudelft.jetbrains.refactoring;

import java.awt.Graphics;

/**
 * Demonstrates the use of Change Function Signature.
 */
public class ChangeSignature {
    Graphics g;

    public void drawShapes() {
        drawRectangle(10, 10, 20, 25);
        drawRectangle(50, 10, 20, 25);
        drawRectangle(70, 20, 10, 15);
    }

    // TODO: we want to add a parameter `wireframe`
    public void drawRectangle(int x, int y, int w, int h) {
        g.drawRect(x, y, w, h);
    }
}
