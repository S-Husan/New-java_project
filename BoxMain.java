
class Box 
{
    int width, hight, lenght;

    Box(int w, int h, int l)
    {
    width = w;
    hight = h;
    lenght = l;

    }

    int volume()
    {        
    return (width * hight * lenght);
    }
}
    class BoxMain 
    {
        public static void main(String[] args) 
        {
            Box b = new Box(10, 20, 30);
            System.out.println(b.volume());
        }

}



