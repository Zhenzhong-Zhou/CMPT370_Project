package model;

public class Timer {

    public long start;
    public int seconds;

    public Timer(){
        start=System.currentTimeMillis();
    }

    public long listen(int seconds) {
        long current = System.currentTimeMillis();
        return (this.seconds * 1000 - current + start) /1000;
    }


    public static void main  (String []args){

        Timer timer = new Timer();
        System.out.println(timer.start);
        timer.listen(10);
    }
}
