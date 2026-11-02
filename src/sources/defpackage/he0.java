package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class he0 extends ie0 {
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ he0(Field field, boolean z, boolean z2, byte b) {
        super(field, z, z2);
        this.g = b;
    }

    @Override // defpackage.ie0, defpackage.ne0
    public void f(Object[] objArr) {
        switch (this.g) {
            case 1:
                super.f(objArr);
                g(objArr.length == 0 ? null : objArr[0]);
                break;
            default:
                super.f(objArr);
                break;
        }
    }
}
