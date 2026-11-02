package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dm {
    public static final dm X;
    public static final dm Y;
    public static final /* synthetic */ dm[] Z;

    static {
        dm dmVar = new dm("JAVA", 0);
        X = dmVar;
        dm dmVar2 = new dm("KOTLIN", 1);
        Y = dmVar2;
        Z = new dm[]{dmVar, dmVar2};
    }

    public static dm valueOf(String str) {
        return (dm) Enum.valueOf(dm.class, str);
    }

    public static dm[] values() {
        return (dm[]) Z.clone();
    }
}
