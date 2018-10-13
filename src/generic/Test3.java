package generic;

import java.time.LocalDate;

public class Test3 {
    public static void main(String[] args) {
        DateInterval interval = new DateInterval();
        Pair<LocalDate> pair = interval;
        pair.setSecond(LocalDate.parse(new CharSequence() {
            @Override
            public int length() {
                return 0;
            }

            @Override
            public char charAt(int index) {
                return 0;
            }

            @Override
            public CharSequence subSequence(int start, int end) {
                return null;
            }
        }));
    }
}

class DateInterval extends Pair<LocalDate>{
    public void setSecond(LocalDate second){
        if (second.compareTo(getFirst()) >= 0)
            super.setSecond(second);
    }
}
