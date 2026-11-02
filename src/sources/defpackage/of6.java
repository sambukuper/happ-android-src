package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class of6 extends s92 {
    public static final oi5 f0;
    public final ClassLoader X;
    public final s92 Y;
    public final vz7 Z;

    static {
        String str = oi5.Y;
        f0 = g55.r("/");
    }

    public of6(ClassLoader classLoader) {
        s92 s92Var = s92.SYSTEM;
        s92Var.getClass();
        this.X = classLoader;
        this.Y = s92Var;
        this.Z = new vz7(new hr5(this, (byte) 6));
    }

    public static String g(oi5 oi5Var) {
        oi5 oi5Var2 = f0;
        return oi5Var2.e(oi5Var, true).d(oi5Var2).X.t();
    }

    @Override // defpackage.s92
    public final sa7 appendingSink(oi5 oi5Var, boolean z) throws IOException {
        oi5Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.s92
    public final void atomicMove(oi5 oi5Var, oi5 oi5Var2) throws IOException {
        oi5Var.getClass();
        oi5Var2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.s92
    public final oi5 canonicalize(oi5 oi5Var) {
        oi5Var.getClass();
        return f0.e(oi5Var, true);
    }

    @Override // defpackage.s92
    public final void createSymlink(oi5 oi5Var, oi5 oi5Var2) throws IOException {
        oi5Var.getClass();
        oi5Var2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.s92
    public final void delete(oi5 oi5Var, boolean z) throws IOException {
        oi5Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.s92
    public final List list(oi5 oi5Var) throws FileNotFoundException {
        oi5Var.getClass();
        String strG = g(oi5Var);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (qg5 qg5Var : (List) this.Z.getValue()) {
            s92 s92Var = (s92) qg5Var.X;
            oi5 oi5Var2 = (oi5) qg5Var.Y;
            try {
                List list = s92Var.list(oi5Var2.f(strG));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (x97.N((oi5) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(x97.T((oi5) it.next(), oi5Var2));
                }
                bw0.d0(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return wv0.Y0(linkedHashSet);
        }
        throw new FileNotFoundException(oi0.i(oi5Var, "file not found: "));
    }

    @Override // defpackage.s92
    public final List listOrNull(oi5 oi5Var) {
        oi5Var.getClass();
        String strG = g(oi5Var);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((List) this.Z.getValue()).iterator();
        boolean z = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            qg5 qg5Var = (qg5) it.next();
            s92 s92Var = (s92) qg5Var.X;
            oi5 oi5Var2 = (oi5) qg5Var.Y;
            List listListOrNull = s92Var.listOrNull(oi5Var2.f(strG));
            if (listListOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listListOrNull) {
                    if (x97.N((oi5) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(xv0.Z(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(x97.T((oi5) it2.next(), oi5Var2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                bw0.d0(linkedHashSet, arrayList);
                z = true;
            }
        }
        if (z) {
            return wv0.Y0(linkedHashSet);
        }
        return null;
    }

    @Override // defpackage.s92
    public final i92 metadataOrNull(oi5 oi5Var) {
        oi5Var.getClass();
        if (!x97.N(oi5Var)) {
            return null;
        }
        String strG = g(oi5Var);
        for (qg5 qg5Var : (List) this.Z.getValue()) {
            i92 i92VarMetadataOrNull = ((s92) qg5Var.X).metadataOrNull(((oi5) qg5Var.Y).f(strG));
            if (i92VarMetadataOrNull != null) {
                return i92VarMetadataOrNull;
            }
        }
        return null;
    }

    @Override // defpackage.s92
    public final g92 openReadOnly(oi5 oi5Var) throws FileNotFoundException {
        oi5Var.getClass();
        if (!x97.N(oi5Var)) {
            throw new FileNotFoundException(oi0.i(oi5Var, "file not found: "));
        }
        String strG = g(oi5Var);
        Iterator it = ((List) this.Z.getValue()).iterator();
        while (it.hasNext()) {
            qg5 qg5Var = (qg5) it.next();
            try {
                return ((s92) qg5Var.X).openReadOnly(((oi5) qg5Var.Y).f(strG));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException(oi0.i(oi5Var, "file not found: "));
    }

    @Override // defpackage.s92
    public final g92 openReadWrite(oi5 oi5Var, boolean z, boolean z2) throws IOException {
        oi5Var.getClass();
        throw new IOException("resources are not writable");
    }

    @Override // defpackage.s92
    public final sa7 sink(oi5 oi5Var, boolean z) throws IOException {
        oi5Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.s92
    public final je7 source(oi5 oi5Var) throws IOException {
        oi5Var.getClass();
        if (!x97.N(oi5Var)) {
            throw new FileNotFoundException(oi0.i(oi5Var, "file not found: "));
        }
        oi5 oi5Var2 = f0;
        oi5Var2.getClass();
        URL resource = this.X.getResource(f.a(oi5Var2, oi5Var, false).d(oi5Var2).X.t());
        if (resource == null) {
            throw new FileNotFoundException(oi0.i(oi5Var, "file not found: "));
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        inputStream.getClass();
        return dh3.Q(inputStream);
    }
}
