import java.util.Scanner;

public class StringHomework {

    //dav1

    public static int countDigits(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                count++;
            }
        }

        return count;
    }

    //dav2
    public static int countSentences(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '.' || ch == '?' || ch == ';' || ch == '!') {
                count++;
            }
        }

        return count;
    }

    //dav3
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    //dav4
    public static boolean isSubstring(String s1, String s2) {
        return s1.contains(s2);
    }

    //dav5
    public static void checkLastChar(String str) {
        if (str.length() == 0) {
            System.out.println("Striqoni carieli");
            return;
        }

        char lastChar = str.charAt(str.length() - 1);
        lastChar = Character.toLowerCase(lastChar);

        String vowels = "aeiou";

        if (vowels.indexOf(lastChar) != -1) {
            System.out.println("Striqoni xmovnit mtavrdeba");
        } else {
            System.out.println("Striqoni tanxmovnit mtavrdeba");
        }
    }

    //dav6
    public static String findOriginalWord(String modified) {
        StringBuilder original = new StringBuilder();

        for (int i = 0; i < modified.length(); i++) {
            if (i == 0 || modified.charAt(i) != modified.charAt(i - 1)) {
                original.append(modified.charAt(i));
            }
        }

        return original.toString();
    }

    //dav7
    public static void processWord(String word) {
        if (word.length() > 10) {
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);
            int middle = word.length() - 2;
            String abbreviation = first + "" + middle + last;

            System.out.println("Sitqva aris uzarmazari");
            System.out.println("Abreviatura: " + abbreviation);
        } else {
            System.out.println("Sitqva ar aris uzarmazari");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Davaleba 1
        System.out.println("Davaleba 1: Cifrebs raodenoba");
        System.out.print("Sheitanet striqoni: ");
        String str1 = scanner.nextLine();
        int digitCount = countDigits(str1);
        System.out.println("Cifrebs raodenoba: " + digitCount);
        System.out.println();

        // Davaleba 2
        System.out.println("Davaleba 2: Winadadeebis raodenoba");
        System.out.print("Sheitanet striqoni: ");
        String str2 = scanner.nextLine();
        int sentenceCount = countSentences(str2);
        System.out.println("Winadadeebis raodenoba: " + sentenceCount);
        System.out.println();

        // Davaleba 3
        System.out.println("Davaleba 3: Palindromi");
        System.out.print("Sheitanet striqoni: ");
        String str3 = scanner.nextLine();
        boolean palindrome = isPalindrome(str3);
        if (palindrome) {
            System.out.println("Striqoni aris palindromi");
        } else {
            System.out.println("Striqoni ar aris palindromi");
        }
        System.out.println();

        // Davaleba 4
        System.out.println("Davaleba 4: Qvestriqoni");
        System.out.print("Sheitanet s1: ");
        String s1 = scanner.nextLine();
        System.out.print("Sheitanet s2: ");
        String s2 = scanner.nextLine();
        System.out.println("s2 aris s1-s qvestriqoni: " + isSubstring(s1, s2));
        System.out.println();

        // Davaleba 5
        System.out.println("Davaleba 5: Xmovani/Tanxmovani");
        System.out.print("Sheitanet striqoni: ");
        String str5 = scanner.nextLine();
        checkLastChar(str5);
        System.out.println();

        // Davaleba 6
        System.out.println("Davaleba 6: Nitas sitqva");
        System.out.print("Sheitanet Nitas shecvlili sitqva: ");
        String nitaWord = scanner.nextLine();
        System.out.println("Tavdapirveli sitqva: " + findOriginalWord(nitaWord));
        System.out.println();

        // Davaleba 7
        System.out.println("Davaleba 7: Uzarmazari sitqva");
        System.out.print("Sheitanet sitqva: ");
        String word = scanner.nextLine();
        processWord(word);

        scanner.close();
    }}