public class Fish extends Animal
{
    @Override
    public void makeSound() {
        System.out.println("Bloop");
    }

    @Override
    public void move() {
        System.out.println("Swims");
    }

    @Override
    public void eat() {
        System.out.println("Eats fish and plants");
    }
}
