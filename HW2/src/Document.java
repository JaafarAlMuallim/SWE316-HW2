// import java.text.DecimalFormat;




class Document implements Edoc {
    private String name;
    private double size;
    private String extension;

    public Document(String name, long size) {
        this.name = name;
        this.size = size;
        extension = showExtension();
    }

    public String getName() {
        return name;
    }
    public double calculateSize() {
        return size / 1024;
    }

    public String getExtension() {
        return extension;
    }

    @Override
    public void print(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }
        System.out.printf("-|- "+name.substring(0, name.lastIndexOf(".")) + "." + extension + " %.02f  KB\n", calculateSize());

    }
    @Override
    public String showExtension() {
        int dotIndex = name.lastIndexOf('.');
        if (dotIndex >= 0 && dotIndex < name.length() - 1) {
            return name.substring(dotIndex + 1);
        } else {
            return "";
        }
    }
}