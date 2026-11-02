package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import defpackage.ci8;
import defpackage.d02;
import defpackage.dh3;
import defpackage.ea6;
import defpackage.g44;
import defpackage.li4;
import defpackage.ni4;
import defpackage.u15;
import defpackage.wv0;
import defpackage.x97;
import io.sentry.android.replay.n;
import io.sentry.f4;
import io.sentry.i1;
import io.sentry.protocol.u;
import io.sentry.protocol.w;
import io.sentry.q4;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.t6;
import io.sentry.u6;
import io.sentry.w6;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:123:0x0307  */
    /* JADX WARN: Code duplicated, block: B:217:0x01c3 A[EDGE_INSN: B:217:0x01c3->B:78:0x01c3 BREAK  A[LOOP:2: B:35:0x0107->B:77:0x01b5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0183  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b5 A[LOOP:2: B:35:0x0107->B:77:0x01b5, LOOP_END] */
    public static k a(i1 i1Var, s6 s6Var, long j, Date date, w wVar, int i, int i2, int i3, t6 t6Var, io.sentry.android.replay.l lVar, int i4, int i5, String str, List list, Deque deque, List list2, List list3) {
        Throwable th;
        ArrayList arrayList;
        int i6;
        io.sentry.android.replay.l lVar2;
        s6 s6Var2;
        int i7;
        Object obj;
        long j2;
        Object obj2;
        List list4;
        io.sentry.util.a aVar;
        List<io.sentry.g> list5;
        boolean z;
        io.sentry.rrweb.b bVarA;
        Object obj3;
        s6Var.getClass();
        wVar.getClass();
        list2.getClass();
        list3.getClass();
        if (lVar != null) {
            s6 s6Var3 = lVar.X;
            long jMin = Math.min(j, 300000L);
            long time = date.getTime();
            File file = new File(lVar.m(), i + ".mp4");
            io.sentry.util.a aVar2 = lVar.g0;
            ArrayList arrayList2 = lVar.j0;
            long j3 = 0;
            if (file.exists() && file.length() > 0) {
                file.delete();
            }
            aVar2.g();
            try {
                if (arrayList2.isEmpty()) {
                    try {
                        arrayList = new ArrayList();
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            u15.h(aVar2, th);
                            throw th3;
                        }
                    }
                } else {
                    arrayList = wv0.Z0(arrayList2);
                }
                ArrayList arrayList3 = arrayList;
                io.sentry.android.replay.e eVar = null;
                u15.h(aVar2, null);
                if (arrayList3.isEmpty()) {
                    s6Var3.getLogger().h(s5.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
                    i6 = i4;
                } else {
                    List list6 = arrayList3;
                    i6 = i4;
                    io.sentry.android.core.d dVar = new io.sentry.android.core.d(s6Var3, new io.sentry.android.replay.video.a(file, i3, i2, i6, i5));
                    try {
                        MediaCodec mediaCodec = (MediaCodec) dVar.c;
                        mediaCodec.configure((MediaFormat) ((g44) dVar.d).getValue(), (Surface) null, (MediaCrypto) null, 1);
                        dVar.g = mediaCodec.createInputSurface();
                        mediaCodec.start();
                        dVar.c(false);
                        lVar.h0 = dVar;
                        s6 s6Var4 = s6Var3;
                        long j4 = 1000 / ((long) i6);
                        Object objT0 = wv0.t0(list6);
                        io.sentry.util.a aVar3 = aVar2;
                        long j5 = time + jMin;
                        li4 li4VarX = x97.X(j4, j5 <= Long.MIN_VALUE ? ni4.f0 : new ni4(time, j5 - 1));
                        long j6 = li4VarX.X;
                        long j7 = li4VarX.Y;
                        long j8 = li4VarX.Z;
                        if ((j8 <= 0 || j6 > j7) && (j8 >= 0 || j7 > j6)) {
                            lVar2 = lVar;
                            s6Var2 = s6Var4;
                            i7 = 0;
                        } else {
                            int i8 = 0;
                            while (true) {
                                Iterator it = list6.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj = objT0;
                                        io.sentry.android.replay.m mVar = (io.sentry.android.replay.m) it.next();
                                        long j9 = j6 + j4;
                                        j2 = j8;
                                        long j10 = mVar.b;
                                        if (j6 <= j10 && j10 <= j9) {
                                            obj2 = mVar;
                                            break;
                                        }
                                        if (j10 <= j9) {
                                            objT0 = obj;
                                            j8 = j2;
                                        }
                                    } else {
                                        obj = objT0;
                                        j2 = j8;
                                    }
                                    obj2 = obj;
                                    break;
                                }
                                io.sentry.android.replay.m mVar2 = (io.sentry.android.replay.m) obj2;
                                if (mVar2 != null) {
                                    try {
                                        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(mVar2.a.getAbsolutePath());
                                        lVar2 = lVar;
                                        s6Var2 = s6Var4;
                                        try {
                                            io.sentry.android.core.d dVar2 = lVar2.h0;
                                            if (dVar2 != null) {
                                                bitmapDecodeFile.getClass();
                                                dVar2.d(bitmapDecodeFile);
                                            }
                                            bitmapDecodeFile.recycle();
                                            i8++;
                                            objT0 = obj2;
                                            j7 = j7;
                                            list4 = list6;
                                            aVar = aVar3;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            s6Var2.getLogger().e(s5.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th);
                                            if (obj2 != null) {
                                                lVar2.k(((io.sentry.android.replay.m) obj2).a);
                                                aVar3.g();
                                                try {
                                                    ci8.d(arrayList2).remove(obj2);
                                                    aVar = aVar3;
                                                    u15.h(aVar, null);
                                                    list4 = list6;
                                                    list4.remove(obj2);
                                                    objT0 = null;
                                                } catch (Throwable th5) {
                                                    io.sentry.util.a aVar4 = aVar3;
                                                    try {
                                                        throw th5;
                                                    } catch (Throwable th6) {
                                                        u15.h(aVar4, th5);
                                                        throw th6;
                                                    }
                                                }
                                            } else {
                                                list4 = list6;
                                                aVar = aVar3;
                                                objT0 = obj2;
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        lVar2 = lVar;
                                        s6Var2 = s6Var4;
                                    }
                                    if (j6 != j7) {
                                        break;
                                    }
                                    j6 += j2;
                                    aVar3 = aVar;
                                    list6 = list4;
                                    s6Var4 = s6Var2;
                                    j7 = j7;
                                    j8 = j2;
                                } else {
                                    lVar2 = lVar;
                                    s6Var2 = s6Var4;
                                }
                                if (obj2 != null) {
                                    lVar2.k(((io.sentry.android.replay.m) obj2).a);
                                    aVar3.g();
                                    ci8.d(arrayList2).remove(obj2);
                                    aVar = aVar3;
                                    u15.h(aVar, null);
                                    list4 = list6;
                                    list4.remove(obj2);
                                    objT0 = null;
                                } else {
                                    list4 = list6;
                                    aVar = aVar3;
                                    objT0 = obj2;
                                }
                                if (j6 != j7) {
                                    break;
                                    break;
                                }
                                j6 += j2;
                                aVar3 = aVar;
                                list6 = list4;
                                s6Var4 = s6Var2;
                                j7 = j7;
                                j8 = j2;
                            }
                            i7 = i8;
                        }
                        if (i7 == 0) {
                            s6Var2.getLogger().h(s5.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                            io.sentry.android.core.d dVar3 = lVar2.h0;
                            if (dVar3 != null) {
                                dVar3.f();
                            }
                            lVar2.h0 = null;
                            lVar2.k(file);
                            eVar = null;
                        } else {
                            io.sentry.android.core.d dVar4 = lVar2.h0;
                            if (dVar4 != null) {
                                dVar4.f();
                            }
                            io.sentry.android.core.d dVar5 = lVar2.h0;
                            if (dVar5 != null) {
                                io.sentry.android.replay.video.b bVar = (io.sentry.android.replay.video.b) dVar5.f;
                                if (bVar.e != 0) {
                                    j3 = (bVar.f + bVar.a) / 1000;
                                }
                            }
                            lVar2.h0 = null;
                            lVar2.u(j5);
                            eVar = new io.sentry.android.replay.e(file, i7, j3);
                        }
                    } catch (Throwable th8) {
                        dVar.f();
                        throw th8;
                    }
                }
                if (eVar != null) {
                    File file2 = eVar.a;
                    int i9 = eVar.b;
                    long j11 = eVar.c;
                    if (list == null) {
                        ea6 ea6Var = new ea6();
                        ea6Var.X = d02.X;
                        if (i1Var != null) {
                            i1Var.o(new n(ea6Var, (byte) 1));
                        }
                        list5 = (List) ea6Var.X;
                    } else {
                        list5 = list;
                    }
                    Date date2 = new Date(date.getTime() + j11);
                    u6 u6Var = new u6();
                    u6Var.X = wVar;
                    u6Var.u0 = wVar;
                    u6Var.v0 = i;
                    u6Var.w0 = date2;
                    u6Var.x0 = date;
                    u6Var.t0 = t6Var;
                    u6Var.r0 = file2;
                    u6Var.A0 = list2;
                    u6Var.B0 = list3;
                    ArrayList arrayList4 = new ArrayList();
                    io.sentry.rrweb.j jVar = new io.sentry.rrweb.j();
                    jVar.Y = date.getTime();
                    jVar.f0 = i2;
                    jVar.g0 = i3;
                    arrayList4.add(jVar);
                    io.sentry.rrweb.m mVar3 = new io.sentry.rrweb.m();
                    mVar3.Y = date.getTime();
                    mVar3.f0 = i;
                    mVar3.h0 = j11;
                    mVar3.m0 = i9;
                    mVar3.g0 = file2.length();
                    mVar3.o0 = i6;
                    mVar3.k0 = i2;
                    mVar3.l0 = i3;
                    mVar3.p0 = 0;
                    mVar3.q0 = 0;
                    arrayList4.add(mVar3);
                    LinkedList linkedList = new LinkedList();
                    io.sentry.g gVar = null;
                    for (io.sentry.g gVar2 : list5) {
                        if (gVar == null || !dh3.f(gVar.i0, "network.event")) {
                            z = false;
                        } else {
                            Map mapB = gVar.b();
                            mapB.getClass();
                            Object obj4 = mapB.get("action");
                            if (obj4 == null) {
                                obj4 = null;
                            }
                            if (dh3.f(obj4, "NETWORK_AVAILABLE") && dh3.f(gVar2.i0, "network.event") && gVar2.b().containsKey("network_type") && gVar2.c().getTime() + StateDownloadFileV2.Success.OUTDATED_DURATION_MS >= date.getTime()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if ((gVar2.c().getTime() >= date.getTime() || z) && gVar2.c().getTime() < date2.getTime() && (bVarA = s6Var.getReplayController().getO0().a(gVar2)) != null) {
                            arrayList4.add(bVarA);
                            io.sentry.rrweb.a aVar5 = bVarA instanceof io.sentry.rrweb.a ? (io.sentry.rrweb.a) bVarA : null;
                            if (dh3.f(aVar5 != null ? aVar5.h0 : null, "navigation")) {
                                io.sentry.rrweb.a aVar6 = (io.sentry.rrweb.a) bVarA;
                                ConcurrentHashMap concurrentHashMap = aVar6.k0;
                                if (concurrentHashMap == null || (obj3 = concurrentHashMap.get("to")) == null) {
                                    obj3 = null;
                                }
                                if (obj3 instanceof String) {
                                    ConcurrentHashMap concurrentHashMap2 = aVar6.k0;
                                    concurrentHashMap2.getClass();
                                    Object obj5 = concurrentHashMap2.get("to");
                                    obj5.getClass();
                                    linkedList.add((String) obj5);
                                }
                            }
                        }
                        gVar = gVar2;
                    }
                    if (str != null && !dh3.f(wv0.t0(linkedList), str)) {
                        linkedList.addFirst(str);
                    }
                    long time2 = date2.getTime();
                    Iterator it2 = deque.iterator();
                    it2.getClass();
                    while (it2.hasNext()) {
                        io.sentry.rrweb.b bVar2 = (io.sentry.rrweb.b) it2.next();
                        long j12 = bVar2.Y;
                        if (j12 < time2) {
                            if (j12 >= date.getTime()) {
                                arrayList4.add(bVar2);
                            }
                            it2.remove();
                        }
                    }
                    if (i == 0) {
                        io.sentry.rrweb.k kVar = new io.sentry.rrweb.k(io.sentry.rrweb.c.Custom);
                        HashMap map = new HashMap();
                        kVar.f0 = map;
                        kVar.Z = "options";
                        u sdkVersion = s6Var.getSdkVersion();
                        if (sdkVersion != null) {
                            map.put("nativeSdkName", sdkVersion.X);
                            map.put("nativeSdkVersion", sdkVersion.Y);
                        }
                        w6 sessionReplay = s6Var.getSessionReplay();
                        Double d = sessionReplay.e;
                        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) sessionReplay.a;
                        map.put("errorSampleRate", d);
                        map.put("sessionSampleRate", sessionReplay.d);
                        map.put("maskAllImages", Boolean.valueOf(copyOnWriteArraySet.contains("android.widget.ImageView")));
                        map.put("maskAllText", Boolean.valueOf(copyOnWriteArraySet.contains("android.widget.TextView")));
                        map.put("quality", sessionReplay.f.serializedName());
                        map.put("maskedViewClasses", copyOnWriteArraySet);
                        map.put("unmaskedViewClasses", (CopyOnWriteArraySet) sessionReplay.b);
                        map.put("screenshotStrategy", sessionReplay.n == q4.PIXEL_COPY ? "pixelCopy" : "canvas");
                        map.put("networkDetailHasUrls", Boolean.valueOf(!sessionReplay.p.isEmpty()));
                        if (!sessionReplay.p.isEmpty()) {
                            map.put("networkDetailAllowUrls", sessionReplay.p);
                            map.put("networkRequestHeaders", sessionReplay.s);
                            map.put("networkResponseHeaders", sessionReplay.t);
                            map.put("networkCaptureBodies", Boolean.valueOf(sessionReplay.r));
                            if (!sessionReplay.q.isEmpty()) {
                                map.put("networkDetailDenyUrls", sessionReplay.q);
                            }
                        }
                        arrayList4.add(kVar);
                    }
                    f4 f4Var = new f4();
                    f4Var.X = Integer.valueOf(i);
                    f4Var.Y = wv0.S0(arrayList4, new g());
                    u6Var.y0 = linkedList;
                    return new i(u6Var, f4Var);
                }
            } catch (Throwable th9) {
                th = th9;
            }
        }
        return j.a;
    }
}
