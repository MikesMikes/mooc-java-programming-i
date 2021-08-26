
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        
        return newMoney;
    }
    
    public boolean lessThan(Money compared){

        return this.thisMoney() < compared.thisMoney();
        
    }
    
    public double thisMoney(){
        double eurosA = this.euros * 1.0;
        double centsA = 1.0 * this.cents; 
        
        System.out.println(centsA);
        
        
        if(centsA >= 10){
            centsA = centsA/100;
        }else if(centsA < 10){
            centsA = centsA / 100;
        }
        
        System.out.println(centsA);
        
        if(eurosA < 0){
            return eurosA - centsA;
        } else {
            return eurosA + centsA;
        }
    }
    
    public Money minus(Money decreaser){
        int newEuro = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;
        
        if(newEuro < 0){
            newEuro = 0;
            newCents = 0;
        } else if(this.cents - decreaser.cents < 0){
            newEuro--;
            newCents = (this.cents - decreaser.cents) + 100;
        }
        
        
        Money newMoney = new Money(newEuro, newCents);
        
        return newMoney;
        
    }

}
