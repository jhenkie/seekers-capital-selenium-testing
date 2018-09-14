package website.constants;

public class AssertionConstants {
    public static class Register {
        public static String URL = "https://members.lelong.com.my/account/register";
        public static String registerButton = "register-submit";
        public static String usernameInput = "UserName";
        public static String passwordInput = "Password";
        public static String confirmPasswordInput = "ConfirmPassword";
        public static String fullnameInput = "FullName";
        public static String emailInput = "Email";
        public static String phoneNumberInput = "PhoneNumber";
        public static String monthButton = "//*[@id=\"registerForm\"]/div[2]/div[1]/div[2]/div[1]/div/div/button";
        public static String selectMonth = "//*[@id=\"registerForm\"]/div[2]/div[1]/div[2]/div[1]/div/div/div/ul/li[2]";
        public static String dayButton = "//*[@id=\"registerForm\"]/div[2]/div[1]/div[2]/div[2]/div/div/button";
        public static String selectDay = "//*[@id=\"registerForm\"]/div[2]/div[1]/div[2]/div[2]/div/div/div/ul/li[2]";
        public static String yearButton = "//*[@id=\"registerForm\"]/div[2]/div[1]/div[2]/div[3]/div/div/button";
        public static String selectYear= "//*[@id=\"registerForm\"]/div[2]/div[1]/div[2]/div[3]/div/div/div/ul/li[2]";
        public static String genderRadio = "Gender";
        public static String verifySuccessRegisterElement = "//*[@id=\"detailpage\"]/div[1]/div[1]/center";


        //ErrorElement
        public static String usernameErrorElement = "//span[@for='UserName']";
        public static String passwordErrorElement = "//span[@for='Password']";
        public static String fullnameErrorElement = "//span[@for='FullName']";
        public static String emailErrorElement = "//span[@for='Email']";
        public static String phoneNumberErrorElement = "//span[@for='PhoneNumber']";
        public static String birthDateErrorElement = "//span[@for='BirthDate']";
        public static String genderErrorElement = "//span[@for='Gender']";
        public static String confirmPasswordErrorElement = "//span[@for='ConfirmPassword']";
    }
}
