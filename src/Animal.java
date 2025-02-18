abstract class Animal {

    String type;
    public abstract String hasFur();
    public abstract String hasSpine();

    public abstract String getType();

    public abstract String liveInWater();

    public void displayInfo() {

        System.out.println(getType());
        System.out.println("Имеет шерсть: " + hasFur());
        System.out.println("Имеет позвоночник: " + hasSpine());
        System.out.println(liveInWater());
    }
}
