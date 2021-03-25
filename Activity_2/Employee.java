package random_activity;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;

			class Employee {
			    private int empid;
			    String empname;
			    int salary;
			  
			    public Employee(int empid, String empname, int salary)
			    {
			        this.empid = empid;
			        this.empname = empname;
			        this.salary = salary;
			    }
			} 
			class Sortbyname implements Comparator<Employee> {
			    public int compare(Employee a, Employee b)
			    {
			        return a.empname.compareTo(b.empname);
			    }
			}
			  
			class Main {
			    public static void main(String[] args)
			    {
			        ArrayList<Employee> ar = new ArrayList<Employee>();
			        ar.add(new Employee(123, "manzar", 2000));
			        ar.add(new Employee(131, "mithun", 3000));
			        ar.add(new Employee(142, "op", 4000));
			        
			        Collections.sort(ar, new Sortbyname());
			        for (int i = 0; i < ar.size(); i++)
			            System.out.println(ar.get(i));
			    }
			}
			
