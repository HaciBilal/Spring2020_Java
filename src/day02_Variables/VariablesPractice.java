package day02_Variables;

public class VariablesPractice {
    public static void main(String[] args) {

        int salary = 120000;
        double federalTax = 0.18;
        float stateTax = 0.065f;
        // salary after tax = salary(1- sum of tax)
        double sumTaxes = federalTax + stateTax;
        double salaryAfterTax = salary * (1-sumTaxes);
        System.out.println(salaryAfterTax);





    }

}
