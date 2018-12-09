package day5;

public class MSExcel implements MSOffice {
	public void save() {
		System.out.println("Save method from MSExcel");
		
	}

	@Override
	public void start() {
		System.out.println("Start method from MSExcel");
		
	}

	@Override
	public void newFile() {
		System.out.println("New File method from MSExcel");
		
	}
	
	public void saveAs(){
		System.out.println("Save as method from MSExcel");
	}

}
