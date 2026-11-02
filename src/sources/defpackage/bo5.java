package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bo5 implements r85 {
    public final Object X;
    public final CopyOnWriteArrayList Y;
    public List Z;
    public Throwable f0;
    public boolean g0;
    public final xe2 h0;
    public final m51 i0;
    public final AtomicBoolean j0;
    public og7 k0;
    public final CameraManager l0;

    public bo5(f76 f76Var, m51 m51Var, List list, Context context) {
        f76Var.getClass();
        this.X = new Object();
        this.Y = new CopyOnWriteArrayList();
        this.f0 = null;
        this.g0 = false;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            str.getClass();
            arrayList.add(z68.v(str, null, null));
        }
        this.Z = arrayList;
        this.h0 = f76Var;
        this.i0 = m51Var;
        this.j0 = new AtomicBoolean(false);
        Object systemService = context.getSystemService("camera");
        systemService.getClass();
        this.l0 = (CameraManager) systemService;
    }

    public final xb4 a() {
        qd0 qd0Var = new qd0();
        qd0Var.c = new if6();
        ud0 ud0Var = new ud0(qd0Var);
        qd0Var.b = ud0Var;
        qd0Var.a = p61.class;
        try {
            w51.G(this.i0, null, null, new k(this, qd0Var, null, (byte) 26), 3);
            qd0Var.a = "FetchData for PipeCameraPresence0";
            return ud0Var;
        } catch (Exception e) {
            ud0Var.b(e);
            return ud0Var;
        }
    }

    public final void b() {
        if (this.j0.compareAndSet(false, true)) {
            og7 og7Var = this.k0;
            q51 q51Var = null;
            if (og7Var != null) {
                og7Var.m(null);
            }
            aa6 aa6Var = new aa6();
            aa6Var.X = true;
            this.k0 = w51.G(this.i0, null, null, new r5((Object) new lf2(new sf2(new o(this.h0, (byte) 21), new qk4((Object) this, (Object) aa6Var, q51Var, (byte) 10), (byte) 2), new dl4(this, null), (byte) 2), q51Var, (byte) 12), 3);
        }
    }

    @Override // defpackage.r85
    public final void c(Executor executor, n85 n85Var) {
        List listUnmodifiableList;
        Throwable th;
        executor.getClass();
        this.Y.add(new k0(executor, n85Var));
        synchronized (this.X) {
            try {
                if (!this.g0 && !this.Y.isEmpty()) {
                    this.g0 = true;
                    b();
                }
                listUnmodifiableList = Collections.unmodifiableList(this.Z);
                th = this.f0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        executor.execute(new j0((Object) th, (Object) new k0(executor, n85Var), (Object) listUnmodifiableList, (byte) 0));
    }

    public final void d(List list, Throwable th) {
        boolean z;
        byte b;
        List listUnmodifiableList;
        Throwable th2;
        synchronized (this.X) {
            z = true;
            b = 0;
            try {
                if (th != null) {
                    if (this.f0 != null && this.Z.isEmpty()) {
                        z = false;
                    }
                    this.f0 = th;
                    list = Collections.EMPTY_LIST;
                    this.Z = list;
                } else {
                    list.getClass();
                    if (this.f0 == null && this.Z.equals(list)) {
                        z = false;
                    }
                    this.f0 = null;
                    this.Z = list;
                }
                listUnmodifiableList = Collections.unmodifiableList(list);
                th2 = this.f0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z) {
            this.Y.size();
            for (k0 k0Var : this.Y) {
                k0Var.a.execute(new j0(th2, k0Var, listUnmodifiableList, b));
            }
        }
    }

    @Override // defpackage.r85
    public final void i(n85 n85Var) {
        k0 k0Var;
        Iterator it = this.Y.iterator();
        do {
            if (!it.hasNext()) {
                k0Var = null;
                break;
            }
            k0Var = (k0) it.next();
        } while (!k0Var.b.equals(n85Var));
        if (k0Var != null) {
            this.Y.remove(k0Var);
        }
        synchronized (this.X) {
            try {
                if (this.g0 && this.Y.isEmpty()) {
                    this.g0 = false;
                    if (this.j0.compareAndSet(true, false)) {
                        og7 og7Var = this.k0;
                        if (og7Var != null) {
                            og7Var.m(null);
                        }
                        this.k0 = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
