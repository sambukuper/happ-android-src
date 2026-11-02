package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dt0 {
    public final String a;
    public final ArrayList b = new ArrayList();
    public final HashSet c = new HashSet();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public dt0(String str) {
        this.a = str;
    }

    public final void a(String str, e37 e37Var) {
        str.getClass();
        e37Var.getClass();
        if (!this.c.add(str)) {
            StringBuilder sbP = p61.p("Element with name '", str, "' is already registered in ");
            sbP.append(this.a);
            throw new IllegalArgumentException(sbP.toString().toString());
        }
        this.b.add(str);
        this.d.add(e37Var);
        this.e.add(d02.X);
        this.f.add(Boolean.FALSE);
    }
}
