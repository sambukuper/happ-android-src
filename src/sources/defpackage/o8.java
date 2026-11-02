package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import defpackage.be;
import defpackage.mm7;
import defpackage.o8;
import defpackage.x;
import defpackage.yi8;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.b1;
import io.sentry.android.core.c1;
import io.sentry.m2;
import io.sentry.s5;
import io.sentry.u2;
import io.sentry.vendor.gson.stream.a;
import io.sentry.vendor.gson.stream.b;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import su.happ.proxyutility.dto.AlertMessageData;
import su.happ.proxyutility.dto.enums.AlertType;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o8 implements q63, u14, iv5 {
    public final /* synthetic */ byte X;
    public boolean Y;
    public Object Z;
    public Object f0;

    public o8(jj0 jj0Var) {
        this.X = (byte) 4;
        jj0Var.getClass();
        this.Z = jj0Var;
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key.getClass();
        int[] iArr = (int[]) ((lf0) jj0Var).c(key);
        this.Y = iArr != null ? eu.a0(iArr, 18) : false;
        this.f0 = c4.c(jj0Var);
    }

    public static boolean f(px1 px1Var, px1 px1Var2) {
        int i;
        boolean zB = px1Var2.b();
        int i2 = px1Var2.a;
        if (zB) {
            int i3 = px1Var.a;
            return !(i3 == 2 && i2 == 1) && (i3 == 2 || i3 == 0 || i3 == i2) && ((i = px1Var.b) == 0 || i == px1Var2.b);
        }
        om0.l("Fully specified range ", px1Var2, " not actually fully specified.");
        return false;
    }

    public static px1 j(px1 px1Var, LinkedHashSet linkedHashSet, Set set) {
        boolean zF;
        if (px1Var.a != 1) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                px1 px1Var2 = (px1) it.next();
                int i = px1Var2.a;
                if (!px1Var2.b()) {
                    bt.i("Fully specified DynamicRange must have fully defined encoding.");
                    break;
                }
                if (i != 1) {
                    if (set.contains(px1Var2)) {
                        zF = f(px1Var, px1Var2);
                    } else {
                        if (hi5.i0("CXCP")) {
                            Objects.toString(px1Var);
                            Objects.toString(px1Var2);
                        }
                        zF = false;
                    }
                    if (zF) {
                        return px1Var2;
                    }
                }
            }
        }
        return null;
    }

    public static void o(BufferedInputStream bufferedInputStream, long j) throws IOException {
        while (j > 0) {
            long jSkip = bufferedInputStream.skip(j);
            if (jSkip != 0) {
                j -= jSkip;
            } else {
                if (bufferedInputStream.read() == -1) {
                    throw new EOFException("Unexpected end of stream while skipping bytes");
                }
                j--;
            }
        }
    }

    public static void q(Set set, px1 px1Var, vk1 vk1Var) {
        Set set2 = set;
        mb6.s("Cannot update already-empty constraints.", !set2.isEmpty());
        vk1Var.getClass();
        px1Var.getClass();
        Set setC = ((sx1) vk1Var.Y).c(px1Var);
        Set set3 = setC;
        if (set3.isEmpty()) {
            return;
        }
        Set setC1 = wv0.c1(set);
        set.retainAll(set3);
        if (set2.isEmpty()) {
            throw new IllegalArgumentException(("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + px1Var + "\nConstraints:\n  " + setC + "\nExisting constraints:\n  " + setC1).toString());
        }
    }

    @Override // defpackage.q63
    public int a() {
        int height;
        synchronized (this.f0) {
            height = ((ImageReader) this.Z).getHeight();
        }
        return height;
    }

    @Override // defpackage.q63
    public int b() {
        int width;
        synchronized (this.f0) {
            width = ((ImageReader) this.Z).getWidth();
        }
        return width;
    }

    public void c(vp4 vp4Var, qr5 qr5Var, String str, boolean z) {
        qr5 qr5Var2 = (qr5) this.Z;
        if (qr5Var2 != null) {
            kp5.n("Conflicting property-based creators: already had %s creator %s, encountered another: %s", new Object[]{str, qr5Var2.a, qr5Var.a});
            return;
        }
        qr5Var.b(vp4Var);
        this.Z = qr5Var;
        this.Y = z;
    }

    @Override // defpackage.q63
    public void close() {
        synchronized (this.f0) {
            ((ImageReader) this.Z).close();
        }
    }

    @Override // defpackage.q63
    public n63 d() {
        Image imageAcquireLatestImage;
        synchronized (this.f0) {
            try {
                imageAcquireLatestImage = ((ImageReader) this.Z).acquireLatestImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new ke(imageAcquireLatestImage);
        }
    }

    @Override // defpackage.q63
    public int e() {
        int imageFormat;
        synchronized (this.f0) {
            imageFormat = ((ImageReader) this.Z).getImageFormat();
        }
        return imageFormat;
    }

    @Override // defpackage.u14
    public boolean g(lh8 lh8Var, lh8 lh8Var2) {
        boolean z = this.Y;
        jd0 jd0Var = (jd0) this.Z;
        jd0 jd0Var2 = (jd0) this.f0;
        byte b = 1;
        if (lh8Var.equals(lh8Var2)) {
            return true;
        }
        ot0 ot0VarX = lh8Var.x();
        ot0 ot0VarX2 = lh8Var2.x();
        if ((ot0VarX instanceof hi8) && (ot0VarX2 instanceof hi8)) {
            return pz2.H0.g((hi8) ot0VarX, (hi8) ot0VarX2, z, new n40(jd0Var, jd0Var2, b));
        }
        return false;
    }

    @Override // defpackage.q63
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f0) {
            surface = ((ImageReader) this.Z).getSurface();
        }
        return surface;
    }

    @Override // defpackage.q63
    public void h() {
        synchronized (this.f0) {
            this.Y = true;
            ((ImageReader) this.Z).setOnImageAvailableListener(null, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:5:0x0011, B:6:0x001d, B:8:0x0025, B:21:0x0058, B:13:0x0038, B:15:0x0040, B:18:0x0047, B:20:0x004f, B:24:0x005f, B:27:0x0069), top: B:50:0x0011, outer: #4 }] */
    public c1 i(BufferedInputStream bufferedInputStream, int i, File file) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.Z;
        c1 c1Var = null;
        try {
            b1 b1Var = new b1(bufferedInputStream, i);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(b1Var, StandardCharsets.UTF_8);
                try {
                    m2 m2Var = new m2(inputStreamReader);
                    a aVar = m2Var.X;
                    m2Var.F0();
                    String strK = null;
                    Date dateL0 = null;
                    while (aVar.peek() == b.NAME) {
                        String strE0 = aVar.e0();
                        int iHashCode = strE0.hashCode();
                        if (iHashCode != 55126294) {
                            if (iHashCode == 1874684019 && strE0.equals("platform")) {
                                strK = m2Var.K();
                            } else {
                                m2Var.v();
                            }
                        } else if (strE0.equals("timestamp")) {
                            dateL0 = m2Var.l0(sentryAndroidOptions.getLogger());
                        } else {
                            m2Var.v();
                        }
                        if (strK != null && dateL0 != null) {
                            break;
                        }
                    }
                    if ("native".equals(strK) && dateL0 != null) {
                        c1Var = new c1(file, dateL0.getTime());
                    }
                    inputStreamReader.close();
                    b1Var.close();
                    return c1Var;
                } catch (Throwable th) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    b1Var.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            sentryAndroidOptions.getLogger().d(s5.DEBUG, th5, "Error parsing event JSON from: %s", file.getName());
            return null;
        }
    }

    public q71 k() {
        xr0 xr0Var = (xr0) this.f0;
        int i = xr0Var.b;
        int i2 = xr0Var.c;
        if (i < i2) {
            return q71.Y;
        }
        return i > i2 ? q71.X : q71.Z;
    }

    public Properties l() {
        u2 u2Var = (u2) this.f0;
        String str = (String) this.Z;
        try {
            File file = new File(str.trim());
            if (!file.isFile() || !file.canRead()) {
                if (file.isFile()) {
                    if (!file.canRead()) {
                        u2Var.h(s5.ERROR, "Failed to load Sentry configuration since it is not readable: %s", str);
                    }
                } else if (this.Y) {
                    u2Var.h(s5.ERROR, "Failed to load Sentry configuration since it is not a file or does not exist: %s", str);
                    return null;
                }
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            u2Var.d(s5.ERROR, th3, "Failed to load Sentry configuration from file: %s", str);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:4:0x0011, B:5:0x001d, B:7:0x0025, B:20:0x0054, B:12:0x0038, B:14:0x0040, B:17:0x0047, B:19:0x004f, B:24:0x005d), top: B:40:0x0011, outer: #2 }] */
    public b8 m(String str) {
        try {
            Charset charset = StandardCharsets.UTF_8;
            InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(str.getBytes(charset)), charset);
            try {
                m2 m2Var = new m2(inputStreamReader);
                a aVar = m2Var.X;
                m2Var.F0();
                int iNextInt = -1;
                String strK = null;
                while (aVar.peek() == b.NAME) {
                    String strE0 = aVar.e0();
                    int iHashCode = strE0.hashCode();
                    if (iHashCode != -1106363674) {
                        if (iHashCode == 3575610 && strE0.equals("type")) {
                            strK = m2Var.K();
                        } else {
                            m2Var.v();
                        }
                    } else if (strE0.equals("length")) {
                        iNextInt = m2Var.nextInt();
                    } else {
                        m2Var.v();
                    }
                    if (strK != null && iNextInt >= 0) {
                        break;
                    }
                }
                if (iNextInt < 0) {
                    inputStreamReader.close();
                    return null;
                }
                b8 b8Var = new b8(strK, iNextInt, (byte) 16);
                inputStreamReader.close();
                return b8Var;
            } catch (Throwable th) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            ((SentryAndroidOptions) this.Z).getLogger().d(s5.DEBUG, th3, "Error parsing item header", new Object[0]);
            return null;
        }
        ((SentryAndroidOptions) this.Z).getLogger().d(s5.DEBUG, th3, "Error parsing item header", new Object[0]);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0195  */
    /* JADX WARN: Code duplicated, block: B:81:0x019f  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:90:0x01be  */
    public LinkedHashMap n(ArrayList arrayList, List list, List list2) {
        px1 px1Var;
        px1 px1Var2;
        boolean zF;
        Iterator it;
        px1 px1Var3;
        px1 px1VarN;
        vk1 vk1Var = (vk1) this.f0;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            px1 px1Var4 = ((rx) it2.next()).d;
            px1Var4.getClass();
            linkedHashSet.add(px1Var4);
        }
        Set setA = ((sx1) vk1Var.Y).a();
        Set setB1 = wv0.b1(setA);
        Iterator it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            q(setB1, (px1) it3.next(), vk1Var);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = list2.iterator();
        while (true) {
            boolean zHasNext = it4.hasNext();
            px1Var = px1.c;
            if (!zHasNext) {
                break;
            }
            er8 er8Var = (er8) list.get(((Number) it4.next()).intValue());
            px1 px1Var5 = (px1) er8Var.a(e63.r, px1Var);
            px1Var5.getClass();
            if (px1Var5.equals(px1Var)) {
                arrayList4.add(er8Var);
            } else {
                int i = px1Var5.a;
                int i2 = px1Var5.b;
                if (i == 2 || ((i != 0 && i2 == 0) || (i == 0 && i2 != 0))) {
                    arrayList3.add(er8Var);
                } else {
                    arrayList2.add(er8Var);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList<er8> arrayList5 = new ArrayList();
        arrayList5.addAll(arrayList2);
        arrayList5.addAll(arrayList3);
        arrayList5.addAll(arrayList4);
        for (er8 er8Var2 : arrayList5) {
            px1 px1Var6 = (px1) er8Var2.a(e63.r, px1Var);
            px1Var6.getClass();
            ((String) er8Var2.d(u18.I)).getClass();
            if (!px1Var6.b()) {
                int i3 = px1Var6.a;
                int i4 = px1Var6.b;
                px1Var2 = px1.d;
                if (i3 != 1 || i4 != 0) {
                    px1 px1VarJ = j(px1Var6, linkedHashSet, setB1);
                    if (px1VarJ == null) {
                        px1VarJ = j(px1Var6, linkedHashSet2, setB1);
                        if (px1VarJ == null) {
                            if (setB1.contains(px1Var2)) {
                                zF = f(px1Var6, px1Var2);
                            } else {
                                if (hi5.i0("CXCP")) {
                                    Objects.toString(px1Var6);
                                    Objects.toString(px1Var2);
                                }
                                zF = false;
                            }
                            if (!zF) {
                                if (i3 != 2 || (i4 != 10 && i4 != 0)) {
                                    it = setB1.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            px1Var2 = null;
                                            break;
                                        }
                                        px1Var3 = (px1) it.next();
                                        if (px1Var3.b()) {
                                            bt.i("Candidate dynamic range must be fully specified.");
                                            return null;
                                        }
                                        if (!px1Var3.equals(px1Var2) && f(px1Var6, px1Var3)) {
                                            if (hi5.i0("CXCP")) {
                                                px1Var6.toString();
                                                px1Var3.toString();
                                            }
                                            px1Var2 = px1Var3;
                                            break;
                                        }
                                    }
                                } else {
                                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                    if (Build.VERSION.SDK_INT >= 33 && (px1VarN = c4.n((jj0) this.Z)) != null) {
                                        linkedHashSet3.add(px1VarN);
                                    }
                                    linkedHashSet3.add(px1.e);
                                    px1 px1VarJ2 = j(px1Var6, linkedHashSet3, setB1);
                                    if (px1VarJ2 == null) {
                                        it = setB1.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                px1Var2 = null;
                                                break;
                                            }
                                            px1Var3 = (px1) it.next();
                                            if (px1Var3.b()) {
                                                bt.i("Candidate dynamic range must be fully specified.");
                                                return null;
                                            }
                                            if (!px1Var3.equals(px1Var2)) {
                                                if (hi5.i0("CXCP")) {
                                                    px1Var6.toString();
                                                    px1Var3.toString();
                                                }
                                                px1Var2 = px1Var3;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (hi5.i0("CXCP")) {
                                            px1Var6.toString();
                                            px1VarJ2.toString();
                                        }
                                        px1Var2 = px1VarJ2;
                                    }
                                }
                            } else if (hi5.i0("CXCP")) {
                                px1Var6.toString();
                                px1Var2.toString();
                            }
                        } else if (hi5.i0("CXCP")) {
                            px1Var6.toString();
                            px1VarJ.toString();
                        }
                    } else if (hi5.i0("CXCP")) {
                        px1Var6.toString();
                        px1VarJ.toString();
                    }
                    px1Var2 = px1VarJ;
                } else if (!setB1.contains(px1Var2)) {
                    px1Var2 = null;
                    break;
                }
            } else {
                px1Var2 = setB1.contains(px1Var6) ? px1Var6 : null;
            }
            if (px1Var2 == null) {
                throw new IllegalArgumentException("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  " + ((String) er8Var2.d(u18.I)) + "\nRequested dynamic range:\n  " + px1Var6 + "\nSupported dynamic ranges:\n  " + setA + "\nConstrained set of concurrent dynamic ranges:\n  " + setB1);
            }
            q(setB1, px1Var2, vk1Var);
            linkedHashMap.put(er8Var2, px1Var2);
            if (!linkedHashSet.contains(px1Var2)) {
                linkedHashSet2.add(px1Var2);
            }
        }
        return linkedHashMap;
    }

    @Override // defpackage.q63
    public void p(final p63 p63Var, final Executor executor) {
        Handler handler;
        synchronized (this.f0) {
            this.Y = false;
            ImageReader.OnImageAvailableListener onImageAvailableListener = new ImageReader.OnImageAvailableListener() { // from class: le
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    o8 o8Var = this.X;
                    Executor executor2 = executor;
                    p63 p63Var2 = p63Var;
                    synchronized (o8Var.f0) {
                        try {
                            if (!o8Var.Y) {
                                executor2.execute(new sc(o8Var, p63Var2, (byte) 1));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            };
            ImageReader imageReader = (ImageReader) this.Z;
            if (jm4.X != null) {
                handler = jm4.X;
            } else {
                synchronized (jm4.class) {
                    try {
                        if (jm4.X == null) {
                            jm4.X = z91.p(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                handler = jm4.X;
            }
            imageReader.setOnImageAvailableListener(onImageAvailableListener, handler);
        }
    }

    public void r(za9 za9Var) {
        synchronized (this.Z) {
            try {
                ArrayDeque arrayDeque = (ArrayDeque) this.f0;
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    this.f0 = arrayDeque;
                }
                arrayDeque.add(za9Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.iv5
    public void request(long j) {
        switch (this.X) {
            case 6:
                if (!this.Y && j > 0) {
                    this.Y = true;
                    ua5 ua5Var = (ua5) this.f0;
                    ua5Var.g0.onNext(this.Z);
                    ua5Var.i(1L);
                    break;
                }
                break;
            default:
                if (!this.Y) {
                    if (j < 0) {
                        bt.i(ie2.f(j, "n >= required but it was "));
                        break;
                    } else if (j != 0) {
                        this.Y = true;
                        aq7 aq7Var = (aq7) this.Z;
                        if (!aq7Var.X.Y) {
                            Object obj = this.f0;
                            try {
                                aq7Var.onNext(obj);
                                if (!aq7Var.X.Y) {
                                    aq7Var.b();
                                    break;
                                }
                            } catch (Throwable th) {
                                vr3.e0(th, aq7Var, obj);
                                return;
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.q63
    public int s() {
        int maxImages;
        synchronized (this.f0) {
            maxImages = ((ImageReader) this.Z).getMaxImages();
        }
        return maxImages;
    }

    public void t(fb9 fb9Var) {
        za9 za9Var;
        synchronized (this.Z) {
            if (((ArrayDeque) this.f0) != null && !this.Y) {
                this.Y = true;
                while (true) {
                    synchronized (this.Z) {
                        try {
                            za9Var = (za9) ((ArrayDeque) this.f0).poll();
                            if (za9Var == null) {
                                this.Y = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    za9Var.a(fb9Var);
                }
            }
        }
    }

    public String toString() {
        switch (this.X) {
            case 5:
                return "JavaTypeEnhancementState(jsr305=" + ((is3) this.Z) + ')';
            case 10:
                return "SingleSelectionLayout(isStartHandle=" + this.Y + ", crossed=" + k() + ", info=\n\t" + ((xr0) this.f0) + ")";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.q63
    public n63 v() {
        Image imageAcquireNextImage;
        synchronized (this.f0) {
            try {
                imageAcquireNextImage = ((ImageReader) this.Z).acquireNextImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new ke(imageAcquireNextImage);
        }
    }

    public /* synthetic */ o8(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Z = obj;
        this.f0 = obj2;
    }

    public o8(is3 is3Var, f0 f0Var) {
        this.X = (byte) 5;
        this.Z = is3Var;
        this.f0 = f0Var;
        this.Y = is3Var.d || f0Var.B(el3.a) == je6.IGNORE;
    }

    public o8(byte b) {
        this.X = b;
        switch (b) {
            case 7:
                break;
            case 13:
                this.Z = new Object();
                break;
            default:
                this.f0 = new BroadcastReceiver() { // from class: su.happ.proxyutility.util.AlertUtil$mMsgReceiver$1
                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(Context context, Intent intent) {
                        String stringExtra;
                        Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("key", 0)) : null;
                        if (numValueOf == null || numValueOf.intValue() != 122 || (stringExtra = intent.getStringExtra("content")) == null || stringExtra.length() == 0) {
                            return;
                        }
                        o8 o8Var = this.a;
                        if (o8Var.Y) {
                            if (!mm7.Z(stringExtra, false, "data:")) {
                                BaseActivity baseActivity = (BaseActivity) o8Var.Z;
                                if (baseActivity != null) {
                                    be.m(baseActivity, null, stringExtra, null, null, null, null, new x((byte) 6), null, 1524);
                                    return;
                                }
                                return;
                            }
                            AlertMessageData alertMessageData = (AlertMessageData) new com.google.gson.a().c(stringExtra.substring(5), new yi8(AlertMessageData.class));
                            if (alertMessageData != null) {
                                String strC = alertMessageData.c();
                                String strB = alertMessageData.b();
                                String strA = alertMessageData.a();
                                AlertType alertTypeD = alertMessageData.d();
                                strC.getClass();
                                strB.getClass();
                                strA.getClass();
                                alertTypeD.getClass();
                                BaseActivity baseActivity2 = (BaseActivity) o8Var.Z;
                                if (baseActivity2 != null) {
                                    be.m(baseActivity2, strC, strB, null, strA, null, Integer.valueOf(alertTypeD.getLayoutRes()), null, null, 1872);
                                }
                            }
                        }
                    }
                };
                break;
        }
    }

    public o8(String str, u2 u2Var, boolean z) {
        this.X = (byte) 12;
        this.Z = str;
        this.f0 = u2Var;
        this.Y = z;
    }

    public /* synthetic */ o8(byte b, Object obj, Object obj2, boolean z) {
        this.X = b;
        this.Y = z;
        this.Z = obj;
        this.f0 = obj2;
    }

    public o8(boolean z) {
        this.X = (byte) 2;
        this.Y = z;
        this.Z = new AtomicReference(null);
        this.f0 = new nh5(0.0f);
    }

    public o8(SentryAndroidOptions sentryAndroidOptions) {
        this.X = (byte) 11;
        this.f0 = new ArrayList();
        this.Y = false;
        this.Z = sentryAndroidOptions;
    }

    public o8(ImageReader imageReader) {
        this.X = (byte) 1;
        this.f0 = new Object();
        this.Y = true;
        this.Z = imageReader;
    }

    public o8(Executor executor, CameraCharacteristics cameraCharacteristics) {
        this.X = (byte) 8;
        i26 i26Var = sm1.a;
        if (sm1.a.b(LowMemoryQuirk.class) != null) {
            this.Z = new c37(executor);
        } else {
            this.Z = executor;
        }
        this.f0 = i26Var;
        this.Y = i26Var.a(IncorrectJpegMetadataQuirk.class);
    }
}
