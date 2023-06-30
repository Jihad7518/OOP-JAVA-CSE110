package Mid01_Viva;

public class EmployeeDriver {
	public static void main(String[] args) {
        ITExecutive itExecutive1 = new ITExecutive();
        itExecutive1.setId("E-001");
        itExecutive1.setName("IT Executive 1");
        itExecutive1.setDateOfBirth("12/04/1995");
        itExecutive1.setJoiningDate("25/05/2013");
        itExecutive1.setBloodGroup("AB+");
        itExecutive1.setAddress("777 Brockton Avenue, Abington MA 2351");
        itExecutive1.setMonthlySalary(1000);
        itExecutive1.setProjectBonus(100);
        itExecutive1.displayEmployeeInformation();
        System.out.println();
        
        ITExecutive itExecutive2 = new ITExecutive("E-002", "IT Executive 2", "15/03/1995", "25/05/2013", "B+", "30 Memorial Drive, Avon MA 2322", 1200.0, 200.0);
        itExecutive2.displayeEmployeeInformation();
        System.out.println();

        HRManager hrManager1 = new HRManager();
        hrManager1.setId("E-003");
        hrManager1.setName("HR Manager 1");
        hrManager1.setDateOfBirth("13/04/1995");
        hrManager1.setJoiningDate("21/07/2013");
        hrManager1.setBloodGroup("AB+");
        hrManager1.setAddress("250 Hartford Avenue, Bellingham MA 2019");
        hrManager1.setMonthlySalary(1100);
        hrManager1.setKPI(150);
        hrManager1.displayeEmployeeInformation();
        System.out.println();
        
        HRManager hrManager2 = new HRManager("E-004", "HR Manager 2", "14/06/1995", "25/05/2012", "O+", "700 Oak Street, Brockton MA 2301", 1050.0, 125.0);
        hrManager2.displayeEmployeeInformation();
        System.out.println();

        MarketAnalyst marketAnalyst1 = new MarketAnalyst();
        marketAnalyst1.setId("E-005");
        marketAnalyst1.setName("Market Analyst 1");
        marketAnalyst1.setDateOfBirth("13/03/1993");
        marketAnalyst1.setJoiningDate("21/06/2009");
        marketAnalyst1.setBloodGroup("AB+");
        marketAnalyst1.setAddress("66-4 Parkhurst Rd, Chelmsford MA 1824");
        marketAnalyst1.setMonthlySalary(1100);
        marketAnalyst1.setCommission(116);
        marketAnalyst1.displayEmployeeInformation();
        System.out.println();
        
        MarketAnalyst marketAnalyst2 = new MarketAnalyst("E-006", "Market Analyst 2", "14/06/1993", "25/05/2009", "A+", "591 Memorial Dr, Chicopee MA 1020", 1050.0, 125.0);
        marketAnalyst2.displayEmployeeInformation();
        System.out.println();

        PartTimer partTimer1 = new PartTimer();
        partTimer1.setId("E-007");
        partTimer1.setName("Part Timer 1");
        partTimer1.setDateOfBirth("12/03/1998");
        partTimer1.setJoiningDate("19/06/2019");
        partTimer1.setBloodGroup("AB+");
        partTimer1.setAddress("137 Teaticket Hwy, East Falmouth MA 2536");
        partTimer1.setMonthlySalary(800);
        partTimer1.displayEmployeeInformation();
        System.out.println();
        
        PartTimer partTimer2 = new PartTimer("E-008", "Part Timer 2", "14/06/1998", "25/05/2019", "B-", "55 Brooksby Village Way, Danvers MA 1923", 990.0);
        partTimer2.displayEmployeeInformation();
        System.out.println();
        
        
    }

}
