package phan_loai_tam_giac;

public class TriangleClass {
    public static int edgeA;
    public static int edgeB;
    public static int edgeC;

    public TriangleClass() {
    }

    public static String compareTriangle(int edgeA, int edgeB, int edgeC) {
        if(edgeA <= 0 || edgeB <= 0 || edgeC <= 0 ||
                (edgeA) > (edgeB)+(edgeC) ||
                (edgeB) > (edgeA)+(edgeC) ||
               (edgeC) > (edgeB)+(edgeA)){
            return "Not a triangle!";
        }else if(edgeA == edgeB){
            if(edgeB == edgeC){
                return "A equilateral triangle";
            }else
                return "A isosceles triangle";
        }else if(edgeB == edgeC || edgeA == edgeC) {
            return "A isosceles triangle";
        }else
            return "A normal triangle";
    }

}
