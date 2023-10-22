public class Runner {

    public static void main(String[] args) {
        rectangleDemo();
        computerDemo();
        shoppingTrolleyDemo();
    }

    public static void rectangleDemo(){
        System.out.println("----------");
        System.out.println("Running rectangle tasks...");



        // 1. Create a new rectangle object
        Rectangle rectangle = new Rectangle(20, 10);

        // 2. Calculate the rectangle's area and store it in a variable
        int area = rectangle.area();
        System.out.println("The rectangle has an area of " + area);

        // 3. Check if your rectangle is actually a square
        boolean isRectangle = rectangle.isRectangle();
        System.out.println("Object is a square (true/false): " + isRectangle);
    }

    public static void computerDemo(){
        System.out.println("----------");
        System.out.println("Running computer tasks...");

        // 1. Create a new computer object
        Computer computer = new Computer(100, "Printer-1");

        // 2. Use a getter to find out how much storage the computer has
        int currentStorage = computer.getStorage();
        System.out.println("Computer initially has " + currentStorage + "GB storage");

        // 3. Add more storage to the computer
        //call the method for adding storage
        computer.newStorage(50);
        // We use the getter again to check that the amount of storage has been updated
        int newStorage = computer.getStorage();
        System.out.println("Computer now has " + newStorage + "GB storage");

        // 4. Use a setter to update the computer's printer property
        computer.setPrinter("Apple printer");
        // Write a getter and use it below to check that the setter worked
        String currentPrinter = computer.getPrinter();
        System.out.println("Computer currently has a " + currentPrinter + " printer connected.");

        // 5. Write a method to print a message.
        // To test this works *without* a printer too you can comment out the code for question 4
//        computer.printMessage("Hello World!");
    }

    public static void shoppingTrolleyDemo(){
        System.out.println("----------");
        System.out.println("Running shopping trolley tasks...");

        // 1. Create a new shopping trolley
        ShoppingTrolley trolley = new ShoppingTrolley(5);

        // 2. Add an item to the trolley
        trolley.newSpace(10);
        int newTrolleySpace = trolley.getItem();
        System.out.println("The trolley has " + newTrolleySpace + ".");

        // 3. Count items in the trolley
        int itemCount = trolley.getItem();
        System.out.println("The trolley has " + itemCount + " items.");

        // 4. Check if an item is in the trolley
//        boolean itemInTrolley = <CALL YOUR METHOD HERE>;
//        System.out.println("Object is a square (true/false): " + itemInTrolley);
    }


}

