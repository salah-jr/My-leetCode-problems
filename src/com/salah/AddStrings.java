package com.salah;

public class AddStrings {
    public String addStrings(String num1, String num2) {
        int i = num1.length() -1;
        int j = num2.length() -1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while(i >= 0 || j >= 0 || carry > 0){
            int n1 = 0;
            int n2 = 0;

            if(i >= 0){
                n1 = num1.charAt(i) - '0';  // Convert character to integer
                i--;
            }
            if(j >= 0){
                n2 = num2.charAt(j) - '0';
                j--;
            }

            int num = (n1 + n2 + carry) % 10;  // will be (n1 + n2 + carry) if it less than 10 else will be the remain
            carry = (n1 + n2 + carry) >= 10 ? 1 : 0;
            result.append(num);

        }

        return result.reverse().toString();
    }
}
