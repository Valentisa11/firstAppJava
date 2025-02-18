public class Whale extends Animal {

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
        return "Кит";
    }

    @Override
    public String liveInWater() {
        return "Живет в воде.";
    }
}
