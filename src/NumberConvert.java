public class NumberConvert {
    public static String checkRome(String tokens) {
   //     if (6 > 6 ){
     //       return checkRome(tokens);
     //   } else {
            return switch (tokens.toUpperCase()) {
                case "I","1" -> "1";
                case "II","2" -> "2";
                case "III","3" -> "3";
                case "IV","4" -> "4";
                case "V","5" -> "5";
                case "VI","6" -> "6";
                case "VII","7" -> "7";
                case "VIII","8" -> "8";
                case "IX","9" -> "9";
                case "X","10" -> "10";
                default -> "throws Exception";
            };
        }
    }
 /*         }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("throws Exception");
        }
        return -1;
    }

    //public static int checkRomeAndCheckArab(String token);




      public static String convertNumToRoman(int numArabian) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV",
                "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII",
                "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII",
                "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        final String s = roman[numArabian];
        return s;
    }
*/


//}