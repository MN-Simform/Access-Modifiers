package MainPackage;

import AccessModifierPackage.AccessModifier;
public class Main {
    public static void main(String[] args) {
        AccessModifier am = new AccessModifier();

        am.setPublicVar("This Is Public Variable");
        am.setProtectedVar("This Is Protected Variable");
        am.setPrivateVar("This Is Private Variable");

        System.out.println(am.getPublicVar());
        System.out.println(am.getProtectedVar());
        System.out.println(am.getPrivateVar());
    }
}