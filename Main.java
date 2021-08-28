public class Main {
    public static void main(String[] args) {
        Schoolkids sch1 = new Schoolkids("Мария", 15);
        Schoolkids sch2 = new Schoolkids("Павел", 17);
        Student std1 = new Student("Анна", 22);
        Student std2 = new Student("Тимур", 25);
        Employee empl1 = new Employee("Владимир", 30);
        Employee empl2 = new Employee("Виталий", 28);

        Team<Schoolkids> schoolTeam = new Team<>("Драконы");
        schoolTeam.addNewParticipant(sch1);
        schoolTeam.addNewParticipant(sch2);

        Team<Student> studentTeam = new Team<>("Гении");
        studentTeam.addNewParticipant(std1);
        studentTeam.addNewParticipant(std2);

        Team<Employee> employeeTeam = new Team<>("Работяги");
        employeeTeam.addNewParticipant(empl1);
        employeeTeam.addNewParticipant(empl2);

        Team<Schoolkids> schoolTeam2 = new Team<>("Мудрецы");
        Schoolkids sch3 = new Schoolkids("Сергей", 15);
        Schoolkids sch4 = new Schoolkids("Алан", 17);
        schoolTeam2.addNewParticipant(sch3);
        schoolTeam2.addNewParticipant(sch4);

        schoolTeam2.playWith(schoolTeam);
    }
}