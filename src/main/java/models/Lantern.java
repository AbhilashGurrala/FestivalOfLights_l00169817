package models;

import java.util.List;

/**
 * Represents a lantern crafted using the materials.
 */
public class Lantern {

    /**
     * The name of the lantern.
     */
    private String name;

    /**
     * The list of materials to craft the lantern.
     */
    private List<Material> materials;

    /**
     * Constructs a new Lantern object with the name and list of materials.
     *
     * @param name The name of the lantern.
     * @param materials A list of materials.
     */
    public Lantern(String name, List<Material> materials) {
        this.name = name;
        this.materials = materials;
    }

    /**
     * Gets the name of the lantern.
     *
     * @return The name of the lantern.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the list of materials required for the lantern.
     *
     * @return A list of materials.
     */
    public List<Material> getMaterials() {
        return materials;
    }

    /**
     * Adds a new material to the material list.
     *
     * @param material The material to be added.
     */
    public void addMaterial(Material material) {
        materials.add(material);
    }
}
