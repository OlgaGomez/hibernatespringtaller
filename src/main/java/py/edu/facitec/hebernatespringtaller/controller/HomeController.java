package py.edu.facitec.hebernatespringtaller.controller;

import javax.xml.ws.RequestWrapper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//para indicar que recibirá requisiciones venidas de un cliente, en este caso un navegador
@Controller
public class HomeController {
//para responder ciertar URL
@RequestMapping("/")
public String index(){
System.out.println("Cargando la página de bienvenida");
return "hello-world";
}
}
