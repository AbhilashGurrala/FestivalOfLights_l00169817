import models.Material;
import org.junit.jupiter.api.Test;
import services.MaterialService;

import static org.junit.jupiter.api.Assertions.*;

public class MaterialServiceTest {

    private final MaterialService materialService = new MaterialService();

    @Test
    public void testCreateMaterial() {
        Material material = materialService.createMaterial("Wood", 5);

        assertEquals("Wood", material.getName());
        assertEquals(5, material.getQuantity());
    }

    @Test
    public void testUpdateMaterialQuantity() {
        Material material = materialService.createMaterial("Wood", 20);

        materialService.updateMaterialQuantity(material, 90);

        assertEquals(90, material.getQuantity());
    }
}
