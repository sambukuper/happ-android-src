package defpackage;

import android.os.Parcel;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q09 implements zc6, ab5, na5, ba5 {
    public final Object X;

    public /* synthetic */ q09() {
        this.X = new CountDownLatch(1);
    }

    @Override // defpackage.zc6
    public void accept(Object obj, Object obj2) {
        z18 z18Var = (z18) obj2;
        a99 a99Var = (a99) ((f89) obj).h();
        e89 e89Var = (e89) this.X;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(a99Var.h);
        int i = n89.a;
        parcelObtain.writeInt(1);
        e89Var.writeToParcel(parcelObtain, 0);
        try {
            a99Var.g.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            z18Var.a(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.ab5
    public void b(Object obj) {
        ((CountDownLatch) this.X).countDown();
    }

    @Override // defpackage.ba5
    public void c() {
        ((CountDownLatch) this.X).countDown();
    }

    @Override // defpackage.na5
    public void d(Exception exc) {
        ((CountDownLatch) this.X).countDown();
    }

    public /* synthetic */ q09(Object obj) {
        this.X = obj;
    }
}
