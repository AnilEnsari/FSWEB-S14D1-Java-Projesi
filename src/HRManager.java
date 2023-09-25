public class HRManager extends Employee{
    String [] JuniorDeveloper;
    String [] MidDeveloper ;
    String [] SeniorDeveloper ;
    public HRManager(String id , String name , Double salary){

        super (id,name,salary);

    }
    public void addEmployee (){


    }


@Override
    public void work(){
        System.out.println("HRManager starts to working");
        super.setSalary(150000);

    }



}
