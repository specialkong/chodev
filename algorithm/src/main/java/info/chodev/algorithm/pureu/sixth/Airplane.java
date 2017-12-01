package info.chodev.algorithm.pureu.sixth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Airplane {

	public int findCity(int n, int[][] t) {
		
		List<City> cityList = makeCity(n, t);
		cityList = getDistanceAirplane(cityList);
		Collections.sort(cityList, new CityComparator());
		return cityList.get(0).getPosition();
	}
	
	public List<City> getDistanceAirplane(List<City> cityList) {
		
		for(int i=0;i<cityList.size();i++) {
			int distance = 0;
			for(int j=0;j<cityList.size();j++) {
				if(cityList.get(i).getPosition() == cityList.get(j).getPosition()) {
					continue;
				}
				int max = Math.max(cityList.get(i).getPosition(), cityList.get(j).getPosition());
				int min = Math.min(cityList.get(i).getPosition(), cityList.get(j).getPosition());
				distance += Math.abs(max - min) * cityList.get(j).getPerson();
			}
			cityList.get(i).setDistance(distance);
		}
		return cityList;
	}
	
	public List<City> makeCity(int n, int[][] t) {
		List<City> cityList = new ArrayList<City>();
		
		for(int i=0;i<n;i++) {
			City city = new City();
			city.setPosition(t[i][0]);
			city.setPerson(t[i][1]);
			cityList.add(city);
		}
		
		return cityList;
	}
	
	public static void main(String[] args) {
		Airplane airplane = new Airplane();
		System.out.println(airplane.findCity(3, new int[][]{{1,5},{2,2},{3,3}}));
	}

}

class City {
	private int position;
	private int person;
	private int distance;
	
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getPerson() {
		return person;
	}
	public void setPerson(int person) {
		this.person = person;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
}

class CityComparator implements Comparator<City> {

	public int compare(City o1, City o2) {
		if(o1.getDistance() > o2.getDistance()) {
			return 1;
		} else if(o1.getDistance() < o2.getDistance()) {
			return -1;
		} else {
			if(o1.getPosition() > o2.getPosition()) {
				return 1;
			}
			return 0;
		}
	}
}