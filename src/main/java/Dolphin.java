public class Dolphin extends Animal {
    /**
     * All the properties of Dolphin are known
     * so a default constructor will do
     * If in future we require properties to be changed dynamically
     * then we can add parameterized construtor.
     *
     */
    public Dolphin(){
        super();
        setName("Dolphin");
        setSound("is Mute");
        setFlyingAbility(new CantFly());
        setJokingAbility(new CantJoke());
        setFlyingAbility(new CantFly());
        setSwimingAbility(new CanSwim());
    }
}
