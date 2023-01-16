
public class Principal {
    public static void main(String[] args){

        Box box1 = new Box("Box1", new Product[]{
                        new Product("Carrot",15),
                        new Product("Bananas",20)
                });
        Box box2 = new Box("Box2",
                new Product[]{
                        new Product("Potato",10),
                        new Product("Carrot",12)
                });

        Box box3 = new Box("Box3",new Product[]{
                new Product("Bananas",40),
                new Product("Watermelon",30)
        }) ;
        Storage sto = new Storage(
                new Box[]{box1,box2, box3});
        System.out.println("Tot. quantity of product: " +
                sto.totQuant("Bananas"));
    }
}
