package com.wipro.sindhu.LSP;

public class Liskov_Substitution_Principle {
    public static void main(String[] args) {
        Bird bird = new Sparrow();
        bird.fly();

        Bird anotherBird = new Crow();
        anotherBird.fly();
    }
}

// Superclass
class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

// Subclass 1 (obeys LSP)
class Sparrow extends Bird {
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

// Subclass 2 (also obeys LSP)
class Crow extends Bird {
    public void fly() {
        System.out.println("Crow is flying");
    }
}
