public class XValue {
    public static void main(String[] args) {
        String[] arr = {"++X","X++","X--","--X"};
        System.out.println(finalValueAfterOperations(arr));
    }
    static public int finalValueAfterOperations(String[] operations) {
        int i = 0;
        for(String value : operations){
        if(value  == "--X" || value == "X--"){
        i--;
        }
        else{
        i++;
        }
        }
        return i;
    }
}
