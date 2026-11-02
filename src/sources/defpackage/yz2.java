package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class yz2 {
    public static final zz2 a = new zz2((byte) 0);

    public static byte[] a(String str) {
        try {
            return a.R(str.length(), str);
        } catch (Exception e) {
            td1 td1Var = new td1("exception decoding Hex string: " + e.getMessage());
            td1Var.X = e;
            throw td1Var;
        }
    }
}
