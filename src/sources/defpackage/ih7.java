package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ih7 {
    public static final ih7 X;
    public static final ih7 Y;
    public static final ih7 Z;
    public static final /* synthetic */ ih7[] f0;

    static {
        ih7 ih7Var = new ih7("BEGINNING", 0);
        X = ih7Var;
        ih7 ih7Var2 = new ih7("MIDDLE", 1);
        Y = ih7Var2;
        ih7 ih7Var3 = new ih7("AFTER_DOT", 2);
        Z = ih7Var3;
        f0 = new ih7[]{ih7Var, ih7Var2, ih7Var3};
    }

    public static ih7 valueOf(String str) {
        return (ih7) Enum.valueOf(ih7.class, str);
    }

    public static ih7[] values() {
        return (ih7[]) f0.clone();
    }
}
