package defpackage;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 g35, still in use, count: 1, list:
  (r1v0 g35) from 0x00fb: INVOKE (r0v17 android.util.SparseArray), (0 int), (r1v0 g35) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:252)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g35 {
    /* JADX INFO: Fake field, exist only in values array */
    LTE_CA(0),
    /* JADX INFO: Fake field, exist only in values array */
    TD_SCDMA(1),
    /* JADX INFO: Fake field, exist only in values array */
    EDGE(2),
    /* JADX INFO: Fake field, exist only in values array */
    UMTS(3),
    /* JADX INFO: Fake field, exist only in values array */
    CDMA(4),
    /* JADX INFO: Fake field, exist only in values array */
    EVDO_0(5),
    /* JADX INFO: Fake field, exist only in values array */
    EVDO_A(6),
    /* JADX INFO: Fake field, exist only in values array */
    RTT(7),
    /* JADX INFO: Fake field, exist only in values array */
    HSDPA(8),
    /* JADX INFO: Fake field, exist only in values array */
    HSUPA(9),
    /* JADX INFO: Fake field, exist only in values array */
    HSPA(10),
    /* JADX INFO: Fake field, exist only in values array */
    IDEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    EVDO_B(12),
    /* JADX INFO: Fake field, exist only in values array */
    LTE(13),
    /* JADX INFO: Fake field, exist only in values array */
    EHRPD(14),
    /* JADX INFO: Fake field, exist only in values array */
    IWLAN(15),
    /* JADX INFO: Fake field, exist only in values array */
    LTE_CA(16),
    /* JADX INFO: Fake field, exist only in values array */
    TD_SCDMA(17),
    /* JADX INFO: Fake field, exist only in values array */
    IWLAN(18),
    /* JADX INFO: Fake field, exist only in values array */
    LTE_CA(19),
    /* JADX INFO: Fake field, exist only in values array */
    COMBINED(100);

    public static final SparseArray X;

    static {
        SparseArray sparseArray = new SparseArray();
        X = sparseArray;
        sparseArray.put(0, g35Var);
        sparseArray.put(1, g35Var);
        sparseArray.put(2, g35Var);
        sparseArray.put(3, g35Var);
        sparseArray.put(4, g35Var);
        sparseArray.put(5, g35Var);
        sparseArray.put(6, g35Var);
        sparseArray.put(7, g35Var);
        sparseArray.put(8, g35Var);
        sparseArray.put(9, g35Var);
        sparseArray.put(10, g35Var);
        sparseArray.put(11, g35Var);
        sparseArray.put(12, g35Var);
        sparseArray.put(13, g35Var);
        sparseArray.put(14, g35Var);
        sparseArray.put(15, g35Var);
        sparseArray.put(16, g35Var);
        sparseArray.put(17, g35Var);
        sparseArray.put(18, g35Var);
        sparseArray.put(19, g35Var);
    }

    public g35(int i) {
        super(str, i);
    }

    public static g35 valueOf(String str) {
        return (g35) Enum.valueOf(g35.class, str);
    }

    public static g35[] values() {
        return (g35[]) Y.clone();
    }
}
