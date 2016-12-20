package com.company;

import com.company.AList;
import org.junit.Before;
import org.junit.Test;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.*;

/**
 * Created by kid on 13.12.2016.
 */
public class AListTest {

    AList list;

    @Before
    public void setUp() {
        list = new AList();
    }

    @Test
    public void shouldCheckThatListEmpty() throws Exception {
        //given
        int expected = 0;

        //when
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 0", expected, actual);
    }

    @Test
    public void shouldAddElementAndReturnSizeOne() throws Exception {
        //given
        int expected = 1;

        //when
        list.add(5);
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 1", expected, actual);
    }

    @Test
    public void shouldAddElementsAndReturnSizeTwo() throws Exception {
        //given
        int expected = 2;

        //when
        list.add(5);
        list.add(6);
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 2", expected, actual);
    }

    @Test
    public void shouldAddMoreElementsThanInitialSizeWithoutTroubles() throws Exception {
        //given
        int expected = 11;

        //when
        for (int i = 0; i < 11; i++) {
            list.add(i + 1);
        }
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 11", expected, actual);
    }

    @Test
    public void shouldReturnLastAddedElement() {
        //given
        int expected = 11;

        //when
        for (int i = 0; i < 11; i++) {
            list.add(i + 1);
        }
        int lastAddedIndex = list.size() - 1;
        int actual = list.get(lastAddedIndex);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 11", expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldTryToGetZeroElementAndThrowException() {
        //when
        list.get(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldTryToGetElevenElementAndThrowException() {
        //when
        list.get(11);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldTryToGetNegativeElementAndThrowException() {
        //when
        list.get(-1);
    }

    @Test
    public void shouldRemoveElementFromEmptyList() throws Exception {
        //given
        int expected = 0;

        //when
        list.remove();
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 0", expected, actual);
    }

    @Test
    public void shouldRemoveFirstElementFromListAndReturnZero() throws Exception {
        //given
        int expected = 0;

        //when
        list.add(1);
        list.remove();
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 0", expected, actual);
    }

    @Test
    public void shouldIncreaseArrayLength() throws Exception {
        //given
        int expected = 12;

        //when
        for (int i = 0; i < 9; i++) {
            list.add(i + 1);
        }

        int actual = list.getArrayLength();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 12", expected, actual);
    }

    @Test
    public void shouldDecreaseArrayLength() throws Exception {
        //given
        int expected = 10;

        //when
        for (int i = 0; i < 9; i++) {
            list.add(i + 1);
        }
        list.remove();
        list.remove();
        int actual = list.getArrayLength();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 10", expected, actual);
    }

    @Test
    public void shouldDecreaseArrayLengthToTen() throws Exception {
        //given
        int expected = 10;

        //when
        for (int i = 0; i < 9; i++) {
            list.add(i + 1);
        }
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        int actual = list.getArrayLength();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 10", expected, actual);
    }

    @Test
    public void shouldRemoveSecondElementFromListAndReturnOne() throws Exception {
        //given
        int expected = 1;

        //when
        list.add(1);
        list.add(2);
        list.remove();
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 1", expected, actual);
    }
    @Test
    public void testRemoveFirstElemnt() throws Exception {
        //given
        int expected = 2;

        //when
        list.add(1);
        list.add(22);
        list.add(222);
        list.removeFirstElemnt();
     //   int actual=2;
        int actual = list.size();


        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 1", expected, actual);
    }
    @Test
    public void testAddFirstElemnt() throws Exception {
        //given
        int expected = 4;

        //when
        list.add(1);
        list.add(22);
        list.add(222);
        list.addFirstElemnt(3);
        //   int actual=2;
        int actual = list.size();


        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 1", expected, actual);
    }
    @Test
    public void testRemoveToIndex() throws Exception {
        //given
        int expected = 2;

        //when
        list.add(1);
        list.add(22);
        list.add(222);
        list.removeToIndex(1);
        //   int actual=2;
        int actual = list.size();


        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 1", expected, actual);
    }

    @Test
    public void testAddElemToIndex() throws Exception {
        //given
        int expected = 67;

        //when
        list.add(1);
        list.add(22);
        list.add(222);
        list.addElemontForIndex(67,2);
        //   int actual=2;
        int actual = list.get(2);


        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 1", expected, actual);
    }
    @Test
    public void testGiveElementToIndex() throws Exception {
        //given
        int expected = 222;

        //when
        list.add(1);
        list.add(22);
        list.add(222);
        list.indexOf(2);
        //   int actual=2;
        int actual = list.get(2);


        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 1", expected, actual);
    }
    @Test
    public void testRazdelenieToEemnt() throws Exception {
        //given
        String expected = " 1test 22test 222test ";
        String razdel="test";


        //when
        list.add(1);
        list.add(22);
        list.add(222);
//        list.addRazdelenieElemen("test");
        //   int actual=2;
        String  actual = list.addRazdelenieElemen("test");


        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 1", expected, actual);
    }
    @Test
    public void testSortElemnt() throws Exception {
        //given
        int expected = 2;

        //when
        list.add(1222);
        list.add(22);
        list.add(222);

               //   int actual=2;
        int actual = list.sortArr();


        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 1", expected, actual);
    }
}