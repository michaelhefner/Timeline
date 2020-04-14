package com.michaelhefner;

import java.time.LocalDateTime;

public class Main {

    static {
        /*
        Sample Data
         */
        Timeline.addTimeSlot(new TimeSlot(LocalDateTime.now(), LocalDateTime.now().plusWeeks(1), "first"));
        Timeline.addTimeSlot(new TimeSlot(LocalDateTime.now().plusWeeks(4), LocalDateTime.now().plusWeeks(5), "second"));
        Timeline.addTimeSlot(new TimeSlot(LocalDateTime.now().plusWeeks(2), LocalDateTime.now().plusWeeks(3), "third"));
        Timeline.addTimeSlot(new TimeSlot(LocalDateTime.now().plusWeeks(2), LocalDateTime.now().plusWeeks(6), "fourth"));
        Timeline.addTimeSlot(new TimeSlot(LocalDateTime.now().minusWeeks(2), LocalDateTime.now().minusWeeks(0), "fifth"));
        Timeline.addTimeSlot(new TimeSlot(LocalDateTime.now().minusWeeks(2), LocalDateTime.now().minusWeeks(1), "sixth"));
    }

    public static void main(String[] args) {
        for (TimeSlot timeSlot : Timeline.getDateTimeObservableList())
            System.out.println(timeSlot.getName() + " is ok");
    }
}
