public class TV {

    //Attributes
    private double width;
    private double height;
    private boolean isTurnOn = false;
    private int channel = 1;
    private static final int MAX_CHANNELS = 30;
    
    //Constructors
    public TV(double width, double height) {
        if(width<=0){
            System.out.println("Cannot Create TV::WIDTH IS 0 OR LESS!!");
        }
        else{
            this.width = width;
        }
        if(height<=0){
            System.out.println("Cannot Create TV::HEIGHT IS 0 OR LESS!!");
        }
        else{
            this.height = height;
        }
    }

    public TV(double width, double height,boolean isTurnOn) {
        if(width<=0){
            System.out.println("Cannot Create TV::WIDTH IS 0 OR LESS!!");
        }
        else{
            this.width = width;
        }
        if(height<=0){
            System.out.println("Cannot Create TV::HEIGHT IS 0 OR LESS!!");
        }
        else{
            this.height = height;
        }
        this.isTurnOn = isTurnOn;
    }

    //Methods
    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public boolean isTurnOn(){
        return this.isTurnOn;
    }

    public int getChannel(){
        if(this.isTurnOn()){
            return this.channel;
        }
        else{
            System.out.println("TV is turn off.");
            return -1;
        }
    }

    public static int getMaxChannel(){
        return MAX_CHANNELS;
    }
    
    public void turnOn(){
        this.isTurnOn = true;
    }

    public void turnOff(){
        this.isTurnOn = false;
    }

    public void setChannel(int channel) {
        if(channel<=0||channel>MAX_CHANNELS){
            System.out.println("This channel is not found!!");
        }
        else{
            this.channel = channel;
        }
    }

    public double getArea(){
        return this.height*this.width;
    }
}