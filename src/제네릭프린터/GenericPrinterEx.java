package 제네릭프린터;

public class GenericPrinterEx {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powderPrinter);
        System.out.println(powder);

        GenericPrinter<Plastic> plasticPriter = new GenericPrinter<>();
        plasticPriter.setMaterial(new Plastic());
        Plastic plastic = plasticPriter.getMaterial();
        System.out.println(plasticPriter);


    }
}
