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


/*
*
Sample Output

**** key:[UI-Service]  ******
element name: UI-Service, element value: [[file-location:/in/my/server/location, script-names:daily-batch,weekly-batch,bi-weekly-batch, seq1:daily-batch,weekly-batch, seq2:daily-batch,weekly-batch,bi-weekly-batch, DEST-ENVT_seq1:[DEV1, DEV2, QA1, QA2], DEST-ENVT_seq2:[DEV3, DEV4, QA3, QA4]]]
**** key:[Mobile-Service]  ******
element name: Mobile-Service, element value: [[file-location:/in/my/server/location, script-names:daily-batch,weekly-batch,bi-weekly-batch, seq1:daily-batch,weekly-batch, seq2:daily-batch,weekly-batch,bi-weekly-batch, DEST-ENVT_seq1:[DEV1, DEV2, QA1, QA2], DEST-ENVT_seq2:[DEV3, DEV4, QA3, QA4]]]

*/
