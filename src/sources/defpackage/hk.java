package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hk {
    public static final hk X;
    public static final hk Y;
    public static final /* synthetic */ hk[] Z;

    static {
        hk hkVar = new hk("BoundReached", 0);
        X = hkVar;
        hk hkVar2 = new hk("Finished", 1);
        Y = hkVar2;
        Z = new hk[]{hkVar, hkVar2};
    }

    public static hk valueOf(String str) {
        return (hk) Enum.valueOf(hk.class, str);
    }

    public static hk[] values() {
        return (hk[]) Z.clone();
    }
}
