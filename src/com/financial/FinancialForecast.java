package com.financial;

public class FinancialForecast {
    public static double forecast(double currentValue, double growthRate, int years) {
        double[] dp = new double[years + 1];
        dp[0] = currentValue;
        for (int i = 1; i <= years; i++) {
            dp[i] = dp[i - 1] * (1 + growthRate);
        }
        return dp[years];
    }
    public static void main(String[] args) {

        double currentValue = 1000;   
        double growthRate = 0.10;   
        int years = 5;
        double result = forecast(currentValue, growthRate, years);

        System.out.println("Future Value after " + years + " years: " + result);
    }
}

