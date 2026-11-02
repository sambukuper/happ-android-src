package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k01 implements cq7 {
    public final /* synthetic */ byte X;
    public volatile boolean Y;
    public AbstractCollection Z;

    public /* synthetic */ k01(byte b) {
        this.X = b;
    }

    @Override // defpackage.cq7
    public final boolean a() {
        switch (this.X) {
            case 0:
                break;
        }
        return this.Y;
    }

    public void b(cq7 cq7Var) {
        if (cq7Var.a()) {
            return;
        }
        if (!this.Y) {
            synchronized (this) {
                try {
                    if (!this.Y) {
                        LinkedList linkedList = (LinkedList) this.Z;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.Z = linkedList;
                        }
                        linkedList.add(cq7Var);
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        cq7Var.c();
    }

    @Override // defpackage.cq7
    public final void c() {
        ArrayList arrayList = null;
        switch (this.X) {
            case 0:
                if (this.Y) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (!this.Y) {
                            this.Y = true;
                            HashSet hashSet = (HashSet) this.Z;
                            this.Z = null;
                            if (hashSet != null) {
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    try {
                                        ((cq7) it.next()).c();
                                    } catch (Throwable th) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(th);
                                    }
                                }
                                vr3.b0(arrayList);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                if (this.Y) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (!this.Y) {
                            this.Y = true;
                            LinkedList linkedList = (LinkedList) this.Z;
                            this.Z = null;
                            if (linkedList != null) {
                                Iterator it2 = linkedList.iterator();
                                while (it2.hasNext()) {
                                    try {
                                        ((cq7) it2.next()).c();
                                    } catch (Throwable th3) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(th3);
                                    }
                                }
                                vr3.b0(arrayList);
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
        }
    }
}
