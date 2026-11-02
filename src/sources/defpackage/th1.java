package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class th1 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ vh1 Y;
    public final /* synthetic */ Runnable Z;
    public final /* synthetic */ wl6 f0;

    public /* synthetic */ th1(vh1 vh1Var, Runnable runnable, wl6 wl6Var, byte b) {
        this.X = b;
        this.Y = vh1Var;
        this.Z = runnable;
        this.f0 = wl6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        final wl6 wl6Var = this.f0;
        final Runnable runnable = this.Z;
        vh1 vh1Var = this.Y;
        switch (b) {
            case 0:
                final byte b2 = 0;
                vh1Var.X.execute(new Runnable() { // from class: rh1
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        byte b3 = b2;
                        wl6 wl6Var2 = wl6Var;
                        Runnable runnable2 = runnable;
                        switch (b3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((xh1) wl6Var2.Y).k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((xh1) wl6Var2.Y).k(e2);
                                    return;
                                }
                            default:
                                xh1 xh1Var = (xh1) wl6Var2.Y;
                                try {
                                    runnable2.run();
                                    xh1Var.j(null);
                                    return;
                                } catch (Exception e3) {
                                    xh1Var.k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                final byte b3 = 2;
                vh1Var.X.execute(new Runnable() { // from class: rh1
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        byte b4 = b3;
                        wl6 wl6Var2 = wl6Var;
                        Runnable runnable2 = runnable;
                        switch (b4) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((xh1) wl6Var2.Y).k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((xh1) wl6Var2.Y).k(e2);
                                    return;
                                }
                            default:
                                xh1 xh1Var = (xh1) wl6Var2.Y;
                                try {
                                    runnable2.run();
                                    xh1Var.j(null);
                                    return;
                                } catch (Exception e3) {
                                    xh1Var.k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                final byte b4 = 1;
                vh1Var.X.execute(new Runnable() { // from class: rh1
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        byte b5 = b4;
                        wl6 wl6Var2 = wl6Var;
                        Runnable runnable2 = runnable;
                        switch (b5) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((xh1) wl6Var2.Y).k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((xh1) wl6Var2.Y).k(e2);
                                    return;
                                }
                            default:
                                xh1 xh1Var = (xh1) wl6Var2.Y;
                                try {
                                    runnable2.run();
                                    xh1Var.j(null);
                                    return;
                                } catch (Exception e3) {
                                    xh1Var.k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
