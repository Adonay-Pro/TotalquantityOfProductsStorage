public class Storage {
    Box [] boxes;

    public Storage(Box[] boxes){
        this.boxes = boxes;
    }

    public void setBoxes(Box[] boxes){
        this.boxes = boxes;
    }

    public Box[] getBoxes(){
        return this.boxes;
    }

    public int totQuant(String name){
       int count =0;
        for(Box s: boxes){
            for(Product z: s.getProds()){
             if(z.getName().equals(name)){
                 count+= z.getQuantity();
             }
            }

        }
        return count;
    }
}
