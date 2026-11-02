package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l44 implements dn2 {
    public final /* synthetic */ byte X;
    public final m44 Y;

    public /* synthetic */ l44(m44 m44Var, byte b) {
        this.X = b;
        this.Y = m44Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        byte b = this.X;
        m44 m44Var = this.Y;
        switch (b) {
            case 0:
                return ia6.a(zc1.M(zc1.K(m44Var.b.a))).a();
            case 1:
                fk2 fk2VarD = m44Var.d();
                ja6 ja6Var = m44Var.b;
                z47 z47Var = m44Var.a;
                if (fk2VarD == null) {
                    return u32.c(s32.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, ja6Var.toString());
                }
                c6 c6Var = (c6) z47Var.Y;
                zz3 zz3Var = ((wx4) c6Var.n0).h0;
                zz3Var.getClass();
                String str = ll3.a;
                qs0 qs0VarG = ll3.g(fk2VarD);
                sx4 sx4VarJ = qs0VarG != null ? zz3Var.j(qs0VarG.a()) : null;
                if (sx4VarJ == null) {
                    ta6 ta6Var = new ta6(zc1.M(zc1.K(ja6Var.a)));
                    q02 q02Var = (q02) ((lr5) c6Var.l0).Y;
                    if (q02Var == null) {
                        dh3.T("resolver");
                        throw null;
                    }
                    sx4VarJ = q02Var.R(ta6Var);
                    if (sx4VarJ == null) {
                        sx4VarJ = oc.o((wx4) c6Var.n0, new qs0(fk2VarD.b(), fk2VarD.a.g()), ((zl1) c6Var.j0).c().l);
                    }
                }
                return sx4VarJ.X();
            default:
                ArrayList<ka6> arrayListB = m44Var.b.b();
                ArrayList arrayList = new ArrayList();
                for (ka6 ka6Var : arrayListB) {
                    v15 v15Var = ka6Var.a;
                    if (v15Var == null) {
                        v15Var = ks3.b;
                    }
                    s21 s21VarA = m44Var.a(ka6Var);
                    qg5 qg5Var = s21VarA != null ? new qg5(v15Var, s21VarA) : null;
                    if (qg5Var != null) {
                        arrayList.add(qg5Var);
                    }
                }
                return zp4.P(arrayList);
        }
    }
}
