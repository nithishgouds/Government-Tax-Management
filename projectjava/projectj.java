class Login_Details
{
    String authority_ID;
    String password;


    public boolean Authority_Login()
    {
        
    }
}


class Personal_Details
{
    String first_name;
    String last_name;
    String gender;
    int age;
    long contact_details;
    String martial__status;
}


class Career_Details extends Personal_Details
{
    public void Occupation()
    {
    long pan_card_number;
    String job;
    String level;
    }
    public void Income()
    {
        long salary;
        long tax;
        long  monthly_expenses;
        long loan_amount;
    }
}
// class projectj
// {
//     public static void main(String [] args)
//     {
//         Login_detais  ld=new Login_detais();
//         if(id.Authority_Login==true)
//         {

//         }
//         else  if(id.Authority_Login!=true)
//         {
//             System.out.println("Authority ID not found");
//         }
//     }
// }