package Lesson1.com.welcome;

public class Hello {

    private String personsName;

    public void setupName(String name){
        personsName = name;
    }

    public void welcome(){
        System.out.println("Hello, "+ personsName);
    }

    public void byeBay(){
        System.out.println("Bye, "+ personsName);
    }

}
