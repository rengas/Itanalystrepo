public class Animal {
    private String name;
    private String sound;
    private Flys flyingAbility;
    private Swims swimingAbility;
    private Jokes jokeAbility;
    private Walks walkAbility;

    public void setSound(String sound){
        this.sound =sound;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public String getSound(){
        return this.sound;
    }

    public void setFlyingAbility(Flys flyingAbility){
        this.flyingAbility= flyingAbility;
    }

    public void setSwimingAbility(Swims swimingAbility){
        this.swimingAbility=swimingAbility;
    }
    public void setJokingAbility(Jokes jokeAbility){
        this.jokeAbility=jokeAbility;
    }
    public void setWalkAbility(Walks walkAbility){
        this.walkAbility=walkAbility;
    }
    public Swims getSwimingAbility(){
       return this.swimingAbility;
    }
    public Jokes getJokingAbility(){
        return this.jokeAbility;
    }
    public Walks getWalkingAbility(){
        return this.walkAbility;
    }
    public Flys getFlyingAbility(){
        return this.flyingAbility;
    }
    public String tryToFly(){
       return this.flyingAbility.fly();
    }
    public String tryToSwim(){
       return this.swimingAbility.swim();
    }
    public String tryToJoke(){
        return this.jokeAbility.joke();
    }
}

