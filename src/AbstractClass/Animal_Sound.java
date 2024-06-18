package AbstractClass;

abstract class Animals {
    public abstract void cats();
    public abstract void dogs();
}

class Cats extends Animals {
    @Override
    public void cats() {
        System.out.println("Cats meow");
    }

    @Override
    public void dogs() {
        // This can be left empty or throw an exception to indicate that it's not implemented
        throw new UnsupportedOperationException("This method is not implemented");
    }
}

class Dogs extends Animals {
    @Override
    public void cats() {
        // This can be left empty or throw an exception to indicate that it's not implemented
        throw new UnsupportedOperationException("This method is not implemented");
    }

    @Override
    public void dogs() {
        System.out.println("Dogs bark");
    }
}

public class Animal_Sound {
    public static void main(String[] args) {
        Cats c = new Cats();
        c.cats();
        
        Dogs d = new Dogs();
        d.dogs();
    }
}
