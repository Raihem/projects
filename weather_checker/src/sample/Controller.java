package sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import org.json.JSONObject;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button getData;

    @FXML
    private Text temp_info;

    @FXML
    private Text temp_feels;

    @FXML
    private Text temp_max;

    @FXML
    private Text temp_min;

    @FXML
    private Text pressure;

    @FXML
    private TextField city;

    @FXML
    private ImageView image;

    @FXML
    void initialize() {
        getData.setOnAction(actionEvent -> {
            String getUSerCity = city.getText().trim();
            if(!getUSerCity.equals("")) {
                String output = getUrlContent("http://api.openweathermap.org/data/2.5/weather?q=" + getUSerCity + "&appid=8c6e061ebcfed86cb7c622f2b12cc68d&units=metric");

                if (!output.isEmpty()) {
                    JSONObject obj = new JSONObject(output);
                    temp_info.setText("температура: " + obj.getJSONObject("main").getDouble("temp"));
                    temp_feels.setText("ощущается: " + obj.getJSONObject("main").getDouble("feels_like"));
                    temp_max.setText("максимум: " + obj.getJSONObject("main").getDouble("temp_max"));
                    temp_min.setText("минимум: " + obj.getJSONObject("main").getDouble("temp_min"));
                    pressure.setText("давление: " + obj.getJSONObject("main").getDouble("pressure"));

                }
            }
        });
    }
        private static String getUrlContent(String urlAdress) {
            StringBuffer content = new StringBuffer();

            try {

            URL url = new URL(urlAdress);
                URLConnection urlConn = url.openConnection();

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
                 String line;

                while ((line = bufferedReader.readLine()) !=null) {
                    content.append(line + "\n");
                }
             bufferedReader.close();
            } catch (Exception e) {
                System.out.println("Такой город не был найден!");
            }
            return content.toString();
    }
}
