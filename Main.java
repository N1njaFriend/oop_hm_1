public class Main {
    public static void main(String[] args) {
        Figure[] figure = {new Rectangle(5, 10), 
                           new Square(5),
                           new Circle(5)};
        
        for(Figure fig : figure)
            System.out.println(fig.getName() + ": Area = " + fig.getArea() + ", Perimetr = " + fig.getPerimeter() + ".");  
    }
}