package forest;

import forest.Creature;
import forest.animals.PlantEating;
import forest.animals.Predator;
import forest.plants.Plant;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Forest forest = new Forest();

        Creature fox = new Predator("fox", 4);
        forest.population.add(fox);

        Creature bear = new Predator("bear", 7);
        forest.population.add(bear);

        Creature bunny = new PlantEating("bunny", 3);
        forest.population.add(bunny);

        Creature deer = new PlantEating("deer", 5 );
        forest.population.add(deer);

        Creature wolf = new Predator("wolf", 6);
        forest.population.add(wolf);

        Plant clover = new Plant("clover", 1 );
        forest.population.add(clover);

        Plant grass = new Plant("grass", 2 );
        forest.population.add(grass);

        Plant tree = new Plant("tree",8 );
        forest.population.add(tree);

        forest.live();

    }
}

