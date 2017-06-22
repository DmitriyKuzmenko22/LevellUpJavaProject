package dao.cinema;

/**
 * Created by Дмитрий on 22.06.2017.
 */
public class Film {

    private long idFilms;
    private String filmNames;
    private String descriptionFilms;

    public Film(long idFilms, String filmNames, String descriptionFilms) {
        this.idFilms = idFilms;
        this.filmNames = filmNames;
        this.descriptionFilms = descriptionFilms;
    }

    public long getIdFilms() {
        return idFilms;
    }

    public void setIdFilms(long idFilms) {
        this.idFilms = idFilms;
    }

    public String getFilmNames() {
        return filmNames;
    }

    public void setFilmNames(String filmNames) {
        this.filmNames = filmNames;
    }

    public String getDescriptionFilms() {
        return descriptionFilms;
    }

    public void setDescriptionFilms(String descriptionFilms) {
        this.descriptionFilms = descriptionFilms;
    }

    @Override
    public String toString() {
        return "Film{" +
                "idFilms=" + idFilms +
                ", filmNames='" + filmNames + '\'' +
                ", descriptionFilms='" + descriptionFilms + '\'' +
                '}';
    }
}
