package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tn8 extends xn8 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public tn8(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // defpackage.xn8
    public final Object a(Class cls) {
        String strY = mj0.y(cls);
        if (strY == null) {
            return this.b.invoke(this.c, cls);
        }
        bt.g("UnsafeAllocator is used for non-instantiable type: ".concat(strY));
        return null;
    }
}
