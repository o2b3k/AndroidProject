package kg.webneo.sql;

import com.orm.SugarRecord;

/**
 * Created by User on 10.04.2016.
 */
public class Contact extends SugarRecord{
    String name;
    String pass;

    public Contact() {

    }

    public Contact(String pass, String name) {
        this.pass = pass;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
