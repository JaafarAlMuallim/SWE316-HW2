import java.io.File;
import java.util.ArrayList;

public class App {
    private static ArrayList<Edoc> edoc = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        File file = new File("/Users/ja3faral-muallim/Desktop/Development/SWE316-HW2");
        getEdocs(file);
        // File[] files = file.listFiles();
        // for (File f : files) {
        //     System.out.println(f.);
        // }

    }

    public static void getEdocs(File path){
        if(path.isDirectory()){
            File[] files = path.listFiles();
            for (File f : files) {
                getEdocs(f);
            }
            edoc.add(new Folder(path.getName()));
        } else {
            edoc.add(new Document(path.getName(), path.length()));
        }
        }
    }
