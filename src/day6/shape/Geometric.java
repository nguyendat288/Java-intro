package day6.shape;

public class Geometric {
    private String color ="Green";
    private boolean filled=true;
        public Geometric(){
        }
    public Geometric(String color,boolean filled){
    this.color=color;
    this.filled=filled;
        }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
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
