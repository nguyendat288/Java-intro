package day6.moveablepoint;

public class moveablePoint extends Point{
private float xSpeed;
private float ySpeed;

    public moveablePoint() {
    }

    public moveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public moveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
     public float[] getSpeed(){
        float[] arr1={this.ySpeed,this.xSpeed};
        return arr1;
     }

    @Override
    public String toString() {
        return super.toString() +",speed = "+"("+this.xSpeed+","+this.ySpeed+")" ;
    }
    public moveablePoint move(){
      super.setX((super.getX()+this.getxSpeed()));
      super.setY((super.getY()+this.getySpeed()));
      return this;
    }

}
