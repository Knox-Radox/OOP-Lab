// Base Class: Crew Member
class CrewMember {
    protected String name;
    protected String role;

    public CrewMember(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void showDetails() {
        System.out.println("Crew Member: " + name);
        System.out.println("Role: " + role);
    }
}

// Scientist Class: Specializes in research
class Scientist extends CrewMember {
    protected String specialization;

    public Scientist(String name, String specialization) {
        super(name, "Scientist");
        this.specialization = specialization;
    }

    public void showResearchArea() {
        System.out.println("Research Specialization: " + specialization);
    }
}

// Engineer Class: Specializes in spacecraft systems
class Engineer extends CrewMember {
    protected String expertise;

    public Engineer(String name, String expertise) {
        super(name, "Engineer");
        this.expertise = expertise;
    }

    public void showEngineeringExpertise() {
        System.out.println("Engineering Expertise: " + expertise);
    }
}

// MissionExpert: Hybrid role with research & engineering knowledge
class MissionExpert extends Scientist {
    protected String engineeringSkill;

    public MissionExpert(String name, String specialization, String engineeringSkill) {
        super(name, specialization);
        this.engineeringSkill = engineeringSkill;
    }

    public void showMissionExpertise() {
        showDetails();
        showResearchArea();
        System.out.println("Also skilled in: " + engineeringSkill);
    }
}

// LeadAstronaut: Commands the mission, inherits from MissionExpert
class LeadAstronaut extends MissionExpert {
    private String missionName;

    public LeadAstronaut(String name, String specialization, String engineeringSkill, String missionName) {
        super(name, specialization, engineeringSkill);
        this.missionName = missionName;
    }

    public void showLeadership() {
        showMissionExpertise();
        System.out.println("Mission Assigned: " + missionName);
        System.out.println(name + " is the Lead Astronaut for this mission!");
    }
}

// Main Class: Space Mission Management System
public class HybridInheritance_2 {
    public static void main(String[] args) {
        System.out.println("\n Space Mission Crew Management System n");

        // Scientist
        Scientist scientist1 = new Scientist("Dr. Luna", "Astrobiology");
        scientist1.showDetails();
        scientist1.showResearchArea();

        System.out.println("\n--------------------\n");

        // Engineer
        Engineer engineer1 = new Engineer("Alex Orion", "Propulsion Systems");
        engineer1.showDetails();
        engineer1.showEngineeringExpertise();

        System.out.println("\n--------------------\n");

        // Mission Expert (Hybrid Role)
        MissionExpert expert1 = new MissionExpert("Sam Nova", "Space Medicine", "Oxygen Regulation");
        expert1.showMissionExpertise();

        System.out.println("\n--------------------\n");

        // Lead Astronaut (Top Role)
        LeadAstronaut leader = new LeadAstronaut("Captain Vega", "Planetary Geology", "Rocket Navigation", "Mars Exploration");
        leader.showLeadership();
    }
}
