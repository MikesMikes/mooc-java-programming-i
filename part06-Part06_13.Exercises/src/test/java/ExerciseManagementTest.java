
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {
    private ExerciseManagement management;
            
    @Before
    public void initialise(){
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseIsEmptyAtStart() {
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void exerciseListGrows() {
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }
    
    @Test 
    public void exerciseListContains(){
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted(){
        management.add("New Exercise");
        management.markAsCompleted("New Exercise");
        assertTrue(management.isCompleted("New Exercise"));
    }
    
    @Test void ifNotMarkedCompletedIsNotCompleted(){
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertFalse(management.isCompleted("Some exercise"));
    }
}
