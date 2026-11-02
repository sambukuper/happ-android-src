package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class os8 implements cn2 {
    public static final os8 X;
    public static final /* synthetic */ os8[] Y;

    static {
        os8 os8Var = new os8("INSTANCE", 0);
        X = os8Var;
        Y = new os8[]{os8Var};
    }

    public static os8 valueOf(String str) {
        return (os8) Enum.valueOf(os8.class, str);
    }

    public static os8[] values() {
        return (os8[]) Y.clone();
    }

    @Override // defpackage.cn2
    public final Object a(Object obj) {
        return obj;
    }
}
