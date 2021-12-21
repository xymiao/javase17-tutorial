public enum SexEnum {
    MALE(1, "男"), FEMALE(2, "女");

    private final int sex;
    private final String sexName;

    private SexEnum(int sex, String sexName) {
        this.sex = sex;
        this.sexName = sexName;
    }

    public int getSex() {
        return sex;
    }

    public String getSexName() {
        return sexName;
    }

    public static SexEnum valueOf(int sex) {
        switch (sex) {
            case 1:
                return SexEnum.MALE;
            case 2:
                return SexEnum.FEMALE;
            default:
                return null;
        }
    }
}
