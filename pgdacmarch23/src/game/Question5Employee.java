package game;
class Employeeq5
{
    String ename;
    int id;
    float salary;
    Employeeq5(int a,String b,float c)
    {
        id=a;
        ename=b;
        salary=c;
    }


}
public class Question5Employee {

    public static void main(String[] args) {
        Employeeq5 temp;

        Employeeq5 e[] = new Employeeq5[5];
        e[0]= new Employeeq5(1,"rashmi",45050);
        e[1]= new Employeeq5(2,"siya",45500);
        e[2]= new Employeeq5(3,"ashu",45400);
        e[3]= new Employeeq5(4,"gagan",452000);
        e[4]= new Employeeq5(5,"priya",452400);
       
        for (int j = 0; j < 4; j++) {
            for (int i = j + 1; i < 5; i++) {
                if (e[j].ename.compareTo(e[i].ename) > 0) {
                    temp = e[j];
                    e[j] = e[i];
                    e[i] = temp;
                }
            }
        }

        for(int i=0;i<5;i++)
            System.out.println(e[i].ename+" "+e[i].id+" "+e[i].salary);


    }

}



