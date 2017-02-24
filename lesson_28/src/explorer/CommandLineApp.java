package explorer;


import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommandLineApp {

    // private static final String DEFAULT_PATH="C:\\";
    private static File currentDir = new File("C:\\");//для того что бі біла возможность переходить из директорий, менять местами разніе диски

    public static void main(String[] args) throws IOException {


        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println(currentDir.getPath());
            String line=scanner.nextLine();//chitaem sled stroky
            if (line.startsWith("printDirect")){ //pechataet directiroii
                if (currentDir.isDirectory()){
                    printAllDerectioris(currentDir);
                }
            } else if (line.startsWith("mkDir")){ //mkDir newFolderName
                createNewFolder(line,currentDir);
            } else if (line.startsWith("cd")) { //vvod v console
                changeDirectory(line);
            } else if (line.startsWith("newfile")){
                createNewFile(line,currentDir);
            } else if (line.startsWith("del")){
                delete(line,currentDir);
            }
            else if (line.startsWith("printFiles")){
                printAllFiles(currentDir);
            }
            else if (line.startsWith("open")){
                openTextFiles(line,currentDir);
            }
            else if (line.startsWith("exit")){

                break;
            }
            else {
                System.out.println("not correct");
            }
        }
    }


    public static void openTextFiles(String line,File parent) throws IOException {
        String folderName = line.split("\\s+")[1];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File(parent, folderName);
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String name;
        // String line;
        System.out.println("Print File "+f.getName()+"? y/n");
        name = br.readLine();
        if(name.equals("y")) {
            if(isTxtOrCsv(f.getName())){
                while ((line = fin.readLine()) != null) {
                    System.out.println(line);
                }
            }else {
                System.out.println("not correct");
            }
        }
    }

    public static boolean isTxtOrCsv(String correct) {
        Pattern p = Pattern.compile(".+\\.(txt|csv)");
        Matcher m = p.matcher(correct);
        return m.matches();
    }

    public static void printAllFiles(File file)
    {
        File[] files = file.listFiles();
        if (files != null)
        {
            for (File f : files)
            {
                if (f.isFile() && !f.isHidden())
                {
                    System.out.println(f.getName());
                }
            }
        }
    }

    public static void delete(String line,File parent) throws FileNotFoundException {
        // String folderName = line.split("\\s+")[1];
        String folderName = line.split("\\s+")[1];
        File file=new File(parent, folderName);
        if(file.delete()){
            System.out.println("файл удален");
        }else System.out.println("Файл "+ folderName+" не обнаружено");
    }

    private static void createNewFile(String line,File parent){
        String folderName = line.split("\\s+")[1];
        File newFile = new File(parent, folderName);
        try
        {
            boolean created = newFile.createNewFile();
            if(created)
                System.out.println("Файл создан");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }


    private static void changeDirectory(String line) {
        String folderName = line.split("\\s+")[1];

        if (folderName.contains("..")) {
            if (currentDir.getParentFile() != null) currentDir = currentDir.getParentFile();
            return;
        }

        File[] list = currentDir.listFiles(dir -> dir.isDirectory() && dir.getName().contains(folderName));

        if (list.length == 1) {
            File matchedFolder = list[0];
            currentDir = matchedFolder;//
        } else if (list.length == 0) {
            System.out.println("No such file or directory");
        } else {
            for (File dir : list) {
                System.out.println(dir.getName());
            }
        }
    }
//cd+// - vozvrat nazad
    //cd+new Folder sozdaet novuy papku
  /*  private static void changeDirectory(String line) { //ищем директорию по не полному названию , к примеру совпаднию по 1й букве
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
    }*/

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