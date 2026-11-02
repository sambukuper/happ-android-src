package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fe0 extends ie0 implements y70 {
    public final Object g;

    public fe0(Field field, boolean z, Object obj) {
        super(field, z, false);
        this.g = obj;
    }

    @Override // defpackage.ie0, defpackage.wd0
    public final Object d(Object[] objArr) throws IllegalAccessException {
        f(objArr);
        ((Field) this.c).set(this.g, eu.r0(objArr));
        return dn8.a;
    }
}
