public class Train extends Vehicle{
    private boolean caboose;
    private boolean locomotive;
    private int railcar;

    public Train (String name, int wheels, boolean caboose, boolean locomotive, int railcar)
    {
        super(name, wheels);
        this.caboose = caboose;
        this.locomotive = locomotive;
        this.railcar = railcar;
    }

    public boolean isCaboose() {
        return caboose;
    }

    public boolean isLocomotive() {
        return locomotive;
    }

    public int getRailcar() {
        return railcar;
    }

    public void drawTrain()
    {
        String train = "";
        if(caboose)
        {
            train+= "Caboose ";
        }
        for (int i = 0; i < railcar; i++) {
            train += " Railcar ";
        }
        if(locomotive)
        {
            train+= " Locomotive";
        }
        System.out.println(train);
    }
}
