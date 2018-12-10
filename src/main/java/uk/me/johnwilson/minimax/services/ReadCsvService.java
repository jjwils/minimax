package uk.me.johnwilson.minimax.services;



import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import uk.me.johnwilson.minimax.models.Port;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service
public class ReadCsvService {


   public List<Object> getCsv(String pathtoCSV, Class schema){

       File input = null;
       try {
           input = ResourceUtils.getFile("classpath:" + pathtoCSV);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
       CsvMapper csvMapper = new CsvMapper();

        // Read data from CSV file
        try {
            List<Object> readAll = csvMapper.readerWithSchemaFor(schema).readValues(input).readAll();
            return readAll;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;

    }
}
