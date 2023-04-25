import java.util.ArrayList;



class Folder extends Edoc {
    private String name;
    private int size;
    private ArrayList<Edoc> arrayList;


    public Folder(String name) {
        super(name);
    }
    // public Folder(String name, ArrayList<Edoc> arrayList) {
    //     super(name, arrayList);
    // }
    public Folder(String name, long size, ArrayList<Edoc> arrayList) {
        super(name, size, arrayList);
    }

    public String getName() {
        return name;
    }
    public long getSize() {
        return size;
    }
    public ArrayList<Edoc> getDocs() {
        return arrayList;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setExtension(ArrayList<Edoc> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public void print() {
        System.out.println("|"+name);
        for (Edoc edoc : arrayList) {
            System.out.println("  |"+edoc.getName());
        }
    }

    @Override
    public void calculateSize() {
        int calculated = 0;
        for (Edoc edoc : arrayList) {
            calculated += edoc.getSize();
        }
        System.out.println(calculated);
    }

}