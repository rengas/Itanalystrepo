public class Animal {
    private String name;
    private String sound;
    private Flys flyingAbility;
    private Swims swimingAbility;

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

    public String tryToFly(){
       return this.flyingAbility.fly();
    }
    public String tryToSwim(){
       return this.swimingAbility.swim();
    }
}

