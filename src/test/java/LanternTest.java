import models.Lantern;
import models.Material;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LanternTest {

    private Lantern lantern;
    private List<Material> materials;

    @BeforeEach
    public void setUp() {
        materials = new ArrayList<>();
        materials.add(new Material("Paper", 2));
        materials.add(new Material("String", 1));
        lantern = new Lantern("Festival Lantern", materials);
    }

    @Test
    public void testLanternInitialization() {
        assertEquals("Festival Lantern", lantern.getName());
        assertEquals(2, lantern.getMaterials().size());
    }

    @Test
    public void testAddMaterial() {
        Material newMaterial = new Material("Glue", 1);
        lantern.addMaterial(newMaterial);

        assertEquals(3, lantern.getMaterials().size());
        assertTrue(lantern.getMaterials().contains(newMaterial));
    }

    @Test
    public void testGetMaterials() {
        List<Material> retrievedMaterials = lantern.getMaterials();
        assertEquals(2, retrievedMaterials.size());
        assertEquals("Paper", retrievedMaterials.get(0).getName());
        assertEquals(2, retrievedMaterials.get(0).getQuantity());
    }
}
