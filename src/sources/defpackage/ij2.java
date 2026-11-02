package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ij2 extends qj6 implements rn2 {
    public final /* synthetic */ byte Z;
    public byte f0;
    public /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;
    public final /* synthetic */ Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ij2(Object obj, Object obj2, q51 q51Var, byte b) {
        super(2, q51Var);
        this.Z = b;
        this.h0 = obj;
        this.i0 = obj2;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.Z;
        dn8 dn8Var = dn8.a;
        bz7 bz7Var = (bz7) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((ij2) n(q51Var, bz7Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.Z;
        Object obj2 = this.i0;
        Object obj3 = this.h0;
        switch (b) {
            case 0:
                ij2 ij2Var = new ij2((s61) obj3, (rn2) obj2, q51Var, (byte) 0);
                ij2Var.g0 = obj;
                return ij2Var;
            default:
                ij2 ij2Var2 = new ij2((bq5) obj3, (ea6) obj2, q51Var, (byte) 1);
                ij2Var2.g0 = obj;
                return ij2Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0126 A[Catch: CancellationException -> 0x010b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x010b, blocks: (B:64:0x0126, B:54:0x0106, B:59:0x0113), top: B:82:0x00ea }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0134  */
    /* JADX WARN: Code duplicated, block: B:69:0x0135 A[Catch: CancellationException -> 0x0140, PHI: r5
  0x0135: PHI (r5v3 bz7) = (r5v4 bz7), (r5v7 bz7) binds: [B:67:0x0132, B:60:0x0116] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0140, blocks: (B:66:0x012c, B:69:0x0135), top: B:80:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ab -> B:35:0x00af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x013d -> B:62:0x0120). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x014f -> B:62:0x0120). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:64:0x0126
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij2.q(java.lang.Object):java.lang.Object");
    }
}
