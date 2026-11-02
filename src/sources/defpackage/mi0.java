package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import android.view.SurfaceHolder;
import androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk;
import androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk;
import io.sentry.c2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mi0 {
    public final wg0 a;
    public final lx0 b;
    public final jh0 c;
    public final ik0 d;
    public final t79 e;
    public final k28 f;
    public final jj0 g;
    public final bm0 h;
    public final dq i;
    public final wl6 j;
    public final DynamicRangeProfiles k;

    public mi0(wg0 wg0Var, lx0 lx0Var, jh0 jh0Var, ik0 ik0Var, t79 t79Var, k28 k28Var, jj0 jj0Var, bm0 bm0Var, dq dqVar) {
        vk1 vk1VarC;
        wg0Var.getClass();
        lx0Var.getClass();
        jh0Var.getClass();
        ik0Var.getClass();
        t79Var.getClass();
        this.a = wg0Var;
        this.b = lx0Var;
        this.c = jh0Var;
        this.d = ik0Var;
        this.e = t79Var;
        this.f = k28Var;
        this.g = jj0Var;
        this.h = bm0Var;
        this.i = dqVar;
        this.j = new wl6((byte) 19);
        int i = Build.VERSION.SDK_INT;
        DynamicRangeProfiles dynamicRangeProfilesB = null;
        if (i >= 33 && jj0Var != null && (vk1VarC = c4.c(jj0Var)) != null) {
            if (i < 33) {
                kp5.h(ie2.h("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher. is not supported on API ", i, " (requires API 33)"));
                throw null;
            }
            dynamicRangeProfilesB = ((sx1) vk1VarC.Y).b();
        }
        this.k = dynamicRangeProfilesB;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0222  */
    /* JADX WARN: Code duplicated, block: B:102:0x022d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0330  */
    /* JADX WARN: Code duplicated, block: B:188:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:206:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x012a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0136  */
    /* JADX WARN: Code duplicated, block: B:54:0x013b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0143  */
    /* JADX WARN: Code duplicated, block: B:57:0x0146  */
    /* JADX WARN: Code duplicated, block: B:59:0x014e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0151  */
    /* JADX WARN: Code duplicated, block: B:62:0x0155  */
    /* JADX WARN: Code duplicated, block: B:64:0x0161  */
    /* JADX WARN: Code duplicated, block: B:66:0x016f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0192  */
    /* JADX WARN: Code duplicated, block: B:77:0x0198  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:95:0x0202  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Code duplicated, block: B:97:0x021a  */
    public final li0 a(int i, f57 f57Var, boolean z, st2 st2Var, Integer num, Map map, Map map2) {
        boolean z2;
        int i2;
        el0 el0Var;
        ArrayList arrayList;
        String str;
        bf5 bf5Var;
        bf5 bf5Var2;
        Iterator it;
        el0 el0Var2;
        af5 af5Var;
        String str2;
        bf5 bf5Var3;
        bf5 bf5Var4;
        lh4 lh4Var;
        cf5 cf5Var;
        df5 df5Var;
        ze5 ze5VarH;
        el0 el0Var3;
        t79 t79Var;
        List list;
        Long l;
        df5 df5Var2;
        Long l2;
        cf5 cf5Var2;
        Class cls;
        lh4 lh4Var2;
        lh4 lh4Var3 = lh4.n0;
        Integer num2 = 0;
        map.getClass();
        map2.getClass();
        boolean z3 = i == 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        boolean z4 = z3;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (f57Var != null) {
            ym0 ym0Var = f57Var.g;
            dq dqVar = this.i;
            if (dqVar != null) {
                tv tvVar = ((hj0) dqVar.Y).a;
                List list2 = f57Var.c;
                list2.getClass();
                tvVar.a = wv0.Y0(list2);
                tv tvVar2 = (tv) ((dq) dqVar.Z).Z;
                List list3 = f57Var.d;
                list3.getClass();
                tvVar2.a = wv0.Y0(list3);
            }
            int i3 = ym0Var.c;
            if (i3 == -1) {
                i3 = 1;
            }
            linkedHashMap2.putAll(this.f.e(new we6(i3)));
            linkedHashMap2.putAll(w45.V(ym0Var.b));
            if (i == 2) {
                xu4 xu4Var = sj0.a;
                num.getClass();
                linkedHashMap2.put(xu4Var, num);
            }
            String str3 = (String) f57Var.g.b.a(gg0.p0, null);
            Iterator it2 = f57Var.a.iterator();
            el0 el0Var4 = null;
            while (it2.hasNext()) {
                fz fzVar = (fz) it2.next();
                wg1 wg1Var = fzVar.a;
                lh4 lh4Var4 = lh4Var3;
                int i4 = fzVar.d;
                wg1Var.getClass();
                String str4 = str3 == null ? null : str3;
                int i5 = i3;
                px1 px1Var = fzVar.e;
                px1Var.getClass();
                String str5 = str3;
                int i6 = fzVar.c;
                int i7 = Build.VERSION.SDK_INT;
                boolean z5 = z4;
                if (i7 >= 33) {
                    it = it2;
                    el0Var2 = el0Var4;
                    af5 af5Var2 = new af5(1L);
                    DynamicRangeProfiles dynamicRangeProfiles = this.k;
                    if (dynamicRangeProfiles == null) {
                        af5Var = af5Var2;
                    } else {
                        Long lA = qx1.a(px1Var, dynamicRangeProfiles);
                        if (lA != null) {
                            af5Var = new af5(lA.longValue());
                        } else {
                            if (hi5.j0()) {
                                px1Var.toString();
                            }
                            af5Var = af5Var2;
                        }
                    }
                } else {
                    it = it2;
                    el0Var2 = el0Var4;
                    af5Var = null;
                }
                Size size = wg1Var.h;
                size.getClass();
                int i8 = wg1Var.i;
                if (str4 == null) {
                    str2 = null;
                } else {
                    vi0.a(str4);
                    str2 = str4;
                }
                if (i6 != 0) {
                    if (i6 != 1) {
                        bf5Var4 = null;
                    } else {
                        bf5Var3 = new bf5(2);
                    }
                    if (z) {
                        cls = fzVar.a.j;
                        if (dh3.f(cls, MediaCodec.class)) {
                            lh4Var2 = lh4.r0;
                        } else if (dh3.f(cls, SurfaceHolder.class)) {
                            lh4Var2 = lh4.o0;
                        } else if (dh3.f(cls, SurfaceTexture.class)) {
                            lh4Var2 = lh4.p0;
                        } else {
                            lh4Var = lh4Var4;
                        }
                        lh4Var = lh4Var2;
                    } else {
                        lh4Var = lh4Var4;
                    }
                    if (z5) {
                        size = size;
                        cf5Var = null;
                    } else {
                        jj0 jj0Var = this.g;
                        l2 = (Long) map.get(wg1Var);
                        if (l2 != null) {
                            cf5Var2 = new cf5(l2.longValue());
                        } else {
                            cf5Var2 = null;
                        }
                        if (i7 >= 33 || cf5Var2 == null || jj0Var == null) {
                            if (hi5.m0()) {
                                Objects.toString(wg1Var);
                                Objects.toString(cf5Var2);
                            }
                            cf5Var2 = null;
                        } else {
                            CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
                            key.getClass();
                            long[] jArr = (long[]) ((lf0) jj0Var).c(key);
                            if (jArr == null || !eu.b0(jArr, cf5Var2.a)) {
                                if (hi5.m0()) {
                                    Objects.toString(wg1Var);
                                    Objects.toString(cf5Var2);
                                }
                                cf5Var2 = null;
                            }
                        }
                        cf5Var = cf5Var2;
                    }
                    if (z5) {
                        df5Var = null;
                    } else {
                        l = (Long) map2.get(wg1Var);
                        if (l != null) {
                            df5Var2 = new df5(l.longValue());
                        } else {
                            df5Var2 = null;
                        }
                        df5Var = df5Var2;
                    }
                    ze5VarH = we5.h(i8, 544, lh4Var, af5Var, bf5Var4, cf5Var, df5Var, size, str2);
                    List list4 = fzVar.b;
                    list4.getClass();
                    el0Var4 = el0Var2;
                    for (wg1 wg1Var2 : wv0.I0(list4, wg1Var)) {
                        el0Var3 = new el0(i21.K(ze5VarH));
                        linkedHashMap3.put(el0Var3, wg1Var2);
                        if (i4 == -1) {
                            list = (List) linkedHashMap.get(Integer.valueOf(i4));
                            if (list == null) {
                                linkedHashMap.put(Integer.valueOf(i4), i21.N(el0Var3));
                            } else {
                                list.add(el0Var3);
                            }
                        }
                        if (dh3.f(wg1Var2, wg1Var)) {
                            t79Var = this.e;
                            wg1Var2.getClass();
                            if (t79Var.e(wg1Var2, f57Var)) {
                                el0Var4 = el0Var3;
                            }
                        }
                        i4 = i4;
                    }
                    str3 = str5;
                    lh4Var3 = lh4Var4;
                    i3 = i5;
                    z4 = z5;
                    it2 = it;
                } else {
                    bf5Var3 = new bf5(1);
                }
                bf5Var4 = bf5Var3;
                if (z) {
                    cls = fzVar.a.j;
                    if (dh3.f(cls, MediaCodec.class)) {
                        lh4Var2 = lh4.r0;
                    } else if (dh3.f(cls, SurfaceHolder.class)) {
                        lh4Var2 = lh4.o0;
                    } else if (dh3.f(cls, SurfaceTexture.class)) {
                        lh4Var2 = lh4.p0;
                    } else {
                        lh4Var = lh4Var4;
                    }
                    lh4Var = lh4Var2;
                } else {
                    lh4Var = lh4Var4;
                }
                if (z5) {
                    jj0 jj0Var2 = this.g;
                    l2 = (Long) map.get(wg1Var);
                    if (l2 != null) {
                        cf5Var2 = new cf5(l2.longValue());
                    } else {
                        cf5Var2 = null;
                    }
                    if (i7 >= 33) {
                        if (hi5.m0()) {
                            Objects.toString(wg1Var);
                            Objects.toString(cf5Var2);
                        }
                        cf5Var2 = null;
                    } else {
                        if (hi5.m0()) {
                            Objects.toString(wg1Var);
                            Objects.toString(cf5Var2);
                        }
                        cf5Var2 = null;
                    }
                    cf5Var = cf5Var2;
                } else {
                    size = size;
                    cf5Var = null;
                }
                if (z5) {
                    l = (Long) map2.get(wg1Var);
                    if (l != null) {
                        df5Var2 = new df5(l.longValue());
                    } else {
                        df5Var2 = null;
                    }
                    df5Var = df5Var2;
                } else {
                    df5Var = null;
                }
                ze5VarH = we5.h(i8, 544, lh4Var, af5Var, bf5Var4, cf5Var, df5Var, size, str2);
                List list5 = fzVar.b;
                list5.getClass();
                el0Var4 = el0Var2;
                while (r8.hasNext()) {
                    el0Var3 = new el0(i21.K(ze5VarH));
                    linkedHashMap3.put(el0Var3, wg1Var2);
                    if (i4 == -1) {
                        list = (List) linkedHashMap.get(Integer.valueOf(i4));
                        if (list == null) {
                            linkedHashMap.put(Integer.valueOf(i4), i21.N(el0Var3));
                        } else {
                            list.add(el0Var3);
                        }
                    }
                    if (dh3.f(wg1Var2, wg1Var)) {
                        t79Var = this.e;
                        wg1Var2.getClass();
                        if (t79Var.e(wg1Var2, f57Var)) {
                            el0Var4 = el0Var3;
                        }
                    }
                    i4 = i4;
                }
                str3 = str5;
                lh4Var3 = lh4Var4;
                i3 = i5;
                z4 = z5;
                it2 = it;
            }
            int i9 = i3;
            z2 = z4;
            el0 el0Var5 = el0Var4;
            if (f57Var.i != null && el0Var5 != null) {
                arrayList2.add(new be3(el0Var5, ((ze5) wv0.O0(el0Var5.a)).b));
            }
            i2 = i9;
        } else {
            z2 = z4;
            i2 = 1;
        }
        ik0 ik0Var = this.d;
        if (ik0Var.a().a(CaptureSessionStuckQuirk.class)) {
            hi5.i0("CXCP");
        }
        String str6 = Build.MODEL;
        str6.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = str6.toLowerCase(locale);
        lowerCase.getClass();
        boolean Z = mm7.Z(lowerCase, false, "cph");
        ji0 ji0Var = new ji0((!z2 || um1.a().b(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class) == null) && um1.a().b(DisableAbortCapturesOnStopQuirk.class) == null && Build.VERSION.SDK_INT >= 30, new r75(ik0Var.a().a(QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.class) ? 1 : 0, ki0.X), Z ? 1 : 0, ((CloseCameraDeviceOnCameraGraphCloseQuirk) this.j.Y) != null ? (CloseCameraDeviceOnCameraGraphCloseQuirk.c || !(!CloseCameraDeviceOnCameraGraphCloseQuirk.e || CloseCameraDeviceOnCameraGraphCloseQuirk.a || CloseCameraDeviceOnCameraGraphCloseQuirk.b)) ? z2 : true : false, 9);
        if (f57Var != null) {
            ym0 ym0Var2 = f57Var.g;
            Integer num3 = (Integer) ym0Var2.b.a(er8.a0, num2);
            Objects.requireNonNull(num3);
            int iIntValue = num3.intValue();
            Integer num4 = (Integer) ym0Var2.b.a(er8.b0, num2);
            Objects.requireNonNull(num4);
            int iIntValue2 = num4.intValue();
            if (iIntValue != 1 && iIntValue2 != 1) {
                if (iIntValue == 2) {
                    num2 = 2;
                } else if (iIntValue2 == 2) {
                    num2 = 1;
                } else {
                    num2 = null;
                }
            }
        } else {
            num2 = null;
        }
        Range rangeA = f57Var != null ? f57Var.g.a() : null;
        if (dh3.f(rangeA, iz.h)) {
            rangeA = null;
        }
        ip4 ip4Var = new ip4();
        if (z2) {
            ip4Var.put(sj0.c, Boolean.TRUE);
        }
        if (num2 != null) {
            ip4Var.put(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(num2.intValue()));
        }
        ip4Var.put(sj0.b, "android.hardware.camera2.CaptureRequest.setTag.CX");
        if (rangeA != null) {
            ip4Var.put(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeA);
        }
        ip4 ip4VarB = ip4Var.b();
        if (rangeA != null) {
            linkedHashMap2.put(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeA);
        }
        if (num2 != null) {
            linkedHashMap2.put(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, num2);
        }
        if (f57Var != null) {
            String str7 = (String) f57Var.g.b.a(gg0.p0, null);
            fz fzVar2 = f57Var.b;
            if (fzVar2 != null) {
                wg1 wg1Var3 = fzVar2.a;
                wg1Var3.getClass();
                if (str7 == null) {
                    str7 = null;
                }
                int i10 = fzVar2.c;
                Size size2 = wg1Var3.h;
                size2.getClass();
                int i11 = wg1Var3.i;
                if (str7 == null) {
                    str = null;
                } else {
                    vi0.a(str7);
                    str = str7;
                }
                if (i10 != 0) {
                    if (i10 != 1) {
                        bf5Var2 = null;
                    } else {
                        bf5Var = new bf5(2);
                    }
                    el0Var = new el0(i21.K(we5.h(i11, XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax, null, null, bf5Var2, null, null, size2, str)));
                    linkedHashMap3.put(el0Var, wg1Var3);
                } else {
                    bf5Var = new bf5(1);
                }
                bf5Var2 = bf5Var;
                el0Var = new el0(i21.K(we5.h(i11, XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax, null, null, bf5Var2, null, null, size2, str)));
                linkedHashMap3.put(el0Var, wg1Var3);
            } else {
                el0Var = null;
            }
        } else {
            el0Var = null;
        }
        bm0 bm0Var = this.h;
        if (bm0Var != null) {
            zx zxVar = pf0.a;
            arrayList = null;
            if (bm0Var.X.a(pf0.a, null) != null) {
                c2.m();
                return null;
            }
        } else {
            arrayList = null;
        }
        String str8 = this.c.Y;
        List listY0 = wv0.Y0(linkedHashMap3.keySet());
        List listY1 = wv0.Y0(linkedHashMap.values());
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        return new li0(new hi0(str8, listY0, listY1, arrayList, el0Var, i2, linkedHashMap2, i, ip4VarB, i21.L(this.a, this.b), i21.M(st2Var), ji0Var), zp4.Q(linkedHashMap3));
    }

    public final String toString() {
        return "CameraGraphConfigProvider<" + ((Object) vi0.b(this.c.Y)) + '>';
    }
}
