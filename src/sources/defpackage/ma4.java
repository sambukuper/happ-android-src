package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ma4 implements Iterator, qv3 {
    public String X;
    public boolean Y;
    public final /* synthetic */ hu Z;

    public ma4(hu huVar) {
        this.Z = huVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        String line = this.X;
        if (line == null && !this.Y) {
            line = ((BufferedReader) this.Z.b).readLine();
            this.X = line;
            if (line == null) {
                this.Y = true;
            }
        }
        return line != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            bt.n();
            return null;
        }
        String str = this.X;
        this.X = null;
        str.getClass();
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
