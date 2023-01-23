import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
public class SheepTestClass {
    @Test
    public void testAddSheep() {
        ListOfSheep sheepManager = new ListOfSheep();
        Sheep sheep = new Sheep("Prashant","Red",172,75);
        int numberOfSheep = sheepManager.AddSheep(sheep);
        assertEquals(2, numberOfSheep);
    }

    @Test
    public void mockAddSheep() {
        ListOfSheep sheepManager = mock(ListOfSheep.class);
        Sheep sheep = new Sheep("Prashant","Red",172,75);
        sheepManager.AddSheep(sheep);
        verify(sheepManager, times(1)).AddSheep(sheep);
    }

}

