package texas;

public class RabinKarp {

    public static int rabinKarp(String str, String pattern)
    {
        int size1 = str.length();
        int size2 = pattern.length();

        //哈希时需要用到进制计算，这里只涉及26个字母所以使用26进制
        int d = 26;
        //防止hash之后的值超出int范围，对最后的hash值取模
        //q取随机素数，满足q*d < INT_MAX即可
        int q = 144451;

        //str子串的hash值
        int strCode = str.charAt(0) - 'a';
        //pattern的hash值
        int patternCode = pattern.charAt(0) - 'a';
        //d的size2-1次幂，hash计算时，公式中会用到
        int h = 1;

        //计算sCode、pCode、h
        for (int i = 1; i < size2; i++) {
            patternCode = (d*patternCode + pattern.charAt(i)-'a') % q;
            //计算str第一个子串的hash
            strCode = (d*strCode + str.charAt(i)-'a') % q;
            h = (h*d) % q;
        }

        //最大需要匹配的次数
        int frequency = size1 - size2 + 1;
        //字符串开始匹配，对patternCode和strCode开始比较，并更新strCode的值
        for (int i = 0; i < frequency; i++) {
            if(strCode == patternCode && ensureMatching(i, str, pattern)){
                return i;
            }
            //更新strCode的值，即计算str[i+1,i+m-1]子串的hashCode
            strCode = ((strCode - h*(str.charAt(i)-'a'))*d + str.charAt(i+size2) - 'a');
        }
        return -1;
    }


    private static boolean ensureMatching(int i, String str, String pattern) {
        String strSub = str.substring(i, i+pattern.length());
        return strSub.equals(pattern);
    }

    public static void main(String[] args) {
        String str = "23456789tjqka";
        String pattern = "56789";
        System.out.println("最大的数:" + (rabinKarp(str, pattern)+5));
    }
}
