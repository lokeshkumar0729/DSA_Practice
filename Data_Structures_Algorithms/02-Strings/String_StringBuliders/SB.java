package String_StringBuliders;

public class SB {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("abchueifeabcdefg");
        // for(int i =0;i<26;i++){
        // char ch = (char)('a'+i);
        // name.append(ch);
        // }
        // System.out.println(name);  // here it will only create a single object and modify it every time
        // // we can also use it as list
        System.out.println( name.substring(0, 5));
      
    }
}
