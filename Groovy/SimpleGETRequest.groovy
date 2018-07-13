
public class SimpleGETRequest {
     static void main(String[] args){
         // GET
        def get = new URL("https://jsonplaceholder.typicode.com/posts/3").openConnection();
        def getRC = get.getResponseCode();
        println(getRC);
        if(getRC.equals(200)) {
            println(get.getInputStream().getText());
        }
     }
}
