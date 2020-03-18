import javafx.application.Application;
import javafx.stage.Stage;

public class MyFirstApp extends Application{

    @Override
    public void init() throws Exception {
        // Este método es útil para inicializar imágenes, asset, resource, etc.
        System.out.println("Antes de iniciar aplicación");
        super.init();
    }

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("First Windows");
        stage.show();

    }

    @Override
    public void stop() throws Exception {

        System.out.println("Después de cerrar aplicación");
        super.stop();

    }

}
