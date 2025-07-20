package Vijayakumar.Daily;/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.



Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
 */

class LeetcodeRough{
    public static void main(String[] args) {
        int[][] arr={{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts) {
        int max=0;
        int sum=0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum+=accounts[i][j];
            }
            if(sum>max){
                max=sum;
                sum=0;
            }
            sum=0;

        }
        return max;
    }
}