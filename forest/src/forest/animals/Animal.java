package forest.animals;

import forest.CantEatThis;
import forest.Creature;

import java.util.ArrayList;

class Animal extends Creature
{
    ArrayList<Class> _classes_who_i_can_eat;

    Animal(String name, int size)
    {
        super(name, size);
        this._classes_who_i_can_eat = new ArrayList<>();
    }

    @Override
    public void take_meal(Creature creature) throws CantEatThis
    {

        if(_classes_who_i_can_eat.contains(creature.getClass()))
        {
            if(this._size > creature._size)
            {
                System.out.println(this._name + " ate the " +  creature._name);
                return;
            }
        }
        throw new CantEatThis(this._name + " can't eat the " +  creature._name);
    }
}
