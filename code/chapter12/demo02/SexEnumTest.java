public class SexEnumTest {
    public static void main(String[] args) {
        for (SexEnum sex : SexEnum.values()) {
            System.out.println(sex + "  " + sex.getSex()  );
        }

        // 有值的情况下如何比较枚举
        SexEnum se = SexEnum.valueOf(1);
        System.out.println(se == SexEnum.MALE);

        System.out.println(SexEnum.valueOf(2) == SexEnum.MALE);

        System.out.println(SexEnum.valueOf("MALE")); 
        System.out.println(SexEnum.valueOf("FEMALE")); 
    }
    
}
