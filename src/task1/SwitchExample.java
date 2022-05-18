package task1;
public class SwitchExample {
        int input1,input2,solution;
        String operator = "add";
        SwitchExample(int input1,int input2)
        {
        	this.input1=input1;
        	this.input2=input2;
        	
        }
       /* Scanner scan1=new Scanner(System.in);
        public void getIntdetails()
        {       System.out.println("Enter the input1:");
                input1=scan1.nextInt();
                System.out.println("Enter the input2");
                input2=scan1.nextInt();
        }
        public  void getStringdetails()
        {
                System.out.println("Enter the operation");
                operator=scan1.next();
                
        } 
        public void getSecondInput()
        {
        	System.out.println("Enter the Second operation");
        	operator=scan1.next();
        }
        public void getThirdInput()
        {
        	System.out.println("Enter the Third operation");
        	operator=scan1.next();        	
        }
        public void getFourthInput()
        {
        	System.out.println("Enter the Fourth operation");
        	operator=scan1.next();
        }
        public void getFifthInput()
        {
        	System.out.println("Enter the Fifth operation");
        	operator=scan1.next();
        }  */ 
        public void operations()
        {
                switch(operator)
                {
                case "add":
                        solution=input1+input2;
                        System.out.println("Addition value is:"+solution);
                        break;
                case "sub":
                        solution=input1-input2;
                        System.out.println("Subraction value is:"+solution);
                       break;
                case "mul":
                        solution=input1*input2;
                        System.out.println("Multiplication value is:"+solution);
                        break;
                case "div":
                        solution=input1/input2;
                        System.out.println("Division value is:"+solution);
                       break;
                case "mod":
                        solution=input1%input2;
                        System.out.println("Modulus value is:"+solution);
                       break;
                default:
                        System.out.println("Entered operation is not possible");
                        break;
                }
        }}
       



    /*   public static void main(String[] args) {
                SwitchExample example=new SwitchExample();
                example.getIntdetails();
                example.getStringdetails();
                example.operations();
                example.getIntdetails();
                example.getSecondInput();
                example.operations();
                example.getIntdetails();
                example.getThirdInput();
                example.operations();
                example.getIntdetails();
                example.getFourthInput();
                example.operations();
                example.getIntdetails();
                example.getFifthInput();
                example.operations();
                
        }
}*/
 
