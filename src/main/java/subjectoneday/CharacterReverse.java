package subjectoneday;

//2、指定字符串中的某一段反转
//数组索引左开右闭
public class CharacterReverse {
    public static void main(String[] args) {
        String param = "buzhidao123..";
        System.out.println(param);

        //方法一使用stringbuffer
        int indexOf = 4;
        int lastIndexOf1 = 8;
        StringBuffer substring1 =new StringBuffer(param.substring(0, indexOf-1)) ;
        System.out.println(substring1);
        StringBuffer substring2 =new StringBuffer( param.substring(lastIndexOf1, param.length()));
        System.out.println(substring2);
        StringBuffer subString3 = new StringBuffer(param.substring(indexOf-1, lastIndexOf1)).reverse();
        System.out.println(subString3);
        String result = substring1.append(subString3.append(substring2)).toString();

        System.out.println(result);

        //方法二：转换为数组
        char[] chars = param.toCharArray();
        for (int x = indexOf-1,y = lastIndexOf1-1 ;x < y ;x++,y--){
            char temp = chars[x];
            chars[x] = chars[y];
            chars[y] = temp;
        }
        System.out.println("=================方法二========================");
        System.out.println(chars);
    }

    public String reverse(String param,int indexOf,int lastIndexOf1) {
        StringBuffer substring1 =new StringBuffer(param.substring(0, indexOf)) ;
        StringBuffer substring2 =new StringBuffer( param.substring(lastIndexOf1, param.length()));
        StringBuffer subString3 = new StringBuffer(param.substring(indexOf, lastIndexOf1)).reverse();
        String result = substring1.append(subString3.append(substring2)).toString();

        return result;
    }
}
