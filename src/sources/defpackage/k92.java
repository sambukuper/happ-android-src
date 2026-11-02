package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class k92 implements su0 {
    public final File a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public k92(File file) {
        this.a = file;
    }

    @Override // defpackage.su0
    public final void close() {
        this.b.set(true);
    }
}
