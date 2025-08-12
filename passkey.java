import java.util.Arrays;

public class passkey {
    public static void main(String[] args) {
        String[] password = {"ASDFDFA", "34958234985234820934", "243082304920394", "ASDFAFMMMMMMMMM99999999", "12212112", "23094230482"};
        Arrays.sort(password);

        String[] sortedPasswords = new String[3];
        sortedPasswords[0] = password[0];
        sortedPasswords[1] = password[1];
        sortedPasswords[2] = password[2];

        String passphrase = "";
        for (int i = 0; i <= 2; i++){
            passphrase = passphrase + sortedPasswords[i];
        }

        System.out.println(passphrase);
    }
}
