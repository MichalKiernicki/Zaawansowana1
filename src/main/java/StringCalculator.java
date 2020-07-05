//Create a simple String calculator with a method signature:
//        ———————————————
//        int Add(string numbers)
//        ———————————————
//        The method can take up to two numbers, separated by commas, and will return their sum.
//        for example “” or “1" or “1,2” as inputs.
//        (for an empty string it will return 0)

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty())
            return 0;
        String[] numbersTable = numbers.split(",");// regex na rozdzielanie wyrazów
        int result = 0;
        for (String s : numbersTable) {
            result += Integer.parseInt(s);// zamiana stringa na int
        }
        return result;
    }
}
