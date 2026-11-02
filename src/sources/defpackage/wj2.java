package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wj2 extends s92 {
    private final s92 delegate;

    public wj2(s92 s92Var) {
        s92Var.getClass();
        this.delegate = s92Var;
    }

    @Override // defpackage.s92
    public sa7 appendingSink(oi5 oi5Var, boolean z) throws IOException {
        oi5Var.getClass();
        return this.delegate.appendingSink(onPathParameter(oi5Var, "appendingSink", "file"), z);
    }

    @Override // defpackage.s92
    public void atomicMove(oi5 oi5Var, oi5 oi5Var2) throws IOException {
        oi5Var.getClass();
        oi5Var2.getClass();
        this.delegate.atomicMove(onPathParameter(oi5Var, "atomicMove", "source"), onPathParameter(oi5Var2, "atomicMove", "target"));
    }

    @Override // defpackage.s92
    public oi5 canonicalize(oi5 oi5Var) throws IOException {
        oi5Var.getClass();
        return onPathResult(this.delegate.canonicalize(onPathParameter(oi5Var, "canonicalize", "path")), "canonicalize");
    }

    @Override // defpackage.s92, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // defpackage.s92
    public void createDirectory(oi5 oi5Var, boolean z) throws IOException {
        oi5Var.getClass();
        this.delegate.createDirectory(onPathParameter(oi5Var, "createDirectory", "dir"), z);
    }

    @Override // defpackage.s92
    public void createSymlink(oi5 oi5Var, oi5 oi5Var2) throws IOException {
        oi5Var.getClass();
        oi5Var2.getClass();
        this.delegate.createSymlink(onPathParameter(oi5Var, "createSymlink", "source"), onPathParameter(oi5Var2, "createSymlink", "target"));
    }

    public final s92 delegate() {
        return this.delegate;
    }

    @Override // defpackage.s92
    public void delete(oi5 oi5Var, boolean z) throws IOException {
        oi5Var.getClass();
        this.delegate.delete(onPathParameter(oi5Var, "delete", "path"), z);
    }

    @Override // defpackage.s92
    public List<oi5> list(oi5 oi5Var) throws IOException {
        oi5Var.getClass();
        List list = this.delegate.list(onPathParameter(oi5Var, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((oi5) it.next(), "list"));
        }
        aw0.b0(arrayList);
        return arrayList;
    }

    @Override // defpackage.s92
    public List<oi5> listOrNull(oi5 oi5Var) {
        oi5Var.getClass();
        List listListOrNull = this.delegate.listOrNull(onPathParameter(oi5Var, "listOrNull", "dir"));
        if (listListOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listListOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((oi5) it.next(), "listOrNull"));
        }
        aw0.b0(arrayList);
        return arrayList;
    }

    @Override // defpackage.s92
    public u27 listRecursively(oi5 oi5Var, boolean z) {
        oi5Var.getClass();
        return w27.l0(this.delegate.listRecursively(onPathParameter(oi5Var, "listRecursively", "dir"), z), new vj2((Object) this, (byte) 0));
    }

    @Override // defpackage.s92
    public i92 metadataOrNull(oi5 oi5Var) throws IOException {
        oi5Var.getClass();
        i92 i92VarMetadataOrNull = this.delegate.metadataOrNull(onPathParameter(oi5Var, "metadataOrNull", "path"));
        if (i92VarMetadataOrNull == null) {
            return null;
        }
        oi5 oi5Var2 = i92VarMetadataOrNull.c;
        if (oi5Var2 == null) {
            return i92VarMetadataOrNull;
        }
        oi5 oi5VarOnPathResult = onPathResult(oi5Var2, "metadataOrNull");
        boolean z = i92VarMetadataOrNull.a;
        boolean z2 = i92VarMetadataOrNull.b;
        Long l = i92VarMetadataOrNull.d;
        Long l2 = i92VarMetadataOrNull.e;
        Long l3 = i92VarMetadataOrNull.f;
        Long l4 = i92VarMetadataOrNull.g;
        Map map = i92VarMetadataOrNull.h;
        map.getClass();
        return new i92(z, z2, oi5VarOnPathResult, l, l2, l3, l4, map);
    }

    public oi5 onPathParameter(oi5 oi5Var, String str, String str2) {
        oi5Var.getClass();
        str.getClass();
        str2.getClass();
        return oi5Var;
    }

    public oi5 onPathResult(oi5 oi5Var, String str) {
        oi5Var.getClass();
        str.getClass();
        return oi5Var;
    }

    @Override // defpackage.s92
    public g92 openReadOnly(oi5 oi5Var) throws IOException {
        oi5Var.getClass();
        return this.delegate.openReadOnly(onPathParameter(oi5Var, "openReadOnly", "file"));
    }

    @Override // defpackage.s92
    public g92 openReadWrite(oi5 oi5Var, boolean z, boolean z2) throws IOException {
        oi5Var.getClass();
        return this.delegate.openReadWrite(onPathParameter(oi5Var, "openReadWrite", "file"), z, z2);
    }

    @Override // defpackage.s92
    public sa7 sink(oi5 oi5Var, boolean z) {
        oi5Var.getClass();
        return this.delegate.sink(onPathParameter(oi5Var, "sink", "file"), z);
    }

    @Override // defpackage.s92
    public je7 source(oi5 oi5Var) throws IOException {
        oi5Var.getClass();
        return this.delegate.source(onPathParameter(oi5Var, "source", "file"));
    }

    public String toString() {
        return yb6.a.b(getClass()).E() + '(' + this.delegate + ')';
    }
}
