package OOP;


public class Box_Constructor {

    double width, height, depth;

    Box_Constructor()
    {
        width = 0;
        height = 0;
        depth = 0;
    }

    Box_Constructor(double w, double h, double d)
    {
        width =w;
        height = h;
        depth = d;
    }
    Box_Constructor(double len)
    {
        width = height=depth=len;
    }

    double volume()
    {
        return width*height*depth;
    }
}
