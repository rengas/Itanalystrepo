public interface Walks {
    String walk();
}

class CanWalk implements Walks{

    @Override
    public String walk() {
        return "can Walk";
    }
}

class CantWalk implements Walks{

    @Override
    public String walk() {
        return "can't Walk";
    }
}
