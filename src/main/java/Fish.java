public class Fish extends Animal {
    /*
     * Model fish as well as other swimming animals
     * 1 a. The only requirement here is fish can swim and rest can
     * be ignored. This is modeled as a seperate class because there might
     * new additional properties that is only for fish could be added in
     * future.
     */
    public Fish(String name){
        super();
        setName(name);
        setSwimingAbility(new CanSwim());
        setFlyingAbility( new CantFly());
    }
}

