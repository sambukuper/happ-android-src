package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ej1 extends lb6 {
    public final tb6 Y;
    public final tb6 Z;
    public final tb6 f0;
    public final tb6 g0;
    public final tb6 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej1(yu3 yu3Var) {
        super(yu3Var);
        yu3Var.getClass();
        this.Y = zc1.X(null, new cj1(this, (byte) 0));
        this.Z = zc1.X(null, new cj1(this, (byte) 1));
        this.f0 = zc1.X(null, new cj1(this, (byte) 2));
        this.g0 = zc1.X(null, new cj1(this, (byte) 3));
        this.h0 = zc1.X(null, new c3((Object) this, (Object) yu3Var, (byte) 8));
    }

    @Override // defpackage.wu3
    public final List Q() {
        Object objInvoke = this.Y.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // defpackage.kb6
    public final boolean R() {
        return dh3.f(V().e(), ek3.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    public final ArrayList T(boolean z) {
        qg5 qg5Var;
        Collection collection;
        ld0 ld0VarV = V();
        ArrayList arrayList = new ArrayList();
        byte b = 1;
        if (z) {
            i44 i44VarH = ms8.h(this);
            if (i44VarH != null) {
                arrayList.add(new qj1(this, arrayList.size(), fw3.X, new dj1(i44VarH, (byte) 0)));
            }
            if (ld0VarV instanceof jm1) {
                jm1 jm1Var = (jm1) ld0VarV;
                qg5Var = new qg5(jm1Var.I0, jm1Var.H0.q0);
            } else if (ld0VarV instanceof im1) {
                im1 im1Var = (im1) ld0VarV;
                qg5Var = new qg5(im1Var.F0, im1Var.E0.q0);
            } else if (ld0VarV instanceof cx5) {
                fx5 fx5Var = ((cx5) ld0VarV).l0;
                im1 im1Var2 = fx5Var instanceof im1 ? (im1) fx5Var : null;
                if (im1Var2 != null) {
                    qg5Var = new qg5(im1Var2.F0, im1Var2.E0.q0);
                } else {
                    qg5Var = null;
                }
            } else {
                qg5Var = null;
            }
            if (qg5Var == null) {
                collection = d02.X;
            } else {
                w15 w15Var = (w15) qg5Var.X;
                List list = (List) qg5Var.Y;
                List listY = ld0VarV.Y();
                listY.getClass();
                ArrayList arrayList2 = new ArrayList(xv0.Z(listY, 10));
                int i = 0;
                for (Object obj : listY) {
                    int i2 = i + 1;
                    if (i < 0) {
                        i21.X();
                        throw null;
                    }
                    i44 i44Var = (i44) obj;
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(new ot8(ld0VarV, null, i, i44Var.getAnnotations(), v15.d(w15Var.getString(((vz5) list.get(i)).g0)), i44Var.c(), false, false, false, null, ke7.G));
                    arrayList2 = arrayList3;
                    i = i2;
                    w15Var = w15Var;
                    list = list;
                }
                collection = arrayList2;
            }
            int size = collection.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(new qj1(this, arrayList.size(), fw3.Y, new y51(collection, i3, b)));
            }
            i44 i44VarS = ld0VarV.S();
            if (i44VarS != null) {
                arrayList.add(new qj1(this, arrayList.size(), fw3.Z, new dj1(i44VarS, (byte) 1)));
            }
        }
        int size2 = ld0VarV.L().size();
        for (int i4 = 0; i4 < size2; i4++) {
            arrayList.add(new qj1(this, arrayList.size(), fw3.f0, new y51(ld0VarV, i4, (byte) 2)));
        }
        if (mb6.J(this) && (ld0VarV instanceof xj3) && arrayList.size() > 1) {
            aw0.c0(arrayList, new l71((byte) 15));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public abstract kk1 U();

    public abstract ld0 V();

    @Override // defpackage.xu3
    public final zw3 e() {
        fl1 fl1VarE = V().e();
        fl1VarE.getClass();
        fk2 fk2Var = ms8.a;
        if (fl1VarE.equals(gl1.e)) {
            return zw3.X;
        }
        if (fl1VarE.equals(gl1.c)) {
            return zw3.Y;
        }
        if (fl1VarE.equals(gl1.d)) {
            return zw3.Z;
        }
        if (fl1VarE.equals(gl1.a) || fl1VarE.equals(gl1.b)) {
            return zw3.f0;
        }
        return null;
    }

    @Override // defpackage.xu3
    public final List g() {
        Object objInvoke = this.f0.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // defpackage.xu3, defpackage.sw3
    public final List getTypeParameters() {
        Object objInvoke = this.h0.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // defpackage.xu3
    public final pw3 j() {
        Object objInvoke = this.g0.invoke();
        objInvoke.getClass();
        return (pw3) objInvoke;
    }

    @Override // defpackage.lb6, defpackage.kb6
    public final List l() {
        Object objInvoke = this.Z.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // defpackage.kb6
    public final ex4 m() {
        ex4 ex4Var = this.X.b;
        if (ex4Var != null) {
            return ex4Var;
        }
        fx4 fx4VarM = V().m();
        fx4VarM.getClass();
        int iOrdinal = fx4VarM.ordinal();
        if (iOrdinal == 0) {
            return ex4.FINAL;
        }
        if (iOrdinal == 1) {
            return ex4.SEALED;
        }
        if (iOrdinal == 2) {
            return ex4.OPEN;
        }
        if (iOrdinal == 3) {
            return ex4.ABSTRACT;
        }
        b61.c();
        return null;
    }
}
