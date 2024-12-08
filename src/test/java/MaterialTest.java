import models.Material;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Material class.
 */
public class MaterialTest {

    @Test
    public void testMaterialConstructorAndGetters() {
        // Arrange
        String name = "Wood";
        int quantity = 10;

        // Act
        Material material = new Material(name, quantity);

        // Assert
        assertEquals(name, material.getName(), "Material name should be 'Wood'.");
        assertEquals(quantity, material.getQuantity(), "Material quantity should be 10.");
    }

    @Test
    public void testSetQuantity() {
        // Arrange
        Material material = new Material("Metal", 5);

        // Act
        material.setQuantity(10);

        // Assert
        assertEquals(10, material.getQuantity(), "Material quantity should be changed to 10.");
    }
}
