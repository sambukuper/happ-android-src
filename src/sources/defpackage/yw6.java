package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yw6 {
    public static final yw6 X;
    public static final yw6 Y;
    public static final yw6 Z;
    public static final /* synthetic */ yw6[] f0;

    static {
        yw6 yw6Var = new yw6("NETWORK_UNMETERED", 0);
        X = yw6Var;
        yw6 yw6Var2 = new yw6("DEVICE_IDLE", 1);
        Y = yw6Var2;
        yw6 yw6Var3 = new yw6("DEVICE_CHARGING", 2);
        Z = yw6Var3;
        f0 = new yw6[]{yw6Var, yw6Var2, yw6Var3};
    }

    public static yw6 valueOf(String str) {
        return (yw6) Enum.valueOf(yw6.class, str);
    }

    public static yw6[] values() {
        return (yw6[]) f0.clone();
    }
}
