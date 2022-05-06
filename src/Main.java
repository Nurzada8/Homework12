public class Main {
    public static void main(String[] args) {

        Fish fish = new Fish();

        fish.setName("Gold fish");
        fish.setColor("yellow");
        fish.setSize("small");

        System.out.println("name:" + fish.getName() + ", color: " + fish.getColor() + ", size: " + fish.getSize());

        fish.setEat();

        Dog dog = new Dog();
        dog.setName("Dog Charlie");
        dog.setEyes("blue");
        dog.setRun("very fast");

        System.out.println("\nname: " + dog.getName() + ", eyes: " + dog.getEyes() + ", run: " + dog.getRun());

        Parrot parrot = new Parrot();
        parrot.setName("Parrot");
        parrot.setColor("green");
        parrot.setAge(7);

        System.out.println("\nname: " +parrot.getName() + ", color: " + parrot.getColor()+", age: "+parrot.getAge());

  Mouse mouse = new Mouse();

  mouse.setName("Mouse");
  mouse.setFood("Cheese");
  mouse.setEnemy("cat because mouse afraid from the cats");

        System.out.println("\nname: " +mouse.getName() + ", food: " +mouse.getFood()+", enemy: "+mouse.getEnemy());
    }
}