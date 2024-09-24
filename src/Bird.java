public class Bird extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }

    @Override
    public void move() {
        System.out.println("Flies and walks");
    }

    @Override
    public void eat() {
        System.out.println("Eats seeds");
    }
}
