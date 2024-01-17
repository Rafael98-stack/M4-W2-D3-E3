public class Product {
    Long id;
    String name;
    String category;
    Double price;
public Product(Long id,String name,String category, Double price){
this.id = id;
this.name= name;
this.category=category;
this.price=price;
}
public Long getId(){
    return this.id;
}
public String getName(){
    return this.name;
}
public String getCategory(){
    return this.category;
}
public Double getPrice(){
    return this.price;
}
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}


