package kodlamaIoKatmanlıMimari.entities;

public class Course {
    private int id;
    private String courseName;
    private String catagory;
    private String edctrName;
    private String edctrlastname;
    private double price;

    public Course(int id, String courseName, String catagory, String edctrName, String edctrlastname, double price) {
        this.id = id;
        this.courseName = courseName;
        this.catagory = catagory;
        this.edctrName = edctrName;
        this.edctrlastname = edctrlastname;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public String getEdctrName() {
        return edctrName;
    }

    public void setEdctrName(String edctrName) {
        this.edctrName = edctrName;
    }

    public String getEdctrlastname() {
        return edctrlastname;
    }

    public void setEdctrlastname(String edctrlastname) {
        this.edctrlastname = edctrlastname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
