import groovy.json.JsonSlurper;

public class ParseJSON {
     static void main(String[] args){
        def jsonSlurper = new JsonSlurper()
        File file = new File("resources/sample.json")
         def data = jsonSlurper.parse(file)
         data.services.each{
             def serviceName = it.keySet()
             println "**** key:${serviceName}  ******"
             it.each{ k, v ->
                 println "element name: ${k}, element value: ${v}"
             }
         }
     }
}
