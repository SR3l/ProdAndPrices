public class Methods {



    double socksPrice = 4.95;
    double shoesPrice = 29.95;
    double capsPrice = 7.95;
    double tiesPrice = 9.95;
    double watchesPrice = 19.95;

    // method to print the number of sock orders
    public int totalSocksOrders(String[] product, int[] quantity) {
        int totalSocks = 0;
        for (int i = 0; i < product.length; i++) {
            if (product[i].equals("Socks")) {
                totalSocks++;
            }
        }
        return totalSocks;
    }
    // method to print the number of shoe orders
    public int totalShoesOrders(String[] product, int[] quantity) {
        int totalShoes = 0;
        for (int i = 0; i < product.length; i++) {
            if (product[i].equals("Shoes")) {
                totalShoes++;
            }
        }
        return totalShoes;
    }
    // method to print the number of cap orders
    public int totalCapsOrders(String[] product, int[] quantity) {
        int totalCaps = 0;
        for (int i = 0; i < product.length; i++) {
            if (product[i].equals("Caps")) {
                totalCaps++;
            }
        }
        return totalCaps;
    }
    // method to print the number of tie orders
    public int totalTiesOrders(String[] product, int[] quantity) {
        int totalTies = 0;
        for (int i = 0; i < product.length; i++) {
            if (product[i].equals("Ties")) {
                totalTies++;
            }
        }
        return totalTies;
    }
    // method to print the number of watch orders
    public int totalWatchesOrders(String[] product, int[] quantity) {
        int totalWatches = 0;
        for (int i = 0; i < product.length; i++) {
            if (product[i].equals("Watches")) {
                totalWatches++;
            }
        }
        return totalWatches;
    }
    // method to print the total cost of all orders
    public double totalCostOfAllOrders(String[] product, int[] quantity) {
        double totalCost = 0;
        for (int i = 0; i < product.length; i++) {
            if (product[i].equals("Socks")) {
                totalCost += quantity[i] * socksPrice;
            } else if (product[i].equals("Shoes")) {
                totalCost += quantity[i] * shoesPrice;
            } else if (product[i].equals("Caps")) {
                totalCost += quantity[i] * capsPrice;
            } else if (product[i].equals("Ties")) {
                totalCost += quantity[i] * tiesPrice;
            } else if (product[i].equals("Watches")) {
                totalCost += quantity[i] * watchesPrice;
            }
        }
        return totalCost;
    }
    // method to print the total cost of all orders to Wall
    public double totalCostWallOrders(String[] product, int[] quantity, String[] destination) {
        double totalCost = 0;
        for (int i = 0; i < product.length; i++) {
            if (destination[i].equals("Wall")) {
                if (product[i].equals("Socks")) {
                    totalCost += quantity[i] * socksPrice;
                } else if (product[i].equals("Shoes")) {
                    totalCost += quantity[i] * shoesPrice;
                } else if (product[i].equals("Caps")) {
                    totalCost += quantity[i] * capsPrice;
                } else if (product[i].equals("Ties")) {
                    totalCost += quantity[i] * tiesPrice;
                } else if (product[i].equals("Watches")) {
                    totalCost += quantity[i] * watchesPrice;
                }
            }
        }
        return totalCost;
    }
    // method to print the total number of orders to Wall
    public int totalOrdersWall(String[] destination) {
        int totalWall = 0;
        for (int i = 0; i < destination.length; i++) {
            if (destination[i].equals("Wall")) {
                totalWall++;
            }
        }
        return totalWall;
    }
    // method to print the total quantity of products to Wall
    public int totalOrderQuantityToWall(String[] product, int[] quantity, String[] destination) {
        int totalWallQuantity = 0;
        for (int i = 0; i < product.length; i++) {
            if (destination[i].equals("Wall")) {
                totalWallQuantity += quantity[i];
            }
        }
        return totalWallQuantity;
    }
    // method to print the total cost of ties to Wall
    public double totalCostTiesWallOrders(String[] product, int[] quantity, String[] destination) {
        double totalCost = 0;
        for (int i = 0; i < product.length; i++) {
            if (destination[i].equals("Wall") && product[i].equals("Ties")) {
                totalCost += quantity[i] * tiesPrice;
            }
        }
        return totalCost;
    }
    // method to print the total cost of ties, socks and watches to Clifton, Brick and Newark
    public double totalCostClBrNe(String[] product, int[] quantity, String[] destination, String[] origin) {
        double totalCost = 0;
        for (int i = 0; i < product.length; i++) {
            if ((destination[i].equals("Clifton") || destination[i].equals("Brick") || destination[i].equals("Newark")) && product[i].equals("Ties")) {
                totalCost += quantity[i] * tiesPrice;
            }
            else if ((destination[i].equals("Clifton") || destination[i].equals("Brick") || destination[i].equals("Newark")) && product[i].equals("Socks")) {
                totalCost += quantity[i] * socksPrice;
            }
            else if ((destination[i].equals("Clifton") || destination[i].equals("Brick") || destination[i].equals("Newark"))  && product[i].equals("Watches")) {
                totalCost += quantity[i] * watchesPrice;
            }
        }
        return totalCost;
    }
    // method to print the total number of orders that originated from Union
    public int totalNumOriginatedFromUnion(String[] origin) {
        int totalUnion = 0;
        for (int i = 0; i < origin.length; i++) {
            if (origin[i].equals("Union")) {
                totalUnion++;
            }
        }
        return totalUnion;
    }
    // method to print the total number of orders that are $50 or more
    public int numOrders50(String[] product, int[] quantity) {
        int totalOrders = 0;
        for (int i = 0; i < product.length; i++) {
            if (product[i].equals("Socks") && quantity[i] * socksPrice > 50) {
                totalOrders++;
            }
            else if (product[i].equals("Shoes") && quantity[i] * shoesPrice > 50) {
                totalOrders++;
            }
            else if (product[i].equals("Caps") && quantity[i] * capsPrice > 50) {
                totalOrders++;
            }
            else if (product[i].equals("Ties") && quantity[i] * tiesPrice > 50) {
                totalOrders++;
            }
            else if (product[i].equals("Watches") && quantity[i] * watchesPrice > 50) {
                totalOrders++;
            }
        }
        return totalOrders;
    }
    // method to print the total number of orders that originated from Union and are $50 or more
    public int numOrders50Union(String[] product, int[] quantity, String[] origin) {
            int totalCost = 0;
            for (int i = 0; i < product.length; i++) {
                if (origin[i].equals("Union")) {
                    if (product[i].equals("Socks") && quantity[i] * socksPrice > 50) {
                        totalCost++;
                    } else if (product[i].equals("Shoes") && quantity[i] * shoesPrice > 50) {
                        totalCost++;
                    } else if (product[i].equals("Caps") && quantity[i] * capsPrice > 50) {
                        totalCost++;
                    } else if (product[i].equals("Ties") && quantity[i] * tiesPrice > 50) {
                        totalCost++;
                    } else if (product[i].equals("Watches") && quantity[i] * watchesPrice > 50) {
                        totalCost++;
                    }
                }
            }
            return totalCost;
        }
    // method to print the total cost of orders that originated from Union and are $50 or more
    public double costOrders50Union(String[] product, int[] quantity, String[] origin) {
        double totalCost = 0;
        for (int i = 0; i < product.length; i++) {
            if (origin[i].equals("Union")) {
                if (product[i].equals("Socks") && quantity[i] * socksPrice > 50) {
                    totalCost += quantity[i] * socksPrice;
                }
                else if (product[i].equals("Shoes") && quantity[i] * shoesPrice > 50) {
                    totalCost += quantity[i] * shoesPrice;
                }
                else if (product[i].equals("Caps") && quantity[i] * capsPrice > 50) {
                    totalCost += quantity[i] * capsPrice;
                }
                else if (product[i].equals("Ties") && quantity[i] * tiesPrice > 50) {
                    totalCost += quantity[i] * tiesPrice;
                }
                else if (product[i].equals("Watches") && quantity[i] * watchesPrice > 50) {
                    totalCost += quantity[i] * watchesPrice;
                }
            }
        }
        return totalCost;
    }
    // method to print the total number of orders that originated from Union and shipped to Edison
    public int numOriginatedFromUnionToEdison(String[] origin, String[] destination) {
        int totalUnion = 0;
        for (int i = 0; i < origin.length; i++) {
            if (origin[i].equals("Union") && destination[i].equals("Edison")) {
                totalUnion++;
            }
        }
        return totalUnion;
    }
    // method to print the total cost of orders that originated from Union and shipped to Edison
    public double costOriginatedFromUnionToEdison(String[] product, int[] quantity, String[] origin, String[] destination) {
        double totalCost = 0;
        for (int i = 0; i < product.length; i++) {
            if (origin[i].equals("Union") && destination[i].equals("Edison"))
                if (product[i].equals("Socks")) {
                    totalCost += quantity[i] * socksPrice;
                }
                else if (product[i].equals("Shoes")) {
                    totalCost += quantity[i] * shoesPrice;
                }
                else if (product[i].equals("Caps")) {
                    totalCost += quantity[i] * capsPrice;
                }
                else if (product[i].equals("Ties")) {
                    totalCost += quantity[i] * tiesPrice;
                }
                else if (product[i].equals("Watches")) {
                    totalCost += quantity[i] * watchesPrice;
                }
            }
        return totalCost;
    }
    // method to print the total number of orders that were shipped to all destinations except Edison
    public int numOrdersNotShippedToEdison(String[] destination) {
        int allOrders = 0;
        for (int i = 0; i < destination.length; i++) {
            if (!destination[i].equals("Edison")) {
                allOrders++;
            }
        }
        return allOrders;
    }
    // method to print the total cost of orders that were shipped to all destinations except Edison
    public double totalNotShippedToEdison(String[] product, int[] quantity, String[] destination) {
        double totalCost = 0;
        for (int i = 0; i < product.length; i++) {
            if (!destination[i].equals("Edison")) {
                if (product[i].equals("Socks")) {
                    totalCost += quantity[i] * socksPrice;
                } else if (product[i].equals("Shoes")) {
                    totalCost += quantity[i] * shoesPrice;
                } else if (product[i].equals("Caps")) {
                    totalCost += quantity[i] * capsPrice;
                } else if (product[i].equals("Ties")) {
                    totalCost += quantity[i] * tiesPrice;
                } else if (product[i].equals("Watches")) {
                    totalCost += quantity[i] * watchesPrice;
                }
            }
        }
        return totalCost;
    }

}

