package phan_loai_tam_giac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleClassifierTestTest {

    @Test
    void compareTriangle() {
        int edgeA = 2;
        int edgeB = 2;
        int edgeC = 2;

        String expected = "A equilateral triangle";
        String result = TriangleClass.compareTriangle(edgeA,edgeB,edgeC);
        assertEquals(expected,result);

    }

    @Test
    void compareTriangle1() {
       int edgeA = 2;
       int edgeB = 2;
       int edgeC = 3;

       String expected = "A isosceles triangle";
       String result = TriangleClass.compareTriangle(edgeA,edgeB,edgeC);
        assertEquals(expected,result);
    }

    @Test
    void compareTriangle2() {
        int edgeA = 3;
        int edgeB = 4;
        int edgeC = 5;
        String expected = "A normal triangle";
        String result = TriangleClass.compareTriangle(edgeA,edgeB,edgeC);
        assertEquals(expected, result);
    }

    @Test
    void compareTriangle3() {
        int edgeA = 8;
        int edgeB = 2;
        int edgeC = 3;
        String expected = "Not a triangle!";
        String result = TriangleClass.compareTriangle(edgeA,edgeB,edgeC);
        assertEquals(expected, result);
    }

    @Test
    void compareTriangle4() {
        int edgeA = -1;
        int edgeB = 2;
        int edgeC = 1;
        String expected = "Not a triangle!";
        String result = TriangleClass.compareTriangle(edgeA,edgeB,edgeC);
        assertEquals(expected, result);
    }

    @Test
    void compareTriangle5() {
        int edgeA = 0;
        int edgeB = 1;
        int edgeC = 1;
        String expected = "Not a triangle!";
        String result = TriangleClass.compareTriangle(edgeA,edgeB,edgeC);
        assertEquals(expected, result);
    }
}