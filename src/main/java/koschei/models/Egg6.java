package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Egg6 {

    public Egg6(Needle7 needle) { this.needle = needle; }

    @Autowired
    private Needle7 needle;

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }
}
