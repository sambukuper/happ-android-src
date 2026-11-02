package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n84 {
    private static final /* synthetic */ l22 $ENTRIES;
    private static final /* synthetic */ n84[] $VALUES;
    public static final l84 Companion;
    public static final n84 ON_ANY;
    public static final n84 ON_CREATE;
    public static final n84 ON_DESTROY;
    public static final n84 ON_PAUSE;
    public static final n84 ON_RESUME;
    public static final n84 ON_START;
    public static final n84 ON_STOP;

    static {
        n84 n84Var = new n84("ON_CREATE", 0);
        ON_CREATE = n84Var;
        n84 n84Var2 = new n84("ON_START", 1);
        ON_START = n84Var2;
        n84 n84Var3 = new n84("ON_RESUME", 2);
        ON_RESUME = n84Var3;
        n84 n84Var4 = new n84("ON_PAUSE", 3);
        ON_PAUSE = n84Var4;
        n84 n84Var5 = new n84("ON_STOP", 4);
        ON_STOP = n84Var5;
        n84 n84Var6 = new n84("ON_DESTROY", 5);
        ON_DESTROY = n84Var6;
        n84 n84Var7 = new n84("ON_ANY", 6);
        ON_ANY = n84Var7;
        n84[] n84VarArr = {n84Var, n84Var2, n84Var3, n84Var4, n84Var5, n84Var6, n84Var7};
        $VALUES = n84VarArr;
        $ENTRIES = new n22(n84VarArr);
        Companion = new l84();
    }

    public static n84 valueOf(String str) {
        return (n84) Enum.valueOf(n84.class, str);
    }

    public static n84[] values() {
        return (n84[]) $VALUES.clone();
    }

    public final o84 a() {
        switch (m84.a[ordinal()]) {
            case 1:
            case 2:
                return o84.Z;
            case 3:
            case 4:
                return o84.f0;
            case 5:
                return o84.g0;
            case 6:
                return o84.X;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                b61.c();
                return null;
        }
    }
}
