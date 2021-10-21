import models.Security;
import service.impl.SecurityManagement;

public class MainSecurity {
    public static void main(String[] args) {
        SecurityManagement securityManagement = new SecurityManagement();
        securityManagement.add(new Security(1, "kkk", 1));
        securityManagement.print();
    }
}
