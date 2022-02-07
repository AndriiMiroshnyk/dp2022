package laptops;

public class Laptops {

	private String title;
	private String img;
	private String description;
	
	public Laptops(String title, String img, String description) {
		super();
		this.title = title;
		this.img = img;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "{\"title\": \""+title+"\", \"img\": \""+img+"\", \"description\": \""+description+"\"}";
	}
	
	
}