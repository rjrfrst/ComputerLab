public class Rectangle {
    //Properties
    private int length;
    private int width;

    //Constructor
    public Rectangle(int inputLength, int inputwidth){
        this.length = inputLength;
        this.width = inputwidth;
    }

    //Method 1
    //Check the area of the shape rectangle
    int area(){
        return this.length * this.width;
    }

    //Method 2
    //Check if the rectangle is actually a square
    boolean isRectangle(){
        return this.length == this.width;
    }


} //Last curly bracket

