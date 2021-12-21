public class EnumTest {
    public static void main(String[] args) {
        for (SexEnum sex : SexEnum.values()) {
            System.out.println(sex + "  " + sex.getSex() + " "
                    + sex.getSexName() + "  ordinal: " + sex.ordinal());
        }

        //valueOf 的方式
        System.out.println(SexEnum.valueOf(SexEnum.class, "MALE"));
        System.out.println(SexEnum.valueOf(SexEnum.class, "FEMALE"));
    }

}
