//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Animal cat = new Cat();
    Animal bear = new Bear();
    Animal fish = new Fish();
    Animal whale = new Whale();


    cat.displayInfo();

    System.out.println();
    bear.displayInfo();
    System.out.println();
    fish.displayInfo();
    System.out.println();
    whale.displayInfo();
    System.out.println();
    }
}
