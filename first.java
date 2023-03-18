class Time {
    int hour, minute;

    Time() {
        hour = 0;
        minute = 0;
    }

    Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    Time Sum(Time A, Time B, Time C) {
        A.hour = B.hour + C.hour;
        A.minute = B.minute + C.minute;
        if (A.minute > 60) {
            A.minute = A.minute % 60;
            A.hour = A.hour + 1;

        }

        if (A.hour >= 24)

        {
            A.hour = A.hour % 24;
            System.out.print(" day:1  " + " hour: " + A.hour + " minute: " + A.minute);
        }
        return A;
    }

    class Timer {
        public static void main(String args[]) {
            Time B = new Time(6, 45);
            Time C = new Time(19, 25);
            Time A = new Time();
            A = A.Sum(A, B, C);
            if (A.hour < 24) {
                System.out.println("hour:" + A.hour + " " + "minute:" + A.minute);
            }
        }

    }

}