package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class le0 extends ee0 implements y70 {
    public final boolean f;
    public final Object g;

    /* JADX WARN: Illegal instructions before constructor call */
    public le0(Method method, boolean z, Object obj) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : eu.k0(genericParameterTypes, 1, genericParameterTypes.length)));
        this.f = z;
        this.g = obj;
    }

    @Override // defpackage.ee0, defpackage.wd0
    public final Object d(Object[] objArr) {
        e(objArr.length);
        ps psVar = new ps(2);
        psVar.b(this.g);
        psVar.c(objArr);
        ArrayList arrayList = psVar.b;
        return h(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
