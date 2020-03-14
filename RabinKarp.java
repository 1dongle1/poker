package texas;

public class RabinKarp {

    public static int rabinKarp(String str, String pattern)
    {
        int size1 = str.length();
        int size2 = pattern.length();

        //��ϣʱ��Ҫ�õ����Ƽ��㣬����ֻ�漰26����ĸ����ʹ��26����
        int d = 26;
        //��ֹhash֮���ֵ����int��Χ��������hashֵȡģ
        //qȡ�������������q*d < INT_MAX����
        int q = 144451;

        //str�Ӵ���hashֵ
        int strCode = str.charAt(0) - 'a';
        //pattern��hashֵ
        int patternCode = pattern.charAt(0) - 'a';
        //d��size2-1���ݣ�hash����ʱ����ʽ�л��õ�
        int h = 1;

        //����sCode��pCode��h
        for (int i = 1; i < size2; i++) {
            patternCode = (d*patternCode + pattern.charAt(i)-'a') % q;
            //����str��һ���Ӵ���hash
            strCode = (d*strCode + str.charAt(i)-'a') % q;
            h = (h*d) % q;
        }

        //�����Ҫƥ��Ĵ���
        int frequency = size1 - size2 + 1;
        //�ַ�����ʼƥ�䣬��patternCode��strCode��ʼ�Ƚϣ�������strCode��ֵ
        for (int i = 0; i < frequency; i++) {
            if(strCode == patternCode && ensureMatching(i, str, pattern)){
                return i;
            }
            //����strCode��ֵ��������str[i+1,i+m-1]�Ӵ���hashCode
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
        System.out.println("������:" + (rabinKarp(str, pattern)+5));
    }
}
