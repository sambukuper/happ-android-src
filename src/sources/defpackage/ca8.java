package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface ca8 {
    default void b(cd1 cd1Var) {
        e(cd1Var != null ? Integer.valueOf(cd1Var.a(9)) : null);
    }

    a9 c();

    void d(Integer num);

    void e(Integer num);

    Integer g();

    void h(Integer num);

    default cd1 k() {
        Integer numL = l();
        if (numL != null) {
            return new cd1(numL.intValue(), 9);
        }
        return null;
    }

    Integer l();

    Integer m();

    void p(a9 a9Var);

    void u(Integer num);

    Integer v();

    Integer w();

    void x(Integer num);
}
