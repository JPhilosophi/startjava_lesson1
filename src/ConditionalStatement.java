public class ConditionalStatement{
    public static void main(String[] args) {
        int age = 21;
        double heigt = 1.6;
        char firstLettersName = 'M';
        boolean male = true;

        if (age > 20) {
            System.out.println("age more then 20");
        }

        if (male == true) {
            System.out.println("male");
        } else if (male == false) {
            System.out.println("Not male");
        }

        if (heigt < 1.80) {
            System.out.println("height more 1.80");
        } else {
            System.out.println("height less 1.80");
        }

        if (firstLettersName == 'M') {
            System.out.println("first names letter start with M");
        } else if (firstLettersName == 'I') {
            System.out.println("first names letter start with I");
        } else {
            System.out.println("note mutch");
        }

        System.out.println("Test message");
    }
}