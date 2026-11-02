package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i01 extends kx8 {
    public final /* synthetic */ byte a;
    public final Object b;

    public i01() {
        this.a = (byte) 0;
        this.b = new ArrayList(3);
    }

    @Override // defpackage.kx8
    public void a(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                try {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((kx8) it.next()).a(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 1:
                ((vl2) obj).b(false);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.kx8
    public void b(int i, float f, int i2) {
        switch (this.a) {
            case 0:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((kx8) it.next()).b(i, f, i2);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            default:
                return;
        }
    }

    @Override // defpackage.kx8
    public final void c(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                try {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((kx8) it.next()).c(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 1:
                ((vl2) obj).b(false);
                return;
            default:
                wk2 wk2Var = ((ok7) obj).t1;
                if (wk2Var != null) {
                    wk2Var.s0.setCurrentStory(i);
                    return;
                } else {
                    dh3.T("binding");
                    throw null;
                }
        }
    }

    public /* synthetic */ i01(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
