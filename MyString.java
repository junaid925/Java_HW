
public final class MyString {

    private final char[] chars;
    
    public MyString toLowerCase() {
        for (int i = 0; i < length(); i++) {
            
            if (this.chars[i] >= 65 && this.chars[i] <= 90) {
                this.chars[i] = (char)(this.chars[i] + 32);
            }
        }
        return new MyString(this.chars);
    }
    
    
    public MyString toUpperCase() {
        for (int i = 0; i < length(); i++) {
            
            if (this.chars[i] >= 97 && this.chars[i] <= 122) {
                this.chars[i] = (char)(this.chars[i] - 32);
            }
        }
        return new MyString(this.chars);
    }

    public MyString(char[] chars) {
        this.chars = chars;
    }

    public char charAt(int index) {
        return this.chars[index];
    }


    public int length() {
        return this.chars.length;
    }


    public MyString substring(int begin, int end) {
        char[] temp = new char[end - begin];
        for (int i = begin; i < end; i++) {
            temp[i - begin] = this.chars[i];
        }
        return new MyString(temp);
    }

    
    public boolean equals(MyString s) {
        if (s.length() != length()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (this.chars[i] != s.toString().charAt(i)) {
                return false;
            }
        }
        return true;
    }


    public MyString getMyString() {
        return new MyString(this.chars);
    }


    public String toString() {
        return new String(this.chars);
    }


    public static MyString valueOf(int i) {
         return new MyString(Integer.toString(i).toCharArray());
    }
    public static void main(String[] args){
        String s1="hello";
        char[] ch=s1.toCharArray();
        MyString s = new MyString(ch);
        
        
        
        System.out.println("toUppercase Method example:  " + s.toUpperCase());
        System.out.println("toLowercase Method example:  " + s.toLowerCase());
        System.out.println("Length Method example:  " + s.length());
        System.out.println("ValueOf Method example:  " + s.valueOf(3));
        System.out.println("getMyString Method example:  " + s.getMyString());
        System.out.println("toString Method example:  " + s.toString());
        System.out.println("Equals Method example:  " + s.equals(s1));
        System.out.println("Substring Method example:  " + s.substring(1,3));
        
        
        
    }
}
