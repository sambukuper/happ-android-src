package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v32 s14[], still in use, count: 1, list:
  (r1v32 s14[]) from 0x0269: CONSTRUCTOR (r2v36 n22) = (r1v32 s14[]) A[MD:(java.lang.Enum[]):void (m)] (LINE:618) call: n22.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class s14 {
    Z(true),
    f0(true),
    g0(false),
    h0(true),
    i0(true),
    j0(true),
    k0(true),
    l0(true),
    m0(true),
    n0(true),
    o0(true),
    p0(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF13(false),
    q0(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF15(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(false),
    r0(false),
    s0(false),
    t0(false),
    u0(false),
    v0(false),
    w0(false),
    x0(false),
    y0(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF313(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF324(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF335(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF346(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF357(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF368(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF379(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF390(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF401(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF412(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF423(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF434(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF445(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF456(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF467(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF479(true),
    /* JADX INFO: Fake field, exist only in values array */
    EF491(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF502(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF513(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF524(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF535(false);

    public static final /* synthetic */ n22 A0;
    public static final HashMap Y;
    public final boolean X;

    static {
        n22 n22Var = new n22(s14VarArr);
        A0 = n22Var;
        Y = new HashMap();
        w1 w1Var = new w1(n22Var, (byte) 0);
        while (w1Var.hasNext()) {
            s14 s14Var = (s14) w1Var.next();
            Y.put(s14Var.name(), s14Var);
        }
        n22 n22Var2 = A0;
        ArrayList arrayList = new ArrayList();
        n22Var2.getClass();
        w1 w1Var2 = new w1(n22Var2, (byte) 0);
        while (w1Var2.hasNext()) {
            Object next = w1Var2.next();
            if (((s14) next).X) {
                arrayList.add(next);
            }
        }
        wv0.c1(arrayList);
        wv0.c1(A0);
        s14 s14Var2 = f0;
        s14 s14Var3 = Z;
        i21.L(s14Var2, s14Var3);
        i21.L(y0, s14Var3);
        i21.L(r0, s14Var3);
        s14 s14Var4 = u0;
        s14 s14Var5 = s0;
        i21.L(s14Var4, s14Var5, s14Var3);
        i21.L(t0, s14Var5, s14Var3);
        i21.L(v0, s14Var3);
        i21.L(w0, s14Var3);
        s14 s14Var6 = x0;
        s14 s14Var7 = h0;
        s14 s14Var8 = i0;
        i21.L(s14Var6, s14Var7, s14Var8);
        s14 s14Var9 = o0;
        i21.K(s14Var9);
        s14 s14Var10 = n0;
        i21.K(s14Var10);
        i21.K(m0);
        s14 s14Var11 = q0;
        i21.K(s14Var11);
        nm nmVar = nm.CONSTRUCTOR_PARAMETER;
        s14 s14Var12 = k0;
        zp4.J(new qg5(nmVar, s14Var12), new qg5(nm.FIELD, s14Var8), new qg5(nm.PROPERTY, s14Var7), new qg5(nm.FILE, s14Var11), new qg5(nm.PROPERTY_GETTER, s14Var10), new qg5(nm.PROPERTY_SETTER, s14Var9), new qg5(nm.RECEIVER, s14Var12), new qg5(nm.SETTER_PARAMETER, s14Var12), new qg5(nm.PROPERTY_DELEGATE_FIELD, s14Var8));
    }

    public s14(boolean z) {
        super(str, i);
        this.X = z;
    }

    public static s14 valueOf(String str) {
        return (s14) Enum.valueOf(s14.class, str);
    }

    public static s14[] values() {
        return (s14[]) z0.clone();
    }
}
