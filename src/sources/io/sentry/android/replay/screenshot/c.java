package io.sentry.android.replay.screenshot;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ i Y;

    public /* synthetic */ c(i iVar, byte b) {
        this.X = b;
        this.Y = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        i iVar = this.Y;
        switch (b) {
            case 0:
                if (!iVar.g.isRecycled()) {
                    synchronized (iVar.g) {
                        if (!iVar.g.isRecycled()) {
                            iVar.g.recycle();
                        }
                        break;
                    }
                }
                iVar.j.close();
                return;
            default:
                try {
                    iVar.a.u0(iVar.g);
                    return;
                } finally {
                    iVar.h();
                }
        }
    }
}
