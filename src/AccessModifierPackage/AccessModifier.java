package AccessModifierPackage;

public class AccessModifier {
    private String privateVar;
    public String publicVar;
    protected String protectedVar;

    public void setPrivateVar(String privateVar) {
        this.privateVar = privateVar;
    }
    public String getPrivateVar() {
        return privateVar;
    }

    public void setPublicVar(String publicVar) {
        this.publicVar = publicVar;
    }
    public String getPublicVar() {
        return publicVar;
    }

    public void setProtectedVar(String protectedVar) {
        this.protectedVar = protectedVar;
    }
    public String getProtectedVar() {
        return protectedVar;
    }
}