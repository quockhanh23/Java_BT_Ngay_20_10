import models.Parents;
import service.impl.ParentManagement;

public class MainParent {
    public static void main(String[] args) {
        ParentManagement parentManagement = new ParentManagement();
        parentManagement.add(new Parents(1, " khánh", 1, 2));
        parentManagement.add(new Parents(1, " khánh2", 11, 1000));

        parentManagement.add(new Parents(2, " khánh3", 1, 100000));
        parentManagement.checkParentsRich1st();
        parentManagement.checkAllMoney();
     
    }
}
