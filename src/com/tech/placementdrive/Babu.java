package com.tech.placementdrive;

import com.tech.oops.Friends;


public class Babu extends Friends {
    public void useInnerClass() {
        // Accessing the protected inner class from a subclass
        Venky venky = new Venky();
        venky.doCoding();
    }

    public static void main(String[] args) {
        Babu subClass = new Babu();
        Friends friends = new Friends();
       // friends.protectedMethod();
        friends.publicMethod();
        subClass.useInnerClass();
    }
}
