import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class MD5Encoding {

    static String getMD5(String input)
    {
        String encodedMessage="";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] message = messageDigest.digest(input.getBytes());
            Base64.Encoder base64 = Base64.getEncoder();
            encodedMessage = base64.encodeToString(message);
        }catch (NoSuchAlgorithmException e)
        {
            e.getStackTrace();
        }
        return encodedMessage;
    }
    public static void main(String[] args)
    {
        System.out.println(getMD5("Upendra Nishad"));
    }
}
