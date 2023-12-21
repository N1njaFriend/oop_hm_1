// public class Square extends Figure {
//     private static final String NAME = "Square";
    
//     private double sideA;
//     private double sideB;
//     private double sideC;
//     private double sideD;

//     public Square(double sideA, double sideB, double sideC, double sideD) {
//         this.sideA = sideA;
//         this.sideB = sideB;
//         this.sideC = sideC;
//         this.sideC = sideD;
//     }
    
//     @Override
//     public double getArea() {
//         double S = (sideA * sideA); 
//         double area = Math.sqrt(sideA * 4);
//         return area;    
//     }   
    
//     @Override
//     public String getName() {
//         return NAME;
//     }
    
//     public double getSideA() {
//         return sideA;
//     }
    
//     public void setSideA(double sideA) {
//         this.sideA = sideA;
//     }
    
//     public double getSideB() {
//         return sideB;
//     }
    
//     public void setSideB(double sideB) {
//         this.sideB = sideB;
//     }
    
//     public double getSideC() {
//         return sideC;
//     }
    
//     public void setSideC(double sideC) {
//         this.sideC = sideC;
//     }

//     public double getSideD() {
//         return sideD;
//     }
    
//     public void setSideD(double sideD) {
//         this.sideD = sideD;
//     }

//     // public double getS() {
//     //     return S;
//     // }
// }

public class Square extends Figure {
    private static final String NAME = "Square";
    private double sideA;
    // private double sideB;
    // private double sideC;
    // private double sideD;
    
    public Square(double sideA) { // можно добавить (double sideA, double sideB, double sideC, double sideD)
        this.sideA = sideA;
        // this.sideB = sideB;
        // this.sideC = sideC;
        // this.sideD = sideD;
    }
    
    @Override
    public double getArea() {
        double area = sideA * sideA;
        return area;    
    }   
    
    @Override
    public double getPerimeter() {
        double Perimeter = 4 * sideA;
        return Perimeter;
    }
    
    @Override
    public String getName() {
        return NAME;
    }
    
    public double getSideA() {
        return sideA;
    }
    
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    
    // public double getSideB() {
    //     return sideB;
    // }
    
    // public void setSideB(double sideB) {
    //     this.sideB = sideB;
    // }
    
    // public double getSideC() {
    //     return sideC;
    // }
    
    // public void setSideC(double sideC) {
    //     this.sideC = sideC;
    // }
    
    // public double getSideD() {
    //     return sideD;
    // }
    
    // public void setSideD(double sideD) {
    //     this.sideD = sideD;
    // }
}