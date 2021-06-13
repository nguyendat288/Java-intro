package day6;

public class Geometric {
    public String color ="White";
    public String filled=null;
        public Geometric(){
        }
    public Geometric(String color,String filled){
    this.color=color;
    filled=filled;
        }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Geometric{" +
                "color='" + color + '\'' +
                ", filled='" + filled + '\'' +
                '}';
    }
}
