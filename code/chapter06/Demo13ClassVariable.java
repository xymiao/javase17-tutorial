public class Demo13ClassVariable {
    private static String version = "1";
    private String name = "默认值";
    private final  String s = "";
    
    private String getName() {
        String s = "";
        System.out.println(s);
        return this.name;
    }

    /**
     * 获得对应的实例变量的数据
     * 
     * @param d 当前对象
     * @return 当前版本号
     */
    public String getVersion(Demo13ClassVariable d) {
        System.out.println("getVersion():" + " " + d.getName() + ", version: " + version);
        return version;
    }

    /**
     * 静态变量获取当前版本。 注意该变量的生命周期
     * 
     * @return 当前版本号
     */
    public static String getVersion2() {
        System.out.println("getVersion2(): version：" + version);
        return version;
    }

    /**
     * 设置版本信息
     * 
     * @param version_ 最新的版本
     * @param index    当前版本的名字
     * @return 当前版本号
     */
    public String setVersion(String version_, String index) {
        this.name = index;
        version = version_;
        System.out.println("setVersion() 设置：" + getName() + ", version: " + version);
        return version;
    }

}
