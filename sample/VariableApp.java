/*
Goal
    Understanding variable
    Understanding type conversion
Step
    javac --class-path "." VariableApp.java ; java --class-path "." VariableApp
*/
public class VariableApp{
    public static void main(String[] args){
        int a = 5;
        int b = 2;
        System.out.println(a+b); // 7
        System.out.println(a/b); // 2

        float c = 5;
        float d = 2;
        System.out.println(c+d); // 7
        System.out.println(c/d); // 2

        // int e = c/d;  => error: incompatible types: possible lossy conversion from float to int
        int e = (int)(c/d); // success, or (int)c/(int)d;
        System.out.println(e); // 2

        float f = a/b; // success
        System.out.println(f); 

        System.out.println("Integer.MAX_VALUE : "+Integer.MAX_VALUE);
        System.out.println("Short.MAX_VALUE : "+Short.MAX_VALUE);
        Short g = 32767; 
        // Short g = 32768; => error: incompatible types: int cannot be converted to Short
    }
}