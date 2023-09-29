package inherit;

public class Animal {

    int no_of_legs=4;
    String color="black";

 
    class Dog extends Animal
    {
     public void  walk(){
    System.out.println(super.no_of_legs);
    }
    }



    public class main {
        public static void main(String[] args) 
        {
            
               Dog dog= new Dog()
               
                dog.color ="";
                dog.no_of_legs = 4;

            }
        }
}

    



