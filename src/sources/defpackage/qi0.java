package defpackage;

import android.content.res.TypedArray;
import android.hardware.camera2.CameraCharacteristics;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qi0 implements AutoCloseable, uh0 {
    public final it2 X;
    public final it2 Y;
    public final cl7 Z;
    public final yx7 f0;
    public final ef0 g0;
    public final jm2 h0;
    public final hm2 i0;
    public final pw j0;
    public final ni0 k0;
    public final ri0 l0;
    public final si0 m0;
    public final lt2 n0;
    public final b71 o0;
    public final u51 p0;
    public final pv q0;

    public qi0(hi0 hi0Var, jj0 jj0Var, it2 it2Var, it2 it2Var2, cl7 cl7Var, yx7 yx7Var, ef0 ef0Var, jm2 jm2Var, hm2 hm2Var, pw pwVar, ni0 ni0Var, ri0 ri0Var, si0 si0Var, lt2 lt2Var, b71 b71Var, u51 u51Var) {
        String strA;
        ArrayList arrayList = hi0Var.d;
        int i = hi0Var.h;
        jj0Var.getClass();
        it2Var.getClass();
        it2Var2.getClass();
        cl7Var.getClass();
        List list = cl7Var.h0;
        yx7Var.getClass();
        ef0Var.getClass();
        jm2Var.getClass();
        hm2Var.getClass();
        pwVar.getClass();
        ri0Var.getClass();
        si0Var.getClass();
        lt2Var.getClass();
        b71Var.getClass();
        u51Var.getClass();
        this.X = it2Var;
        this.Y = it2Var2;
        this.Z = cl7Var;
        this.f0 = yx7Var;
        this.g0 = ef0Var;
        this.h0 = jm2Var;
        this.i0 = hm2Var;
        this.j0 = pwVar;
        this.k0 = ni0Var;
        this.l0 = ri0Var;
        this.m0 = si0Var;
        this.n0 = lt2Var;
        this.o0 = b71Var;
        this.p0 = u51Var;
        this.q0 = nr4.e(false);
        String str = hi0Var.a;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        lf0 lf0Var = (lf0) jj0Var;
        Integer num = (Integer) lf0Var.c(key);
        String str2 = "External";
        String str3 = "Unknown";
        String str4 = (num != null && num.intValue() == 0) ? "Front" : (num != null && num.intValue() == 1) ? "Back" : (num != null && num.intValue() == 2) ? "External" : "Unknown";
        CameraCharacteristics.Key key2 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key2.getClass();
        Integer num2 = (Integer) lf0Var.c(key2);
        if (num2 != null && num2.intValue() == 0) {
            str2 = "Limited";
        } else if (num2 != null && num2.intValue() == 1) {
            str2 = "Full";
        } else if (num2 != null && num2.intValue() == 2) {
            str2 = "Legacy";
        } else if (num2 != null && num2.intValue() == 3) {
            str2 = "Level 3";
        } else if (num2 == null || num2.intValue() != 4) {
            str2 = "Unknown";
        }
        if (i == 1) {
            str3 = "High Speed";
        } else if (i == 0) {
            str3 = "Normal";
        } else if (i == 2) {
            str3 = "Extension";
        }
        CameraCharacteristics.Key key3 = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key3.getClass();
        int[] iArr = (int[]) lf0Var.c(key3);
        String str5 = (iArr == null || !eu.a0(iArr, 11)) ? "Physical" : "Logical";
        StringBuilder sb = new StringBuilder();
        sb.append(this + " (Camera " + str + ")\n");
        StringBuilder sbT = oi0.t("  Facing:    ", str4, " (", str5, ", ");
        sbT.append(str2);
        sbT.append(")\n");
        sb.append(sbT.toString());
        sb.append("  Mode:      " + str3 + '\n');
        sb.append("Outputs:\n");
        Iterator it = cl7Var.i0.iterator();
        while (true) {
            int i2 = 12;
            if (!it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                int i3 = i;
                List<zk7> list2 = list;
                if (!list2.isEmpty()) {
                    sb.append("Inputs:\n");
                    for (zk7 zk7Var : list2) {
                        sb.append(" ");
                        sb.append(fm7.t0(12, "Input-" + zk7Var.a));
                        sb.append(fm7.t0(12, yk7.b(zk7Var.b)));
                        sb.append(fm7.t0(12, String.valueOf(1)));
                        sb.append("\n");
                    }
                }
                sb.append("Session Template: " + we6.a(hi0Var.f) + '\n');
                vj8.n(sb, "Session Parameters", hi0Var.g);
                sb.append("Default Template: " + we6.a(1) + '\n');
                vj8.n(sb, "Default Parameters", hi0Var.i);
                vj8.n(sb, "Required Parameters", hi0Var.l);
                if (i3 == 1) {
                    if (this.Z.j0.isEmpty()) {
                        bt.q("Cannot create a HIGH_SPEED CameraGraph without outputs.");
                        throw null;
                    }
                    int size = this.Z.j0.size();
                    cl7 cl7Var2 = this.Z;
                    if (size > 2) {
                        xw3.z(cl7Var2.j0, "Cannot create a HIGH_SPEED CameraGraph with more than two outputs. Configured outputs are ");
                        throw null;
                    }
                    ArrayList arrayList3 = cl7Var2.j0;
                    if (arrayList3 == null || !arrayList3.isEmpty()) {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            if (!((bl7) it2.next()).a()) {
                                xw3.z(this.Z.j0, "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are ");
                                throw null;
                            }
                        }
                    }
                }
                if (arrayList2 != null) {
                    if (arrayList2.isEmpty()) {
                        bt.q("At least one InputConfiguration is required for reprocessing");
                        throw null;
                    }
                    if (Build.VERSION.SDK_INT < 31 && arrayList2.size() > 1) {
                        bt.q("Multi resolution reprocessing not supported under Android S");
                        throw null;
                    }
                }
                if (this.Z.g0.isEmpty()) {
                    return;
                }
                this.f0.g();
                return;
            }
            Iterator it3 = ((fl0) it.next()).b.iterator();
            int i4 = 0;
            while (it3.hasNext()) {
                Object next = it3.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    i21.X();
                    throw null;
                }
                bl7 bl7Var = (bl7) next;
                sb.append("  ");
                if (i4 == 0) {
                    fl0 fl0Var = bl7Var.j;
                    if (fl0Var == null) {
                        dh3.T("stream");
                        throw null;
                    }
                    strA = dl7.a(fl0Var.a);
                } else {
                    strA = _UrlKt.FRAGMENT_ENCODE_SET;
                }
                sb.append(fm7.t0(i2, strA));
                int i6 = bl7Var.a;
                String str6 = bl7Var.d;
                sb.append(fm7.t0(12, "Output-" + i6));
                String string = bl7Var.b.toString();
                string.getClass();
                sb.append(fm7.t0(12, string));
                sb.append(fm7.t0(16, yk7.a(bl7Var.c)));
                bf5 bf5Var = bl7Var.e;
                if (bf5Var != null) {
                    sb.append(" [" + ((Object) bf5.a(bf5Var.a)) + ']');
                }
                af5 af5Var = bl7Var.f;
                Iterator it4 = it;
                ArrayList arrayList4 = arrayList;
                if (af5Var != null) {
                    sb.append(" [" + ((Object) af5.a(af5Var.a)) + ']');
                }
                cf5 cf5Var = bl7Var.g;
                int i7 = i;
                if (cf5Var != null) {
                    long j = cf5Var.a;
                    StringBuilder sb2 = new StringBuilder(" [");
                    sb2.append((Object) ("StreamUseCase(value=" + j + ')'));
                    sb2.append(']');
                    sb.append(sb2.toString());
                }
                df5 df5Var = bl7Var.i;
                if (df5Var != null) {
                    long j2 = df5Var.a;
                    StringBuilder sb3 = new StringBuilder(" [");
                    sb3.append((Object) ("StreamUseHint(value=" + j2 + ')'));
                    sb3.append(']');
                    sb.append(sb3.toString());
                }
                if (!dh3.f(str6, str)) {
                    sb.append(" [");
                    sb.append(new vi0(str6));
                    sb.append("]");
                }
                sb.append("\n");
                it = it4;
                it3 = it3;
                i = i7;
                arrayList = arrayList4;
                i4 = i5;
                list = list;
                i2 = 12;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        q51 q51Var;
        if (this.q0.a()) {
            Trace.beginSection(this + "#close");
            this.X.b.close();
            ef0 ef0Var = this.g0;
            synchronized (ef0Var.q) {
                try {
                    q51Var = null;
                    if (!ef0Var.c()) {
                        ef0Var.s = sh0.k0;
                        ef0Var.toString();
                        sy8 sy8Var = ef0Var.y;
                        sn0 sn0Var = ef0Var.z;
                        ef0Var.y = null;
                        ef0Var.z = null;
                        og7 og7Var = ef0Var.w;
                        if (og7Var != null) {
                            og7Var.m(null);
                        }
                        og7 og7Var2 = ef0Var.B;
                        if (og7Var2 != null) {
                            og7Var2.m(null);
                        }
                        ef0Var.B = null;
                        og7 og7Var3 = ef0Var.C;
                        if (og7Var3 != null) {
                            og7Var3.m(null);
                        }
                        ef0Var.C = null;
                        og7 og7Var4 = ef0Var.D;
                        if (og7Var4 != null) {
                            og7Var4.m(null);
                        }
                        ef0Var.D = null;
                        p61.z(ef0Var.g);
                        ef0Var.b(sn0Var, sy8Var);
                        hi0 hi0Var = ef0Var.d;
                        if (hi0Var.n.e || ef0Var.l.a(hi0Var.a)) {
                            vi0.b(ef0Var.d.a);
                            ef0Var.toString();
                            s16 s16Var = ef0Var.j;
                            String str = ef0Var.d.a;
                            s16Var.getClass();
                            str.getClass();
                            qe6 qe6Var = new qe6(str);
                            ux0 ux0Var = qe6Var.b;
                            if (((x90) s16Var.e.h0).b(qe6Var) instanceof tp0) {
                                vi0.b(str);
                                ux0Var.V(dn8.a);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.h0.close();
            this.i0.close();
            this.f0.close();
            this.Z.close();
            pw pwVar = this.j0;
            pwVar.getClass();
            synchronized (pwVar.c) {
                qw qwVarA = pwVar.a();
                pwVar.d.remove(this);
                qw qwVarA2 = pwVar.a();
                if (qwVarA2 != null && !qwVarA2.equals(qwVarA)) {
                    wl6 wl6Var = pwVar.b;
                    m51 m51Var = pwVar.a;
                    k kVar = new k(pwVar, qwVarA2, q51Var, (byte) 2);
                    wl6Var.getClass();
                    m51Var.getClass();
                    w51.G(m51Var, null, e71.f0, new wu1(wl6Var, kVar, q51Var, (byte) 4), 1);
                }
            }
            gv3.i(this.o0, null);
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(s51 s51Var) {
        pi0 pi0Var;
        if (s51Var instanceof pi0) {
            pi0Var = (pi0) s51Var;
            int i = pi0Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                pi0Var.h0 = i - Integer.MIN_VALUE;
            } else {
                pi0Var = new pi0(this, s51Var);
            }
        } else {
            pi0Var = new pi0(this, s51Var);
        }
        Object objA = pi0Var.f0;
        int i2 = pi0Var.h0;
        if (i2 == 0) {
            w39.n0(objA);
            pi0Var.h0 = 1;
            objA = this.n0.a(pi0Var);
            c71 c71Var = c71.X;
            if (objA == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objA);
        }
        return new ti0((s15) objA, this.X, this.p0, this.i0, this.l0, this.m0);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d2  */
    public final void m(int i, Surface surface) throws Exception {
        AutoCloseable autoCloseable;
        boolean zIsTerminated;
        Trace.beginSection(((Object) dl7.a(i)) + "#setSurface");
        if (surface != null && !surface.isValid()) {
            surface.toString();
        }
        yx7 yx7Var = this.f0;
        if (yx7Var.f0.keySet().contains(new dl7(i))) {
            StringBuilder sb = new StringBuilder("Cannot configure surface for ");
            sb.append((Object) dl7.a(i));
            bt.l(sb, ", it is permanently assigned to ", yx7Var.f0.get(new dl7(i)));
            return;
        }
        synchronized (yx7Var.g0) {
            if (!yx7Var.k0) {
                if (surface != null) {
                    dl7.a(i);
                    surface.toString();
                } else {
                    dl7.a(i);
                }
                LinkedHashMap linkedHashMap = yx7Var.h0;
                if (surface == null) {
                    Surface surface2 = (Surface) linkedHashMap.remove(new dl7(i));
                    if (!yx7Var.j0 || surface2 == null) {
                        autoCloseable = null;
                    } else {
                        autoCloseable = (AutoCloseable) yx7Var.i0.remove(surface2);
                    }
                } else {
                    Surface surface3 = (Surface) linkedHashMap.get(new dl7(i));
                    yx7Var.h0.put(new dl7(i), surface);
                    if (!yx7Var.j0 || dh3.f(surface3, surface)) {
                        autoCloseable = null;
                    } else {
                        if (yx7Var.i0.containsKey(surface)) {
                            throw new IllegalStateException(("Surface (" + surface + ") is already in use!").toString());
                        }
                        autoCloseable = (AutoCloseable) ci8.f(yx7Var.i0).remove(surface3);
                        yx7Var.i0.put(surface, yx7Var.Z.a(surface));
                    }
                }
                yx7Var.g();
                if (autoCloseable != null) {
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof ExecutorService) {
                        ExecutorService executorService = (ExecutorService) autoCloseable;
                        if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                            executorService.shutdown();
                            boolean z = false;
                            while (!zIsTerminated) {
                                try {
                                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                } catch (InterruptedException unused) {
                                    if (!z) {
                                        executorService.shutdownNow();
                                        z = true;
                                    }
                                }
                            }
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    } else if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                    } else if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                    } else {
                        if (!(autoCloseable instanceof MediaDrm)) {
                            kp5.e();
                            return;
                        }
                        ((MediaDrm) autoCloseable).release();
                    }
                }
            } else if (surface != null) {
                dl7.a(i);
                surface.toString();
            }
        }
        Trace.endSection();
    }

    public final String toString() {
        return this.k0.a;
    }
}
