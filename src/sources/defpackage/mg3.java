package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mg3 extends ne0 implements y70 {
    public final Object e;

    public mg3(Method method, Object obj) {
        super(method, d02.X);
        this.e = obj;
    }

    @Override // defpackage.wd0
    public final Object d(Object[] objArr) {
        e(objArr.length);
        return ((Method) this.c).invoke(this.e, Arrays.copyOf(objArr, objArr.length));
    }
}
