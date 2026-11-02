package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cv6 extends aq7 {
    public final m5 g0;
    public boolean h0;

    public cv6(m5 m5Var) {
        super(m5Var, true);
        this.g0 = m5Var;
    }

    @Override // defpackage.u85
    public final void b() {
        if (this.h0) {
            return;
        }
        this.h0 = true;
        try {
            c();
        } catch (Throwable th) {
            jr6.b(th);
            throw new jo8(th.getMessage(), th);
        }
    }

    @Override // defpackage.u85
    public final void onError(Throwable th) {
        vr3.c0(th);
        if (this.h0) {
            return;
        }
        this.h0 = true;
        mr6.c.a().getClass();
        try {
            this.g0.onError(th);
            try {
                c();
            } catch (Throwable th2) {
                jr6.b(th2);
                throw new ja5(th2.getMessage(), th2);
            }
        } catch (ka5 e) {
            try {
                c();
                throw e;
            } catch (Throwable th3) {
                jr6.b(th3);
                throw new ka5("Observer.onError not implemented and error while unsubscribing.", new g01(Arrays.asList(th, th3)));
            }
        } catch (Throwable th4) {
            jr6.b(th4);
            try {
                c();
                throw new ja5("Error occurred when trying to propagate error to Observer.onError", new g01(Arrays.asList(th, th4)));
            } catch (Throwable th5) {
                jr6.b(th5);
                throw new ja5("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new g01(Arrays.asList(th, th4, th5)));
            }
        }
    }

    @Override // defpackage.u85
    public final void onNext(Object obj) {
        try {
            if (this.h0) {
                return;
            }
            this.g0.onNext(obj);
        } catch (Throwable th) {
            vr3.d0(th, this);
        }
    }
}
