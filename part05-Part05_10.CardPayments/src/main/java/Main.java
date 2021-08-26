
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        PaymentTerminal terminal = new PaymentTerminal(); 
        PaymentCard card = new PaymentCard(10); 
        terminal.addMoneyToCard(card, -10); 
        card.balance();
        System.out.println(card);
    }
}
