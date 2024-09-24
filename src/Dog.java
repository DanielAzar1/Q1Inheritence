public class Dog extends Animal
{
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void move() {
        System.out.println("Walks on 4");
    }

    @Override
    public void eat() {
        System.out.println("Eats dog food");
    }
}
