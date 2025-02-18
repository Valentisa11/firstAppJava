public class Cat extends Animal {


    @Override
    public String getType() { return "Кошка";}
    @Override
    public String liveInWater() {
        return "Не живет в воде.";
    }


    @Override
    public String hasFur() {
        return "Да";
    }
    @Override
    public String hasSpine() {
        return "Да";
    }
  

}
