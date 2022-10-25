import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args)
    {
        List<String> SourceControlTools = new ArrayList<>() ;
        SourceControlTools.addAll(List.of("git","SVN", "Bazar")) ;

        for (String Tool:SourceControlTools) {
            System.out.println(Tool);

        }

    }

}