package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d77 {
    public static final d77 X;
    public static final d77 Y;
    public static final d77 Z;
    public static final d77 f0;
    public static final d77 g0;
    public static final d77 h0;
    public static final /* synthetic */ d77[] i0;

    /* JADX INFO: Fake field, exist only in values array */
    d77 EF0;

    static {
        d77 d77Var = new d77("CornerExtraExtraLarge", 0);
        d77 d77Var2 = new d77("CornerExtraLarge", 1);
        X = d77Var2;
        d77 d77Var3 = new d77("CornerExtraLargeIncreased", 2);
        d77 d77Var4 = new d77("CornerExtraLargeTop", 3);
        Y = d77Var4;
        d77 d77Var5 = new d77("CornerExtraSmall", 4);
        Z = d77Var5;
        d77 d77Var6 = new d77("CornerExtraSmallTop", 5);
        f0 = d77Var6;
        d77 d77Var7 = new d77("CornerFull", 6);
        g0 = d77Var7;
        d77 d77Var8 = new d77("CornerLarge", 7);
        d77 d77Var9 = new d77("CornerLargeEnd", 8);
        d77 d77Var10 = new d77("CornerLargeIncreased", 9);
        d77 d77Var11 = new d77("CornerLargeStart", 10);
        d77 d77Var12 = new d77("CornerLargeTop", 11);
        d77 d77Var13 = new d77("CornerMedium", 12);
        h0 = d77Var13;
        i0 = new d77[]{d77Var, d77Var2, d77Var3, d77Var4, d77Var5, d77Var6, d77Var7, d77Var8, d77Var9, d77Var10, d77Var11, d77Var12, d77Var13, new d77("CornerNone", 13), new d77("CornerSmall", 14)};
    }

    public static d77 valueOf(String str) {
        return (d77) Enum.valueOf(d77.class, str);
    }

    public static d77[] values() {
        return (d77[]) i0.clone();
    }
}
