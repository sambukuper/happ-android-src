package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xd0 extends ne0 implements y70 {
    public final Object e;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public xd0(Constructor constructor, Object obj, boolean z) {
        Class declaringClass = constructor.getDeclaringClass();
        declaringClass.getClass();
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        genericParameterTypes.getClass();
        int i = z ? 2 : 1;
        super(constructor, declaringClass, (Type[]) (genericParameterTypes.length <= i + 1 ? new Type[0] : eu.k0(genericParameterTypes, 1, genericParameterTypes.length - i)));
        this.e = obj;
        this.f = z;
    }

    @Override // defpackage.wd0
    public final Object d(Object[] objArr) {
        e(objArr.length);
        Object obj = this.e;
        boolean z = this.f;
        Member member = this.c;
        if (!z) {
            ps psVar = new ps(3);
            psVar.b(obj);
            psVar.c(objArr);
            psVar.b(null);
            ArrayList arrayList = psVar.b;
            return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
        ps psVar2 = new ps(4);
        psVar2.b(obj);
        psVar2.c(objArr);
        psVar2.b(null);
        psVar2.b(null);
        ArrayList arrayList2 = psVar2.b;
        return ((Constructor) member).newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
    }
}
