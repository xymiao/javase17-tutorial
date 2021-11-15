public class VariableDemo {
    public static void main(String[] args) {
        String message = "";
        int score = 90;
        if(score < 60){
            message = "你的成绩未及格，请多努力。";
        }else  if (score >= 60 && score <=80){
            message = "你的这次成绩为良，再接再厉，优在等着你！";
        }else{
            message = "你的这次成为优，继续保持！";
        }
        System.out.println(message);
    }
    
}
