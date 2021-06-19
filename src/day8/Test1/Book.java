package day8.Test1;

public class Book implements IBook,Comparable<Book>{
    private int id;
    private String name;
    private String athor;

    public Book() {
    }

    public Book(int id, String name, String athor) {
        this.id = id;
        this.name = name;
        this.athor = athor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAthor() {
        return athor;
    }

    public void setAthor(String athor) {
        this.athor = athor;
    }


    @Override
    public void Display(){
        System.out.println( "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", athor='" + athor + '\'' +
                '}');
    }
    @Override
    public int compareTo(Book o) {
//        if (this.getId() > o.getId()) {
//            return 1;
//        } else {
//            return -1;
//        }
        return this.getName().compareTo(o.getName());
    }

}
