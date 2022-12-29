package multithreads.synchronization;

import java.time.LocalDate;

public class AppoinmentCenter {

    private LocalDate day = LocalDate.now();

    public synchronized LocalDate getAppoinmentDate(){

        day = day.plusDays(1);
        return day;

    }

}
