public class Main {
    public static void main(String[] args) {


        Fish fish = new Fish();

        fish.setName("Gold fish");
        fish.setColor("yellow");
        fish.setSize("small");

        System.out.println("name:" +fish.getName()+", color: "+fish.getColor()+", size: "+fish.getSize());
        System.out.println();

        fish.setEat();

    }




}