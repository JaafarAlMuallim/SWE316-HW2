import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your directory name: ");
        String dirName = sc.nextLine();

        sc.close();
        // File rootDir = new File("/Users/ja3faral-muallim/Desktop/Development/Demo");
        File rootDir = new File(dirName);
        if(!rootDir.exists()){
            System.out.println("The directory does not exist");
            return;
        }
        if(rootDir.isFile()){
            System.out.println("The given input is a file");
            System.out.println(rootDir.getName());
            return;
        }
        // Create the root folder component
        Folder rootFolder = new Folder(rootDir.getName());

        // Recursively traverse the root directory and create components for files and folders
        traverseDirectory(rootDir, rootFolder);

        // Display the file system
        rootFolder.print(0);
    }

    private static void traverseDirectory(File directory, Folder folder) {
        for (File file : directory.listFiles()) {
            if (file.isFile()) {
                folder.add(new Document(file.getName(), file.length()));
            } else if (file.isDirectory()) {
                Folder subFolder = new Folder(file.getName());
                folder.add(subFolder);
                traverseDirectory(file, subFolder);
            }
        }
    }
}
