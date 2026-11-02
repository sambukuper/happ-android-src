package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 u47[], still in use, count: 1, list:
  (r0v1 u47[]) from 0x006e: CONSTRUCTOR (r0v1 u47[]) A[WRAPPED] (LINE:111) call: n22.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class u47 {
    /* JADX INFO: Fake field, exist only in values array */
    HOKKAIDO(" HOKKAIDO "),
    /* JADX INFO: Fake field, exist only in values array */
    AKTAU(" AKTAU "),
    /* JADX INFO: Fake field, exist only in values array */
    ELISTA(" ELISTA "),
    /* JADX INFO: Fake field, exist only in values array */
    TOMSK(" TOMSK "),
    /* JADX INFO: Fake field, exist only in values array */
    BEWAR(" BEWAR "),
    /* JADX INFO: Fake field, exist only in values array */
    CORONA(" corona "),
    /* JADX INFO: Fake field, exist only in values array */
    KOSTROMA(" KOSTROMA "),
    /* JADX INFO: Fake field, exist only in values array */
    SARANSK(" SARANSK "),
    /* JADX INFO: Fake field, exist only in values array */
    BIMBO(" bimbo "),
    /* JADX INFO: Fake field, exist only in values array */
    DEBILA(" DEBILA ");

    public static final /* synthetic */ n22 Z;
    public final String X;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Z = new n22(u47VarArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u47(String str) {
        super(str, i);
        this.X = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static u47 valueOf(String str) {
        return (u47) Enum.valueOf(u47.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static u47[] values() {
        return (u47[]) Y.clone();
    }
}
