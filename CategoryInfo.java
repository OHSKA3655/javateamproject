package Category;

public class CategoryInfo {
	
	//private String CategoryName;
	/*
	 private boolean isAdded;
	 private boolean isDeleted;
	 private boolean isEdited;
	 */
	private CategoryDB CDB;
	
	public CategoryInfo() {
		this.CDB = new CategoryDB();
	}
	
	public void addCategory(String c) {
		CDB.addedCategory(c);
	}
	
	public void deleteCategory(String c) {
		CDB.deletedCategory(c);
	}
	
	public void editCategory(String oldCategory, String newCategory) {
		CDB.editedCategory(oldCategory, newCategory);
	}
	
	public void printCategory() { //디버그용 메소드, 카테고리 목록 확인용
		String[] CList = CDB.getCategory();
		for (int i = 0; i < CList.length; i++) {
			System.out.println (CList[i]);
		}
		System.out.println();
	}
	
	public void printCategoryLimit() { //디버그용 메소드, 카테고리 지출한도 확인용
		int[] CLimit = CDB.getCategoryLimit();
		for (int i = 0; i < CLimit.length; i++) {
			System.out.println (CLimit[i]);
		}
		System.out.println();
	}
	
	public void editCategoryLimit(String c, int limit) { //디버그용 메소드, 지출한도 수정 확인용
		CDB.editedCategoryLimit(c, limit);
	}

	public static void main(String[] args) { //test
		CategoryInfo CInfo = new CategoryInfo();
		
		CInfo.printCategory();
		CInfo.printCategoryLimit();
		
		CInfo.addCategory("술"); //add test
		CInfo.editCategoryLimit("술", 10000); //editLimit test
		
		CInfo.printCategory();
		CInfo.printCategoryLimit();
		
		CInfo.editCategoryLimit("술", 15000); //editLimit test
		
		CInfo.printCategory();
		CInfo.printCategoryLimit();
		
		CInfo.deleteCategory("유흥"); //del test
		
		CInfo.printCategory();
		CInfo.printCategoryLimit();
		
		CInfo.editCategoryLimit("식사", 30000); //editLimit test
		
		CInfo.printCategory();
		CInfo.printCategoryLimit();
		
		CInfo.editCategory("식사", "간식"); //edit test
		
		CInfo.printCategory();
		CInfo.printCategoryLimit();
	}
}
