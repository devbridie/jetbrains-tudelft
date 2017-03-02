package com.devbridie.tudelft.jetbrains.refactoring;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;

/**
 * Demonstrates Convert Anonymous class to Inner class
 * as well as IntelliJ IDEA's code duplication detection.
 */
public class ConvertAnonymous {

    public void bindComponents() {
        JMenuItem closeWindowMenuItem = new JMenuItem();
        closeWindowMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // window closed
                System.out.println("Window closed.");
            }
        });

        JButton closeWindowButton = new JButton();
        closeWindowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // window closed
                System.out.println("Window closed.");
            }
        });
    }
}
