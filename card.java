import java.util.*;

class card implements  Cloneable  {
    public static void main (String[]args) throws CloneNotSupportedException {
        card c1 = new card();
        if (c1.cardnumber().equals("true")) {
            System.out.println("same card number");
        }
         else {
             System.out.println("Different card number");
            }
         card c2 = (card)c1.clone();
         System.out.println("Card Holder Name : "+c2.holdername);
         System.out.println("Card number : "+c2.cardnumber);
         System.out.println("Card Expire Date : "+c2.expiredate);
        }
        String holdername,cardnumber,expiredate;
        String name = "karthick";
        String number = "1234";
        String date = "10";

        public card(){
            System.out.println("Enter the card holder name : ");
            System.out.println("Enter the card number : ");
            System.out.println("Enter the card expire date : ");
            Scanner sc = new Scanner(System.in);
            holdername = sc.next();
            cardnumber = sc.next();
            expiredate = sc.next();
        }
        String cardnumber(){
            if (cardnumber.equals(number)) {
                return "true";
            }
             else{
                 return "false";
            }
        }
        public Object clone() throws CloneNotSupportedException
        {
            return super.clone();
        }


}


