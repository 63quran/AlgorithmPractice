package subjectoneday;


import com.sun.org.apache.bcel.internal.generic.CPInstruction;

//3、获取一个字符串在另一个字符串中出现的次数
public class CharacterCount {

    public static void main(String[] args) {
        System.out.println(new CharacterCount().count("abcdfgrabcsdlfkjab", "abcsd"));
    }


    public int count(String total,String part){

        char[] chars = total.toCharArray();
        char[] chars1 = part.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            int j = 0;
            if (chars[i] == chars1[j] && i+chars1.length <= chars.length){
                for ( j = 1; j < chars1.length; j++) {
                    if (chars[i+j] == chars1[j] && j != chars1.length-1){
                        continue;
                    }else if(chars[i+chars1.length-1] == chars1[chars1.length-1] && j == chars1.length-1){
                        count++;
                    } else{
                        break;
                    }
                }

            }
        }
        return count;

    }

}
