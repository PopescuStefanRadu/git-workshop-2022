public class Main {
    public static void main(String[] args) {
	if (args.length == 0) {
		System.out.println("Can't greet you cuz I don't know your name.");
	}
	System.out.println("Hello " + args[0] + "!");
        // this is something that got added
    }
}
