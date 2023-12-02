package LabObserverPattern;

public class RealTimeNewsService {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        Subscriber subscriber1 = new SubscriberEndpoint("John Pork");
        Subscriber subscriber2 = new SubscriberEndpoint("Barbara Bark ");

        newsAgency.addSubscriber(subscriber1);
        newsAgency.addSubscriber(subscriber2);

        String headline1 = "6.9 quake shakes Surigao del Sur";
        String news1 = "A powerful earthquake with a magnitude of 6.9 struck the region near Hinatuan in Surigao Del Sur at 10:37 p.m. Saturday.";
        newsAgency.publishNews(headline1, news1);

        String headline2 = "Nxled takes best path among PVL newcomers";
        String news2 = "Nxled’s maiden Premier Volleyball League (PVL) campaign turned out to be a relative success compared to other newcomers—even head coach Taka Minowa was pleasantly surprised at what his Chameleons accomplished.";
        newsAgency.publishNews(headline2, news2);

        newsAgency.removeSubscriber(subscriber1);
        String headline3 = "PH, France begin talks on visiting forces deal— Teodoro";
        String news3 = "The Philippines and France have begun talks to establish a visiting forces agreement between both countries, Defense Secretary Gilberto Teodoro Jr. announced on Saturday.";
        newsAgency.publishNews(headline3, news3);

        newsAgency.removeSubscriber(subscriber2);
        String headline4 = "PBA: Rain or Shine turns back Blackwater to stop winless slide";
        String news4 = "Rookie Adrian Nocum and Andrei Caracut took turns in crunch time on Saturday night as Rain or Shine slipped past Blackwater, 115-110, to end its winless start in the PBA Commissioner’s Cup.";
        newsAgency.publishNews(headline4, news4);

    }
}
