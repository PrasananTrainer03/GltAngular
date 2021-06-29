import java.sql.SQLException;
import java.util.Scanner;

public class AgentInsertMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Agent agent = new Agent();
		System.out.println("Enter  Name  ");
		agent.setName(sc.nextLine());
		System.out.println("Enter City   ");
		agent.setCity(sc.nextLine());
		System.out.println("Enter Gender   ");
		String gen = sc.nextLine().toUpperCase();
//		Gender gender;
		if (gen.equals("MALE")) {
			agent.setGender(Gender.MALE);
		}
		if (gen.equals("FEMALE")) {
			agent.setGender(Gender.FEMALE);
		}
		System.out.println("Enter Marital Status  ");
		agent.setMaritalStatus(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Premium   ");
		agent.setPremium(Double.parseDouble(sc.nextLine()));
		
		AgentDao dao = new AgentDao();
		try {
			System.out.println(dao.addAgent(agent));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
