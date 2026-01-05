package MultiLevelInhertance;

public class BoxPrice extends BoxWeight {
    int Price ;
    BoxPrice(){
    this.Price  = -1 ;
    }
    BoxPrice(int Price){
        System.out.println("This is the BoxPrice Class");
    this.Price = Price;
    }
    BoxPrice(int l , int h ,int w, int Weight , int Price){
    super(l,h,w,Weight);
    this.Price = Price;
    }
    BoxPrice(int side , int Weight , int Price){
      System.out.println("This is the BoxPrice Class");
    super(side , Weight);
    this.Price = Price;
    }
    BoxPrice(BoxPrice other){
    super(other);
    this.Price = other.Price;
    }
}
