package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ie0 extends ne0 {
    public final boolean e;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public ie0(Field field, boolean z, boolean z2) {
        Class cls = Void.TYPE;
        cls.getClass();
        super(field, cls, z2 ? new Type[]{field.getDeclaringClass(), field.getGenericType()} : new Type[]{field.getGenericType()});
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.wd0
    public Object d(Object[] objArr) throws IllegalAccessException {
        f(objArr);
        ((Field) this.c).set(this.f ? eu.r0(objArr) : null, eu.y0(objArr));
        return dn8.a;
    }

    @Override // defpackage.ne0
    public void f(Object[] objArr) {
        e(objArr.length);
        if (this.e && eu.y0(objArr) == null) {
            bt.q("null is not allowed as a value for this property.");
        }
    }
}
