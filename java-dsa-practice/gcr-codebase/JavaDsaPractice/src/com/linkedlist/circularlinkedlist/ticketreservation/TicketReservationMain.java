package com.linkedlist.circularlinkedlist.ticketreservation;

public class TicketReservationMain {
    public static void main(String[] args) {

        TicketReservationSystem trs = new TicketReservationSystem();

        trs.addTicket(101, "Alice", "Inception", "A1", "10:00 AM");
        trs.addTicket(102, "Bob", "Avatar", "B5", "10:30 AM");
        trs.addTicket(103, "Charlie", "Inception", "C3", "11:00 AM");
        trs.displayTickets();

        System.out.println("\nSearch by Customer:");
        trs.searchByCustomer("Alice");

        System.out.println("\nSearch by Movie:");
        trs.searchByMovie("Inception");
        System.out.println("\nRemove Ticket ID 102:");
        trs.removeTicket(102);
        trs.displayTickets();
        trs.countTickets();
    }
}
