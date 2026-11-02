package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ai8 {
    public static final yh8 X;
    public static final wh8 Y;
    public static final zh8 Z;
    public static final xh8 f0;
    public static final /* synthetic */ ai8[] g0;

    static {
        yh8 yh8Var = new yh8();
        X = yh8Var;
        wh8 wh8Var = new wh8();
        Y = wh8Var;
        zh8 zh8Var = new zh8();
        Z = zh8Var;
        xh8 xh8Var = new xh8();
        f0 = xh8Var;
        g0 = new ai8[]{yh8Var, wh8Var, zh8Var, xh8Var};
    }

    public static ai8 b(mo8 mo8Var) {
        mo8Var.getClass();
        if (mo8Var.o0()) {
            return Y;
        }
        return z68.R(lh4.E0.S0(), yn0.O(mo8Var), ih8.b) ? f0 : Z;
    }

    public static ai8 valueOf(String str) {
        return (ai8) Enum.valueOf(ai8.class, str);
    }

    public static ai8[] values() {
        return (ai8[]) g0.clone();
    }

    public ai8 a(mo8 mo8Var) {
        mo8Var.getClass();
        return b(mo8Var);
    }
}
