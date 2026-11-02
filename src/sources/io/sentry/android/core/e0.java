package io.sentry.android.core;

import android.view.View;
import defpackage.u15;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends CopyOnWriteArrayList {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ e0(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.X) {
            case 0:
                d0 d0Var = (d0) obj;
                boolean zAdd = super.add(d0Var);
                if (Boolean.FALSE.equals(((f0) this.Y).Y.f0)) {
                    d0Var.g();
                } else if (Boolean.TRUE.equals(((f0) this.Y).Y.f0)) {
                    d0Var.k();
                }
                return zAdd;
            default:
                io.sentry.android.replay.g gVar = (io.sentry.android.replay.g) obj;
                io.sentry.android.replay.a0 a0Var = (io.sentry.android.replay.a0) this.Y;
                io.sentry.util.a aVar = a0Var.Y;
                aVar.g();
                try {
                    for (View view : a0Var.f0) {
                        if (gVar != null) {
                            gVar.g(view, true);
                        }
                    }
                    u15.h(aVar, null);
                    return super.add(gVar);
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

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.X) {
            case 1:
                if (obj == null ? true : obj instanceof io.sentry.android.replay.g) {
                    return super.contains((io.sentry.android.replay.g) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.X) {
            case 1:
                if (obj == null ? true : obj instanceof io.sentry.android.replay.g) {
                    return super.indexOf((io.sentry.android.replay.g) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.X) {
            case 1:
                if (obj == null ? true : obj instanceof io.sentry.android.replay.g) {
                    return super.lastIndexOf((io.sentry.android.replay.g) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public /* bridge */ boolean remove(Object obj) {
        switch (this.X) {
            case 1:
                if (obj == null ? true : obj instanceof io.sentry.android.replay.g) {
                    return super.remove((io.sentry.android.replay.g) obj);
                }
                return false;
            default:
                return super.remove(obj);
        }
    }
}
