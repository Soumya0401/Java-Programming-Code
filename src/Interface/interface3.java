package Interface;

interface Flyable {
    void fly_obj();
}

class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying");
    }
}

class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Airplane is flying");
    }

    static class Helicopter implements Flyable {
        @Override
        public void fly_obj() {
            System.out.println("Helicopter is flying");
        }
    }

    public static void main(String[] args) {
        Flyable[] flyingObjects = { new Spacecraft(), new Airplane(), new Helicopter() };

        for (Flyable obj : flyingObjects) {
            obj.fly_obj();
        }
    }
}
