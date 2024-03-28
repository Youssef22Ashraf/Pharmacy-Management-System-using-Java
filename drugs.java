import java.util.ArrayList;

public class drugs  {
    private String name;
    private int id;
    private double price;
    private int available_quantity;
    private String catogery;
    
    public  ArrayList < ArrayList<drugs> > pham_list = new ArrayList<ArrayList<drugs>>();
    public ArrayList<drugs> cosme_list = new ArrayList<drugs>();
    public ArrayList<drugs> pres_list = new ArrayList<drugs>();
    public ArrayList<drugs> other_list = new ArrayList<drugs>();
    

    
    
    public drugs(String name, int id, double price,String catogery, int available_quantity ){
    this.name = name;
    this.id = id;
    this.price = price;
    this.available_quantity = available_quantity;
    this.catogery = catogery;
    pham_list.add(cosme_list);
    pham_list.add(pres_list);
    pham_list.add(other_list);
    }
    public drugs(){
        this.name="";
        this.id=0;
        this.price=0;
        this.available_quantity=0;
        this.catogery="";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }


    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    
    
    public int getAvailable_quantity(){
        return available_quantity;
    }
    
    public void setAvailable_quantity(int available_quantity){
        this.available_quantity=available_quantity;
    }


    public String getCatogery() {
        return catogery;
    }
    public void setCatogery(String catogery){
        this.catogery=catogery;   
    }
    
  
    

}


