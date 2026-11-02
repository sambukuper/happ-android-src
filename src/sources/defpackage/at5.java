package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class at5 extends qj6 implements rn2 {
    public final /* synthetic */ byte Z = 0;
    public byte f0;
    public /* synthetic */ Object g0;
    public Object h0;
    public Object i0;
    public final /* synthetic */ Object j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at5(ne neVar, h68 h68Var, i68 i68Var, q51 q51Var) {
        super(2, q51Var);
        this.h0 = neVar;
        this.i0 = h68Var;
        this.j0 = i68Var;
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
            case 1:
                break;
        }
        return ((at5) n(q51Var, bz7Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.Z;
        Object obj2 = this.j0;
        switch (b) {
            case 0:
                at5 at5Var = new at5((h70) this.i0, (n30) obj2, q51Var);
                at5Var.g0 = obj;
                return at5Var;
            case 1:
                at5 at5Var2 = new at5((ne) this.h0, (h68) this.i0, (i68) obj2, q51Var);
                at5Var2.g0 = obj;
                return at5Var2;
            default:
                at5 at5Var3 = new at5((sm7) obj2, q51Var);
                at5Var3.g0 = obj;
                return at5Var3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:235:0x0408  */
    /* JADX WARN: Code duplicated, block: B:237:0x0418  */
    /* JADX WARN: Code duplicated, block: B:287:0x0420 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x041d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x023e -> B:138:0x0241). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:231:0x03fa -> B:233:0x03fd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d1 -> B:38:0x00d5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:235:0x0408
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at5.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at5(h70 h70Var, n30 n30Var, q51 q51Var) {
        super(2, q51Var);
        this.i0 = h70Var;
        this.j0 = n30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at5(sm7 sm7Var, q51 q51Var) {
        super(2, q51Var);
        this.j0 = sm7Var;
    }
}
