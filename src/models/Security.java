package models;

public class Security extends Person {
    private static String teamSecurity = "SEAL 6";

    public Security(int id, String name, int age) {
        super(id, name, age);
    }

    public Security() {
    }

    public static String getTeamSecurity() {
        return teamSecurity;
    }

    public static void setTeamSecurity(String teamSecurity) {
        Security.teamSecurity = teamSecurity;
    }

    @Override
    public String toString() {
        return " Name: "+ getName() + " Age: " + getAge() + " Team " + teamSecurity ;
    }
}
