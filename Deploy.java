package com.cacheserverdeploy.deploy;

import java.util.ArrayList;
import java.util.List;

public class Deploy {
    public static String[] deployServer(String[] graphContent) {
        String[] content = new String[graphContent.length];

        List<String> list = new ArrayList<String>();

        /**do your work here**/
        for (int i = 1; i < graphContent.length; i++) {
            if (graphContent[i].contains(" ") && graphContent[i].split(" ").length == 3) {

                String[] array = graphContent[i].split(" ");
                String content1 = array[0];
                String content2 = array[1];
                String content3 = array[2];

                list.add(content2 + " " + content1 + " " + content3);
            }
        }

        content[0] = String.valueOf(list.size());
        content[1] = "";

        for (int i = 0; i < list.size(); i++) {
            content[i + 2] = list.get(i);

        }

        return content;
    }
}


// из папки SDK-java:
/*
package com.cacheserverdeploy.deploy;
public class Deploy {
*/
    /**
     * todo
     *
     * @param graphContent caseinfo
     * @return caseouput info
     * @see [huawei]
     */
/*
    public static String[] deployServer(String[] graphContent) {
        *//**do your work here**//*
        return new String[]{"17", "\r\n", "0 8 0 20"};
    }
}*/
