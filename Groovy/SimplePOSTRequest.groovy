


public class SimplePOSTRequest {
     static void main(String[] args){
           // POST
           def post = new URL("https://jsonplaceholder.typicode.com/posts").openConnection();
           def message = '{"userId": 1,"title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit","body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"}'
           post.setRequestMethod("POST")
           post.setDoOutput(true)
           post.setRequestProperty("Content-Type", "application/json")
           post.getOutputStream().write(message.getBytes("UTF-8"));
           def postRC = post.getResponseCode();
           println(postRC);
           if(postRC.equals(200) || postRC.equals(204) || postRC.equals(201) ) {
               println(post.getInputStream().getText());
               println("POST Success");
           }
       }
}
