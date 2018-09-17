public interface Jokes {
    String joke();
}

class CanJoke implements Jokes{

    @Override
    public String joke() {
        return "can Joke";
    }
}

class CantJoke implements Jokes{

    @Override
    public String joke() {
        return "can't Joke";
    }
}
