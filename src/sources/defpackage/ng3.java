package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ng3 extends ne0 {
    public ng3(Method method) {
        super(method, i21.K(method.getDeclaringClass()));
    }

    @Override // defpackage.wd0
    public final Object d(Object[] objArr) {
        e(objArr.length);
        Object obj = objArr[0];
        Object[] objArrK0 = objArr.length <= 1 ? new Object[0] : eu.k0(objArr, 1, objArr.length);
        return ((Method) this.c).invoke(obj, Arrays.copyOf(objArrK0, objArrK0.length));
    }
}
