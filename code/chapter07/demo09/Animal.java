public  abstract class Animal {
    public Animal(){
        System.out.println("Animal 的构造方法执行了！");
    }
    
    static abstract class CatSuper{
        public CatSuper(){
            System.out.println("CatSuper 的构造方法执行了！");
        }
        public abstract void eat();
    }
}
