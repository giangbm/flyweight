package Example1;

public class GrpcClientRegistration implements GrpcClient {
    //
    private Stub stub;

    public void getUser() {
        stub = getStub();
        stub.getUser();
        System.out.println("Sub: " + stub);
    }

    //    Flyweight

    public Stub getStub() {
        if (stub == null) {
            stub = new StubRegistration();
        }
        return stub;
    }
}
