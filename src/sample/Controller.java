package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;

import static sample.MainHibernate.*;


public class Controller {
    public Button buscarBtn;
    public TextField claveBuscar;
    public TextArea resultaBuscar;

    public void buscaPersona(ActionEvent actionEvent) {
        resultaBuscar.setText("clic en buscar:"+claveBuscar.getText());
        PersonaEntity miPersona = new PersonaEntity();
        final Session session = getSession();
        try {
            miPersona = session.get(PersonaEntity.class,2);
            if (miPersona != null) {
                resultaBuscar.setText("Encontró: "+miPersona.getNombre());
            }else {
                resultaBuscar.setText("NO Encontró: ");
            }

        }catch (SessionException e){

            resultaBuscar.setText("error al abrir sesión "+ e.getMessage());
        }
        finally {
            session.close();
        }
    }
}
