public interface Shape {
    void draw();
    default void init()
    {
        System.out.println("Shape init..");
    }
}
