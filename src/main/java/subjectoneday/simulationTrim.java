package subjectoneday;

//1、模拟trim算法，去掉字符串收尾空格
public class simulationTrim {
    public static void main(String[] args) {

        String trim = new simulationTrim().trim(" admin ");
        System.out.println(trim);

    }

    public String trim(String userName){
        char[] chars = userName.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' '){
                stringBuffer.append(chars[i]);
            }
        }


//        String trim = userName.trim();
        return  stringBuffer.toString();
    }
}
