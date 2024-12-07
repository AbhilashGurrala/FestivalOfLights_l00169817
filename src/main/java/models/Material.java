package models;

/**
 * Represents a material required for crafting decorative lanterns.
 * Each material has a name and quantity.
 */
public class Material {

    /**
     * The name of the material
     */
    private String name;

    /**
     * The quantity of the material
     */
    private int quantity;

    /**
     * Constructs a new Material object with the specified name and quantity.
     *
     * @param name The name of the material.
     * @param quantity The quantity of the material.
     */
    public Material(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    /**
     * Gets the name of the material.
     *
     * @return name of the material.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the quantity of the material.
     *
     * @return quantity of the material.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Updates the quantity of the material.
     *
     * @param quantity The new quantity of the material.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
