public class IsomorphicStringTest {

    public static void main(String[] args) {
        testIsomorphicStrings();
        testEmptyStrings();
        testDifferentLength();
        testNullStrings();
    }

    private static void testIsomorphicStrings() {
        System.out.println("Testing isIsomorphic method with valid inputs:");
        printResult("egg", "add", IsomorphicString.isIsomorphic("egg", "add"));         
        printResult("foo", "bar", IsomorphicString.isIsomorphic("foo", "bar"));         
        printResult("paper", "title", IsomorphicString.isIsomorphic("paper", "title")); 
        printResult("ab", "aa", IsomorphicString.isIsomorphic("ab", "aa"));             
        printResult("ab", "ca", IsomorphicString.isIsomorphic("ab", "ca"));             
        System.out.println();
    }

    private static void testEmptyStrings() {
        System.out.println("Testing isIsomorphic method with empty strings:");
        printResult("", "", IsomorphicString.isIsomorphic("", ""));                    
        System.out.println();
    }

    private static void testDifferentLength() {
        System.out.println("Testing isIsomorphic method with different length strings:");
        printResult("abc", "defg", IsomorphicString.isIsomorphic("abc", "defg"));       // Expected: false
        System.out.println();
    }

    private static void testNullStrings() {
        System.out.println("Testing isIsomorphic method with null strings:");
        printResult("null", "null", IsomorphicString.isIsomorphic(null, null));         // Expected: false
        printResult("abc", "null", IsomorphicString.isIsomorphic("abc", null));        // Expected: false
        printResult("null", "def", IsomorphicString.isIsomorphic(null, "def"));        // Expected: false
        System.out.println();
    }

    private static void printResult(String s, String t, boolean result) {
        String expectedMessage = result ? "Expected: true" : "Expected: false";
        System.out.printf("For strings \"%s\" and \"%s\": Result is %b. %s\n", s, t, result, expectedMessage);
    }
}
