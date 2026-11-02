package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oe1 extends uy7 implements rn2 {
    public ba6 g0;
    public qk h0;
    public boolean i0;
    public final /* synthetic */ float j0;
    public final /* synthetic */ pe1 k0;
    public final /* synthetic */ xx6 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe1(float f, pe1 pe1Var, xx6 xx6Var, q51 q51Var) {
        super(2, q51Var);
        this.j0 = f;
        this.k0 = pe1Var;
        this.l0 = xx6Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((oe1) n((q51) obj2, (b71) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        return new oe1(this.j0, this.k0, this.l0, q51Var);
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        float f;
        ba6 ba6Var;
        qk qkVar;
        boolean z = this.i0;
        if (!z) {
            w39.n0(obj);
            f = this.j0;
            if (Math.abs(f) > 1.0f) {
                ba6 ba6Var2 = new ba6();
                ba6Var2.X = f;
                ba6 ba6Var3 = new ba6();
                qk qkVarB = z68.b(0.0f, f, 28);
                try {
                    pe1 pe1Var = this.k0;
                    bd1 bd1Var = pe1Var.a;
                    sn snVar = new sn(ba6Var3, this.l0, ba6Var2, pe1Var);
                    this.g0 = ba6Var2;
                    this.h0 = qkVarB;
                    this.i0 = true;
                    Object objC = ry7.c(qkVarB, bd1Var, false, snVar, this);
                    c71 c71Var = c71.X;
                    if (objC == c71Var) {
                        return c71Var;
                    }
                    ba6Var = ba6Var2;
                    f = ba6Var.X;
                } catch (CancellationException unused) {
                    ba6Var = ba6Var2;
                    qkVar = qkVarB;
                    ba6Var.X = ((Number) qkVar.a()).floatValue();
                }
            }
        } else {
            if (!z) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qkVar = this.h0;
            ba6Var = this.g0;
            try {
                w39.n0(obj);
            } catch (CancellationException unused2) {
                ba6Var.X = ((Number) qkVar.a()).floatValue();
            }
            f = ba6Var.X;
        }
        return new Float(f);
    }
}
