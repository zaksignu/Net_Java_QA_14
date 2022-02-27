package ru.netology.domain;
import java.util.Comparator;
public class TicketByPriceAscComparator implements Comparator<Ticket> {

//    private int id;
//    private int price;
//    private String departurePlace;
//    private String arrivalPlace;
//    private int travelTime;

//    public TicketByPriceAscComparator(int id, int price, String departurePlace, String arrivalPlace, int travelTime) {
//        this.id = id;
//        this.price = price;
//        this.departurePlace = departurePlace;
//        this.arrivalPlace = arrivalPlace;
//        this.travelTime = travelTime;
//    }
    public int compare(Ticket o1, Ticket o2) {
        return o2.getPrice() - o1.getPrice();
    }

}