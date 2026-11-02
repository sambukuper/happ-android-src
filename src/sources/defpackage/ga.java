package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ga extends uy7 implements gn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ Object i0;
    public final /* synthetic */ Object j0;
    public final /* synthetic */ Object k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ga(Object obj, Object obj2, Object obj3, q51 q51Var, byte b) {
        super(1, q51Var);
        this.g0 = b;
        this.k0 = obj;
        this.i0 = obj2;
        this.j0 = obj3;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        q51 q51Var = (q51) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((ga) m(q51Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 m(q51 q51Var) {
        byte b = this.g0;
        Object obj = this.i0;
        Object obj2 = this.j0;
        Object obj3 = this.k0;
        switch (b) {
            case 0:
                return new ga((t5) obj3, this.i0, (tn2) obj2, q51Var, (byte) 0);
            case 1:
                return new ga((la) obj3, this.i0, (tn2) obj2, q51Var, (byte) 1);
            case 2:
                return new ga((wq8) obj3, (Map) obj, (k11) obj2, q51Var, (byte) 2);
            default:
                return new ga((wq8) obj3, (gg0) obj, (Map) obj2, q51Var, (byte) 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.j0;
        Object obj3 = this.i0;
        c71 c71Var = c71.X;
        Object obj4 = this.k0;
        we6 we6Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (b) {
            case 0:
                t5 t5Var = (t5) obj4;
                boolean z = this.h0;
                if (z) {
                    if (z) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                ((rh5) t5Var.m0).setValue(obj3);
                byte b2 = 3;
                aa aaVar = new aa(t5Var, b2);
                r0 r0Var = new r0((tn2) obj2, t5Var, objArr == true ? 1 : 0, b2);
                this.h0 = true;
                return ys0.T(aaVar, r0Var, this) == c71Var ? c71Var : dn8Var;
            case 1:
                la laVar = (la) obj4;
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    laVar.h.setValue(obj3);
                    ba baVar = new ba(laVar, (byte) 2);
                    r0 r0Var2 = new r0((tn2) obj2, laVar, objArr2 == true ? 1 : 0, (byte) 4);
                    this.h0 = true;
                    if (t9.b(baVar, r0Var2, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                y2 y2Var = laVar.a;
                laVar.j.a(laVar.b().c(obj3), laVar.g.l());
                laVar.d.setValue(obj3);
                laVar.c.setValue(obj3);
                return dn8Var;
            case 2:
                boolean z3 = this.h0;
                if (z3) {
                    if (z3) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                this.h0 = true;
                ux0 ux0Var = wq8.l;
                Object objL = ((wq8) obj4).l(pq8.Y, (Map) obj3, (k11) obj2, this);
                return objL == c71Var ? c71Var : objL;
            default:
                wq8 wq8Var = (wq8) obj4;
                boolean z4 = this.h0;
                if (z4) {
                    if (z4) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                hi5.i0("CXCP");
                LinkedHashMap linkedHashMap = wq8Var.k;
                ux0 ux0Var2 = wq8.l;
                fg0 fg0Var = new fg0((byte) 0);
                fg0Var.c((gg0) obj3);
                linkedHashMap.put(pq8.Z, new sq8(fg0Var, new LinkedHashMap((Map) obj2), we6Var, 12));
                sq8 sq8VarJ = wq8.j(wq8Var.k);
                this.h0 = true;
                Object objM = wq8Var.m(sq8VarJ, null, this);
                return objM == c71Var ? c71Var : objM;
        }
    }
}
