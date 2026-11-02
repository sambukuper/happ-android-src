package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class be0 extends ee0 implements y70 {
    public final Object f;

    public be0(Field field, Object obj) {
        super(field, false);
        this.f = obj;
    }

    @Override // defpackage.ee0, defpackage.wd0
    public final Object d(Object[] objArr) {
        e(objArr.length);
        return ((Field) this.c).get(this.f);
    }
}
