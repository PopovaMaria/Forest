package forest.plants;

import forest.CantEatThis;
import forest.Creature;


public class Plant extends Creature
{
    private String _name;
    private int _size;

    public Plant(String name, int size)
    {
        super(name, size);
    }

    public void take_meal(Creature creature) throws CantEatThis
    {
        throw new CantEatThis("");
    }
}




