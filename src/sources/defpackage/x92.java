package defpackage;

import java.io.File;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x92 extends s1 {
    public final ArrayDeque Z;
    public final /* synthetic */ z92 f0;

    public x92(z92 z92Var) {
        this.f0 = z92Var;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.Z = arrayDeque;
        File file = (File) z92Var.b;
        if (file.isDirectory()) {
            arrayDeque.push(b(file));
        } else if (!file.isFile()) {
            this.X = (byte) 2;
        } else {
            file.getClass();
            arrayDeque.push(new v92(file));
        }
    }

    @Override // defpackage.s1
    public final void a() {
        File file;
        while (true) {
            ArrayDeque arrayDeque = this.Z;
            y92 y92Var = (y92) arrayDeque.peek();
            if (y92Var == null) {
                file = null;
                break;
            }
            File fileA = y92Var.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else {
                if (fileA.equals(y92Var.a) || !fileA.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    file = fileA;
                    break;
                }
                arrayDeque.push(b(fileA));
            }
        }
        if (file == null) {
            this.X = (byte) 2;
        } else {
            this.Y = file;
            this.X = (byte) 1;
        }
    }

    public final t92 b(File file) {
        int iOrdinal = ((aa2) this.f0.c).ordinal();
        if (iOrdinal == 0) {
            file.getClass();
            return new w92(file);
        }
        if (iOrdinal == 1) {
            file.getClass();
            return new u92(file);
        }
        b61.c();
        return null;
    }
}
