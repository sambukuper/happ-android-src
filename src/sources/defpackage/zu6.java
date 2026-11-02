package defpackage;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zu6 implements Runnable {
    public final /* synthetic */ byte X;
    public final Runnable Y;

    public /* synthetic */ zu6(Runnable runnable, byte b) {
        this.X = b;
        this.Y = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        Runnable runnable = this.Y;
        switch (b) {
            case 0:
                try {
                    runnable.run();
                } catch (Exception unused) {
                    mb6.F("Executor");
                    return;
                }
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            default:
                Process.setThreadPriority(0);
                runnable.run();
                break;
        }
    }

    public String toString() {
        switch (this.X) {
            case 1:
                return this.Y.toString();
            default:
                return super.toString();
        }
    }
}
