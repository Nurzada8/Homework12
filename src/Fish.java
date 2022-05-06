public class Fish {
    private String name;
    private String color;
    private String size;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color){
        if (!color.contains ("yellow")){
            System.err.println(name+ "you can't see the Gold fish");
        }else
            this.color = color;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }
    void setEat() {
        System.out.println("they eat aquatic plants under the water");
    }


}



