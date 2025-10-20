class ArmQ42{
    public static void main(String[] args) {
        for (int num = 100; num <= 500; num++) {
            int original = num;
            int sum = 0;
            int temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }
    }
}

/*
C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>javac ArmQ42.java

C:\Users\Admin\Documents\CDAC\CDAC Codes\OOP With java\Assignment 1>java ArmQ42
153
370
371
407
*/