package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public byte h0;
    public final /* synthetic */ long i0;
    public Object j0;
    public final /* synthetic */ Object k0;
    public final /* synthetic */ Object l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(l38 l38Var, long j, q38 q38Var, k38 k38Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 2;
        this.j0 = l38Var;
        this.i0 = j;
        this.k0 = q38Var;
        this.l0 = k38Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((s0) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.l0;
        Object obj3 = this.k0;
        switch (b) {
            case 0:
                return new s0(obj3, this.i0, (xz4) obj2, q51Var, (byte) 0);
            case 1:
                return new s0((z54) obj3, (ta2) obj2, this.i0, q51Var);
            case 2:
                return new s0((l38) this.j0, this.i0, (q38) obj3, (k38) obj2, q51Var);
            default:
                return new s0(obj3, this.i0, (xz4) obj2, q51Var, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r9.a(r0, r14) == r7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0121, code lost:
    
        if (defpackage.oi.a(r0, r9, r12, r3, r14, 4) == r7) goto L65;
     */
    @Override // defpackage.r10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s0.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(z54 z54Var, ta2 ta2Var, long j, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 1;
        this.k0 = z54Var;
        this.l0 = ta2Var;
        this.i0 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(Object obj, long j, xz4 xz4Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.k0 = obj;
        this.i0 = j;
        this.l0 = xz4Var;
    }
}
