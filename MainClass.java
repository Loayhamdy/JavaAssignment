import java.util.List;

public class MainClass {
    
    public static void main(String[] args){
    
        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        List<Pyramid> Pyramids = pDAO.readPyramidsFromCsv("‪C:\\Users\\HEI-1001\\Downloads\\pyramids.csv");
        
        int i =0 ;
        for(Pyramid p: Pyramids)
        {
            System.out.println("#"+(i++)+p);
        }
        
    }
    
}
