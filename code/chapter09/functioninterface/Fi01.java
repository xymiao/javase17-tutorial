public class Fi01 {
    public static void main(String[] args) {
        Customizer<String> customizer = (t) -> {
            System.out.println(t);
        };
        customizer.customize("Test");

    }
    
}

@FunctionalInterface
interface Customizer<T> {

	void customize(T t);

	static <T> Customizer<T> withDefaults() {
		return (t) -> {
		};
	}
}