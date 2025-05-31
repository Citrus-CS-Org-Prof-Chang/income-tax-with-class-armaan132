package edu.pasadena.cs.cs03b;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestDummy {

   @Test
   public void testDummy()
   {
     // action
     int iResult = Dummy.dummy();
     // assertion
     assertEquals(1, iResult);

     // TODO: add your own test cases
     

   }

   @Test
    public void testSalary10000() {
        TaxTableTools tool = new TaxTableTools();
        tool.setSalary(10000);
        assertEquals(0.0, tool.getTaxRate(), 0.0001);
        assertEquals(0.0, tool.calculateTax(), 0.01);
    }

    @Test
    public void testSalary50000() {
        TaxTableTools tool = new TaxTableTools();
        tool.setSalary(50000);
        assertEquals(0.20, tool.getTaxRate(), 0.0001);
        assertEquals(10000.0, tool.calculateTax(), 0.01);
    }

    @Test
    public void testSalary50001() {
        TaxTableTools tool = new TaxTableTools();
        tool.setSalary(50001);
        assertEquals(0.20, tool.getTaxRate(), 0.0001);
        assertEquals(10000.2, tool.calculateTax(), 0.01);
    }

    @Test
    public void testSalary100001() {
        TaxTableTools tool = new TaxTableTools();
        tool.setSalary(100001);
        assertEquals(0.30, tool.getTaxRate(), 0.0001);
        assertEquals(30000.3, tool.calculateTax(), 0.01);
    }
}
