import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.DAOException;
import dao.GroupDao;
import dao.UserDao;
import domain.Group;
import domain.User;
import sql.SqlUserDao;


public class Main {

	public static void main(String[] ars) {

		/*
		 * try { StudentDao studentDao = new SqlStudentDao();
		 * 
		 * 
		 * System.out.println(studentDao.selectStudent(119)); // //
		 * studentDao.selectAllStudentAndGroup(); //
		 * studentDao.insertStudent("rfrfrfrfrfr", "rfrfrfrfrfr", 2);
		 * 
		 * 
		 * List<Student> list = studentDao.selectAllStudentAndGroup(); int i=0;
		 * 
		 * for (i=0; i<list.size(); i++){ System.out.println(list.get(i)); }
		 * 
		 * 
		 * // studentDao.insertStudent("вася", "хрумкин", 3);
		 * 
		 * // studentDao.selectAllStudents();
		 * 
		 * studentDao.close(); } catch (Exception e) {
		 * System.out.println("Ошибка выполнения studentDao"); }
		 * 
		 * 
		 * /* try { GroupDao groupDao = new SqlGroupDao();
		 * 
		 * //groupDao.updateGroup(3, 4545, "rfrf");
		 * 
		 * 
		 * List<Group> list =groupDao.selectAllGroups(); int i=0; for (i=0;
		 * i<list.size(); i++){ System.out.println(list.get(i)); }
		 * System.out.println(groupDao.selectGroup(3));
		 * 
		 * groupDao.close(); } catch (Exception e) {
		 * System.out.println("Ошибка выполнения groupDao"); }
		 */

		/*
		 * try { MarkDao markDao = new SqlMarkDao();
		 * 
		 * List<Mark> list =markDao.selectAllMarks(); int i=0; for (i=0;
		 * i<list.size(); i++){ System.out.println(list.get(i)); }
		 * markDao.close(); } catch (Exception e) {
		 * System.out.println("Ошибка выполнения markDao"); }
		 */
/*		try {
			UserDao userDao = new SqlUserDao();
			List<User> list = userDao.selectAllUsers();

			int i = 0;
			for (i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			userDao.close();
		} catch (Exception e) {
			System.out.println("Ошибка выполнения Dao");
		}*/
		
		 try {
		   ApplicationContext ac = new ClassPathXmlApplicationContext("application-config.xml");
		   UserDao userDao = (UserDao) ac.getBean("userDao");
		   List<User> list =userDao.selectAllUsers();
			
			int i = 0;
			for (i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			
			 userDao.close(); 
			
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 try {
			   ApplicationContext ac = new ClassPathXmlApplicationContext("application-config.xml");
			   GroupDao groupDao = (GroupDao) ac.getBean("groupDao");
			   List<Group> list =groupDao.selectAllGroups();
				
				int i = 0;
				for (i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				
				groupDao.close(); 
				
			} catch (DAOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
	
	}

}
