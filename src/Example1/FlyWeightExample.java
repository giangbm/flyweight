package Example1;

public class FlyWeightExample {

    public static void main(String[] args) {
        // client 1
        GrpcClient client1 = new GrpcClientRegistration();
        client1.getUser();

        // client 2
        client1.getUser();

    }
}
