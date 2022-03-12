public class Auto {
    public String kolor;
    public int prędkość;

    public Auto(String kolor, int prędkość) {
        this.kolor = kolor;
        this.prędkość = prędkość;
    }
    public void jedzie(){
        System.out.println("Auto jedzi z prędkością "+prędkość+ "km");
}
}
