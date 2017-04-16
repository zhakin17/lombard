package kz.zhakins.app.domain;

public class CategoryProduct {

	private Long Id;
	private String CategoryName;
	private String CategoryDescription;
	public CategoryProduct(Long id, String categoryName, String categoryDescription) {
		super();
		Id = id;
		CategoryName = categoryName;
		CategoryDescription = categoryDescription;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public String getCategoryDescription() {
		return CategoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		CategoryDescription = categoryDescription;
	}
	
}
