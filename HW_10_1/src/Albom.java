/*Создать объект класса Фотоальбом, используя классы Фотография, Страница.
Методы: задать название фотографии, дополнить фотоальбом фотографией,
вывести на консоль количество фотографий.
*/
public class Albom {
    private String name;
    Page[]pages = new Page[20];
    private int kolFoto=0;

    public Albom(String name) {
        this.name = name;
        for (int i =0; i< pages.length; i++){
            pages[i]= new Page(i);
        }
    }
    public void setPhotoTitle(String title,int photoNum,int pageNum){

        if(pageNum<pages.length&&pageNum>-1&&pages[pageNum]!=null){
            pages[pageNum].setPhotoTitle(title,photoNum);
        }

    }

    public void addPhotoOnPage (int pageNum, String title ){
        pages[pageNum].addPhoto(new Photo(title));
    }

    public int proverkaFoto(){

        for(int i=0;i<pages.length && pages[i]!= null ;i++){
            for(int j=0;j<pages[i].photos.length;j++){
                if(pages[i].photos[j]!=null){
                    kolFoto++;
                }

            }
        }
        return kolFoto;
    }
}
