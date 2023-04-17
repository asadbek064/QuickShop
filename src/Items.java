public class Items implements Observer{
    //Properties
    private String name;
    private Double price;
    private int quantity;


    public Items(String n, Double p, int qty){
        name = n;
        price = p;
        quantity = qty;
    }

    public String getName(){return name;}

    public Double getPrice(){return price;}

    public int getQuantity() {return quantity;}

    public void setName(String name) {this.name = name;}

    public void setPrice(Double price) {this.price = price;}

    public void setQuantity(int quantity) {this.quantity = quantity;}

    public void print(){
        System.out.println(name+", $"+price+", "+quantity+" in stock");
    }

    @Override
    public void update(int qty) {
        quantity -= qty;
        if(quantity < 0) {
            System.out.println(name +" is restocked");
            quantity += 30;
        }
        System.out.println("There are only "+this.quantity+" "+this.name+" left");

    }
}
