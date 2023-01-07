import java.util.*;
    public class Registration { String customerName;
        String panCardNo;
        String passportNo;
        int voterId;
        int licenseNo;
        Long telephoneNo[]=new Long[5];
        Registration(String customerName,String passportNo,Long[] telephoneNo){

            this.customerName=customerName;
            this.passportNo=passportNo;
            this.telephoneNo=telephoneNo;
        }
        Registration(String customerName,int licensenNo,String panCardNo,Long[] telephoneNo ){
            this.customerName=customerName;
            this.licenseNo=licensenNo;
            this.panCardNo=panCardNo;
            this.telephoneNo=telephoneNo;
        }
        Registration(String customerName,int voterid ,int licensenNo,Long[] telephoneNo ) {
            this.customerName = customerName;
            this.licenseNo = licensenNo;
            this.voterId = voterid;
            this.telephoneNo = telephoneNo;
        }
        Registration(String customerName,String pancardNo,int voterid,Long[] telephoneNo ) {
            this.customerName = customerName;
            this.panCardNo=pancardNo;
            this.voterId = voterid;
            this.telephoneNo = telephoneNo;
        }
        public static void main(String args[])
        {
            while(true){
                System.out.println("Welcome to our portal");
                System.out.println("Select any one of the options to move forward with registeration");
                System.out.println("1.Passport");
                System.out.println("2.License and Pan Card ");
                System.out.println("3.License and Voter ID");
                System.out.println("4.Pan Card and voter Id ");
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                switch(n){
                    case 1:System.out.println("Enter your name");
                        String name1=sc.next();
                        System.out.println("Enter your Passport No");
                        String passportno =sc.next();
                        System.out.println("Enter ur phone no");
                        Long a[]=new Long[2];
                        a[0]= sc.nextLong();
                        Registration reg1 = new Registration(name1,passportno,a);
                        System.out.println(reg1.licenseNo);
                    case 2:System.out.println("Enter your name");
                           String name2=sc.next();
                           System.out.println("Enter your License no");
                           int licensename=sc.nextInt();
                           System.out.println("Enter your PAN Card ID");
                           String pancard=sc.next();
                           System.out.println("Enter ur phone no");
                           Long a1[]=new Long[2];
                           a1[0]= sc.nextLong();
                           Registration reg2 =new Registration(name2, licensename,pancard,a1);
                    case 3:System.out.println("Enter your name");
                        String name3=sc.next();
                        System.out.println("Enter your License no");
                        int licensename2=sc.nextInt();
                        System.out.println("Enter your Voter ID");
                        int voterID=sc.nextInt();
                        System.out.println("Enter ur phone no");
                        Long a2[]=new Long[2];
                        a2[0]= sc.nextLong();
                        Registration reg3 =new Registration(name3,voterID,licensename2,a2);
                    case 4:System.out.println("Enter your name");
                        String name4=sc.next();
                        System.out.println("Enter your Voter ID");
                        int voterid=sc.nextInt();
                        System.out.println("Enter your PAN Card ID");
                        String pancard1=sc.next();
                        System.out.println("Enter ur phone no");
                        Long a3[]=new Long[2];
                        a3[0]= sc.nextLong();
                        Registration reg4 =new Registration(name4,pancard1,voterid,a3);
                }

            }
        }

    }

