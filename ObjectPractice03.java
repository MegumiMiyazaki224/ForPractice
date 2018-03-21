public class ObjectPractice03 {
    public static void main(String[] args) {

        Circle hoge = new Circle();

        hoge.radius = 20;

        double a = hoge.getArea();

        double b = hoge.getCircumference();


        System.out.println("面積："+a+"  円周："+b);


    }

}