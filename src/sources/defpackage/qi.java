package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qi extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public Object i0;
    public Object j0;
    public Object k0;
    public Object l0;
    public final /* synthetic */ Object m0;
    public final /* synthetic */ Object n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi(r77 r77Var, dn2 dn2Var, tn2 tn2Var, ky2 ky2Var, Context context, rn2 rn2Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 3;
        this.i0 = r77Var;
        this.j0 = dn2Var;
        this.k0 = tn2Var;
        this.l0 = ky2Var;
        this.m0 = context;
        this.n0 = rn2Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) throws Exception {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                return ((qi) n(q51Var, b71Var)).q(dn8Var);
            case 1:
                return ((qi) n(q51Var, b71Var)).q(dn8Var);
            case 2:
                return ((qi) n(q51Var, b71Var)).q(dn8Var);
            case 3:
                ((qi) n(q51Var, b71Var)).q(dn8Var);
                return c71.X;
            default:
                return ((qi) n(q51Var, b71Var)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.n0;
        Object obj3 = this.m0;
        switch (b) {
            case 0:
                qi qiVar = new qi(this.k0, this.l0, obj3, obj2, q51Var, (byte) 0);
                qiVar.j0 = obj;
                return qiVar;
            case 1:
                return new qi(this.k0, this.l0, obj3, obj2, q51Var, (byte) 1);
            case 2:
                qi qiVar2 = new qi((lr5) obj3, (d27) obj2, q51Var);
                qiVar2.j0 = obj;
                return qiVar2;
            case 3:
                return new qi((r77) this.i0, (dn2) this.j0, (tn2) this.k0, (ky2) this.l0, (Context) obj3, (rn2) obj2, q51Var);
            default:
                qi qiVar3 = new qi((h57) this.i0, (or8) this.k0, (List) this.l0, (Map) obj3, (qi0) obj2, q51Var);
                qiVar3.j0 = obj;
                return qiVar3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:208:0x043c  */
    /* JADX WARN: Code duplicated, block: B:211:0x0446  */
    /* JADX WARN: Code duplicated, block: B:213:0x0454  */
    /* JADX WARN: Code duplicated, block: B:214:0x0456  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:207:0x043a -> B:209:0x043e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r27) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1156
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qi.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi(h57 h57Var, or8 or8Var, List list, Map map, qi0 qi0Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 4;
        this.i0 = h57Var;
        this.k0 = or8Var;
        this.l0 = list;
        this.m0 = map;
        this.n0 = qi0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi(lr5 lr5Var, d27 d27Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 2;
        this.m0 = lr5Var;
        this.n0 = d27Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi(Object obj, Object obj2, Object obj3, Object obj4, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.k0 = obj;
        this.l0 = obj2;
        this.m0 = obj3;
        this.n0 = obj4;
    }
}
