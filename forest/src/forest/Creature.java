package forest;


public abstract class Creature
{
    public int _size;
    public String _name;

    public Creature(String name, int size)
    {
        this._name = name;
        this._size = size;
    }

   public abstract void take_meal(Creature creature) throws CantEatThis;
}


