package defpackage;

import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class df0 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ long i0;
    public final /* synthetic */ Object j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df0(long j, ef0 ef0Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 0;
        this.i0 = j;
        this.j0 = ef0Var;
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
        }
        return ((df0) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.j0;
        switch (b) {
            case 0:
                return new df0(this.i0, (ef0) obj2, q51Var);
            case 1:
                return new df0((ea6) obj2, this.i0, q51Var, (byte) 1);
            default:
                return new df0((a68) obj2, this.i0, q51Var, (byte) 2);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        q51 q51Var = null;
        byte b = 1;
        switch (this.g0) {
            case 0:
                c71 c71Var = c71.X;
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    long j = this.i0;
                    this.h0 = true;
                    if (u70.F(j, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                ef0 ef0Var = (ef0) this.j0;
                synchronized (ef0Var.q) {
                    if (!ef0Var.c() && !ef0Var.s.equals(sh0.p0) && !ef0Var.s.equals(sh0.o0)) {
                        ef0Var.toString();
                        ef0Var.f.k();
                        ef0Var.f();
                        ef0Var.e();
                    }
                    break;
                }
                return dn8.a;
            case 1:
                ea6 ea6Var = (ea6) this.j0;
                c71 c71Var2 = c71.X;
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    MainViewModel mainViewModel = (MainViewModel) ea6Var.X;
                    long j2 = this.i0;
                    mainViewModel.getClass();
                    lf2 lf2Var = new lf2(zc1.o(new j31(new eo4(j2, (q51) null), (byte) 7), -1), new ar2(ea6Var, q51Var, b), (byte) 0);
                    fg2 fg2Var = new fg2(ea6Var, (byte) 2);
                    this.h0 = true;
                    if (lf2Var.a(fg2Var, this) == c71Var2) {
                        return c71Var2;
                    }
                } else {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            default:
                c71 c71Var3 = c71.X;
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    oi oiVar = ((a68) this.j0).x0;
                    z85 z85Var = new z85(this.i0);
                    wf7 wf7Var = o07.d;
                    this.h0 = true;
                    if (oi.a(oiVar, z85Var, wf7Var, null, this, 12) == c71Var3) {
                        return c71Var3;
                    }
                } else {
                    if (!z3) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ df0(Object obj, long j, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.j0 = obj;
        this.i0 = j;
    }
}
