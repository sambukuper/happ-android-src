package io.sentry.android.replay.capture;

import defpackage.nw3;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final /* synthetic */ byte a;
    public final AtomicReference b;
    public final /* synthetic */ c c;
    public final /* synthetic */ c d;

    public a(c cVar, c cVar2, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.c = cVar;
                this.d = cVar2;
                this.b = new AtomicReference(null);
                break;
            case 3:
                Boolean bool = Boolean.FALSE;
                this.c = cVar;
                this.d = cVar2;
                this.b = new AtomicReference(bool);
                break;
            case 4:
                this.c = cVar;
                this.d = cVar2;
                this.b = new AtomicReference(null);
                break;
            case 5:
                this.c = cVar;
                this.d = cVar2;
                this.b = new AtomicReference(null);
                break;
            case 6:
                this.c = cVar;
                this.d = cVar2;
                this.b = new AtomicReference(null);
                break;
            default:
                this.c = cVar;
                this.d = cVar2;
                this.b = new AtomicReference(-1);
                break;
        }
    }

    public Object a(nw3 nw3Var, Object obj) {
        byte b = this.a;
        AtomicReference atomicReference = this.b;
        nw3Var.getClass();
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return atomicReference.get();
    }

    public a(Object obj, c cVar, c cVar2) {
        this.a = (byte) 0;
        this.c = cVar;
        this.d = cVar2;
        this.b = new AtomicReference(obj);
    }
}
