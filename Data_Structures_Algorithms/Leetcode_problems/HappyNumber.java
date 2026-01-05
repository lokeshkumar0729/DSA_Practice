public class HappyNumber {
    public static void main(String[] args) {
        int n = 20;
       int slow = n;
       int fast = n;
       do{
    slow = findnum(slow);
    fast = findnum(findnum(fast));
    }while(slow != fast);

    if(slow == 1){
    System.out.println("True");
    }else
        System.out.println("False");
    }
    static int findnum(int num){
    int ans = 0;
    while (num > 0) {
        int rem = num%10;
          ans += rem * rem;
          num /= 10;
    }
    return ans;
    }
}
