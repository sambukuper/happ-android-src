package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qc {
    public static final qc X;
    public static final qc Y;
    public static final /* synthetic */ qc[] Z;

    static {
        qc qcVar = new qc("SHOW_ORIGINAL", 0);
        X = qcVar;
        qc qcVar2 = new qc("SHOW_TRANSLATED", 1);
        Y = qcVar2;
        Z = new qc[]{qcVar, qcVar2};
    }

    public static qc valueOf(String str) {
        return (qc) Enum.valueOf(qc.class, str);
    }

    public static qc[] values() {
        return (qc[]) Z.clone();
    }
}
