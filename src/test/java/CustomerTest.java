import org.testng.Assert;
import org.testng.annotations.Test;
import org.example.enums.EmploymentContractType;
import org.example.enums.Title;
import org.example.people.Customer;

public class CustomerTest {
    @Test
    public void testCreditScore() {
        Customer customer = new Customer(Title.MR, "Jan", "Kowalski", 30, "Warszawa", EmploymentContractType.EMPLOYMENT_CONTRACT, 4000.0);
        customer.setTotalInstallments(2000.0);
        customer.creditScoring();
        Assert.assertEquals(customer.getCreditScore(), 20);
    }
}
