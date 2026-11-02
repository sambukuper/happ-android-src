package defpackage;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cm1 implements gn2 {
    public final /* synthetic */ byte X;
    public final fm1 Y;

    public /* synthetic */ cm1(fm1 fm1Var, byte b) {
        this.X = b;
        this.Y = fm1Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        fl1 fl1Var;
        byte b = this.X;
        Collection<cz5> collectionN0 = d02.X;
        fm1 fm1Var = this.Y;
        byte b2 = 0;
        switch (b) {
            case 0:
                v15 v15Var = (v15) obj;
                v15Var.getClass();
                LinkedHashMap linkedHashMap = fm1Var.a;
                au3 au3Var = vy5.B0;
                au3Var.getClass();
                gm1 gm1Var = fm1Var.i;
                byte[] bArr = (byte[]) linkedHashMap.get(v15Var);
                if (bArr != null) {
                    collectionN0 = w27.n0(w27.h0(new em1(au3Var, new ByteArrayInputStream(bArr), gm1Var, b2)));
                }
                ArrayList arrayList = new ArrayList(collectionN0.size());
                for (vy5 vy5Var : collectionN0) {
                    ys4 ys4Var = (ys4) gm1Var.b.k0;
                    vy5Var.getClass();
                    jm1 jm1VarF = ys4Var.f(vy5Var);
                    if (!gm1Var.r(jm1VarF)) {
                        jm1VarF = null;
                    }
                    if (jm1VarF != null) {
                        arrayList.add(jm1VarF);
                    }
                }
                gm1Var.j(v15Var, arrayList);
                return ys0.m(arrayList);
            case 1:
                v15 v15Var2 = (v15) obj;
                v15Var2.getClass();
                LinkedHashMap linkedHashMap2 = fm1Var.b;
                au3 au3Var2 = cz5.H0;
                au3Var2.getClass();
                gm1 gm1Var2 = fm1Var.i;
                byte[] bArr2 = (byte[]) linkedHashMap2.get(v15Var2);
                if (bArr2 != null) {
                    collectionN0 = w27.n0(w27.h0(new em1(au3Var2, new ByteArrayInputStream(bArr2), gm1Var2, b2)));
                }
                ArrayList arrayList2 = new ArrayList(collectionN0.size());
                for (cz5 cz5Var : collectionN0) {
                    ys4 ys4Var2 = (ys4) gm1Var2.b.k0;
                    cz5Var.getClass();
                    arrayList2.add(ys4Var2.g(cz5Var, false));
                }
                gm1Var2.k(v15Var2, arrayList2);
                return ys0.m(arrayList2);
            default:
                v15 v15Var3 = (v15) obj;
                v15Var3.getClass();
                jl1 jl1Var = fm1Var.i.b;
                byte[] bArr3 = (byte[]) fm1Var.c.get(v15Var3);
                if (bArr3 == null) {
                    return null;
                }
                pz5 pz5Var = (pz5) pz5.s0.a(new ByteArrayInputStream(bArr3), ((hl1) jl1Var.X).p);
                if (pz5Var == null) {
                    return null;
                }
                ys4 ys4Var3 = (ys4) jl1Var.k0;
                jl1 jl1Var2 = ys4Var3.a;
                w15 w15Var = (w15) jl1Var2.Y;
                ux4 ux4Var = (ux4) jl1Var2.f0;
                List<cy5> list = pz5Var.m0;
                list.getClass();
                ArrayList arrayList3 = new ArrayList(xv0.Z(list, 10));
                for (cy5 cy5Var : list) {
                    dq dqVar = ys4Var3.b;
                    cy5Var.getClass();
                    arrayList3.add(dqVar.m(cy5Var, w15Var));
                }
                sm vmVar = arrayList3.isEmpty() ? oy1.f0 : new vm(arrayList3, (byte) 0);
                b06 b06Var = (b06) md2.d.e(pz5Var.f0);
                switch (b06Var == null ? -1 : i06.b[b06Var.ordinal()]) {
                    case 1:
                        fl1Var = gl1.d;
                        fl1Var.getClass();
                        break;
                    case 2:
                        fl1Var = gl1.a;
                        fl1Var.getClass();
                        break;
                    case 3:
                        fl1Var = gl1.b;
                        fl1Var.getClass();
                        break;
                    case 4:
                        fl1Var = gl1.c;
                        fl1Var.getClass();
                        break;
                    case 5:
                        fl1Var = gl1.e;
                        fl1Var.getClass();
                        break;
                    case 6:
                        fl1Var = gl1.f;
                        fl1Var.getClass();
                        break;
                    default:
                        fl1Var = gl1.a;
                        fl1Var.getClass();
                        break;
                }
                km1 km1Var = new km1(((hl1) jl1Var2.X).a, (ed1) jl1Var2.Z, vmVar, u70.S(w15Var, pz5Var.g0), fl1Var, pz5Var, (w15) jl1Var2.Y, ux4Var, (dv8) jl1Var2.g0, (xl1) jl1Var2.i0);
                List list2 = pz5Var.h0;
                list2.getClass();
                fc8 fc8Var = (fc8) jl1Var2.a(km1Var, list2, (w15) jl1Var2.Y, (ux4) jl1Var2.f0, (dv8) jl1Var2.g0, (s50) jl1Var2.h0).j0;
                km1Var.K0(fc8Var.b(), fc8Var.e(vr3.i0(pz5Var, ux4Var), false), fc8Var.e(vr3.v(pz5Var, ux4Var), false));
                return km1Var;
        }
    }
}
