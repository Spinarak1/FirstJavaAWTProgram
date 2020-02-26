import java.awt.EventQueue;

class Test {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame();
            }
        });
    }
}//aplikacja trzy przyciski z trzema roznymi wiadomosciami.
    //wyslac przed lekcja zadania maturalne