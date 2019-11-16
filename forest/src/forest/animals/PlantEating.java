package forest.animals;

import forest.plants.Plant;

public class PlantEating extends Animal
{
    public PlantEating(String name, int size)
    {
        super(name, size);
        _classes_who_i_can_eat.add(Plant.class);
    }
}