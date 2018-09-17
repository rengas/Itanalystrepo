public interface Swims {
    String swim();
}

class CanSwim implements Swims{

    @Override
    public String swim() {
        return "can swim";
    }
}

class CantSwim implements Swims{

    @Override
    public String swim() {
       return "can't Swim";
    }
}
