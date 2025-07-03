interface Vehicle{
    void clutchpads(int a);
    void speedlimit(int a);
    void speedup(int a);
}
class Bicycle implements Vehicle{
    int speed;
    int gear;
    @Override
    public void clutchpads(int newgear){
        gear =newgear;
    }
    @Override
    public void speedlimit(int speed){
        speed = speed+speed;

    }
    @Override
    public void speedup(int a){
    }
}
class vehicle{
    public static void main(String[] args) {
        Bicycle bycycle=new Bicycle();
        bycycle.speedlimit(200);
    }
}