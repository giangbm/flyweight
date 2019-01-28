package Example1;

public class FlyWeightExample {

    public static void main(String[] args) {
        GrpcClient client1 = new GrpcClientRegistration();
        GrpcClient client2 = new GrpcClientRegistration();

        // client 1
        client1.getUser();
        // client 2
        client2.getUser();

    }
}
