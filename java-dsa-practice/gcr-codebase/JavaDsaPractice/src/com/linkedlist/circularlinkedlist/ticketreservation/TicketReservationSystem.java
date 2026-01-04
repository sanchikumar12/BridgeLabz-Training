package com.linkedlist.circularlinkedlist.ticketreservation;

public class TicketReservationSystem {
    private Ticket head = null;
    public void addTicket(int id, String customer, String movie,
                          String seat, String time) {

        Ticket newTicket = new Ticket(id, customer, movie, seat, time);

        if (head == null) {
            head = newTicket;
            newTicket.next = head;
            return;
        }

        Ticket temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newTicket;
        newTicket.next = head;
    }

    public void removeTicket(int id) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket current = head;
        Ticket prev = null;

        do {
            if (current.ticketId == id) {

                if (current == head && current.next == head) {
                    head = null;
                    System.out.println("Ticket removed.");
                    return;
                }

                if (current == head) {
                    Ticket last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = current.next;
                }

                System.out.println("Ticket removed.");
                return;
            }

            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Ticket not found.");
    }

    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets to display.");
            return;
        }

        Ticket temp = head;
        System.out.println("Current Ticket Reservations:");
        do {
            displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByCustomer(String customer) {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        Ticket temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(customer)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No ticket found for customer: " + customer);
        }
    }

    public void searchByMovie(String movie) {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        Ticket temp = head;
        boolean found = false;

        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No ticket found for movie: " + movie);
        }
    }

    public void countTickets() {
        if (head == null) {
            System.out.println("Total tickets booked: 0");
            return;
        }

        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Total tickets booked: " + count);
    }

    private void displayTicket(Ticket t) {
        System.out.println(
            "Ticket ID: " + t.ticketId +
            ", Customer: " + t.customerName +
            ", Movie: " + t.movieName +
            ", Seat: " + t.seatNumber +
            ", Time: " + t.bookingTime
        );
    }
}

