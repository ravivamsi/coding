import groovy.xml.XmlUtil

public class ParseXML {
     static void main(String[] args){
       def xml=new XmlSlurper().parse("resources/sample.xml")
       xml.each{
        println (it)
       }
     }
}


/*
*
Sample Output
JaneSmith31VamsiRavi28
*/
