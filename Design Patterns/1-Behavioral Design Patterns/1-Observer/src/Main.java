public class Main {
    public static void main(String[] args) {

        YouTubeChannel channel = new YouTubeChannel();

        Observer user1 = new Subscriber("Ahmed");
        Observer user2 = new Subscriber("Mona");

        channel.subscribe(user1);
        channel.subscribe(user2);
//        channel.unsubscribe(user1);

        channel.uploadVideo("Observer Pattern in Java");
    }

}
