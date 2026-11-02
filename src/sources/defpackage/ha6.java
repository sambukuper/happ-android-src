package defpackage;

import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ha6 extends e0 {
    public static final ha6 d;

    static {
        b24 b24Var = b24.g0;
        b24Var.getClass();
        fl3 fl3Var = el3.d;
        b24 b24Var2 = fl3Var.b;
        je6 je6Var = (b24Var2 == null || b24Var2.f0 - b24Var.f0 > 0) ? fl3Var.a : fl3Var.c;
        je6Var.getClass();
        d = new ha6(new o8(new is3(je6Var, je6Var == je6.WARN ? null : je6Var), new f0(b24Var, (byte) 17)));
    }

    @Override // defpackage.e0
    public final fk2 d(Object obj) {
        Annotation annotation = (Annotation) obj;
        annotation.getClass();
        String strP = zc1.K(annotation).p();
        if (strP != null) {
            return new fk2(strP);
        }
        return null;
    }

    @Override // defpackage.e0
    public final Object e(Object obj) {
        Annotation annotation = (Annotation) obj;
        annotation.getClass();
        return zc1.K(annotation);
    }

    @Override // defpackage.e0
    public final Iterable f(Object obj) {
        ((Annotation) obj).getClass();
        return d02.X;
    }

    @Override // defpackage.e0
    public final boolean h() {
        return true;
    }
}
