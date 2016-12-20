import spock.lang.Specification

import static org.junit.Assert.assertArrayEquals

class SorterTest extends Specification {
    def "BubbleSort Test"(){
     int[] actual =[8,5,3,6,1,0];
     int[] expected =[0,1,3,5,6,8];

        when:
        Sorter.bubbleSort(actual)

        then:
        assertArrayEquals(expected,actual)

//        where:
//        expected           | actual
//        [1]                | [1]
//        [0, 2, 4]          | [4, 0, 2]
//        [-2, 0, 4]         | [4, 0, -2]
//        [0, 1, 3, 5, 6, 8] | [8, 5, 3, 6, 1, 0]
//        [0, 1, 3, 5, 6, 8] | [0, 1, 3, 5, 6, 8]

    }
    def "BubbleSort2 Test"(){
        int[] actual =[0,1,2,3,4,5];
        int[] expected =[0,1,2,3,4,5];

        when:
        Sorter.bubbleSort(actual)

        then:
        assertArrayEquals(expected,actual)

    }
    def "BubbleSort3 Test"(){
        int[] actual =[];
        int[] expected =[];

        when:
        Sorter.bubbleSort(actual)

        then:
        assertArrayEquals(expected,actual)

    }
    def "BubbleSort4 Test"(){
        int[] actual =[4, 0, 2];
        int[] expected =[0, 2, 4];

        when:
        Sorter.bubbleSort(actual)

        then:
        assertArrayEquals(expected,actual)

    }
    def "BubbleSort5 Test"(){
        int[] actual =[4, 0, -2];
        int[] expected =[-2, 0, 4];

        when:
        Sorter.bubbleSort(actual)

        then:
        assertArrayEquals(expected,actual)

    }
    def "BubbleSort6 Test"(){
        int[] actual =[8, 5, 3, 6, 1, 0];
        int[] expected =[0, 1, 3, 5, 6, 8];

        when:
        Sorter.bubbleSort(actual)

        then:
        assertArrayEquals(expected,actual)

    }
    def "BubbleSort7 Test"(){
        int[] actual =[0, 1, 3, 5, 6, 8];
        int[] expected =[0, 1, 3, 5, 6, 8];

        when:
        Sorter.bubbleSort(actual)

        then:
        assertArrayEquals(expected,actual)
    }
}
