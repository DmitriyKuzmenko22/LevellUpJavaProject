import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

/**
 * Created by Дмитрий on 08.02.2017.
 */
public class HomeTest {

    @Test
    public void testHash(){
        TreeSet<Home> homeSet1=new TreeSet<>();
        homeSet1.add(new Home(27,"Dnepr",12,144));
        homeSet1.add(new Home(27,"Kharkov",11,142));

        System.out.println(homeSet1);

    }

}