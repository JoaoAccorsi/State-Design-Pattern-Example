# State-Design-Pattern-Example

> Code developed for the Bachelor's Degree in Computer Science:  
> - University: Universidade do Vale do Rio dos Sinos (Unisinos)  
> - Subject: Software Development II
> - Semester: 2023/01  

Java program to simulate the State Design Pattern.

This Design Pattern is used in Object Oriented Programming in order to represent the state of an object. 

So on, the multiple classes which represents each the state of the object implements an interface of this same object.

In this example, the code is related to an alarm clock, which has two states: armed and unarmed. 

The following rules are valid:

• An alarm clock starts its life disarmed, but can be programmed (armed) to wake up at a certain time;  
• The alarm clock rings for 10 seconds;  
• If the alarm clock is not disarmed by a person, the time is added by 5 minutes, and the alarm clock remains armed;  
• Alarm clock rings up to 3 times. If not disarmed by a person, it is automatically disarmed.  
