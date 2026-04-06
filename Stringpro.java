public class Stringpro{

    public static void main(String[] args){
        
        String s ="nitin";
        String rev ="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if (s.equals(rev)) {
            
            System.out.println("palindrom");
        }
        else{
            System.out.println("Not an palindrom");
        }

    }
}