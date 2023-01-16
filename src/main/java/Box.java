public class Box {

  private String id;
  Product[] prods;

  public Box(String id, Product prods[]){
    this.id = id;
    this.prods = prods;
  }

  public void setProds(Product[] prods) {
    this.prods = prods;
  }

  public Product[] getProds(){
    return this.prods;
  }

  public void setId(String id){
      this.id = id;
  }

  public String getId(){
    return this.id;
  }

}
