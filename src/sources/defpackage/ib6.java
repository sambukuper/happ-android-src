package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collection;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ib6 extends xa6 implements vj3 {
    public final gb6 a;
    public final Annotation[] b;
    public final String c;
    public final boolean d;

    public ib6(gb6 gb6Var, Annotation[] annotationArr, String str, boolean z) {
        annotationArr.getClass();
        this.a = gb6Var;
        this.b = annotationArr;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.vj3
    public final ja6 a(fk2 fk2Var) {
        fk2Var.getClass();
        return ys0.s(this.b, fk2Var);
    }

    @Override // defpackage.vj3
    public final Collection getAnnotations() {
        return ys0.u(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(ib6.class.getName());
        sb.append(": ");
        sb.append(this.d ? "vararg " : _UrlKt.FRAGMENT_ENCODE_SET);
        String str = this.c;
        sb.append(str != null ? v15.d(str) : null);
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }
}
