package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 e69[], still in use, count: 1, list:
  (r0v1 e69[]) from 0x004f: CONSTRUCTOR (r0v1 e69[]) A[WRAPPED] (LINE:80) call: n22.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class e69 {
    f0("debug", "D"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("debug", "D"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("info", "I"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("warning", "W"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("error", "E"),
    g0("none", null);

    public static final f08 Z = new f08((byte) 16);
    public static final /* synthetic */ n22 i0;
    public final String X;
    public final String Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        i0 = new n22(new e69[]{r0, r1, r2, r3, r4, r5});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e69(String str, String str2) {
        super(str, i);
        this.X = str;
        this.Y = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static e69 valueOf(String str) {
        return (e69) Enum.valueOf(e69.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static e69[] values() {
        return (e69[]) h0.clone();
    }
}
