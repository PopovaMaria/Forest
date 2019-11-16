package forest.animals;


public class Predator extends Animal
{
    public Predator(String name, int size)
    {
        super(name, size);

        _classes_who_i_can_eat.add(Predator.class);
        _classes_who_i_can_eat.add(PlantEating.class);
    }
}
