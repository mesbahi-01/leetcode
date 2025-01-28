package org.example.countDaysTogether;

class Solution {
    int[] days_per_month = new int[]{
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int arriveAliceStamp = calculateStamp(arriveAlice);
        int leaveAliceStamp = calculateStamp(leaveAlice);

        int arriveBobStamp = calculateStamp(arriveBob);
        int leaveBobStamp = calculateStamp(leaveBob);

        int firstToArrive = Math.min(arriveAliceStamp, arriveBobStamp);
        int secondToArrive = Math.max(arriveAliceStamp, arriveBobStamp);

        int firstToLeave = Math.min(leaveAliceStamp, leaveBobStamp);
        int secondToLeave = Math.max(leaveAliceStamp, leaveBobStamp);

        int days_between_second_to_leave_first_to_arrive = secondToLeave - firstToArrive + 1;

        int days_between_second_to_arrive_first_to_arrive = secondToArrive - firstToArrive + 1;

        int days_between_first_to_leave_second_to_arrive = firstToLeave - secondToArrive + 1;

        int days_between_second_to_leave_first_to_leave = secondToLeave - firstToArrive + 1;

        return Math.max(firstToLeave - secondToArrive + 1, 0);


    }

    private int calculateStamp(String date) {
        int stemp = 0;
        int monthIndex = Integer.parseInt(date.substring(0, 2)) -1;
        int days = Integer.parseInt(date.substring(3));

        for (int i = 0; i < monthIndex; i++) {
            stemp += days_per_month[i];
        }
        stemp += days;
        return stemp;
    }
}