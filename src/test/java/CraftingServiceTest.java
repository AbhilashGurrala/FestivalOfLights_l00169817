import models.Lantern;
import models.Material;
import org.junit.jupiter.api.Test;
import services.CraftingService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CraftingServiceTest {

    private final CraftingService craftingService = new CraftingService();

    @Test
    public void testCreateLantern() {
        List<Material> materials = new ArrayList<>();
        materials.add(new Material("Paper", 2));
        materials.add(new Material("String", 1));

        Lantern lantern = craftingService.createLantern("Festival Lantern", materials);

        assertEquals("Festival Lantern", lantern.getName());
        assertEquals(2, lantern.getMaterials().size());
    }

    @Test
    public void testAddMaterialToLantern() {
        List<Material> materials = new ArrayList<>();
        materials.add(new Material("Paper", 2));
        Lantern lantern = craftingService.createLantern("Simple Lantern", materials);

        Material newMaterial = new Material("Glue", 1);
        craftingService.addMaterialToLantern(lantern, newMaterial);

        assertEquals(2, lantern.getMaterials().size());
        assertTrue(lantern.getMaterials().contains(newMaterial));
    }
}
