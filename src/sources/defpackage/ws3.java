package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ws3 implements wf5 {
    public final ve4 a;
    public final wx4 b;
    public hl1 c;
    public final vt1 d;

    public ws3(ve4 ve4Var, y45 y45Var, wx4 wx4Var) {
        this.a = ve4Var;
        this.b = wx4Var;
        this.d = ve4Var.c(new f0(this, (byte) 2));
    }

    @Override // defpackage.wf5
    public final boolean a(fk2 fk2Var) {
        fk2Var.getClass();
        vt1 vt1Var = this.d;
        Object obj = ((ConcurrentHashMap) vt1Var.Z).get(fk2Var);
        return ((obj == null || obj == ue4.Y) ? c(fk2Var) : (tf5) vt1Var.B(fk2Var)) == null;
    }

    @Override // defpackage.wf5
    public final void b(fk2 fk2Var, ArrayList arrayList) {
        fk2Var.getClass();
        Object objB = this.d.B(fk2Var);
        if (objB != null) {
            arrayList.add(objB);
        }
    }

    public final oa0 c(fk2 fk2Var) {
        InputStream inputStreamA;
        fk2Var.getClass();
        v15 v15Var = ug7.j;
        v15Var.getClass();
        if (fk2Var.a.h(v15Var)) {
            ja0.m.getClass();
            inputStreamA = qa0.a(ja0.a(fk2Var));
        } else {
            inputStreamA = null;
        }
        if (inputStreamA == null) {
            return null;
        }
        qg5 qg5VarZ0 = z68.z0(inputStreamA);
        az5 az5Var = (az5) qg5VarZ0.X;
        ka0 ka0Var = (ka0) qg5VarZ0.Y;
        if (az5Var != null) {
            return new oa0(fk2Var, this.a, this.b, az5Var, ka0Var);
        }
        throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + ka0.f + ", actual " + ka0Var + ". Please update Kotlin");
    }

    @Override // defpackage.wf5
    public final Collection t(fk2 fk2Var, gn2 gn2Var) {
        fk2Var.getClass();
        return m02.X;
    }
}
