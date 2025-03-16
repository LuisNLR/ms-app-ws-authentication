package pe.com.softlite.authentication.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
	
	private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    // Hashear la contraseña
    public static String hashPassword(String rawPassword) {
        return encoder.encode(rawPassword);
    }

    //Validar o comparar contraseñas
    public static boolean matchPassword(String rawPassword, String hashedPassword) {
        return encoder.matches(rawPassword, hashedPassword);
    }
}
