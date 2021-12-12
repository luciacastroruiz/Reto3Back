
package co.edu.arboleda.sergio.ciclo4;

import co.edu.arboleda.sergio.ciclo4.interfaces.InterfaceOrder;
import co.edu.arboleda.sergio.ciclo4.interfaces.InterfacePeripheral;
import co.edu.arboleda.sergio.ciclo4.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ciclo4Application implements CommandLineRunner  {
    @Autowired
    private InterfacePeripheral interfacePeripheral;
    @Autowired
    private InterfaceUser interfaceUser;
    @Autowired
    private InterfaceOrder interfaceOrder;
    
	public static void main(String[] args) {
		SpringApplication.run(Ciclo4Application.class, args);
	}
        @Override
        public void run(String... args) throws Exception{
            
        }

}
