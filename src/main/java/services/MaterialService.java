package services;

import models.Material;

public class MaterialService {

    // Method to create a new Material
    public Material createMaterial(String name, int quantity) {
        return new Material(name, quantity);
    }

    // Method to update the quantity of a Material
    public void updateMaterialQuantity(Material material, int newQuantity) {
        material.setQuantity(newQuantity);
    }

}
