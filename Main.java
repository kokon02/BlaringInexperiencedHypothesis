import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int wybor;
    System.out.println("1.Wprowadz nowego studenta");
    
    wybor = scan.nextInt();  
    
    switch (wybor){
      case 1:
        System.out.println("Podaj imie:");
        String name = scan.next();
        System.out.println("Podaj wiek:");
          Int wiek = scan.nextInt();
        try{
          Service s = new Service();
          
          s.addStudent(new Student(Imie, Wiek));

          var students = s.getStudents();
          
          
          for (Student current : students){
            
            System.out.println(current.ToString());
            
          }
          catch (IOException e){
              
            }
          
        } 
        
        
    }
    
    }  

    
  
}