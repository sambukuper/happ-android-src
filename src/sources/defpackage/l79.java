package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l79 extends s92 {
    public static final oi5 f0;
    public final oi5 X;
    public final s92 Y;
    public final LinkedHashMap Z;

    static {
        String str = oi5.Y;
        f0 = g55.r("/");
    }

    public l79(oi5 oi5Var, s92 s92Var, LinkedHashMap linkedHashMap) {
        s92Var.getClass();
        this.X = oi5Var;
        this.Y = s92Var;
        this.Z = linkedHashMap;
    }

    @Override // defpackage.s92
    public final sa7 appendingSink(oi5 oi5Var, boolean z) throws IOException {
        oi5Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.s92
    public final void atomicMove(oi5 oi5Var, oi5 oi5Var2) throws IOException {
        oi5Var.getClass();
        oi5Var2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.s92
    public final oi5 canonicalize(oi5 oi5Var) throws FileNotFoundException {
        oi5Var.getClass();
        oi5 oi5Var2 = f0;
        oi5Var2.getClass();
        oi5 oi5VarA = f.a(oi5Var2, oi5Var, true);
        if (this.Z.containsKey(oi5VarA)) {
            return oi5VarA;
        }
        throw new FileNotFoundException(String.valueOf(oi5Var));
    }

    @Override // defpackage.s92
    public final void createDirectory(oi5 oi5Var, boolean z) throws IOException {
        oi5Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.s92
    public final void createSymlink(oi5 oi5Var, oi5 oi5Var2) throws IOException {
        oi5Var.getClass();
        oi5Var2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.s92
    public final void delete(oi5 oi5Var, boolean z) throws IOException {
        oi5Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    public final List g(oi5 oi5Var, boolean z) throws IOException {
        k79 k79Var = (k79) this.Z.get(f0.e(oi5Var, true));
        if (k79Var != null) {
            return wv0.Y0(k79Var.q);
        }
        if (!z) {
            return null;
        }
        u52.s(oi0.i(oi5Var, "not a directory: "));
        return null;
    }

    @Override // defpackage.s92
    public final List list(oi5 oi5Var) throws IOException {
        oi5Var.getClass();
        List listG = g(oi5Var, true);
        listG.getClass();
        return listG;
    }

    @Override // defpackage.s92
    public final List listOrNull(oi5 oi5Var) {
        oi5Var.getClass();
        return g(oi5Var, false);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    @Override // defpackage.s92
    public final i92 metadataOrNull(oi5 oi5Var) throws Throwable {
        Long lValueOf;
        Long lValueOf2;
        Long l;
        Long lValueOf3;
        Throwable th;
        Throwable th2;
        oi5Var.getClass();
        oi5 oi5Var2 = f0;
        oi5Var2.getClass();
        k79 k79VarO = (k79) this.Z.get(f.a(oi5Var2, oi5Var, true));
        if (k79VarO == null) {
            return null;
        }
        long j = k79VarO.h;
        if (j != -1) {
            g92 g92VarOpenReadOnly = this.Y.openReadOnly(this.X);
            try {
                j76 j76Var = new j76(g92VarOpenReadOnly.p(j));
                try {
                    k79VarO = u28.o(j76Var, k79VarO);
                    k79VarO.getClass();
                    try {
                        j76Var.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        j76Var.close();
                    } catch (Throwable th5) {
                        gv3.g(th4, th5);
                    }
                    th2 = th4;
                    k79VarO = null;
                }
                if (th2 != null) {
                    throw th2;
                }
                try {
                    g92VarOpenReadOnly.close();
                    th = null;
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                if (g92VarOpenReadOnly != null) {
                    try {
                        g92VarOpenReadOnly.close();
                    } catch (Throwable th8) {
                        gv3.g(th7, th8);
                    }
                }
                th = th7;
                k79VarO = null;
            }
            if (th != null) {
                throw th;
            }
        }
        boolean z = k79VarO.b;
        boolean z2 = !z;
        Long lValueOf4 = z ? null : Long.valueOf(k79VarO.f);
        Long l2 = k79VarO.m;
        if (l2 != null) {
            lValueOf = Long.valueOf((l2.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num = k79VarO.p;
            lValueOf = num != null ? Long.valueOf(((long) num.intValue()) * 1000) : null;
        }
        Long l3 = k79VarO.k;
        if (l3 != null) {
            lValueOf2 = Long.valueOf((l3.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num2 = k79VarO.n;
            if (num2 != null) {
                lValueOf2 = Long.valueOf(((long) num2.intValue()) * 1000);
            } else {
                int i = k79VarO.j;
                if (i != -1) {
                    int i2 = k79VarO.i;
                    if (i == -1) {
                        lValueOf2 = null;
                    } else {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        lValueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                } else {
                    lValueOf2 = null;
                }
            }
        }
        Long l4 = k79VarO.l;
        if (l4 == null) {
            Integer num3 = k79VarO.o;
            if (num3 != null) {
                lValueOf3 = Long.valueOf(((long) num3.intValue()) * 1000);
            } else {
                l = null;
            }
            return new i92(z2, z, null, lValueOf4, lValueOf, lValueOf2, l);
        }
        lValueOf3 = Long.valueOf((l4.longValue() / 10000) - 11644473600000L);
        l = lValueOf3;
        return new i92(z2, z, null, lValueOf4, lValueOf, lValueOf2, l);
    }

    @Override // defpackage.s92
    public final g92 openReadOnly(oi5 oi5Var) {
        oi5Var.getClass();
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.s92
    public final g92 openReadWrite(oi5 oi5Var, boolean z, boolean z2) throws IOException {
        oi5Var.getClass();
        throw new IOException("zip entries are not writable");
    }

    @Override // defpackage.s92
    public final sa7 sink(oi5 oi5Var, boolean z) throws IOException {
        oi5Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.s92
    public final je7 source(oi5 oi5Var) throws Throwable {
        j76 j76Var;
        Throwable th;
        oi5Var.getClass();
        oi5 oi5Var2 = f0;
        oi5Var2.getClass();
        k79 k79Var = (k79) this.Z.get(f.a(oi5Var2, oi5Var, true));
        if (k79Var == null) {
            throw new FileNotFoundException(oi0.i(oi5Var, "no such file: "));
        }
        long j = k79Var.f;
        g92 g92VarOpenReadOnly = this.Y.openReadOnly(this.X);
        try {
            j76Var = new j76(g92VarOpenReadOnly.p(k79Var.h));
            try {
                g92VarOpenReadOnly.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (g92VarOpenReadOnly != null) {
                try {
                    g92VarOpenReadOnly.close();
                } catch (Throwable th4) {
                    gv3.g(th3, th4);
                }
            }
            j76Var = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        j76Var.getClass();
        u28.o(j76Var, null);
        return k79Var.g == 0 ? new t94(j76Var, j, false) : new t94(new oc3(new t94(j76Var, k79Var.e, false), new Inflater(true)), j, true);
    }
}
