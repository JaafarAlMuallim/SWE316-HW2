import java.util.ArrayList;
import java.util.List;



class Folder implements Edoc {
    private String name;
    private double size;
    private List<Edoc> list;

    public Folder(String name) {
        this.name = name;
        this.size = 0;
        this.list = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(Edoc edoc) {
        list.add(edoc);

    }
    public void remove(Edoc edoc) {
        list.remove(edoc);
    }

    @Override
    public void print(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }
        System.out.printf("-|- "+name + " %.02f KB\n", calculateSize());
        for (Edoc edoc : list) {
            edoc.print(level + 1);
        }
    }

    public double calculateSize(){
        for(Edoc edoc : list){
            size += edoc.calculateSize();
        }
        
        return size;
    }
    @Override
    public String showExtension() {
        return "";
    }

}