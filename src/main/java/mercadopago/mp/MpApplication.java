package mercadopago.mp;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MpApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		System.setProperty("mercado_pago_sample_access_token", dotenv.get("access_token"));
		System.setProperty("mercado_pago_sample_public_key", dotenv.get("public_key"));
		SpringApplication.run(MpApplication.class, args);
	}
}
