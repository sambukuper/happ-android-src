package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tx1 implements sx1 {
    public final DynamicRangeProfiles a;

    public tx1(DynamicRangeProfiles dynamicRangeProfiles) {
        this.a = dynamicRangeProfiles;
    }

    public static Set d(Set set) {
        if (set.isEmpty()) {
            return m02.X;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            px1 px1Var = (px1) qx1.a.get(Long.valueOf(((Number) it.next()).longValue()));
            if (px1Var == null) {
                hi5.m0();
            }
            if (px1Var != null) {
                linkedHashSet.add(px1Var);
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    @Override // defpackage.sx1
    public final Set a() {
        Set<Long> supportedProfiles = this.a.getSupportedProfiles();
        supportedProfiles.getClass();
        return d(supportedProfiles);
    }

    @Override // defpackage.sx1
    public final DynamicRangeProfiles b() {
        return this.a;
    }

    @Override // defpackage.sx1
    public final Set c(px1 px1Var) {
        px1Var.getClass();
        LinkedHashMap linkedHashMap = qx1.a;
        Long lA = qx1.a(px1Var, this.a);
        if (lA == null) {
            xw3.z(px1Var, "DynamicRange is not supported: ");
            return null;
        }
        Set<Long> profileCaptureRequestConstraints = this.a.getProfileCaptureRequestConstraints(lA.longValue());
        profileCaptureRequestConstraints.getClass();
        return d(profileCaptureRequestConstraints);
    }
}
