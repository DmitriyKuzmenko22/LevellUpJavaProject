import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by java on 13.12.2016.
 */
public class AListTest {

    AList list;

    @Before
    public void setUp(){
        list = new AList();

    }

    @Test
    public void shouldCheckThatListEmpty() throws Exception {
       //given
        int expected=0;

        //when

        int actual=list.size();

        //then
        assertEquals("ERROR!!! ACTUAL result is wrong! Expected is 0",expected,actual);

    }

    @Test
    public void testRemove() throws Exception {

    }
    @Test
    public void shouldAddElementsReturnSizaTwo() throws Exception {
        //given
        int expected=2;

        //when
        list.add(5);
        list.add(6);
        int actual=list.size();

        //then
        assertEquals("ERROR!!! ACTUAL result is wrong! Expected is 2",expected,actual);

    }
    @Test
    public void shouldMoreElementsInitialSizaTroubles() throws Exception {
        //given
        int expected = 11;

        //when
        for(int i=0;i<11;i++){
            list.add(i+1);
        }

        int actual = list.size();

        //then
        assertEquals("ERROR!!! ACTUAL result is wrong! Expected is 11", expected, actual);
    }
    @Test
    public void shouldReturnLastAddElement(){
        //given
        int expected = 11;


        //when
        for(int i=0;i<11;i++){
            list.add(i+1);
        }

        int actual = list.get(list.size()-1);
        int lastAddIndex=list.get(list.size()-1);

        //then
        assertEquals("ERROR!!! ACTUAL result is wrong! Expected is 11", expected, actual);
    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldTryToGetZeroElements(){
              //when

        int actual = list.get(0);

         }
    @Test(expected = IllegalArgumentException.class)
    public void shouldTryToGetElevenElementThrowExceprion(){
        //when

        int actual = list.get(11);

    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldTryToGetNegativeElevenElementThrowExceprion(){
        //when

        int actual = list.get(-1);

    }
    @Test
    public void shouldRemoveElementFromEmptyList() throws Exception {
        //given
        int expected=0;

        //when

        int actual=list.size();

        //then
        assertEquals("ERROR!!! ACTUAL result is wrong! Expected is 2",expected,actual);

    }
    @Test
    public void shouldRemoveFirstFromListAndReturnZero() throws Exception {
        //given
        int expected=0;

        //when
        list.add(1);
        list.remove();


        int actual=list.size();

        //then
        assertEquals("ERROR!!! ACTUAL result is wrong! Expected is 2",expected,actual);

    }

    @Test
    public void shouldRemoveSecondElemntAndRerutnOne() throws Exception {
        //given
        int expected = 1;

        //when
        list.add(1);
        list.add(2);
        list.remove();
        int actual = list.size();


        //then
        assertEquals("ERROR!!! ACTUAL result is wrong! Expected is 2", expected, actual);

    } @Test
    public void shouldIncreaseArrayLenght() throws Exception {
        //given
        int expected =12;

        //when
        for(int i=0;i<9;i++){
            list.add(i+1);
        }


        int actual = list.getArrayLenght();


        //then
        assertEquals("ERROR!!! ACTUAL result is wrong! Expected is 9*1.5", expected, actual);

    }
    @Test
    public void shouldDecreaseArrayLenght() throws Exception {
        //given
        int expected =10;

        //when
        for(int i=0;i<9;i++){
            list.add(i+1);
        }
        list.remove();
        list.remove();
        int actual = list.getArrayLenght();


        //then
        assertEquals("ERROR!!! ACTUAL result is wrong! Expected is 9*1.5", expected, actual);

    }
    @Test
    public void shouldDecreaseArrayLenghtToTen() throws Exception {
        //given
        int expected =10;

        //when
        for(int i=0;i<9;i++){
            list.add(i+1);
        }
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        int actual = list.getArrayLenght();


        //then
        assertEquals("ERROR!!! ACTUAL result is wrong! Expected is 9*1.5", expected, actual);

    }
}