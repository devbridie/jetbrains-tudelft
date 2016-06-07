import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Presentation file for the 9th of June
 * Showcasing IntelliJ IDEA's hotkeys and other features
 */
public class ShortcutDemo {

    /**
     * Generate methods
     * Find Usages: Alt+F7
     */
    public void getCoffee() {

    }


    /**
     * Demonstration Intent Menu
     * Smart Join: Control+Shift+J
     * Clipboard:
     */
    public String getLongDescription() {
        final String className = "ShortcutDemo";
        return "This is a long description " +
                "that has been split over multiple lines. " +
                "It has been provided by " + className;
    }

    /**
     * Code completion: Enter vs Tab
     * Documentation view: Control+Q
     */

    public boolean contains(String first, String second) {
        //obviously incorrect:
        return first.equals(second);
    }

    /**
     * Instanceof smart casting
     * Check intent menu!
     * Parameter Info: Control+Q
     */
    public InputStream streamOf(Object o) throws Throwable {
        if (o instanceof File) {
        }
        return null;
    }

    /**
     * Smart multi-cursors
     * See courses.txt
     * Intent list: Control+Shift+A
     */
    public void logCourses() {

    }

    /**
     * Navigation && Bookmarks
     * Navigate file: Control+F12
     */
    public void bookmark() {

    }

    /**
     * Extracting methods: Control+Shift+M (also, Control+Shift+(V, F, P, C)...)
     * Showcases IntelliJ IDEA's anti- code duplication tools
     *
     * Expression selection tool: Control+W
     */
    public void splitNumbers(List<Integer> in) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        int modNumber = 0;
        for (Integer i : in) {
            if (i % 2 == modNumber) {
                even.add(i);
            }
        }

        modNumber = 1;
        for (Integer i : in) {
            if (i % 2 == modNumber) {
                odd.add(i);
            }
        }
    }

    /**
     * Code templates
     * Command+J: list available templates
     */
    public void forNumber() {
        List<Integer> in = new ArrayList<>();
        // for, fori, forr

        Object o = new Object();
        // nn

    }

    /**
     * Other intents
     */
    public void complicatedConditionals(boolean a, boolean b, boolean c, boolean d) {
        if (!(!(c || d) || !(a || b))) {
            System.out.println("!(!(c || d) || !(a || b)) evaluates to true!");
        }
    }

    /**
     * Productivity Guide
     */


    /**
     * Final:
     * Local History
     */
    public void localHistory() {

    }
}
