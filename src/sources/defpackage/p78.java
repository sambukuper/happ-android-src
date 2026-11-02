package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p78 {
    public static final p78 X;
    public static final p78 Y;
    public static final p78 Z;
    public static final p78 f0;
    public static final /* synthetic */ p78[] g0;

    static {
        p78 p78Var = new p78("StartInput", 0);
        X = p78Var;
        p78 p78Var2 = new p78("StopInput", 1);
        Y = p78Var2;
        p78 p78Var3 = new p78("ShowKeyboard", 2);
        Z = p78Var3;
        p78 p78Var4 = new p78("HideKeyboard", 3);
        f0 = p78Var4;
        g0 = new p78[]{p78Var, p78Var2, p78Var3, p78Var4};
    }

    public static p78 valueOf(String str) {
        return (p78) Enum.valueOf(p78.class, str);
    }

    public static p78[] values() {
        return (p78[]) g0.clone();
    }
}
