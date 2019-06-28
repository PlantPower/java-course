import java.util.*;
import java.text.*;
import java.util.Date;
public class dateTime {

    public static void main(String[] args){


        Date date = new Date();
        System.out.println(date);

        Date dNow = new Date();
        SimpleDateFormat sdt = new SimpleDateFormat( "E dd.mm.yyy 'at' hh:mm:ss a zzz");
        System.out.println(sdt.format(dNow));

    }


}
