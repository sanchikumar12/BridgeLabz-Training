package com.oopspracticescenariobasedquestions.eventease;

interface ISchedulable {
	 void schedule();
	 void reschedule(String newDate);
	 void cancel();
	}