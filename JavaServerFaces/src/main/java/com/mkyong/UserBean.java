package com.mkyong;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
@ManagedBean(name="user")
@SessionScoped
public class UserBean{

	public String favColor1;
	public String favColor2;
	public String favColor3;
	
	
	public void delete(){
		int i=0;

		int k=80;

		int j=0;

		
		int z=0;

		int l=90;

	}
	public save(){
		
	}
	public initilize(){
	}
	public String getFavColor1() {
		return favColor1;
	}

	public void setFavColor1(String favColor1) {
		this.favColor1 = favColor1;
	}

	public String getFavColor2() {
		return favColor2;
	}

	public void setFavColor2(String favColor2) {
		this.favColor2 = favColor2;
	}

	public String getFavColor3() {
		return favColor3;
	}

	public void setFavColor3(String favColor3) {
		this.favColor3 = favColor3;
	}

	//Generated by Map
	private static Map<String,Object> color2Value;
	static{
		color2Value = new LinkedHashMap<String,Object>();
		color2Value.put("Color2 - Red", "Red"); //label, value
		color2Value.put("Color2 - Green", "Green");
		color2Value.put("Color3 - Blue", "Blue");
	}
	
	public Map<String,Object> getFavColor2Value() {
		return color2Value;
	}
	
	//Generated by Object array
	public static class Color{
		public String colorLabel;
		public String colorValue;
		
		public Color(String colorLabel, String colorValue){
			this.colorLabel = colorLabel;
			this.colorValue = colorValue;
		}
		
		public String getColorLabel(){
			return colorLabel;
		}
		
		public String getColorValue(){
			return colorValue;
		}
		
	}
	
	public Color[] color3List;
	
	public Color[] getFavColor3Value() {
		
		color3List = new Color[3];
		color3List[0] = new Color("Color3 - Red", "Red");
		color3List[1] = new Color("Color3 - Green", "Green");
		color3List[2] = new Color("Color3 - Blue", "Blue");
		
		return color3List;
	}
	
}