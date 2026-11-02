package defpackage;

import java.util.LinkedHashSet;
import su.happ.proxyutility.dto.ImportResult;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z81 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ boolean i0;
    public final /* synthetic */ Object j0;
    public final /* synthetic */ Object k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z81(MainActivity mainActivity, boolean z, Object obj, boolean z2, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.j0 = mainActivity;
        this.h0 = z;
        this.k0 = obj;
        this.i0 = z2;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) throws Throwable {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                return ((z81) n(q51Var, b71Var)).q(dn8Var);
            case 1:
                return ((z81) n(q51Var, b71Var)).q(dn8Var);
            case 2:
                return ((z81) n(q51Var, b71Var)).q(dn8Var);
            case 3:
                ((z81) n(q51Var, b71Var)).q(dn8Var);
                return dn8Var;
            default:
                ((z81) n(q51Var, b71Var)).q(dn8Var);
                return dn8Var;
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        boolean z = this.i0;
        Object obj2 = this.k0;
        Object obj3 = this.j0;
        switch (b) {
            case 0:
                return new z81(q51Var, (gn2) obj2, (ql6) obj3, z);
            case 1:
                return new z81((gh1) obj3, q51Var, z, (LinkedHashSet) obj2);
            case 2:
                return new z81(z, (la) obj3, obj2, q51Var);
            case 3:
                return new z81((MainActivity) obj3, this.h0, (t83) obj2, this.i0, q51Var, (byte) 3);
            default:
                return new z81((MainActivity) obj3, this.h0, (ImportResult) obj2, this.i0, q51Var, (byte) 4);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        byte b = this.g0;
        c71 c71Var = c71.X;
        dn8 dn8Var = dn8.a;
        boolean z = this.i0;
        Object obj2 = this.k0;
        Object obj3 = this.j0;
        switch (b) {
            case 0:
                boolean z2 = this.h0;
                if (z2) {
                    if (z2) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                ql6 ql6Var = (ql6) obj3;
                b91 b91Var = new b91(null, (gn2) obj2, ql6Var, z);
                this.h0 = true;
                Object objQ = ql6Var.q(z, b91Var, this);
                return objQ == c71Var ? c71Var : objQ;
            case 1:
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
                xg1 xg1VarF = ((gh1) obj3).j().f((LinkedHashSet) obj2, z);
                this.h0 = true;
                Object objH = ((ux0) xg1VarF).h(this);
                return objH == c71Var ? c71Var : objH;
            case 2:
                boolean z4 = this.h0;
                if (!z4) {
                    w39.n0(obj);
                    if (!z) {
                        this.h0 = true;
                        if (t9.a((la) obj3, obj2, this) == c71Var) {
                            return c71Var;
                        }
                    }
                } else {
                    if (!z4) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            case 3:
                w39.n0(obj);
                m51 m51Var = ko1.B1;
                MainActivity mainActivity = (MainActivity) obj3;
                km4.x(mainActivity.n());
                if (this.h0) {
                    mainActivity.J((t83) obj2, z);
                }
                return dn8Var;
            default:
                w39.n0(obj);
                m51 m51Var2 = ko1.B1;
                MainActivity mainActivity2 = (MainActivity) obj3;
                km4.x(mainActivity2.n());
                if (this.h0) {
                    mainActivity2.J(((ImportResult) obj2).getLastParseError(), z);
                }
                return dn8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z81(gh1 gh1Var, q51 q51Var, boolean z, LinkedHashSet linkedHashSet) {
        super(2, q51Var);
        this.g0 = (byte) 1;
        this.j0 = gh1Var;
        this.i0 = z;
        this.k0 = linkedHashSet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z81(q51 q51Var, gn2 gn2Var, ql6 ql6Var, boolean z) {
        super(2, q51Var);
        this.g0 = (byte) 0;
        this.j0 = ql6Var;
        this.i0 = z;
        this.k0 = gn2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z81(boolean z, la laVar, Object obj, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 2;
        this.i0 = z;
        this.j0 = laVar;
        this.k0 = obj;
    }
}
