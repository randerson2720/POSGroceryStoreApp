import java.util.Scanner;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Collections;

/**@author
 * program asks the user what item they would like to purchase from hashmaps 
 * calculates the total items purchased along with the price and discounts
 * 
 */

class BillProccessor {                                        
    public static void prepareBill(LinkedHashMap<String, Integer> purchases, LinkedHashMap<String,Double> items, LinkedHashMap<String,String> sale,
        ArrayList<String> itemNames) {                           // handles the bill and prints it
            double totalCost = 0;
            double totalDiscount = 0;
            	if (purchases.containsKey("Apples")) {
            		totalCost = items.get("Apples") + totalCost;
            		}
            	if (purchases.containsKey("Blueberries")) {
            		totalCost = items.get("Blueberries") + totalCost;
            	}
            	if (purchases.containsKey("Bread")) {
            		totalCost = items.get("Bread") + totalCost;
            		totalDiscount = totalDiscount + 0.20;
            		}
            	if (purchases.containsKey("Cereal")) {
            		totalCost = items.get("Cereal") + totalCost;
            		
            	}
            	if (purchases.containsKey("Eggs")) {
            		totalCost = items.get("Eggs") + totalCost;
            		
            		}
            	if (purchases.containsKey("Frozen Pizza")) {
            		totalCost = items.get("Frozen Pizza") + totalCost;
            	}
            	if (purchases.containsKey("Ground Beef")) {
            		totalCost = items.get("Ground Beef") + totalCost;
            		}
            	if (purchases.containsKey("Hamburgers")) {
            		totalCost = items.get("Hamburgers") + totalCost;
            		totalDiscount = totalDiscount + 2.00;
            	}
            	if (purchases.containsKey("Milk")) {
            		totalCost = items.get("Milk") + totalCost;
            		}
            	if (purchases.containsKey("Mountain Dew")) {
            		totalCost = items.get("Mountain Dew") + totalCost;
            		totalDiscount = totalDiscount + 0.30;
            	}
            	if (purchases.containsKey("Peanut Butter")) {
            		totalCost = items.get("Peanut Butter") + totalCost;
            		}
            	if (purchases.containsKey("Roast Beef")) {
            		totalCost = items.get("Roast Beef") + totalCost;
            	}
            	if (purchases.containsKey("Sausage")) {
            		totalCost = items.get("Sausage") + totalCost;
            		}
            	if (purchases.containsKey("String Cheese")) {
            		totalCost = items.get("String Cheese") + totalCost;
            	}
            	if (purchases.containsKey("Tamales")) {
            		totalCost = items.get("Tamales") + totalCost;
            		totalDiscount = totalDiscount + 0.80;
            	}
            	System.out.println("Here is what you purchased:");
                if (purchases.containsKey("Apples")) {
                    System.out.printf("%s apples, regularly  $%.2f each, total $%.2f\n", purchases.get("Apples"), items.get("Apples"), items.get("Apples"));
                } else {
                    
                } if (purchases.containsKey("Blueberries")) {
                    System.out.printf("%s blueberries, regularly  $%.2f each, total $%.2f\n", purchases.get("Blueberries"), items.get("Blueberries"), items.get("Blueberries"));
                } else {

                } if (purchases.containsKey("Bread")) {
                    System.out.printf("%s bread, regularly  $%.2f each, total $%.2f ($0.20 discount)\n", purchases.get("Bread"), items.get("Bread"), items.get("Bread"));
                } else {
                
                } if (purchases.containsKey("Cereal")) {
                    System.out.printf("%s cereal, regularly  $%.2f each, total $%.2f\n", purchases.get("Cereal"), items.get("Cereal"), items.get("Cereal"));
                } else {

                } if (purchases.containsKey("Eggs")) {
                    System.out.printf("%s eggs, regularly  $%.2f each, total $%.2f\n", purchases.get("Eggs"), items.get("Eggs"), items.get("Eggs"));
                } else {
                
                } if (purchases.containsKey("Frozen Pizza")) {
                    System.out.printf("%s frozen pizza, regularly  $%.2f each, total $%.2f\n", purchases.get("Frozen Pizza"), items.get("Frozen Pizza"), items.get("Frozen Pizza"));
                } else {
                
                } if (purchases.containsKey("Ground Beef")) {
                    System.out.printf("%s ground beef, regularly  $%.2f each, total $%.2f\n", purchases.get("Ground Beef"), items.get("Ground Beef"), items.get("Ground Beef"));
                } else {
                
                } if (purchases.containsKey("Hamburgers")) {
                    System.out.printf("%s hamburgers, regularly  $%.2f each, total $%.2f ($2.00 discount)\n", purchases.get("Hamburgers"), items.get("Hamburgers"), items.get("Hamburgers"));
                } else {
                
                }if (purchases.containsKey("Milk")) {
                    System.out.printf("%s milk, regularly  $%.2f each, total $%.2f\n", purchases.get("Milk"), items.get("Milk"), items.get("Milk"));
                } else {
                
                } if (purchases.containsKey("Mountain Dew")) {
                    System.out.printf("%s mountain dew, regularly  $%.2f each, total $%.2f ($0.30 discount)\n", purchases.get("Mountain Dew"), items.get("Mountain Dew"), items.get("Mountain Dew"));
                } else {
                
                } if (purchases.containsKey("Peanut Butter")) {
                    System.out.printf("%s peanut butter, regularly  $%.2f each, total $%.2f\n", purchases.get("Peanut Butter"), items.get("Peanut Butter"), items.get("Peanut Butter"));
                } else {
                
                } if (purchases.containsKey("Roast Beef")) {
                    System.out.printf("%s roast beef, regularly  $%.2f each, total $%.2f\n", purchases.get("Roast Beef"), items.get("Roast Beef"), items.get("Roast Beef"));
                } else {
                
                } if (purchases.containsKey("Sausage")) {
                    System.out.printf("%s sausage, regularly  $%.2f each, total $%.2f\n", purchases.get("Sausage"), items.get("Sausage"), items.get("Sausage"));
                } else {
                
                } if (purchases.containsKey("String Cheese")) {
                    System.out.printf("%s string cheese, regularly  $%.2f each, total $%.2f\n", purchases.get("String Cheese"), items.get("String Cheese"), items.get("Stringe Cheese"));
                } else {
                
                } if (purchases.containsKey("Tamales")) {
                    System.out.printf("%s tamales, regularly  $%.2f each, total $%.2f ($0.80 discount)\n", purchases.get("Tamales"), items.get("Tamales"), items.get("Tamales"));
                } else {
                
                }
                System.out.println();
                System.out.printf("Your total bill is $%.2f\n", totalCost);
                System.out.printf("You saved $%.2f by shopping with us today\n", totalDiscount);
                System.out.println();
                System.out.println("Thank you for your business. Come back soon!");
        }

}

public class AndersonGroceryStore {
    private static LinkedHashMap<String,Double> items; // storage for items and the cost
    private static LinkedHashMap<String,String> sale; // storage for the items and the sale of the items
    private static LinkedHashMap<String,Integer> purchases; // storage for the items that are purchased and the amounts
    private static ArrayList<String> itemNames;

    public static LinkedHashMap<String,Double>readItemsFromFile(String fname) {     // reads the items file and puts it into a linked hashmap and an arraylist for the names
        LinkedHashMap<String,Double> result = new LinkedHashMap<String,Double>();
        itemNames = new ArrayList<String>();
        String line;
        String[] parts;
        String itemName;
        double itemPrice;
        try {
            Scanner fscan = new Scanner(new File("items.txt"));
            while (fscan.hasNextLine()) {
                line = fscan.nextLine().trim();
                if (line.length() > 0) {
                    parts = line.split("\t");
                    itemName = parts[0];
                    itemPrice = Double.parseDouble(parts[1]);
                    result.put(itemName, itemPrice);
                    itemNames.add(itemName);
                    
                }
            }
            fscan.close();
        } catch (Exception ex) {
            return null;
        }
        Collections.sort(itemNames);
        return result;
    }
    public static LinkedHashMap<String,String> readSaleFromFile(String fname) {  // reads the sales file and puts it into a linked hashmap
        LinkedHashMap<String,String> result = new LinkedHashMap<String,String>();
        String line;
        String[] parts;
        String itemName;
        String itemSale;
        try {
            Scanner fscan = new Scanner(new File("sales.txt"));
            while (fscan.hasNextLine()) {
                line = fscan.nextLine().trim();
                if (line.length() > 0) {
                    parts = line.split("\t");
                    itemName = parts[0];
                    itemSale = parts[1];
                    result.put(itemName,itemSale);
                }
            }
        } catch (Exception ex) {
            return null;
        }
        return result;
    }
    public static void printWelcome() {   // prints the welcome message for the assignment. 
        System.out.println("***************************************************************");
        System.out.println("*                    CHARLIE'S PANTRY                         *");
        System.out.println("***************************************************************");
        System.out.println();
        System.out.println("Welcome to your friendly neighborhood Charlie's Pantry. We sell");
        System.out.println("only the highest quality of groceries of the freshest produce around.");
        System.out.println("We have many great specials this week. The more you buy, the");
        System.out.println("more you save!");
        System.out.println();
        System.out.println("What would you like to buy?");
        System.out.println();
    }
    public static void printMenuItems() {        // prints the menu of items with sale and price
        System.out.println("##\t Item Name\t\t Reg.   Sale");
        System.out.println("---------------------------------------------------------");
        System.out.println("1\t" + itemNames.get(0) +"\t\t\t" + "$" + items.get("Apples"));
        System.out.println("2\t" + itemNames.get(1) +"\t\t" + "$" + items.get("Blueberries"));
        System.out.println("3\t" + itemNames.get(2) +"\t\t\t" + "$" + items.get("Bread") + "\t" + "$" + sale.get("Bread") + " discount");
        System.out.println("4\t" + itemNames.get(3) +"\t\t\t" + "$" + items.get("Cereal") + "\t" + "Buy One, Get One");
        System.out.println("5\t" + itemNames.get(4) +"\t\t\t" + "$" + items.get("Eggs") + "\t" + "Buy One, Get One");
        System.out.println("6\t" + itemNames.get(5) +"\t\t" + "$" + items.get("Frozen Pizza"));
        System.out.println("7\t" + itemNames.get(6) +"\t\t" + "$" + items.get("Ground Beef"));
        System.out.println("8\t" + itemNames.get(7) +"\t\t" + "$" + items.get("Hamburgers") + "\t" + "$" + sale.get("Hamburgers") + " discount");
        System.out.println("9\t" + itemNames.get(8) +"\t\t\t" + "$" + items.get("Milk"));
        System.out.println("10\t" + itemNames.get(9) +"\t\t" + "$" + items.get("Mountain Dew") + "\t" + "$" + sale.get("Mountain Dew") + " discount");
        System.out.println("11\t" + itemNames.get(10) +"\t\t" + "$" + items.get("Peanut Butter"));
        System.out.println("12\t" + itemNames.get(11) +"\t\t" + "$" + items.get("Roast Beef"));
        System.out.println("13\t" + itemNames.get(12) +"\t\t\t" + "$" + items.get("Sausage"));
        System.out.println("14\t" + itemNames.get(13) +"\t\t" + "$" + items.get("String Cheese"));
        System.out.println("15\t" + itemNames.get(14) +"\t\t\t" + "$" + items.get("Tamales") + "\t" + "$" + sale.get("Tamales") + " discount");
        System.out.println("---------------------------------------------------------");
        System.out.println();
    }
    public static void main(String[] args) {
        items = readItemsFromFile("items.txt");
        sale = readSaleFromFile("sales.txt");
        purchases = new LinkedHashMap<String,Integer>();
        Scanner scan = new Scanner(System.in);
        String choice;
        printWelcome();
        printMenuItems();
        do {                                       // takes the user choice and puts what the user picks in the purchases hashmap
            System.out.print("Enter the number of your choice, or q to check out: ");
            choice = scan.nextLine();
            if (choice.equals("1") && purchases.containsKey("Apples")) {
                purchases.put(itemNames.get(0), + 1);
                } else  {
                    purchases.put("Apples", 1);
                } if (choice.equals("2") && purchases.containsKey("Blueberries")) {
                    purchases.put(itemNames.get(1), + 1);
                    } else {
                        purchases.put("Blueberries" , 1);
                } if (choice.equals("3") && purchases.containsKey("Bread")) {
                    purchases.put(itemNames.get(2), + 1);
                    } else {
                        purchases.put(itemNames.get(2) , 1);
                } if (choice.equals("4") && purchases.containsKey("Cereal")) {
                    purchases.put(itemNames.get(3), + 1);
                    } else {
                        purchases.put("Cereal" , 1);
                } if (choice.equals("5") && purchases.containsKey("Eggs")) {
                    purchases.put(itemNames.get(4), + 1);                     
                    } else {
                        purchases.put("Eggs" , 1);
                } if (choice.equals("6") && purchases.containsKey("Frozen Pizza")) {
                    purchases.put(itemNames.get(5), + 1);                       
                    } else {
                        purchases.put("Frozen Pizza" , 1);
                } if (choice.equals("7") && purchases.containsKey("Ground Beef")) {
                    purchases.put(itemNames.get(6), + 1);                      
                    } else {
                        purchases.put("Ground Beef" , 1);
                } if (choice.equals("8") && purchases.containsKey("Hamburgers")) {
                    purchases.put(itemNames.get(7), 1);                       
                    } else {
                        purchases.put("Hamburgers" , 1);
                } if (choice.equals("9") && purchases.containsKey("Milk")) {
                    purchases.put(itemNames.get(8), + 1);                       
                    } else {
                        purchases.put("Milk" , 1);
                } if (choice.equals("10") && purchases.containsKey("Mountain Dew")) {
                    purchases.put(itemNames.get(9), + 1);                       
                    } else {
                        purchases.put("Mountain Dew" , 1);
                } if (choice.equals("11") && purchases.containsKey("Peanut Butter")) {
                    purchases.put(itemNames.get(10), + 1);                      
                    } else {
                        purchases.put("Peanut Butter" , 1);
                } if (choice.equals("12") && purchases.containsKey("Roast Beef")) {
                    purchases.put(itemNames.get(11), + 1);                       
                    } else {
                        purchases.put("Roast Beef" , 1);
                } if (choice.equals("13") && purchases.containsKey("Sausage")) {
                    purchases.put(itemNames.get(12), + 1);                       
                    } else {
                        purchases.put("Sausage" , 1);
                } if (choice.equals("14") && purchases.containsKey("String Cheese")) {
                    purchases.put(itemNames.get(13), + 1);
                    } else {
                        purchases.put("String Cheese" , 1);
                } if (choice.equals("15") && purchases.containsKey("Tamales")) {
                    purchases.put(itemNames.get(14), + 1);
                    } else {
                        purchases.put("Tamales" , 1);
                } 
        } while (!choice.equals("q"));
        
        BillProccessor.prepareBill(purchases, items, sale, itemNames); // calls the prepareBill method and prints it 
        
        
        
        
        
        
        
        
        
    }
}