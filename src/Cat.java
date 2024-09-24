public class Cat extends Animal
{
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void move() {
        System.out.println("Walks on 4");
    }

    @Override
    public void eat() {
        System.out.println("Eats cat food");
    }
}
