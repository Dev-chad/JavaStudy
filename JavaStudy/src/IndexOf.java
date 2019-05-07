class IndexOf {
	public static void main(String[] args) {
		String file = "/home/temp/Java.class";

		String[] paths = file.split("/");
		
		for(String path : paths) {
			System.out.println(path);
		}
	}
}
