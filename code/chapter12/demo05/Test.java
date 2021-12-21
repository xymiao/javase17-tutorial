public class Test {
    public static void main(String[] args) {
        for (SexEnum sex : SexEnum.values()) {
            System.out.println(sex + "  " + sex.getSex());
        }
    }
}
