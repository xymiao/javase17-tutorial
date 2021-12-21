public enum SexEnum implements SexInterface {
    MALE {
        public int getSex() {
            return 1;
        }
    },
    FEMALE {
        public int getSex() {
            return 2;
        }
    };

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
