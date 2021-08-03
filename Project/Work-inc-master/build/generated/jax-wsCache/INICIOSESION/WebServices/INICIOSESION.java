
package WebServices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "INICIOSESION", targetNamespace = "http://SESIONES/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface INICIOSESION {


    /**
     * 
     * @param usr
     * @param contraa
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://SESIONES/", className = "WebServices.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://SESIONES/", className = "WebServices.HelloResponse")
    @Action(input = "http://SESIONES/INICIOSESION/helloRequest", output = "http://SESIONES/INICIOSESION/helloResponse")
    public String hello(
        @WebParam(name = "usr", targetNamespace = "")
        String usr,
        @WebParam(name = "contraa", targetNamespace = "")
        String contraa);

}