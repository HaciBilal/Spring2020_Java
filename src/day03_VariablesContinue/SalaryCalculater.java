package day03_VariablesContinue;

public class SalaryCalculater {
    public static void main(String[] args) {
        int rate = 62;
        double stateTax = 0.04;
        double federalTax= 0.22;
        byte weeklyHours = 40;
        double  salary = weeklyHours*52*rate;
        double totalTax = (stateTax*salary)+(federalTax*salary);

        System.out.println("your montly salary is = $" +salary );
        System.out.println("your total tax is = $" +totalTax );
        System.out.println("your income after tax = $" + (salary - totalTax)/12);
        System.out.println("9" + 3); // 93 Concatenation



    }




}
