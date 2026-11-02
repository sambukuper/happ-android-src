package defpackage;

import androidx.work.WorkerParameters;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ia1 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public Object h0;
    public byte i0;
    public Object j0;
    public Object k0;
    public Object l0;
    public Object m0;
    public final /* synthetic */ Object n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia1(ec4 ec4Var, Throwable th, xy0 xy0Var, y5 y5Var, String str, WorkerParameters workerParameters, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 3;
        this.k0 = ec4Var;
        this.l0 = th;
        this.h0 = xy0Var;
        this.j0 = y5Var;
        this.m0 = str;
        this.n0 = workerParameters;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((ia1) n((q51) obj2, obj)).q(dn8Var);
            case 1:
                return ((ia1) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 2:
                return ((ia1) n((q51) obj2, (w35) obj)).q(dn8Var);
            case 3:
                return ((ia1) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 4:
                return ((ia1) n((q51) obj2, (b71) obj)).q(dn8Var);
            default:
                return ((ia1) n((q51) obj2, (b71) obj)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.n0;
        switch (b) {
            case 0:
                ia1 ia1Var = new ia1(this.m0, obj2, q51Var, (byte) 0);
                ia1Var.j0 = obj;
                return ia1Var;
            case 1:
                ia1 ia1Var2 = new ia1(this.m0, obj2, q51Var, (byte) 1);
                ia1Var2.j0 = obj;
                return ia1Var2;
            case 2:
                ia1 ia1Var3 = new ia1((ea6) this.l0, (o35) this.j0, (ea6) this.m0, (t35) obj2, q51Var);
                ia1Var3.h0 = obj;
                return ia1Var3;
            case 3:
                return new ia1((ec4) this.k0, (Throwable) this.l0, (xy0) this.h0, (y5) this.j0, (String) this.m0, (WorkerParameters) obj2, q51Var);
            case 4:
                return new ia1((tj7) this.m0, (qq8) obj2, (rj7) null, q51Var);
            default:
                return new ia1((tj7) obj2, q51Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:190:0x039e  */
    /* JADX WARN: Code duplicated, block: B:193:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:196:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:200:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:201:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [byte, o15] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, q51, rj7] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia1.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia1(ea6 ea6Var, o35 o35Var, ea6 ea6Var2, t35 t35Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 2;
        this.l0 = ea6Var;
        this.j0 = o35Var;
        this.m0 = ea6Var2;
        this.n0 = t35Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia1(tj7 tj7Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 5;
        this.n0 = tj7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia1(tj7 tj7Var, qq8 qq8Var, rj7 rj7Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 4;
        this.m0 = tj7Var;
        this.n0 = qq8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ia1(Object obj, Object obj2, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.m0 = obj;
        this.n0 = obj2;
    }
}
