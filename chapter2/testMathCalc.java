import java.io.IOException;
public class testMathCalc {
  public static void main (String[] args) {
    // Test for divived
    // The result of Integer divided is integer
    System.out.println("Integer divided by Integer is Integer (10/4):" + 10/4);
    System.out.println("The sign of the quotient of Integre division is depended on the sign of divisor and dividend:");
    System.out.println("1:negetive divisor and negetive dividend is positive (-10/-4):" + (-10/-4));
    System.out.println("2:negetive divisor divided by positive dividend or opposition is negitive (-10/4):" + (-10/4));
    System.out.println("3:the remainder of a division is the result that divisor subtract the result of dividend multiple quotient:(-8%3 is -2):" + (-8 % 3));
    System.out.println("and (8%(-3) is 2):" + 8 % (-3)); 
    
    // Increment and Decrement oparation
    int iNumOranges = 5;
    int iNumApples = 10;
    int iNumFruits = 0;
    System.out.println("The prefix operation will enable operator add one before used in other operation");
    System.out.println("iNumOranges is:" + iNumOranges);
    System.out.println("iNumApples is:" + iNumApples);
    System.out.println("iNumFruits = ++iNumOranges + iNumApples will given the result:");
    iNumFruits = ++iNumOranges + iNumApples;
    System.out.println("iNumOranges is:" + iNumOranges);
    System.out.println("iNumApples is:" + iNumApples);
    System.out.println("iNumFruits is:" + iNumFruits);
    System.out.println("And iNumFruits = iNumOranges + (iNumApples++) will result in:");
    iNumFruits = iNumOranges + iNumApples++;
    System.out.println("iNumOranges is:" + iNumOranges);
    System.out.println("iNumApples is:" + iNumApples);
    System.out.println("iNumFruits is:" + iNumFruits);
    
    // assing computing result to sorter or byte type integer needed explicit cast
    short shtNumOranges = 5;
    short shtNumApples = 10;
    short shtNumFruits = 0;
    System.out.println("The expression: shtNumFruits = shtNumOranges + shtNumApples, will raise error in compliles");
    //shtNumFruits = shtNumOranges + shtNumApples;
    System.out.println("An explicit cast will needed in such kind of computing like this: shtNumFruits = (short)(shtNumOranges + shtNumApples)");  
    shtNumFruits = (short)(shtNumOranges + shtNumApples); 
    
    //The out of range error for integer expression
    System.out.println("An unlarmed Error will raise when an integer expression result in a value or intermediate value that is outside the range of the type of the result");
    System.out.println("1000000 * 2000000 =" + 1_000_000 * 2_000_000); 
    System.out.println("1000000L * 2000000L =" + 1_000_000L * 2_000_000L); 
    System.out.println("50 + 1000000 * 2000000 =" + ( 50 + 1_000_000 * 2_000_000)); 
    //
    System.out.println("50L + 1000000 * 2000000 =" + ( 50L + 1_000_000 * 2_000_000)); 
    
    // Float point computing
    double dblNumOranges = 5.0;
    double dblNumApples = 10.0;
    double dblAveFruits = 0.0;
    dblAveFruits = (dblNumOranges + dblNumApples)/2.0;
    System.out.println("The average fuits is:" + dblAveFruits);
    // The Increment and Decrement operators just add or subtract 1.0 from the float-point varaible
    System.out.println("The Increment and Decrement operators just add or subtract 1.0 from the float-point varaible");
    System.out.println("++dblAveFruits=" + (++dblAveFruits));  
    // The result of modulus operator is the value that divisor substract the n times of dividend, where n is integer and dividend * n <= divisor <= dividend * (n+1) 
    System.out.println("The result of modulus operator is the value that divisor substract the n times of dividend, where n is integer and dividend * n <= divisor <= dividend * (n+1)"); 
    System.out.println("5.1 % -2 =" + (5.1 % -2));    
    System.out.println("The expression given a value (include the dividend is zero) that is outside of the maxim or minim range of the type of the result, will result in 'Infinity'");
    System.out.println("10.0 / 0.0 = " + 10.0 / 0.0);
    System.out.println("1.0/-0.0 = " + (1.0/-0.0));
    System.out.println("1.5E300 * 1.5E300 = " + 1.5E300 * 1.5E300);
    System.out.println("1.5E30F * 1.5E30F = " + 1.5E30F * 1.5E30F);
    System.out.println("The expression given a result is a decimal which is too small to presented, and will result in -0.0 if the result is negetive, and 0.0 if is positive");
    System.out.println("-1.5E-300 * 1.5E-300 = " + -1.5E-300 * 1.5E-300);
    System.out.println("The undetermined value used in arithmetic expression will result in NaN");
    System.out.println("(dblNumApples - 10.0) / 0.0 = " + (dblNumApples - 10.0) / 0.0);
    System.out.println("(dblNumApples - 10.0) / 0.0 = " + (dblNumApples - 10.0) / 1.0);
    test4CombinedOp();
  }

  private static void test4CombinedOp(){
    System.out.println("In combined operators,the auotmatic conversion to the result will heppen regardless of what type of left and right operaters are, and do not give any alerm, when the type of the result and left operaters of the operator is different from each other, and do not give any alerm even though the range of the type of the left operater is smaller than that of the result");  
    short shtShortValue = 10;
    shtShortValue *= 1000000;
    System.out.println("shtShortValue *= 1000000 will given shtShortValue = " + shtShortValue);
  }
}
