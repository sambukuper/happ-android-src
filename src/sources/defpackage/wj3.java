package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wj3 {
    public static final Map a = zp4.J(new qg5("PACKAGE", EnumSet.noneOf(s14.class)), new qg5("TYPE", EnumSet.of(s14.Z, s14.q0)), new qg5("ANNOTATION_TYPE", EnumSet.of(s14.f0)), new qg5("TYPE_PARAMETER", EnumSet.of(s14.g0)), new qg5("FIELD", EnumSet.of(s14.i0)), new qg5("LOCAL_VARIABLE", EnumSet.of(s14.j0)), new qg5("PARAMETER", EnumSet.of(s14.k0)), new qg5("CONSTRUCTOR", EnumSet.of(s14.l0)), new qg5("METHOD", EnumSet.of(s14.m0, s14.n0, s14.o0)), new qg5("TYPE_USE", EnumSet.of(s14.p0)));
    public static final Map b = zp4.J(new qg5("RUNTIME", r14.X), new qg5("CLASS", r14.Y), new qg5("SOURCE", r14.Z));

    public static du a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ya6) {
                arrayList.add(obj);
            }
        }
        ArrayList<s14> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) a.get(v15.e(((ya6) it.next()).b.name()).b());
            if (iterable == null) {
                iterable = m02.X;
            }
            bw0.d0(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(xv0.Z(arrayList2, 10));
        for (s14 s14Var : arrayList2) {
            fk2 fk2Var = tg7.u;
            fk2Var.getClass();
            arrayList3.add(new x22(new qs0(fk2Var.b(), fk2Var.a.g()), v15.e(s14Var.name())));
        }
        return new du(arrayList3, cl1.n0);
    }
}
