"go to edit new package "

// Inside a folder named 'mypack'
package mypack;

public class MyPackageClass {
    public void displayMessage() {
        System.out.println("Hello from MyPackageClass in mypack package!");
    }

    // New utility method
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}

"come out of my pack"
"pavkageDemo"
// Main program outside the mypack folder
import mypack.MyPackageClass;
//import mypack.*;


public class PackageDemo {
    public static void main(String[] args) {
        // Creating an instance of MyPackageClass from the mypack package
        MyPackageClass myPackageObject = new MyPackageClass();

        // Calling the displayMessage method from MyPackageClass
        myPackageObject.displayMessage();

        // Using the utility method addNumbers from MyPackageClass
        int result = MyPackageClass.addNumbers(5, 3);
        System.out.println("Result of adding numbers: " + result);
    }
}
