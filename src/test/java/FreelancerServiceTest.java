import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class FreelancerServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/freelancer.csv")
    void testCase1(int expected, int income, int expenses, int threshold) {
        FreelancerService service = new FreelancerService();

        int actual = service.countingMonths(income, expenses, threshold);
        //int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void testCase2() {
//        FreelancerService service = new FreelancerService();
//
//        int actual = service.countingMonths(100_000, 60_000, 150_000);
//        int expected = 2;
//
//        Assertions.assertEquals(expected, actual);
//    }

}
