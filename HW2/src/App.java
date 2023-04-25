import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        File rootDir = new File("/Users/ja3faral-muallim/Desktop/Development/Demo");

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
