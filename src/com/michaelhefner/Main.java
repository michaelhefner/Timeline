package com.michaelhefner;

import java.time.LocalDateTime;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        TimeSlot timeSlot1 = new TimeSlot(LocalDateTime.now(), LocalDateTime.now().plusWeeks(1), "first");
        TimeSlot timeSlot2 = new TimeSlot(LocalDateTime.now().plusWeeks(4), LocalDateTime.now().plusWeeks(5), "second");
        TimeSlot timeSlot3 = new TimeSlot(LocalDateTime.now().plusWeeks(2), LocalDateTime.now().plusWeeks(3), "third");
        TimeSlot timeSlot4 = new TimeSlot(LocalDateTime.now().plusWeeks(2), LocalDateTime.now().plusWeeks(6), "fourth");
        TimeSlot timeSlot5 = new TimeSlot(LocalDateTime.now().minusWeeks(2), LocalDateTime.now().minusWeeks(0), "fifth");

        Timeline.addTimeSlot(timeSlot1);
        Timeline.addTimeSlot(timeSlot2);
        Timeline.addTimeSlot(timeSlot3);
        Timeline.addTimeSlot(timeSlot4);
        Timeline.addTimeSlot(timeSlot5);
        for (TimeSlot timeSlot : Timeline.getDateTimeObservableList()){
            System.out.println(timeSlot.getName());
        }
    }
}
