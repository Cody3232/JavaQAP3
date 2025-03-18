public class DemoProblem1 {
    public static void main(String[] args) {

        // Create hockey player objects
        Person player1 = new Person("Wayne Gretzky", 63, "M");
        System.out.println(player1);

        Student player2 = new Student("Sidney Crosby", 18, "M", "HS87109", 4.0);
        System.out.println(player2);

        Teacher player3 = new Teacher("Mario Lemieux", 55, "M", "Hockey Tactics", 85000);
        System.out.println(player3);

        CollegeStudent player4 = new CollegeStudent("Connor McDavid", 19, "M", "UOA097", 4.0, 2, "Sports Management");
        System.out.println(player4);
    }
}

