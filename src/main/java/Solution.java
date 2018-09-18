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
        /*
         * 4 a,b,c,d Model a parrot
         * Our model is flexible enough for parrots which makes different type of sound
         * As we added sound as property its very flexible for us have new sound
         * on the fly without changing much code.
         */
        Animal parrotlivesWithDog =  new Bird("Parrot", "Woof,Woof",new CanFly(),new CantSwim() );
        System.out.println("I am a "+ parrotlivesWithDog.getName()+ " Who "
                +parrotlivesWithDog.getSound()+","
                + parrotlivesWithDog.tryToFly()+ "and "
                +parrotlivesWithDog.tryToSwim());

        Animal parrotlivesWithCat =  new Bird("Parrot", "Meow",new CanFly(),new CantSwim() );
        System.out.println("I am a "+ parrotlivesWithCat.getName()+ " Who "
                +parrotlivesWithCat.getSound()+","
                + parrotlivesWithCat.tryToFly()+ "and "
                +parrotlivesWithCat.tryToSwim());


        Animal parrotlivesWithRooster =  new Bird("Parrot", "Cock-a-doodle-doo",new CanFly(),new CantSwim() );
        System.out.println("I am a "+ parrotlivesWithRooster.getName()+ " Who "
                +parrotlivesWithRooster.getSound()+","
                + parrotlivesWithRooster.tryToFly()+ "and "
                +parrotlivesWithRooster.tryToSwim());

        Animal parrotlivesWithPhone =  new Bird("Parrot", "Ring Ring",new CanFly(),new CantSwim() );
        System.out.println("I am a "+ parrotlivesWithPhone.getName()+ " Who "
                +parrotlivesWithPhone.getSound()+","
                + parrotlivesWithPhone.tryToFly()+ "and "
                +parrotlivesWithPhone.tryToSwim());

        Animal Fish = new Fish("Fish","No Size","No colour","Plants",new CantJoke() );
        System.out.println("I am a "+ Fish.getName()+ " Who "
                +Fish.getSound()+","
                + Fish.tryToFly()+ " and "
                +Fish.tryToSwim());

        /*
         * Can you specialize the fish as a Shark and as a Clownfish?
         *
         */

        Animal Shark = new Fish("Shark","Large","Grey","Fish",new CantJoke() );
        System.out.println("I am a "+ Fish.getName()+ " Who "
                +Shark.getSound()+","
                + Shark.tryToFly()+ ","
                +Shark.tryToSwim()+","
                +Shark.tryToJoke());

        Animal ClownFish = new Fish("Clown Fish", "small","Multi color","Plants",new CanJoke());
        System.out.println("I am a "+ ClownFish.getName()+ " Who "
                +ClownFish.getSound()+","
                + ClownFish.tryToFly()+ ","
                +ClownFish.tryToSwim()+","
                +ClownFish.tryToJoke());
        /*
        * Dolphins are not exactly fish, yet, they are good swimmers
         */
        Animal Dolphin = new Dolphin();
        System.out.println("I am a "+ Dolphin.getName()+ " Who "
                +Dolphin.getSound()+","
                + Dolphin.tryToFly()+ ","
                +Dolphin.tryToSwim()+","
                +Dolphin.tryToJoke());
        /**
         * Model animals behaviour over time
         */
        // Start as a caterpillar
        Animal CaterPillar = new Insect("Caterpillar","is Mute",new CantFly(),new CanWalk() );
        // transform into butterfly
        CaterPillar.setName("Butterfly");
        CaterPillar.setFlyingAbility(new CanFly());

    }
}
