package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vn8 extends xn8 {
    public final /* synthetic */ Method b;

    public vn8(Method method) {
        this.b = method;
    }

    @Override // defpackage.xn8
    public final Object a(Class cls) {
        String strY = mj0.y(cls);
        if (strY == null) {
            return this.b.invoke(null, cls, Object.class);
        }
        bt.g("UnsafeAllocator is used for non-instantiable type: ".concat(strY));
        return null;
    }
}
