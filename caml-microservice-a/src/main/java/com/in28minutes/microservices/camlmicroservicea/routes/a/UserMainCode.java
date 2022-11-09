package com.in28minutes.microservices.camlmicroservicea.routes.a;

public class UserMainCode {

    public static void main(String[] args) {

        UserMainCode userMainCode = new UserMainCode();
        int input1 = 3;
        int input2 = 5;
        int[][] input3 = new int[][]{{75,76,65,87,87},{78,76,68,56,89},{67,87,78,77,65}};

        userMainCode.SortStudentMarks(input1,input2,input3);



    }

    public int[] SortStudentMarks(int input1, int input2, int[][] input3){

        int[] subjectMarks = new int[input2];
        int[] revisedMarks = new int[input1];
         StringBuilder sb =new StringBuilder();

        for (int i = 0; i < input3.length; i++) {
            for (int j = 0; j < input3[i].length; j++) {
                subjectMarks[j]+= input3[i][j];
            }
        }

        int min = subjectMarks[0];

        for (int i = 0; i < subjectMarks.length; i++) {
            if(subjectMarks[i]<min){
                min = subjectMarks[i];
            }
        }

        int minSubjectMarksIndex = findIndex(subjectMarks, min);


        for (int i = 0; i < input3.length; i++) {
            for (int j = 0; j < input3[i].length; j++) {
                if (j!=minSubjectMarksIndex){
                    revisedMarks[i]+=input3[i][j];
                }
            }
        }

        return revisedMarks;
    }





    public static int findIndex(int arr[], int t){
        if (arr == null) {
            return -1;
        }

        int len = arr.length;
        int i = 0;

        while (i < len) {

             if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }

}
