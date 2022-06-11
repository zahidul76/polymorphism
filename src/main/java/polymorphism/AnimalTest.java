package polymorphism;

public class AnimalTest {
    public static void main(String[] args) {
        //Creating the objects from the super class which is Animal Class
        Animal animal = new Animal();
        Animal human = new Human();
        Animal cats = new Cats();
        Animal dogs = new Dogs();
        Animal parrots = new Parrots();

        animal.animalSound();
        human.animalSound();
        cats.animalSound();
        dogs.animalSound();
        parrots.animalSound();



    }
}
