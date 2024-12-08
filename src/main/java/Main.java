import services.CraftingService;
import services.MaterialService;
import models.Lantern;
import models.Material;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CraftingService craftingService = new CraftingService();
        MaterialService materialService = new MaterialService();

        // a list to hold materials for lanterns
        List<Material> materials = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // Variables to keep track of lantern
        Lantern lantern = null;

        // Menu options
        while (true) {
            // Display menu
            System.out.println("\n--- Lantern Crafting Menu ---");
            System.out.println("1. Create Lantern");
            System.out.println("2. Add Material to Lantern");
            System.out.println("3. View Lantern Details");
            System.out.println("4. Exit");
            System.out.print("Enter number: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Create a new lantern
                    System.out.print("Enter the name of the lantern: ");
                    String lanternName = scanner.nextLine();
                    lantern = craftingService.createLantern(lanternName, materials);
                    System.out.println("Lantern \"" + lanternName + "\" created successfully!");
                    break;

                case 2:
                    // Add a new material to the lantern
                    if (lantern == null) {
                        System.out.println("No lantern has been created yet. Please create a lantern first.");
                    } else {
                        System.out.print("Enter the material name: ");
                        String materialName = scanner.nextLine();
                        System.out.print("Enter the quantity of the material: ");
                        int quantity = scanner.nextInt();
                        scanner.nextLine();

                        // Create material and add it to the lantern
                        Material material = materialService.createMaterial(materialName, quantity);
                        craftingService.addMaterialToLantern(lantern, material);
                        System.out.println("Material \"" + materialName + "\" added to the lantern.");
                    }
                    break;

                case 3:
                    // View details of the created lantern
                    if (lantern == null) {
                        System.out.println("No lantern has been created yet.");
                    } else {
                        System.out.println("\nLantern Name: " + lantern.getName());
                        System.out.println("Materials required:");
                        for (Material m : lantern.getMaterials()) {
                            System.out.println("- " + m.getName() + ": " + m.getQuantity());
                        }
                    }
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
