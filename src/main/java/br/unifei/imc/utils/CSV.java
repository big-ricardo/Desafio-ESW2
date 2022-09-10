package br.unifei.imc.utils;
import br.unifei.imc.model.Game;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CSV {
    public static List<Pessoa> read(String path) {
        /*try {
            Reader reader = Files.newBufferedReader(Path.of(path));
            CsvToBean<Game> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(Game.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            return csvToBean.parse();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();*/
    }

    public static void createFile(List<Pessoa> pessoas) {
        /*File file = new File("pessoas.csv");
        FileWriter writer = null;
        try{
            writer = new FileWriter(file);

            CSVWriter csvWriter = new CSVWriter(writer);

            List<String[]> data = new ArrayList<>();

            data.add(new String[] { "Id", "Nome", "Idade"});
            for (Pessoa pessoa : pessoas) {
                data.add(new String[] { pessoa.getId().toString(), pessoa.getNome(), pessoa.getIdade().toString()});
            }

            csvWriter.writeAll(data);
            csvWriter.close();
        } catch (Exception e){
            throw new RuntimeException(e);
        }*/
    }

}
