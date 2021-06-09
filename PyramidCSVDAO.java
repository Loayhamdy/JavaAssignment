
import java.io.*;
import java.nio.file.Files;
import java.util.*;


public class PyramidCSVDAO {
    
    List<Pyramid> pyramids;
            
    public List<Pyramid> readPyramidsFromCsv(String rawFileName){
        
        this.pyramids = new ArrayList<Pyramid>();
        File pyramidsFile = new File(rawFileName);
        List<String> lines = new ArrayList<String>();
        try{
            lines = Files.readAllLines(pyramidsFile.toPath());
        }catch(Exception e){
            System.out.println("An Issue Has Been Happend");
        }
        
        for (int lineidx = 1; lineidx < lines.size(); lineidx++){
            String line = lines.get(lineidx);
            
            String[] fields = line.split(",");
            
            for(int fieldidx = 0; fieldidx < fields.length; fieldidx++){
                fields[fieldidx] = fields[fieldidx].trim();
                
            }
            Pyramid pyramida = new Pyramid(fields[0],fields[1],fields[2],Double.parseDouble(fields[3]));
            pyramids.add(pyramida);
        }
        System.out.println("Total Number of pyramids is : "+pyramids.size());
        return pyramids;
    }
     

        }
    
    
    

