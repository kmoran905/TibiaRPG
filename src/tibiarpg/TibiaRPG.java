/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tibiarpg;

import java.util.Scanner;

/**
 *
 * @author KHYLE
 * 
 * This program is based on the NPC character Sam in the MMORPG game called Tibia
 * Source: https://tibia.fandom.com/wiki/Sam
 */
public class TibiaRPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Items[] items = Items.values();

        Scanner scanner = new Scanner(System.in);

        String greeting = scanner.next();
        scanner.nextLine();

        if (greeting.equalsIgnoreCase("hi")) {

            System.out.println("Sam: Hello there, adventurer! Need a deal in weapons or armor? I'm your man!");

            String service = scanner.nextLine().toLowerCase();
            
            //Replaces all characters in the service variable except for digits
            String integersOnly = service.replaceAll("[^0-9]", "");
            
            
            //Parses the integersOnly String to an integer.
            int Quantity = Integer.parseInt(integersOnly);

            
            // For each value of every Enum
            for (Items item : items) {
                
                

                if (service.matches("buy.* " + item.getItems().toLowerCase())) {

                    System.out.printf("You have purchased " + Quantity + " %s for %s gold. \n", item.getItems(), item.getBuyingValue() * Quantity);
                    break;

                } else if (service.matches("sell.* " + item.getItems().toLowerCase())) {
                    System.out.printf("You have sold " + Quantity + " %s for %s gold. \n", item.getItems(), item.getSellingValue() * Quantity);
                    break;
                }

            }

        }

    }

}
