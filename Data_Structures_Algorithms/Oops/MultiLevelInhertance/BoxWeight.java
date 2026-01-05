package MultiLevelInhertance;

public class BoxWeight extends Box {
    int Weight ;
    BoxWeight(){
    this.Weight = -1;
    }
    BoxWeight(int Weight){
    this.Weight = Weight;
    }
    BoxWeight(int side , int Weight){
      
    super(side);
      System.out.println("This is the BoxWeight Class");
    this.Weight = Weight;
    }
    BoxWeight(int l , int h , int w , int Weight){
    super(l,h,w);
    this.Weight = Weight;
    }
    BoxWeight(BoxWeight other){
    super(other);
    this.Weight = other.Weight;
    }

}
