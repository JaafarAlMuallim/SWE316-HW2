import java.util.ArrayList;

abstract class Edoc  {
    private String name;
    private long size;
    private ArrayList<Edoc> arrayList;
    

    public Edoc(String name) {
        this.name = name;
    }
    public Edoc(String name, long size) {
        this.name = name;
        this.size = size;
    }
    public Edoc(String name, long size, ArrayList<Edoc> arrayList) {
        this.name = name;
        this.size = size;
        this.arrayList = arrayList;
    }
    // getters
    public String getName() {
        return name;
    }
    public long getSize() {
        return size;
    }
    public ArrayList<Edoc> getDocs() {
        return arrayList;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setExtension(ArrayList<Edoc> arrayList) {
        this.arrayList = arrayList;
    }
    public abstract void print();
    public abstract void calculateSize();

}