package defpackage;

import com.github.luben.zstd.ZstdInputStream;
import com.tencent.mmkv.MMKV;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.HappApplication;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l72 {
    public final vz7 a = new vz7(new j72((byte) 0));
    public final oh7 b;
    public final h76 c;

    public l72() {
        oh7 oh7VarA = ph7.a(e02.X);
        this.b = oh7VarA;
        this.c = jm4.n(oh7VarA);
    }

    public static File d(InputStream inputStream) throws IOException {
        inputStream.getClass();
        HappApplication happApplication = HappApplication.M0;
        FileOutputStream fileOutputStream = new FileOutputStream(new File(k32.i().getFilesDir(), "data.result.tmp"));
        try {
            gv3.m(inputStream, fileOutputStream);
            fileOutputStream.close();
            return new File(k32.i().getFilesDir(), "data.result.tmp");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                oc.h(fileOutputStream, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0043  */
    public final Object a() {
        try {
            HappApplication happApplication = HappApplication.M0;
            k32.i().d().h(new h80((byte) 25));
            InputStream inputStreamOpen = k32.i().getAssets().open("data.result");
            Long lC0 = mm7.c0("1792654306601");
            if (lC0 != null) {
                if (we3.a.a().a() - lC0.longValue() >= 2592000000L) {
                    inputStreamOpen = null;
                }
            } else {
                inputStreamOpen = null;
            }
            if (inputStreamOpen == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            w39.n0(c(inputStreamOpen));
            return dn8.a;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            return new rj6(th);
        }
    }

    public final Object b(File file) {
        file.getClass();
        try {
            if (!file.exists() || f()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            w39.n0(c(new FileInputStream(file)));
            return dn8.a;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            return new rj6(th);
        }
    }

    public final Object c(InputStream inputStream) {
        Object value;
        Map map;
        try {
            byte[] bArrO = gv3.O(inputStream);
            byte[] bArrF0 = eu.F0(bArrO, x97.a0(0, 12));
            Charset charset = iq0.a;
            Object objC = c12.c(new String(bArrF0, charset).concat(new String(eu.F0(bArrO, x97.a0(bArrO.length - 12, bArrO.length)), charset)), eu.j0(12, bArrO.length - 12, bArrO));
            w39.n0(objC);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) objC);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ZstdInputStream zstdInputStream = new ZstdInputStream(byteArrayInputStream);
            try {
                try {
                    gv3.m(zstdInputStream, byteArrayOutputStream);
                    byteArrayOutputStream.close();
                    zstdInputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArray.getClass();
                    String str = new String(byteArray, charset);
                    oh7 oh7Var = this.b;
                    do {
                        value = oh7Var.getValue();
                        Object objD = yw2.c.d(str, new k72().b);
                        objD.getClass();
                        map = (Map) objD;
                    } while (!oh7Var.k(value, map));
                    return map;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        oc.h(byteArrayOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    oc.h(zstdInputStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            if ((th5 instanceof InterruptedException) || (th5 instanceof CancellationException)) {
                throw th5;
            }
            return new rj6(th5);
        }
    }

    public final boolean e() {
        long jF = ((MMKV) this.a.getValue()).f(-1L, "extra_file_timestamp");
        Long lValueOf = Long.valueOf(jF);
        if (jF == -1) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            return true;
        }
        long jLongValue = lValueOf.longValue();
        HappApplication happApplication = HappApplication.M0;
        return !new File(k32.i().getFilesDir(), "data.result").exists() || we3.a.a().a() - jLongValue > 86400000;
    }

    public final boolean f() {
        long jF = ((MMKV) this.a.getValue()).f(-1L, "extra_file_timestamp");
        Long lValueOf = Long.valueOf(jF);
        Comparable comparable = null;
        if (jF == -1) {
            lValueOf = null;
        }
        Iterator it = eu.q0(new Long[]{lValueOf, mm7.c0("1792654306601")}).iterator();
        if (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            loop0: while (true) {
                comparable = comparable2;
                do {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    comparable2 = (Comparable) it.next();
                } while (comparable.compareTo(comparable2) >= 0);
            }
        }
        Long l = (Long) comparable;
        if (l != null) {
            return we3.a.a().a() - l.longValue() > 172800000;
        }
        return true;
    }
}
