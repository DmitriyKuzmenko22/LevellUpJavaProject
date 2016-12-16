import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
public class TestHW {

    @org.junit.Test
    public void numberOfMonth(){
//given
        int month = 4;
        int expected=4;

        //when
        int actual = HW7.isOneA(month);

        //then
        assertEquals(expected,actual);
    }


}
