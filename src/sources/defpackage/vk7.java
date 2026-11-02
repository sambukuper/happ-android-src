package defpackage;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vk7 {
    public final ue5 a;
    public final LinkedHashMap b;
    public final y45 c;

    public vk7(StreamConfigurationMap streamConfigurationMap, ue5 ue5Var) {
        ue5Var.getClass();
        this.a = ue5Var;
        this.b = new LinkedHashMap();
        new LinkedHashMap();
        new LinkedHashMap();
        this.c = Build.VERSION.SDK_INT >= 34 ? new wk7(streamConfigurationMap) : new y45(streamConfigurationMap);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    public final Size[] a(int i) {
        Size[] sizeArr;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.b;
        Size[] sizeArrG = null;
        if (linkedHashMap.containsKey(numValueOf)) {
            Size[] sizeArr2 = (Size[]) linkedHashMap.get(Integer.valueOf(i));
            if (sizeArr2 != null) {
                return (Size[]) sizeArr2.clone();
            }
            return null;
        }
        try {
            sizeArrG = this.c.G(i);
        } catch (Throwable unused) {
            hi5.z0("StreamConfigurationMapCompat");
        }
        if (sizeArrG == null || sizeArrG.length == 0) {
            hi5.z0("StreamConfigurationMapCompat");
            return sizeArrG;
        }
        ue5 ue5Var = this.a;
        ue5Var.getClass();
        sizeArrG.getClass();
        ArrayList arrayList = new ArrayList(new jt(sizeArrG, false));
        if (ue5Var.c != null) {
            if (i == 34) {
                String str = Build.MANUFACTURER;
                str.getClass();
                if (!str.equalsIgnoreCase("Motorola")) {
                    String str2 = Build.BRAND;
                    str2.getClass();
                    if (!str2.equalsIgnoreCase("Motorola")) {
                        sizeArr = new Size[0];
                    } else if ("moto e5 play".equalsIgnoreCase(Build.MODEL)) {
                        sizeArr = new Size[]{new Size(1440, 1080), new Size(960, 720)};
                    } else {
                        sizeArr = new Size[0];
                    }
                } else if ("moto e5 play".equalsIgnoreCase(Build.MODEL)) {
                    sizeArr = new Size[]{new Size(1440, 1080), new Size(960, 720)};
                } else {
                    sizeArr = new Size[0];
                }
            } else {
                sizeArr = new Size[0];
            }
            if (sizeArr.length != 0) {
                bw0.e0(arrayList, sizeArr);
            }
        }
        jj0 jj0Var = ue5Var.a;
        if (jj0Var != null && ue5Var.b != null) {
            String str3 = ((lf0) jj0Var).X;
            str3.getClass();
            boolean zT = km4.T();
            Collection<?> collectionL = d02.X;
            if (zT) {
                if (str3.equals("0") && i == 256) {
                    collectionL = i21.L(new Size(4160, 3120), new Size(4000, 3000));
                }
            } else if (km4.U()) {
                if (str3.equals("0") && i == 256) {
                    collectionL = i21.L(new Size(4160, 3120), new Size(4000, 3000));
                }
            } else if (km4.Q()) {
                if (str3.equals("0") && (i == 34 || i == 35)) {
                    collectionL = i21.L(new Size(720, 720), new Size(400, 400));
                }
            } else if (km4.Y()) {
                if (str3.equals("0")) {
                    if (i == 34) {
                        collectionL = i21.L(new Size(4128, 3096), new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                    } else if (i == 35) {
                        collectionL = i21.L(new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                    }
                } else if (str3.equals("1") && (i == 34 || i == 35)) {
                    collectionL = i21.L(new Size(3264, 2448), new Size(3264, 1836), new Size(2448, 2448), new Size(1920, 1920), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                }
            } else if (km4.X()) {
                if (str3.equals("0")) {
                    if (i == 34) {
                        collectionL = i21.L(new Size(4128, 3096), new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                    } else if (i == 35) {
                        collectionL = i21.L(new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                    }
                } else if (str3.equals("1") && (i == 34 || i == 35)) {
                    collectionL = i21.L(new Size(2576, 1932), new Size(2560, 1440), new Size(1920, 1920), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                }
            } else if (km4.V()) {
                if (str3.equals("0") && i == 256) {
                    collectionL = i21.K(new Size(9280, 6944));
                }
            } else if (km4.W()) {
                if (i == 35) {
                    collectionL = i21.L(new Size(3840, 2160), new Size(3264, 2448), new Size(3200, 2400), new Size(2688, 1512), new Size(2592, 1944), new Size(2592, 1940), new Size(1920, 1440));
                }
            } else if (km4.S()) {
                if (i == 35) {
                    collectionL = i21.L(new Size(4032, 3024), new Size(4000, 3000), new Size(3264, 2448), new Size(3200, 2400), new Size(3024, 3024), new Size(2976, 2976), new Size(2448, 2448));
                }
            } else if (!km4.Z()) {
                hi5.z0("ExcludedSupportedSizesQuirk");
            } else if (str3.equals("1") && i == 35) {
                collectionL = i21.L(new Size(1280, 720), new Size(1920, 1080), new Size(2304, 1296), new Size(640, 360), new Size(177, 144), new Size(2336, 1080), new Size(2400, 1080), new Size(1920, 824), new Size(1088, 1088), new Size(1728, 1728), new Size(2736, 2736), new Size(1824, 712));
            }
            Collection<?> collection = collectionL;
            if (!collection.isEmpty()) {
                arrayList.removeAll(collection);
            }
        }
        if (arrayList.isEmpty()) {
            hi5.z0("OutputSizesCorrector");
        }
        Size[] sizeArr3 = (Size[]) arrayList.toArray(new Size[0]);
        linkedHashMap.put(Integer.valueOf(i), sizeArr3);
        return (Size[]) sizeArr3.clone();
    }
}
