package Console;

import org.springframework.web.bind.annotation.RequestMapping;

public class API_digitsum {
    int cntMethod = 0;

    @RequestMapping("/api/digitsum/usage")
    public int usageCount(){ // returns the current count of the usage from the method digitSum
        return cntMethod;
    }





}
