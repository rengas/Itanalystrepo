public class Solution {
    public static void main(String[] args) {
        /*
        * 2(a,b,c) Model Duck and chicken
        * The name of the animal and the sound has a "is a relationship" or otherwise
        * properties of animals, whereas Flying and swimming are abilities of the animal,
        * so those are modeled with Strategy pattern, so the ability of the animal
        * could be modeled differently based on what they  can do.
        *
        * Now you if there is a new type of animal with other ability then
        * it could be modeled without breaking old code. This implementation
        * is also flexible in a way that now you could model
        * any existing animal with new ability
        * without much change to previous code.
        * e.g. a flying dog.
        * */

        Animal duck = new Bird("Duck","Quack, quack",new CanFly(),new CanSwim());
        System.out.println("I am a "+ duck.getName()+ " Who "
                                    +duck.getSound()+","
                                    + duck.tryToFly()+" and "
                                    +duck.tryToSwim());
        Animal duck1 = new Bird("Duck","Quack, quack",new CantFly(),new CanSwim());
        System.out.println("I am a "+ duck1.getName()+ " Who "
                +duck1.getSound()+","
                + duck1.tryToFly()+" and "
                +duck1.tryToSwim());

        Animal chicken = new Bird("Chicken","Cluck Cluck",new CantFly(),new CanSwim());
        System.out.println("I am a "+ chicken.getName()+ " Who "
                                    +chicken.getSound()+","
                                    + chicken.tryToFly()+ " and "
                                    +chicken.tryToSwim());

        Animal chicken1 = new Bird("Chicken","Cluck Cluck",new CanFly(),new CanSwim());
        System.out.println("I am a "+ chicken1.getName()+ " Who "
                +chicken1.getSound()+","
                + chicken1.tryToFly()+ "and "
                +chicken1.tryToSwim());

        /*
        * 3a Now how would you model a rooster?
        * The Class model that was done in previous step  is flexible enough
        * to have a new type of Animal which makes a different sound.
        * There is no relation between chicken and Rooster in this case
        *
        */
        Animal rooster = new Bird("Rooster", "Cock-a-doodle-doo",new CantFly(),new CantSwim());
        System.out.println("I am a "+ rooster.getName()+ " Who "
                +rooster.getSound()+","
                + rooster.tryToFly()+ "and "
                +rooster.tryToSwim());

    }
}
