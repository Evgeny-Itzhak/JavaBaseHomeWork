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
        int remainderOfDivisionSecondName;

        remainderOfDivisionSecondName = secondNameFirstLetter % 4;

        System.out.println("Code of first letter of second name is " + secondNameFirstLetter);
        System.out.println("Remainder of division on 4 is " + remainderOfDivisionSecondName);

        int remainderOfDivisionTask;

        for (int task = 0; task < 57; task++) {

            remainderOfDivisionTask = task % 4;

            boolean myTask = false;

            if (remainderOfDivisionTask == remainderOfDivisionSecondName) {
                myTask = true;
            }

            if (myTask) {
                System.out.println("Task: " + task);
            }
        }
    }
}
