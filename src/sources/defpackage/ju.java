package defpackage;

import java.lang.reflect.Modifier;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ju extends e41 implements p51 {
    public final dh8 Z;
    public final d50 f0;
    public final boolean g0;
    public final Boolean h0;
    public final ri8 i0;
    public final ar3 j0;
    public g33 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju(Class cls, dh8 dh8Var, boolean z, ri8 ri8Var, ar3 ar3Var) {
        super(0, cls);
        boolean z2 = false;
        this.Z = dh8Var;
        if (z || (dh8Var != null && Modifier.isFinal(dh8Var.j0.getModifiers()))) {
            z2 = true;
        }
        this.g0 = z2;
        this.i0 = ri8Var;
        this.f0 = null;
        this.j0 = ar3Var;
        this.k0 = px5.f;
        this.h0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    @Override // defpackage.p51
    public final ar3 a(t37 t37Var, d50 d50Var) {
        ar3 ar3VarD;
        dh8 dh8Var;
        Object objC;
        ri8 ri8Var = this.i0;
        ri8 ri8VarG = ri8Var != null ? ri8Var.g(d50Var) : ri8Var;
        if (d50Var != null) {
            m85 m85VarD = t37Var.X.d();
            gl glVarB = d50Var.b();
            if (glVarB == null || (objC = m85VarD.c(glVarB)) == null) {
                ar3VarD = null;
            } else {
                ar3VarD = t37Var.D(glVarB, objC);
            }
        } else {
            ar3VarD = null;
        }
        no3 no3VarK = lj7.k(t37Var, d50Var, this.X);
        Boolean boolA = no3VarK != null ? no3VarK.a(ko3.X) : null;
        ar3 ar3Var = this.j0;
        if (ar3VarD == null) {
            ar3VarD = ar3Var;
        }
        ar3 ar3VarJ = lj7.j(t37Var, d50Var, ar3VarD);
        if (ar3VarJ == null && (dh8Var = this.Z) != null && this.g0 && !dh8Var.K0()) {
            ar3VarJ = t37Var.i(dh8Var, d50Var);
        }
        return (ar3VarJ == ar3Var && d50Var == this.f0 && ri8Var == ri8VarG && Objects.equals(this.h0, boolA)) ? this : r(d50Var, ri8VarG, ar3VarJ, boolA);
    }

    @Override // defpackage.ar3
    public final void f(Object obj, ro3 ro3Var, t37 t37Var, ri8 ri8Var) {
        z76 z76VarE = ri8Var.e(ro3Var, ri8Var.d(obj, gr3.START_ARRAY));
        ro3Var.m(obj);
        q(obj, ro3Var, t37Var);
        ri8Var.f(ro3Var, z76VarE);
    }

    public final ar3 p(g33 g33Var, dh8 dh8Var, t37 t37Var) {
        zz2 zz2VarR = g33Var.r(dh8Var, t37Var, this.f0);
        g33 g33Var2 = (g33) zz2VarR.Z;
        if (g33Var != g33Var2) {
            this.k0 = g33Var2;
        }
        return (ar3) zz2VarR.Y;
    }

    public abstract void q(Object obj, ro3 ro3Var, t37 t37Var);

    public abstract ju r(d50 d50Var, ri8 ri8Var, ar3 ar3Var, Boolean bool);

    public ju(ju juVar, d50 d50Var, ri8 ri8Var, ar3 ar3Var, Boolean bool) {
        super(0, juVar.X);
        this.Z = juVar.Z;
        this.g0 = juVar.g0;
        this.i0 = ri8Var;
        this.f0 = d50Var;
        this.j0 = ar3Var;
        this.k0 = px5.f;
        this.h0 = bool;
    }
}
