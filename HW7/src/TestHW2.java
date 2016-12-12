import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class TestHW2 {
    @Test
    public void whatMastAndNumberKarti(){
        //given
        int Mast=2;
        int number=8;
        String expected = "Трефы восьмерка";


        //when
        String actual=HW7.isTwo(Mast, number);

        //then
        assertEquals(expected,actual);

    }


}


