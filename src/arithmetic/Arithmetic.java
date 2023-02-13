/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter two Numbers: ");
        int n= in.nextInt();
        int m= in.nextInt();
        
        System.out.println("Enter Arethmetic Operation to perform: ");
        String operation = in.next();
        
        Operation op = Operation.valueOf(operation.toUpperCase());
        double result = op.apply(n, m);
        
        System.out.println("Result: " + result);
    
    }
}

