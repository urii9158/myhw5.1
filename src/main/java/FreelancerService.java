public class FreelancerService {
    public int countingMonths(int income, int expenses, int threshold) {
        int wallet = 0;
        int numberOfMonths = 0;
        for (int i = 0; i < 12; i++) {
            if (wallet >= threshold) {
                wallet -= expenses;
                wallet /= 3;
                numberOfMonths++;
            } else {
                wallet += income;
                wallet -= expenses;
            }
        }
        return numberOfMonths;
    }
}