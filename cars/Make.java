package cars;

public class Make {
    String make;
    int count;

    Make(String make) {
        this.make = make;
        this.count =1;
    }

    public void addCount(){
        this.count++;
    }
}