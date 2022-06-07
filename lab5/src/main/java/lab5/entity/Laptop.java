package lab5.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="laptop")
public class Laptop {
	@Id
	@GeneratedValue
	Long id;
	String title;
	String img;
	String description;
	
	public Laptop() {
		
	}
	
	public Laptop(Long id, String title, String img, String description) {
		this.id = id;
		this.title = title;
		this.img = img;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		return "{\"id\": \""+id+"\", \"title\": \""+title+"\", \"img\": \""+img+"\", \"description\": \""+description+"\"}";
	}
	
	
}
