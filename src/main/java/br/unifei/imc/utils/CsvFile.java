package br.unifei.imc.utils;
import br.unifei.imc.model.Aluno;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CsvFile {
    public static List<Aluno> readFile(Path path) {
        List<Aluno> list = new ArrayList<>();
        try {
            Reader reader = Files.newBufferedReader(path);
            CsvToBean<Aluno> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(Aluno.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            list = csvToBean.parse();
        } catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo...");
            e.printStackTrace();
        }

        return list;
    }

    public static void createFile(List<Aluno> alunos) {
        File file = new File("alunosegrupos.csv");
        FileWriter writer = null;
        try{
            writer = new FileWriter(file);

            CSVWriter csvWriter = new CSVWriter(writer);

            List<String[]> data = new ArrayList<>();

            data.add(new String[] { "matricula", "nome", "nota"});
            for (Aluno aluno : alunos) {
                data.add(new String[] { aluno.getMatricula(), aluno.getNome(), aluno.getNota().toString()});
            }

            csvWriter.writeAll(data);
            csvWriter.close();
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

}
