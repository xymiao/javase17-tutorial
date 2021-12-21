public class EnumTest {
    private SexEnum sexEnum;
    public EnumTest(SexEnum sexEnum){
        this.sexEnum = sexEnum;
    }

    public void showSex(){
        switch(sexEnum){
            case MALE:
            System.out.println("性别: 男");
            break;
            case FEMALE:
            System.out.println("性别: 女");
            break; 
        }
    }
    public static void main(String[] args) {
        EnumTest enumTest = new EnumTest(SexEnum.MALE);
        enumTest.showSex();
        EnumTest enumTest2 = new EnumTest(SexEnum.FEMALE);
        enumTest2.showSex();
    }
    
}
