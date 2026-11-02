package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m5 extends aq7 {
    public final /* synthetic */ byte g0 = 1;
    public final Object h0;

    public m5(aq7 aq7Var) {
        super(aq7Var, true);
        this.h0 = new q37(aq7Var);
    }

    @Override // defpackage.u85
    public final void b() {
        byte b = this.g0;
        Object obj = this.h0;
        switch (b) {
            case 0:
                break;
            case 1:
                ((q37) obj).b();
                break;
            default:
                ((aq7) obj).b();
                break;
        }
    }

    @Override // defpackage.u85
    public final void onError(Throwable th) {
        byte b = this.g0;
        Object obj = this.h0;
        switch (b) {
            case 0:
                String message = th != null ? th.getMessage() : null;
                if (th == null) {
                    th = new NullPointerException();
                }
                throw new ka5(message, th);
            case 1:
                ((q37) obj).onError(th);
                return;
            default:
                ((aq7) obj).onError(th);
                return;
        }
    }

    @Override // defpackage.u85
    public final void onNext(Object obj) {
        byte b = this.g0;
        Object obj2 = this.h0;
        switch (b) {
            case 0:
                ((w4) obj2).mo8a(obj);
                break;
            case 1:
                ((q37) obj2).onNext(obj);
                break;
            default:
                ((aq7) obj2).onNext(obj);
                break;
        }
    }

    public m5(w4 w4Var) {
        this.h0 = w4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(aq7 aq7Var, aq7 aq7Var2) {
        super(aq7Var, true);
        this.h0 = aq7Var2;
    }

    private final void g() {
    }
}
