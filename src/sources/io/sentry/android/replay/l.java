package io.sentry.android.replay;

import defpackage.bw0;
import defpackage.da2;
import defpackage.dt7;
import defpackage.ea6;
import defpackage.fm7;
import defpackage.iq0;
import defpackage.oc;
import defpackage.t21;
import defpackage.u15;
import defpackage.vz7;
import defpackage.wv0;
import io.sentry.s5;
import io.sentry.s6;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Closeable {
    public final s6 X;
    public final io.sentry.protocol.w Y;
    public final AtomicBoolean Z;
    public final io.sentry.util.a f0;
    public final io.sentry.util.a g0;
    public io.sentry.android.core.d h0;
    public final vz7 i0;
    public final ArrayList j0;
    public final LinkedHashMap k0;
    public final vz7 l0;

    public l(s6 s6Var, io.sentry.protocol.w wVar) {
        s6Var.getClass();
        wVar.getClass();
        this.X = s6Var;
        this.Y = wVar;
        this.Z = new AtomicBoolean(false);
        this.f0 = new io.sentry.util.a();
        this.g0 = new io.sentry.util.a();
        this.i0 = new vz7(new j(this, (byte) 1));
        this.j0 = new ArrayList();
        this.k0 = new LinkedHashMap();
        this.l0 = new vz7(new j(this, (byte) 0));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicBoolean atomicBoolean = this.Z;
        try {
            io.sentry.android.core.d dVar = this.h0;
            if (dVar != null) {
                dVar.f();
            }
            this.h0 = null;
        } finally {
            atomicBoolean.set(true);
        }
    }

    public final void g(File file, long j, String str) {
        m mVar = new m(file, j, str);
        io.sentry.util.a aVar = this.g0;
        aVar.g();
        try {
            this.j0.add(mVar);
            u15.h(aVar, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u15.h(aVar, th);
                throw th2;
            }
        }
    }

    public final void k(File file) {
        s6 s6Var = this.X;
        try {
            if (file.delete()) {
                return;
            }
            s6Var.getLogger().h(s5.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            s6Var.getLogger().d(s5.ERROR, th, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    public final File m() {
        return (File) this.i0.getValue();
    }

    public final void p(String str, String str2) {
        File file;
        File file2;
        vz7 vz7Var = this.l0;
        LinkedHashMap linkedHashMap = this.k0;
        io.sentry.util.a aVar = this.f0;
        aVar.g();
        try {
            if (this.Z.get()) {
                u15.h(aVar, null);
                return;
            }
            File file3 = (File) vz7Var.getValue();
            if ((file3 == null || !file3.exists()) && (file = (File) vz7Var.getValue()) != null) {
                file.createNewFile();
            }
            if (linkedHashMap.isEmpty() && (file2 = (File) vz7Var.getValue()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), iq0.a), 8192);
                try {
                    Iterator it = ((t21) dt7.c(bufferedReader)).iterator();
                    while (it.hasNext()) {
                        List listF0 = fm7.F0((String) it.next(), new String[]{"="}, 2);
                        linkedHashMap.put((String) listF0.get(0), (String) listF0.get(1));
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        oc.h(bufferedReader, th);
                        throw th2;
                    }
                }
            }
            if (str2 == null) {
                linkedHashMap.remove(str);
            } else {
                linkedHashMap.put(str, str2);
            }
            File file4 = (File) vz7Var.getValue();
            if (file4 != null) {
                Set setEntrySet = linkedHashMap.entrySet();
                setEntrySet.getClass();
                da2.T(file4, wv0.y0(setEntrySet, "\n", null, null, c.f0, 30));
            }
            u15.h(aVar, null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                u15.h(aVar, th3);
                throw th4;
            }
        }
    }

    public final String u(long j) {
        ea6 ea6Var = new ea6();
        io.sentry.util.a aVar = this.g0;
        aVar.g();
        try {
            bw0.h0(this.j0, new k(j, this, ea6Var, (byte) 0));
            u15.h(aVar, null);
            return (String) ea6Var.X;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u15.h(aVar, th);
                throw th2;
            }
        }
    }
}
