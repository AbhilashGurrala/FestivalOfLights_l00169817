package services;

import models.Lantern;
import models.Material;
import java.util.List;

public class CraftingService {

    // Method to create a new Lantern
    public Lantern createLantern(String name, List<Material> materials) {
        return new Lantern(name, materials);
    }

    // Method to add material to an existing Lantern
    public void addMaterialToLantern(Lantern lantern, Material material) {
        lantern.addMaterial(material);
    }

}
