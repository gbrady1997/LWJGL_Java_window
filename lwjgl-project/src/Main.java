import org.lwjgl.glfw.GLFW;

public class Main {
    public static void main(String[] args) 
    {
        if (!GLFW.glfwInit())
        {
            System.out.println("GLFW failed to initialize");
            return;
        }
        
        long window = GLFW.glfwCreateWindow(800, 600, "GLFW Test", 0, 0);

        if (window == 0)
        {
            System.out.println("Window creation failed");
            return;
        }

        //System.out.printf("long window = %d",window);
        GLFW.glfwMakeContextCurrent(window);

        while (!GLFW.glfwWindowShouldClose(window))
        {
            GLFW.glfwPollEvents();
        }

        GLFW.glfwDestroyWindow(window);
        GLFW.glfwTerminate();
    }
}