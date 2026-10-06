public class linearsrt {
    public static void main(String[] args) {
        String str = "parth";
        char tar = 'o';
       System.out.println(linear(str,tar));
    }

    static boolean linear(String str, char tar){
        if(str.length()==0){
            return false;
        }
        
        for(int i = 0 ; i<str.length(); i++){
            if(tar == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

}
