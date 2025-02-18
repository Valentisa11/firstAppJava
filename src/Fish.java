public class Fish extends Animal {


    @Override
    public String hasFur() {
        return "Нет";
    }

    @Override
    public String hasSpine() {
        return "Да";
    }

    @Override
    public String getType() {
        return "Рыба";
    }

    @Override
    public String liveInWater() {
        return "Живет в воде.";
    }
}
