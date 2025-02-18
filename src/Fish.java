public class Fish extends Animal {
    String type = "Рыба";

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
