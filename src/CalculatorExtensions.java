
public class CalculatorExtensions {
    
    

    // Check if a number is integer or float
    boolean isInteger(Float num) {
        
    if (Math.floor(num) == Math.ceil(num)) {
        return true;
    }
    return false;
    }
    
}

