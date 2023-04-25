class Document extends Edoc {
    private String name;
    private int size;
    private String extension;
    
// constructor
    public Document(String name, long size) {
        super(name, size);
    }

    // getters
    public String getName() {
        return name;
    }
    public long getSize() {
        return size;
    }
    public String getExtension() {
        return extension;
    }

    public String toString() {
        return " Size: " + size + "-- " + name + "." + extension;
    }
    @Override
    public void print() {
        System.out.println(name);
    }
    @Override
    public void calculateSize() throws UnsupportedOperationException{
        // throw Unsupportated operation
        throw new UnsupportedOperationException("Not Supported");
    }
}