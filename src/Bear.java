public class Bear extends Animal {
    String type = "Медведь";

    @Override
    public String hasFur() {
        return "Да";
    }
    public String getName() {
        return type;
    }
    @Override
    public String hasSpine() {
        return "Да";
    }

    @Override
    public String getType() {
        return "Медведь";
    }

    @Override
    public String liveInWater() {
        return "Не живет в воде.";
    }
}
