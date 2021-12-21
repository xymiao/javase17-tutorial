public enum SexEnum {
    MALE(1), FEMALE(2);

    private final int sex;
    private SexEnum(int sex) {
        this.sex = sex;
    }

    public int getSex() {
        return sex;
    }

    /**
     * 根据值返回对应的枚举对象
     * @param sex 性别的值
     * @return 枚举对象
     */
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
