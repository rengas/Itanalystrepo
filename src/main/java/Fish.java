public class Fish extends Animal {
    /*
     * Model fish as well as other swimming animals
     * 1 a. The only requirement here is fish can swim and rest can
     * be ignored. This is modeled as a seperate class because there might
     * new additional properties that is only for fish could be added in
     * future.
     */
     /*
     * Size,Colour and food are added as new properties.
     * And fish with ability to joke
     */
    private String size;
    private String colour;
    private String food;

    public Fish(String name,String size, String colour, String food,Jokes jokes){
        super();
        this.size=size;
        this.colour=colour;
        this.food=food;
        setName(name);
        setSound("is Mute");
        setSwimingAbility(new CanSwim());
        setFlyingAbility( new CantFly());
        setJokingAbility(jokes);
    }
}

