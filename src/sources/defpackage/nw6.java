package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nw6 {
    public static final nw6 X;
    public static final nw6 Y;
    public static final nw6 Z;
    public static final nw6 f0;
    public static final nw6 g0;
    public static final /* synthetic */ nw6[] h0;

    static {
        nw6 nw6Var = new nw6("TopBar", 0);
        X = nw6Var;
        nw6 nw6Var2 = new nw6("MainContent", 1);
        Y = nw6Var2;
        nw6 nw6Var3 = new nw6("Snackbar", 2);
        Z = nw6Var3;
        nw6 nw6Var4 = new nw6("Fab", 3);
        f0 = nw6Var4;
        nw6 nw6Var5 = new nw6("BottomBar", 4);
        g0 = nw6Var5;
        h0 = new nw6[]{nw6Var, nw6Var2, nw6Var3, nw6Var4, nw6Var5};
    }

    public static nw6 valueOf(String str) {
        return (nw6) Enum.valueOf(nw6.class, str);
    }

    public static nw6[] values() {
        return (nw6[]) h0.clone();
    }
}
