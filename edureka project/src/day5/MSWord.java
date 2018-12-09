package day5;

public class MSWord implements MSOffice {
	@Override
	public void save() {
		System.out.println("Save method from MSWord");

	}

	@Override
	public void start() {
		System.out.println("Start method from MSWord");

	}

	@Override
	public void newFile() {
		System.out.println("New File method from MSWord");


}
}