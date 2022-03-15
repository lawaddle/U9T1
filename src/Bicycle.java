public class Bicycle extends Vehicle{
    private int gears;
    public Bicycle (String name, int wheels, int gears)
    {
        super(name, wheels);
        this.gears = gears;
    }

    public int getGears() {
        return gears;
    }

    public void ringBell()
    {
        System.out.println("ding a ling");
    }

}
