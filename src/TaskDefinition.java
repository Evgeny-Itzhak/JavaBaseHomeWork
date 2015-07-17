public class TaskDefinition {

    /**
     * Task: 3
     * Task: 7
     * Task: 11
     * Task: 15
     * Task: 19
     * Task: 23
     * Task: 27
     * Task: 31
     * Task: 35
     * Task: 39
     * Task: 43
     * Task: 47
     * Task: 51
     * Task: 55
     */

    public static void main(String[] args) {

        System.out.println("Hello World!");

        int secondNameFirstLetter = 'C';
        int remainderOfDivision;

        remainderOfDivision = secondNameFirstLetter % 4;

        System.out.println("Code of first letter of second name is " + secondNameFirstLetter);
        System.out.println("Remainder of division on 4 is " + remainderOfDivision);

        int remainderOfDivisionTask;

        for (int i = 0; i < 57; i++) {

            if (i % 4 == remainderOfDivision) {
                System.out.println("Task: " + i);
            }
        }
    }
}
