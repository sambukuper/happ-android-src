package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class de0 extends ee0 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ de0(Field field, boolean z, byte b) {
        super(field, z);
        this.f = b;
    }

    @Override // defpackage.ne0
    public void f(Object[] objArr) {
        switch (this.f) {
            case 1:
                e(objArr.length);
                g(objArr.length == 0 ? null : objArr[0]);
                break;
            default:
                super.f(objArr);
                break;
        }
    }
}
