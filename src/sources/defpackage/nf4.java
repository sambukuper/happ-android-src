package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 nf4[], still in use, count: 1, list:
  (r0v1 nf4[]) from 0x005c: CONSTRUCTOR (r0v1 nf4[]) A[WRAPPED] (LINE:93) call: n22.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class nf4 {
    AUTO("time"),
    /* JADX INFO: Fake field, exist only in values array */
    BRIEF("brief"),
    /* JADX INFO: Fake field, exist only in values array */
    LONG("long"),
    /* JADX INFO: Fake field, exist only in values array */
    PROCESS("process"),
    /* JADX INFO: Fake field, exist only in values array */
    RAW("raw"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG("tag"),
    /* JADX INFO: Fake field, exist only in values array */
    TIME("time"),
    /* JADX INFO: Fake field, exist only in values array */
    THREADTIME("threadtime");

    public static final k32 Y = new k32();
    public static final /* synthetic */ n22 g0;
    public final String X;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        g0 = new n22(new nf4[]{r0, new nf4("brief"), new nf4("long"), new nf4("process"), new nf4("raw"), new nf4("tag"), new nf4("time"), new nf4("threadtime")});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nf4(String str) {
        super(str, i);
        this.X = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static nf4 valueOf(String str) {
        return (nf4) Enum.valueOf(nf4.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static nf4[] values() {
        return (nf4[]) f0.clone();
    }
}
