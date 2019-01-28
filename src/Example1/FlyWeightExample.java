package Example1;

public class FlyWeightExample {

    public static void main(String[] args) {
        // client 1
        GrpcClient client1 = new GrpcClientRegistration();
        client1.getUser();

        GrpcClient client2 = new GrpcClientRegistration();
        // client 2
        client2.getUser();

    }
}
