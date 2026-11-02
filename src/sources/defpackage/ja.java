package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ja extends uy7 implements sn2 {
    public final /* synthetic */ byte g0 = 1;
    public boolean h0;
    public /* synthetic */ Object i0;
    public /* synthetic */ Serializable j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(dq dqVar, pi piVar, q51 q51Var) {
        super(3, q51Var);
        this.i0 = dqVar;
        this.j0 = piVar;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        x31 x31Var;
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        x31 x31Var2 = null;
        switch (b) {
            case 0:
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
                ka kaVar = (ka) ((dq) this.i0).Y;
                pi piVar = (pi) this.j0;
                this.h0 = true;
                return piVar.K(kaVar, this) == c71Var ? c71Var : dn8Var;
            default:
                boolean z2 = this.h0;
                if (z2) {
                    if (z2) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                ze2 ze2Var = (ze2) this.i0;
                x31[] x31VarArr = (x31[]) ((Object[]) this.j0);
                int length = x31VarArr.length;
                int i = 0;
                while (true) {
                    x31Var = v31.a;
                    if (i < length) {
                        x31 x31Var3 = x31VarArr[i];
                        if (dh3.f(x31Var3, x31Var)) {
                            i++;
                        } else {
                            x31Var2 = x31Var3;
                        }
                    }
                }
                if (x31Var2 != null) {
                    x31Var = x31Var2;
                }
                this.h0 = true;
                return ze2Var.l(x31Var, this) == c71Var ? c71Var : dn8Var;
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Serializable, java.lang.Object[]] */
    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return new ja((dq) this.i0, (pi) this.j0, (q51) obj3).q(dn8Var);
            default:
                ja jaVar = new ja(3, (q51) obj3);
                jaVar.i0 = (ze2) obj;
                jaVar.j0 = (Object[]) obj2;
                return jaVar.q(dn8Var);
        }
    }

    public /* synthetic */ ja(int i, q51 q51Var) {
        super(i, q51Var);
    }
}
