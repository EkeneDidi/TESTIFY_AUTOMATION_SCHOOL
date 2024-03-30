package Task14;

public class ClassB {
    public static void main(String[] args) {
        ClassA square = new ClassA();
        int shapeSides = square.getShapeSides();

        //set value for length
        square.setShapeLength(3);

        //set value for breadth
        square.setShapeBreadth(3);

        //get values for the length and breadth
        int shapeLength = square.getShapeLength();;
        double shapeBreadth = square.getShapeBreadth();;

        //Formula for area
       double area = shapeLength * shapeBreadth;

       //Print Answer
        System.out.println("length " + square.getShapeLength() + " breadth " + square.getShapeBreadth() + " = " + area);
        
    }


}
