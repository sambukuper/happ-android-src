package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w16 extends AtomicReference implements o85, u85 {
    public static final v16[] Y = new v16[0];
    public static final v16[] Z = new v16[0];
    public Throwable X;

    @Override // defpackage.w4
    /* JADX INFO: renamed from: a */
    public final void mo8a(Object obj) {
        v16[] v16VarArr;
        v16[] v16VarArr2;
        aq7 aq7Var = (aq7) obj;
        v16 v16Var = new v16(this, aq7Var);
        aq7Var.X.b(v16Var);
        aq7Var.f(v16Var);
        do {
            v16VarArr = (v16[]) get();
            if (v16VarArr == Z) {
                Throwable th = this.X;
                if (th != null) {
                    aq7Var.onError(th);
                    return;
                } else {
                    aq7Var.b();
                    return;
                }
            }
            int length = v16VarArr.length;
            v16VarArr2 = new v16[length + 1];
            System.arraycopy(v16VarArr, 0, v16VarArr2, 0, length);
            v16VarArr2[length] = v16Var;
        } while (!compareAndSet(v16VarArr, v16VarArr2));
        if (v16Var.a()) {
            c(v16Var);
        }
    }

    @Override // defpackage.u85
    public final void b() {
        for (v16 v16Var : (v16[]) getAndSet(Z)) {
            v16Var.b();
        }
    }

    public final void c(v16 v16Var) {
        v16[] v16VarArr;
        v16[] v16VarArr2;
        do {
            v16VarArr = (v16[]) get();
            if (v16VarArr == Z || v16VarArr == (v16VarArr2 = Y)) {
                return;
            }
            int length = v16VarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (v16VarArr[i] == v16Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                v16VarArr2 = new v16[length - 1];
                System.arraycopy(v16VarArr, 0, v16VarArr2, 0, i);
                System.arraycopy(v16VarArr, i + 1, v16VarArr2, i, (length - i) - 1);
            }
        } while (!compareAndSet(v16VarArr, v16VarArr2));
    }

    @Override // defpackage.u85
    public final void onError(Throwable th) {
        this.X = th;
        ArrayList arrayList = null;
        for (v16 v16Var : (v16[]) getAndSet(Z)) {
            try {
                v16Var.onError(th);
            } catch (Throwable th2) {
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                }
                arrayList.add(th2);
            }
        }
        vr3.b0(arrayList);
    }

    @Override // defpackage.u85
    public final void onNext(Object obj) {
        for (v16 v16Var : (v16[]) get()) {
            v16Var.onNext(obj);
        }
    }
}
