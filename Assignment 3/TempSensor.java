/*


5. Temperature Sensor 
Scenario: Sensor should only accept temperatures in safe range. 
Problem Statement: 
Create a class TemperatureSensor with private temperature. Setter validates range 0–100°C. 
Fields: 
● private int temperature 
Methods: 
● setTemperature(int t) → only 0–100 valid 
● getTemperature() → return temperature 
Sample Input: 
temperature = -5 
Sample Output: 
“Temperature out of range” 


*/

class TempSensor {
    private int temperature;

    public void setTemperature(int t) {
        if (t >= 0 && t <= 100) {
            this.temperature = t;
        } else {
            System.out.println("Temperature out of range");
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public static void main(String[] args) {
        TempSensor sensor = new TempSensor();
        sensor.setTemperature(-5);
        System.out.println("Temperature = " + sensor.getTemperature());
    }
}


/*


C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac TempSensor.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java TempSensor
Temperature out of range
Temperature = 0


*/

