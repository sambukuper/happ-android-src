package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yh2 {
    public static final yh2 X;
    public static final yh2 Y;
    public static final yh2 Z;
    public static final /* synthetic */ yh2[] f0;

    static {
        yh2 yh2Var = new yh2("Active", 0);
        X = yh2Var;
        yh2 yh2Var2 = new yh2("ActiveParent", 1);
        Y = yh2Var2;
        yh2 yh2Var3 = new yh2("Captured", 2);
        yh2 yh2Var4 = new yh2("Inactive", 3);
        Z = yh2Var4;
        f0 = new yh2[]{yh2Var, yh2Var2, yh2Var3, yh2Var4};
    }

    public static yh2 valueOf(String str) {
        return (yh2) Enum.valueOf(yh2.class, str);
    }

    public static yh2[] values() {
        return (yh2[]) f0.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        b61.c();
        return false;
    }

    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                b61.c();
                return false;
            }
        }
        return true;
    }
}
