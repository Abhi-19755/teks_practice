public class TypeCasting {
    public static void main(String[] args) {
        
        //  implicit type casting
        int num = 6;
        float num2 = num;
        // it converts automatically from small data type to large
        System.out.println(num);
        System.out.println(num2);

        // explicit type casting
        float num3 = 3.53f ;
        int num4 = (int) num3; //manual casting which is denoted inside ()

        System.out.println(num3);
        System.out.println(num4);

    }
}


/*
 * Type Casting in java is the process of converting one datatype into another 
 * 
 *  Widening Casting ( implicit casting ) also know as Upcasting
 *  Converting a smaller data type into a larger data type automatically.
 *  data is safe
 *  byte → short → int → long → float → double
 * 
 *  Narrowing Casting (Explcit casting ) also known as Downcasting
 *  Converting a larger data type into a smaller one manually.
 *  Requires explicit casting syntax: (targetType)
 *  data can be loss
 *  double -> float -> long -> int -> char -> short -> byte
 */