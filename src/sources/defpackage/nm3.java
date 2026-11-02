package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nm3 extends qj6 implements rn2 {
    public final /* synthetic */ byte Z;
    public Object f0;
    public int g0;
    public int h0;
    public byte i0;
    public Object j0;
    public Object k0;
    public final /* synthetic */ Object l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nm3(Object obj, q51 q51Var, byte b) {
        super(2, q51Var);
        this.Z = b;
        this.l0 = obj;
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
        }
        return ((nm3) n(q51Var, v27Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.Z;
        Object obj2 = this.l0;
        switch (b) {
            case 0:
                nm3 nm3Var = new nm3((rm3) obj2, q51Var, (byte) 0);
                nm3Var.f0 = obj;
                return nm3Var;
            default:
                nm3 nm3Var2 = new nm3((Iterator) obj2, q51Var, (byte) 1);
                nm3Var2.k0 = obj;
                return nm3Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01c7 -> B:82:0x01dd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm3.q(java.lang.Object):java.lang.Object");
    }
}
