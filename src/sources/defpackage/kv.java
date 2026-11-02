package defpackage;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kv extends Thread {
    public final /* synthetic */ byte X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kv(String str) {
        super(str);
        this.X = (byte) 0;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        switch (this.X) {
            case 0:
                break;
            case 1:
                Process.setThreadPriority(10);
                super.run();
                return;
            default:
                super.run();
                return;
        }
        while (true) {
            try {
                nv.Companion.getClass();
                ReentrantLock reentrantLock = nv.lock;
                reentrantLock.lock();
                try {
                    nv.Companion.getClass();
                    nv nvVarA = jv.a();
                    nv.Companion.getClass();
                    if (nvVarA == nv.idleSentinel) {
                        nv.Companion.getClass();
                        nv.idleSentinel = null;
                        reentrantLock.unlock();
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (nvVarA != null) {
                            nvVarA.timedOut();
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kv(Runnable runnable, String str, byte b) {
        super(runnable, str);
        this.X = b;
    }
}
