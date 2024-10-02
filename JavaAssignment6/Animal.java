package JavaAssignment6;

abstract class Animal {
    public abstract String sound();
    public abstract String move();
}

class Dog extends Animal {
    @Override
    public String sound() {
        return "Bark";
    }

    @Override
    public String move() {
        return "Runs on four legs";
    }
}

class Cat extends Animal {
    @Override
    public String sound() {
        return "Meow";
    }

    @Override
    public String move() {
        return "Walks stealthily";
    }
}

class Bird extends Animal {
    @Override
    public String sound() {
        return "Chirp";
    }

    @Override
    public String move() {
        return "Flies in the sky";
    }
}


