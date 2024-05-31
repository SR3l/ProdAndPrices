import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {




        String []product = {"Ties", "Shoes", "Ties", "Shoes", "Ties", "Watches",
                "Watches", "Shoes", "Shoes", "Watches", "Watches", "Ties", "Caps",
                "Watches", "Ties", "Shoes", "Watches", "Caps", "Socks", "Shoes",
                "Shoes", "Caps", "Caps", "Ties", "Watches", "Watches", "Ties",
                "Watches", "Caps", "Watches", "Watches", "Socks", "Ties", "Watches",
                "Socks", "Watches", "Caps", "Shoes", "Ties", "Socks", "Shoes", "Ties",
                "Watches", "Socks", "Watches", "Watches", "Watches", "Watches", "Watches",
                "Shoes", "Watches", "Socks", "Ties", "Ties", "Ties", "Shoes", "Caps", "Caps",
                "Caps", "Caps", "Ties", "Caps", "Watches", "Watches", "Caps", "Shoes", "Caps",
                "Watches", "Caps", "Shoes"};

        int []quantity = {10, 9, 6, 4, 10, 4, 9, 6, 10, 7, 3, 4, 4, 9, 1,
                8, 9, 1, 5, 8, 7, 2, 3, 4, 10, 5, 6, 2, 1, 7, 2, 8, 6, 9, 8,
                8, 7, 7, 9, 10, 6, 7, 8, 2, 1, 7, 6, 3, 3, 1, 8, 4, 10, 7, 1,
                10, 6, 9, 8, 2, 4, 6, 1, 8, 2, 6, 10, 2, 6, 2};

        String []destination = {"Summit", "Clifton", "Atco", "Brick", "Wall",
                "Newark", "Deal", "Clark", "Edison", "Atco", "Clark", "Mahwah",
                "Clark", "Mahwah", "Newark", "Deal", "Atco", "Clifton", "Edison",
                "Wall", "Clifton", "Wall", "Summit", "Wall", "Wall", "Edison",
                "Wall", "Newark", "Brick", "Wall", "Clifton", "Clifton", "Summit",
                "Newark", "Summit", "Summit", "Deal", "Summit", "Atco", "Brick",
                "Newark", "Mahwah", "Deal", "Mahwah", "Clark", "Edison", "Clifton",
                "Atco", "Edison", "Clifton", "Clark", "Clark", "Deal", "Mahwah",
                "Atco", "Brick", "Edison", "Edison", "Edison", "Edison", "Edison",
                "Summit", "Brick", "Atco", "Clark", "Wall", "Edison", "Clifton", "Deal", "Brick"};

        String []origin = {"Union", "Nutley", "Newark", "Newark", "Nutley",
                "Union", "Union", "Paramus", "Paramus", "Union",
                "Paramus", "Newark", "Union", "Newark", "Paramus",
                "Paramus", "Union", "Newark", "Nutley", "Nutley",
                "Union", "Union", "Union", "Newark", "Union", "Union",
                "Nutley", "Nutley", "Nutley", "Paramus", "Paramus",
                "Newark", "Nutley", "Newark", "Union", "Nutley",
                "Newark", "Nutley", "Nutley", "Union", "Nutley",
                "Nutley", "Newark", "Newark", "Union", "Nutley",
                "Nutley", "Newark", "Union", "Union", "Union",
                "Nutley", "Union", "Nutley", "Nutley", "Paramus",
                "Newark", "Nutley", "Union", "Newark", "Nutley",
                "Paramus", "Union", "Union", "Union", "Union",
                "Paramus", "Nutley", "Union", "Nutley"};


        Methods method = new Methods();


        printNumOfOrders("Total number of socks orders: ", method.totalSocksOrders(product, quantity));
        printNumOfOrders("Total number of shoes orders: ", method.totalShoesOrders(product, quantity));
        printNumOfOrders("Total number of caps orders: ", method.totalCapsOrders(product, quantity));
        printNumOfOrders("Total number of ties orders: ", method.totalTiesOrders(product, quantity));
        printNumOfOrders("Total number of watches orders: ", method.totalWatchesOrders(product, quantity));

        printLines();


        printCostOfOrders("\nThe total cost of all 70 orders: ", method.totalCostOfAllOrders(product, quantity));

        printLines();


        printCostOfOrders("\nThe total cost of all orders shipped to Wall: ",
                method.totalCostWallOrders(product, quantity, destination));
        printNumOfOrders("The total number of orders shipped to Wall: ",
                method.totalOrdersWall(destination));
        printNumOfOrders("The total quantity of products shipped to Wall: ",
                method.totalOrderQuantityToWall(product, quantity, destination));
        printCostOfOrders("The total cost of Ties, shipped to Wall: ",
                method.totalCostTiesWallOrders(product, quantity, destination));

        printLines();


        printCostOfOrders("\nThe total cost of the products Ties, Socks and Watches shipped to Clifton, Brick and Newark: ",
                method.totalCostClBrNe(product, quantity, destination, origin));

        printNumOfOrders("\nThe total number of orders that originated from Union: ",
                method.totalNumOriginatedFromUnion(origin));

        printNumOfOrders("\nThe total number of orders where each order is $50 or more: ",
                method.numOrders50(product, quantity));

        printLines();

        printNumOfOrders("\nThe total number of orders that originated from Union where each order is $50 or more: ",
                method.numOrders50Union(product, quantity, origin));
        printCostOfOrders("The total cost of orders that originated from Union where each order is $50 or more: ",
                method.costOrders50Union(product, quantity, origin));

        printLines();


        printNumOfOrders("\nThe total number of orders that originated from Union and shipped to Edison: ",
                method.numOriginatedFromUnionToEdison(origin, destination));
        printCostOfOrders("The total cost of orders that originated from Union and shipped to Edison: ",
                method.costOriginatedFromUnionToEdison(product, quantity, origin, destination));

        printLines();


        printNumOfOrders("\nThe total number of orders that was shipped to all destinations except to Edison: ",
                method.numOrdersNotShippedToEdison(destination));
        printCostOfOrders("The total cost of orders that was shipped to all destinations except to Edison: ",
                method.totalNotShippedToEdison(product, quantity, destination));

        printLines();




    }
    // print method to print the number of orders
    public static void printNumOfOrders(String str, int methodValue) {
        System.out.println(str  + methodValue);
    }
    // print method to print the cost of orders
    public static void printCostOfOrders(String str, double methodValue) {
        NumberFormat fp = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(str  + fp.format(methodValue));
    }
    // print method to print dividing lines
    public static void printLines() {
        System.out.println("-------------------------------------------------");

    }
}