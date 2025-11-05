package in.co.rays.proj4.test;

import in.co.rays.proj4.exception.DatabaseException;
import in.co.rays.proj4.model.CollegeModel;

public class TestCollegeModel {
	
	public static void main(String[] args) throws DatabaseException {
		
		CollegeModel model=new CollegeModel();
		
		System.out.println(model.nextPk());
	}

}
