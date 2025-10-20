/*


26. Smart Devices  
Scenario: Smart devices can perform actions like calling, messaging, and browsing internet. 
Problem Statement: 
● Interface Callable → method makeCall(String number) 
● Interface Messaging → method sendMessage(String number, String message) 
● Interface Internet → method browse(String website) 
● Class SmartPhone implements all three interfaces → provide respective implementations 
Sample Input: 
Call → number="9876543210" 
Message → number="9876543210", message="Hello!" 
Browse → website="www.google.com" 
Sample Output: 
Calling 9876543210 
Sending message to 9876543210: Hello! 
Browsing website: www.google.com 


*/

interface Callable {
    void makeCall(String number);
}

interface Messaging {
    void sendMessage(String number, String message);
}

interface Internet {
    void browse(String website);
}

class SmartPhone implements Callable, Messaging, Internet {
    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void sendMessage(String number, String message) {
        System.out.println("Sending message to " + number + ": " + message);
    }

    @Override
    public void browse(String website) {
        System.out.println("Browsing website: " + website);
    }
}

public class SmartDevice{
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();

        sp.makeCall("9876543210");
        sp.sendMessage("9876543210", "Hello!");
        sp.browse("www.google.com");
    }
}
/*
C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac SmartDevice.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java SmartDevice
Calling 9876543210
Sending message to 9876543210: Hello!
Browsing website: www.google.com

*/
