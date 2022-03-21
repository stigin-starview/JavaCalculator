
public class CalculatorExtensions {
   
    public int[] Dimentions(int a, int b) {

        return new int[] {a, b};
    }

    boolean isInteger(Float num) {
        
    if (Math.floor(num) == Math.ceil(num))
    {
        return true;
    }
    return false;
        


    }
}
