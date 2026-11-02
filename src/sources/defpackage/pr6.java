package defpackage;

import java.io.PrintStream;
import java.util.AbstractQueue;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pr6 implements cq7 {
    public static final int Y;
    public AbstractQueue X;

    static {
        int i = oo5.a ? 16 : 128;
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                i = Integer.parseInt(property);
            } catch (NumberFormatException e) {
                PrintStream printStream = System.err;
                StringBuilder sbP = p61.p("Failed to set 'rx.buffer.size' with value ", property, " => ");
                sbP.append(e.getMessage());
                printStream.println(sbP.toString());
            }
        }
        Y = i;
    }

    @Override // defpackage.cq7
    public final boolean a() {
        return this.X == null;
    }

    public final void b(Object obj) throws aw4 {
        boolean z;
        boolean z2;
        synchronized (this) {
            try {
                AbstractQueue abstractQueue = this.X;
                z = true;
                z2 = false;
                if (abstractQueue != null) {
                    z = false;
                    z2 = !abstractQueue.offer(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            bt.i("This instance has been unsubscribed and the queue is no longer usable.");
        } else if (z2) {
            throw new aw4();
        }
    }

    @Override // defpackage.cq7
    public final void c() {
        synchronized (this) {
        }
    }
}
