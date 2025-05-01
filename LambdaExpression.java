package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

    public class LambdaExpression {
        public static void main(String[] args) {
            List<String> names= Arrays.asList("Yogita","Ravi","Radhe","Rohit");
            List<String> filtered=names.stream().filter(name->name.startsWith("R")).map(String::toUpperCase).collect(Collectors.toList());
            //System.out.println(filtered);
            for (String name:filtered){
                System.out.println(name);
            }

        }
}
