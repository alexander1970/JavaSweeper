package sweeper;

public class Coord
{
    public int x;
    public int y;

    public Coord(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Coord)
        {
            Coord coord = (Coord) o;
            return x == coord.x && y == coord.y;
        }
        return super.equals(o);
    }
}
