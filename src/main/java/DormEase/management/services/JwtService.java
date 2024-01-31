package DormEase.management.services;

import io.jsonwebtoken.Claims;
import org.springframework.security.core.userdetails.UserDetails;

import java.security.Key;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

public interface JwtService {
    String extractUsername(String token);
    <T> T extractClaim(String token, Function<Claims, T> claimsResolver);
    Claims extractClaims(String token);
    String generateToken(UserDetails userDetails);
    public String generateToken(Map<String, Objects> extraClaims,UserDetails userDetails);
    Boolean isTokenValid(String token, UserDetails userDetails);

}
