package forest;

import forest.plants.Plant;

import java.util.ArrayList;
import java.util.Random;

public class Forest {
    ArrayList<Creature> population = new ArrayList<Creature>();

    public void live() throws InterruptedException {
        while (true) {
            if (population.size() <= 2)
                break;

            Thread.sleep(2 * 1000);

            Random random = new Random();
            Creature lhs = this.population.get(random.nextInt(population.size()));
            Creature rhs = this.population.get(random.nextInt(population.size()));

            if (lhs.getClass() == Plant.class) {
                continue;
            }

            try {
                lhs.take_meal(rhs);

                System.out.println(rhs._name + " have died :(");
                population.remove(rhs);
                rhs = null;

            } catch (CantEatThis exc) {
                System.out.println(exc.toString());
            }


            if (rhs != null) {

                if (rhs.getClass() == Plant.class) {
                    continue;
                }

                try {
                    rhs.take_meal(lhs);

                    System.out.println(lhs._name + " have died :(");
                    population.remove(lhs);

                } catch (CantEatThis exc) {
                    System.out.println(exc.toString());
                }
            }
        }
    }
}