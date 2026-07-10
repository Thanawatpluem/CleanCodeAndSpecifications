package lab;

/** ส่วน A ข้อ 1 — Intention-Revealing Name + Pure Function */
public class StringUtils {
    /**
     * นับจำนวนสระ a,e,i,o,u (ไม่สนพิมพ์เล็ก/ใหญ่) ในข้อความ
     * @param text ข้อความ, ต้องไม่เป็น null
     * @return จำนวนสระที่พบ
     * @throws IllegalArgumentException ถ้า text เป็น null
     */
    public static int countVowels(String text) {
        if (text ==null)
            throw new IllegalArgumentException("text must not be null");
        String lower = text.toLowerCase();
        int count = 0;
        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
