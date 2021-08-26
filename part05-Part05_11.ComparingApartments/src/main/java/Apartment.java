
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public int getSquare(){
        return this.squares;
    }
    
    public boolean largerThan(Apartment apartment){
        return this.squares > apartment.getSquare();
    }
    
    public int priceDifference(Apartment apartment){
        if(this.getPrice() > apartment.getPrice()){
            return this.getPrice() - apartment.getPrice();
        }
        return apartment.getPrice() - this.getPrice();
    }
    
    public int getPrice(){
        return this.princePerSquare * this.squares;
    }
    
    public boolean moreExpensiveThan(Apartment apartment){
        return this.getPrice() > apartment.getPrice();
    }

}
