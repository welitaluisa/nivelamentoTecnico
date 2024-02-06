package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ArquivosUtils {
    public static String getPropriedade(String propriedade) throws IOException{
        Properties propriedades = new Properties();
        propriedades.load(new FileInputStream("C:\\Projects\\n" + //
                        "ivelamentoTecnico\\src\\main\\resources\\application.properties"));
        return propriedades.getProperty(propriedade);
    }
    
}
