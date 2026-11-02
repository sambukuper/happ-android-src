package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jn8 extends c75 {
    @Override // defpackage.c75, defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) throws pp3, xk7 {
        if (t37Var.X.j(n37.g0)) {
            o(t37Var, obj);
            throw null;
        }
        super.e(obj, ro3Var, t37Var);
    }

    @Override // defpackage.c75, defpackage.ar3
    public final void f(Object obj, ro3 ro3Var, t37 t37Var, ri8 ri8Var) throws pp3, xk7 {
        if (t37Var.X.j(n37.g0)) {
            o(t37Var, obj);
            throw null;
        }
        super.f(obj, ro3Var, t37Var, ri8Var);
    }

    public final void o(t37 t37Var, Object obj) {
        Class<?> cls = obj.getClass();
        boolean zA = g25.a(cls);
        Class cls2 = this.X;
        if (zA) {
            t37Var.z(cls2, "No serializer found for class " + cls.getName() + " and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS). This appears to be a native image, in which case you may need to configure reflection for the class that is to be serialized");
            throw null;
        }
        t37Var.z(cls2, "No serializer found for class " + cls.getName() + " and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)");
        throw null;
    }
}
