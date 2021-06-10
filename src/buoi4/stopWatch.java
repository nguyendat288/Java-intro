package buoi4;

import java.util.Date;

public class stopWatch {
    private Date startTime;
   private Date stopTime;
    public stopWatch(){
this.startTime=new Date();
    }
    public Date start(){
        return startTime;
    }
public Date stop(){
        return stopTime;
}
    public void start1() {
        this.startTime = new Date();
    }
    public void end1() {
        this.stopTime = new Date();
    }
   public long getElapsedTime(){
        return this.stopTime.getTime()-this.startTime.getTime();
   }
    public static void main(String[] args) {
     stopWatch watch=new stopWatch();
     watch.start1();
        System.out.println(watch.start());
        watch.end1();
        System.out.println(watch.stop());
        System.out.println(watch.getElapsedTime());

    }
}
