public class ShoppingTrolley {

    //Properties
    private int item;

    //Constructor
    public ShoppingTrolley(int inputItem){
        this.item = inputItem;
    }

    //Getters and Setters
    public int getItem(){
        return item;
    }

    public void setItem(int item){
        this.item = item;
    }

    public void newSpace(int trolleySpace){
        setItem(this.item + trolleySpace);
    }

    //method check if an item is in the trolley

//    boolean isInTrolley(String item){



} // Last curly bracket

