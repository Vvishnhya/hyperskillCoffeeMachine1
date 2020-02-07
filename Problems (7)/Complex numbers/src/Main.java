class Complex {

    double real;
    double image;

    // write methods here
    public void add(Complex complex){
        image += complex.image;
        real += complex.real;

    }
    public void subtract(Complex complex){
        image -= complex.image;
        real -= complex.real;

    }
}
//
//class Check{
//    public static void main(String[] args) {
//        Complex comp = new Complex();
//        Complex comp2 = new Complex();
//        comp.real = 100.3;
//        comp.image = -5;
//
//        comp2.real = 99.2;
//        comp2.image = -7;
//
//       comp.subtract(comp2);
//        System.out.println(comp.image);
//        System.out.println(comp.real);
//    }
//}