package explorer;

import com.sun.org.apache.xalan.internal.xsltc.dom.Filter;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by java on 21.02.2017.
 */
public class CommandLineApp {

    private static final String DEFAULT_PATH="D:\\";
    private static File currentDir = new File(DEFAULT_PATH);//для того что бі біла возможность переходить из директорий, менять местами разніе диски

    public static void main(String[] args) {
        File currentDir=new File(DEFAULT_PATH);
        //dlya peremeshenia po papkam

        Scanner scanner=new Scanner(System.in);
        while (true){
            String line=scanner.nextLine();//chitaem sled stroky

            if (line.startsWith("print")){ //pechataet directiroii
                if (currentDir.isDirectory()){
                    printAllDerectioris(currentDir);
                }
            } else if (line.startsWith("mkDir")){ //mkDir newFolderName
               createNewFolder(line,currentDir);
            } else if (line.startsWith("cd")){ //vvod v console
                changeDirectory(line);
            }

        }

    /*    //provaryaem eto direcoria
        if (currentDir.isDirectory()){
            printAllDerectioris(currentDir); //esli directiria pereday ee nam
        }
*/
    }
//cd+// - vozvrat nazad
    //cd+new Folder sozdaet novuy papku
    private static void changeDirectory(String line) { //ищем директорию по не полному названию , к примеру совпаднию по 1й букве
        String folderName = line.split("\\s+")[1];

        if (folderName.contains("..")){ // возвращаемся назад в директорию предідущую
            currentDir=currentDir.getParentFile();
            return;
        }

        File[] list = currentDir.listFiles(new FileFilter() { //anonimniy class, показіваем список всех вложенніх файлов в директории котору мі указали при поиске
            @Override
            public boolean accept(File dir) {
                return dir.isDirectory() && dir.getName().contains(folderName);
            }
        });

        if (list.length == 1) { //ishem po sovpadeniu, если толко одна директория в нее сразу и переходим
            File matchedFolder=list[0];
            currentDir = matchedFolder;
        } else if (list.length == 0) {
            System.out.println("No such file or directory");
        } else {
            for (File dir : list) { // pokazivaem polniy spisok directoriy
                System.out.println(dir.getName());
            }
        }
    }

    private static void createNewFolder(String line,File parent){
        String folderName = line.split("\\s+")[1];

        File directory = new File(parent, folderName);
        directory.mkdir();// sozdaem papky
    }

    private static void printAllDerectioris(File file) {
        File[] files=file.listFiles();//vosvrashaet spisok vlojennih failov i directriy
        for (File f: files){
           if (f.isDirectory()&&!f.isHidden()){ //i ne skritie fayli
               System.out.println(f.getName());//vivodim imya
           }
        }
    }
}
