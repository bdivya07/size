

import java.io.Serializable;
import java.util.List;

public class BigObject implements Serializable{
    
    private static final long serialVersionUID = -1892561327013038124L;
    
    private String name;
    
    private List<String> name1;
    
    private List<String> name2;
    
    private List<String> name3;
    
    private List<String> name4;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getName1() {
        return name1;
    }

    public void setName1(List<String> name1) {
        this.name1 = name1;
    }

    public List<String> getName2() {
        return name2;
    }

    public void setName2(List<String> name2) {
        this.name2 = name2;
    }

    public List<String> getName3() {
        return name3;
    }

    public void setName3(List<String> name3) {
        this.name3 = name3;
    }

    public List<String> getName4() {
        return name4;
    }

    public void setName4(List<String> name4) {
        this.name4 = name4;
    }
    

}
