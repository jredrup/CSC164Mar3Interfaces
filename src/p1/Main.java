package p1;

public class Main {

    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple()};
        for (Object each : objects){
            if (each instanceof Edible)
                System.out.println(((Edible)each).howToEat());
            if (each instanceof Animal)
                System.out.println(((Animal)each).sound());
        }
    }
}

interface Edible{
    public abstract String howToEat();
}

abstract class Animal {
    public abstract String sound();

}

class Chicken extends Animal implements Edible {
    public String sound(){

        return "Chicken: Cock-a-doodle-doo!";
    }

    @Override
    public String howToEat() {
        return "Chicken: Fry that bitch.";
    }
}

class Tiger extends Animal {
    public String sound(){

        return "Tiger: Rowr!";
    }
}

abstract class fruit implements Edible {

}

class Apple extends fruit{

    @Override
    public String howToEat() {
        return "Apple: Make Cider?  What if I don't like cider?";
    }
}

class Orange extends fruit{

    @Override
    public String howToEat() {
        return "Orange: Peel it.";
    }
}