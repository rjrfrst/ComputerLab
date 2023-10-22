public class Computer {

    //Properties | Instance fields
    private int storage;
    private String printer;


    //Constructor
    public Computer(int inputStorage, String inputPrinter){
        this.storage = inputStorage;
        this.printer = inputPrinter;
    }

    //Method for adding more storage
    public void newStorage(int storageSpace){
        setStorage(this.storage + storageSpace);
    }


    //Getters and Setters
    //Getter for the storage
    public int getStorage(){
        return storage;
    }
    public void setStorage(int storage){
        this.storage = storage;
    }

    public String getPrinter(){
        return printer;
    }
    public void setPrinter(String printer){
        this.printer = printer;
    }




} //Last curly bracket

