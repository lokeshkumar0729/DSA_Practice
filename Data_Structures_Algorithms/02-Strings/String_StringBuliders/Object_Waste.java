package String_StringBuliders;
public class Object_Waste {
    public static void main(String[] args) {
        String name = "";
        for(int i =0;i<26;i++){
        char ch = (char)('a'+i);
        System.out.println(ch);
        name += ch;
        }
        System.out.println(name); // evert time it is creating a new object
    }
}
