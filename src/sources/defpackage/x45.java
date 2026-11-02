package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x45 {
    public static final x45 X;
    public static final x45 Y;
    public static final x45 Z;
    public static final x45 f0;
    public static final x45 g0;
    public static final x45 h0;
    public static final x45 i0;
    public static final x45 j0;
    public static final /* synthetic */ x45[] k0;

    /* JADX INFO: Fake field, exist only in values array */
    x45 EF1;

    static {
        x45 x45Var = new x45("FROM_IDE", 0);
        x45 x45Var2 = new x45("FROM_BACKEND", 1);
        x45 x45Var3 = new x45("FROM_TEST", 2);
        x45 x45Var4 = new x45("FROM_BUILTINS", 3);
        X = x45Var4;
        x45 x45Var5 = new x45("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        x45 x45Var6 = new x45("WHEN_CHECK_OVERRIDES", 5);
        x45 x45Var7 = new x45("FOR_SCRIPT", 6);
        x45 x45Var8 = new x45("FROM_REFLECTION", 7);
        Y = x45Var8;
        x45 x45Var9 = new x45("WHEN_RESOLVE_DECLARATION", 8);
        x45 x45Var10 = new x45("WHEN_GET_DECLARATION_SCOPE", 9);
        x45 x45Var11 = new x45("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        x45 x45Var12 = new x45("FOR_ALREADY_TRACKED", 11);
        Z = x45Var12;
        x45 x45Var13 = new x45("WHEN_GET_ALL_DESCRIPTORS", 12);
        f0 = x45Var13;
        x45 x45Var14 = new x45("WHEN_TYPING", 13);
        x45 x45Var15 = new x45("WHEN_GET_SUPER_MEMBERS", 14);
        g0 = x45Var15;
        x45 x45Var16 = new x45("FOR_NON_TRACKED_SCOPE", 15);
        h0 = x45Var16;
        x45 x45Var17 = new x45("FROM_SYNTHETIC_SCOPE", 16);
        x45 x45Var18 = new x45("FROM_DESERIALIZATION", 17);
        i0 = x45Var18;
        x45 x45Var19 = new x45("FROM_JAVA_LOADER", 18);
        j0 = x45Var19;
        k0 = new x45[]{x45Var, x45Var2, x45Var3, x45Var4, x45Var5, x45Var6, x45Var7, x45Var8, x45Var9, x45Var10, x45Var11, x45Var12, x45Var13, x45Var14, x45Var15, x45Var16, x45Var17, x45Var18, x45Var19, new x45("WHEN_GET_LOCAL_VARIABLE", 19), new x45("WHEN_FIND_BY_FQNAME", 20), new x45("WHEN_GET_COMPANION_OBJECT", 21), new x45("FOR_DEFAULT_IMPORTS", 22)};
    }

    public static x45 valueOf(String str) {
        return (x45) Enum.valueOf(x45.class, str);
    }

    public static x45[] values() {
        return (x45[]) k0.clone();
    }
}
