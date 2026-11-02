package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h22 extends qj6 implements rn2 {
    public final /* synthetic */ byte Z;
    public long[] f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public long k0;
    public boolean l0;
    public /* synthetic */ Object m0;
    public Object n0;
    public final /* synthetic */ Object o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h22(Object obj, q51 q51Var, byte b) {
        super(2, q51Var);
        this.Z = b;
        this.o0 = obj;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.Z;
        dn8 dn8Var = dn8.a;
        v27 v27Var = (v27) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((h22) n(q51Var, v27Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.Z;
        Object obj2 = this.o0;
        switch (b) {
            case 0:
                h22 h22Var = new h22((i22) obj2, q51Var, (byte) 0);
                h22Var.m0 = obj;
                return h22Var;
            case 1:
                h22 h22Var2 = new h22((i22) obj2, q51Var, (byte) 1);
                h22Var2.m0 = obj;
                return h22Var2;
            case 2:
                h22 h22Var3 = new h22((ww6) obj2, q51Var, (byte) 2);
                h22Var3.m0 = obj;
                return h22Var3;
            default:
                h22 h22Var4 = new h22((xp7) obj2, q51Var, (byte) 3);
                h22Var4.m0 = obj;
                return h22Var4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x021a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0268 A[DONT_INVERT, PHI: r1 r4 r5 r6 r7 r8
  0x0268: PHI (r1v6 v27) = (r1v4 v27), (r1v8 v27) binds: [B:76:0x0218, B:84:0x0263] A[DONT_GENERATE, DONT_INLINE]
  0x0268: PHI (r4v4 long[]) = (r4v2 long[]), (r4v6 long[]) binds: [B:76:0x0218, B:84:0x0263] A[DONT_GENERATE, DONT_INLINE]
  0x0268: PHI (r5v4 int) = (r5v2 int), (r5v6 int) binds: [B:76:0x0218, B:84:0x0263] A[DONT_GENERATE, DONT_INLINE]
  0x0268: PHI (r6v2 int) = (r6v1 int), (r6v4 int) binds: [B:76:0x0218, B:84:0x0263] A[DONT_GENERATE, DONT_INLINE]
  0x0268: PHI (r7v1 int) = (r7v0 int), (r7v2 int) binds: [B:76:0x0218, B:84:0x0263] A[DONT_GENERATE, DONT_INLINE]
  0x0268: PHI (r8v4 i22) = (r8v2 i22), (r8v6 i22) binds: [B:76:0x0218, B:84:0x0263] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x026a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0066 -> B:22:0x00a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0068 -> B:15:0x0077). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007d -> B:19:0x009b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00f0 -> B:43:0x0135). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00f2 -> B:36:0x0107). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x010d -> B:40:0x012b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0180 -> B:64:0x01c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0182 -> B:57:0x0197). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x019d -> B:61:0x01bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0218 -> B:85:0x0268). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x021a -> B:78:0x022c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0232 -> B:82:0x025e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h22.q(java.lang.Object):java.lang.Object");
    }
}
