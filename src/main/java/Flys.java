public interface Flys {
    String fly();
}

class CanFly implements Flys{

    @Override
    public String fly() {
        return "can Fly";
    }
}

class CantFly implements Flys{

    @Override
    public String fly() {
       return "can't Fly";
    }
}
