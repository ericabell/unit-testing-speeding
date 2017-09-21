public class Speeding {
    public static int caughtSpeeding (int speed, boolean isBirthday) {
        if( speed < 60 ) {
            return 0;
        }
        else if( speed <= 80 ) {
            return 1;
        }
        else if( !isBirthday ) {
            return 2;
        }
        else {
            return 0;
        }
    }
}
