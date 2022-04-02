package study.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JarCategory_Demo {


	private String jarCapacity;
	private String waterType;
	private Integer price;
	

	public JarCategory_Demo() {
	}

	public JarCategory_Demo(String jarCapacity, String waterType, Integer price) {
		this.jarCapacity = jarCapacity;
		this.waterType = waterType;
		this.price = price;
	}
	


	public String getJarCapacity() {
		return this.jarCapacity;
	}

	
	public void setJarCapacity(String jarCapacity) {
		this.jarCapacity = jarCapacity;
	}

	
	public String getWaterType() {
		return this.waterType;
	}

	public void setWaterType(String waterType) {
		this.waterType = waterType;
	}

	
	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	


}
