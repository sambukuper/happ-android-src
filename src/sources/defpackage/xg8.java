package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xg8 implements dn2 {
    public final /* synthetic */ byte X;
    public final Object Y;
    public final Object Z;

    public /* synthetic */ xg8(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        Object obj = this.Z;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                yg8 yg8Var = (yg8) obj2;
                gs0 gs0Var = (gs0) obj;
                ve4 ve4Var = yg8Var.H0;
                km1 km1Var = yg8Var.I0;
                sm annotations = gs0Var.getAnnotations();
                int iR = gs0Var.r();
                if (iR == 0) {
                    throw null;
                }
                km1 km1Var2 = yg8Var.I0;
                ke7 source = km1Var2.getSource();
                source.getClass();
                yg8 yg8Var2 = new yg8(ve4Var, km1Var, gs0Var, yg8Var, annotations, iR, source);
                yg8.K0.getClass();
                wi8 wi8VarD = km1Var2.H0() == null ? null : wi8.d(km1Var2.I0());
                if (wi8VarD == null) {
                    return null;
                }
                i44 i44Var = gs0Var.n0;
                i44 i44VarG = i44Var != null ? i44Var.g(wi8VarD) : null;
                List listY = gs0Var.Y();
                listY.getClass();
                ArrayList arrayList = new ArrayList(xv0.Z(listY, 10));
                Iterator it = listY.iterator();
                while (it.hasNext()) {
                    arrayList.add(((i44) it.next()).g(wi8VarD));
                }
                List listK0 = km1Var2.k0();
                List listL = yg8Var.L();
                t14 t14Var = yg8Var.k0;
                t14Var.getClass();
                yg8Var2.L0(null, i44VarG, arrayList, listK0, listL, t14Var, fx4.Y, km1Var2.j0);
                return yg8Var2;
            default:
                jl1 jl1Var = (jl1) ((fc8) obj2).Y;
                return ((hl1) jl1Var.X).e.f((nz5) obj, (w15) jl1Var.Y);
        }
    }
}
