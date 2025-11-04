package in.co.rays.proj4.test;

import java.sql.Timestamp;
import java.util.Date;

import com.google.protobuf.TextFormat.ParseException;

import in.co.rays.proj4.bean.RoleBean;
import in.co.rays.proj4.exception.ApplicationException;
import in.co.rays.proj4.exception.DatabaseException;
import in.co.rays.proj4.model.RoleModel;

public class TestRoleModel {

	public static void main(String[] args) throws DatabaseException, ParseException, ApplicationException {
//		testAdd();
//		testDelete();
		testUpdate();

//		
//		RoleModel model= new RoleModel();
//		
//		System.out.println(model.nextPk());

	}

	public static void testAdd()  {

		RoleBean bean = new RoleBean();
		bean.setName("student");
		bean.setDescription("student");
		bean.setCreatedBy("admin");
		bean.setModifiedBy("admin");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		RoleModel model = new RoleModel();
		try {
			model.add(bean);
			System.out.println("Role added successfully");

		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}

	public static void testDelete() {
		RoleBean bean = new RoleBean();
		RoleModel model = new RoleModel();
		try {
			bean.setId(1);

			model.delete(bean);

		} catch (Exception e) {
			System.out.println("record deleted sucessfully");

		}

	}
	public static void testUpdate() {
		
		RoleBean bean = new RoleBean();
		RoleModel model = new RoleModel();
		
		
		bean.setId(1);
		bean.setName("hr");
		bean.setDescription("student");
		bean.setCreatedBy("admin");
		bean.setModifiedBy("admin");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		try {
			model.update(bean);
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
		System.out.println("Recorded updated sucessfully");
		
	}
}
