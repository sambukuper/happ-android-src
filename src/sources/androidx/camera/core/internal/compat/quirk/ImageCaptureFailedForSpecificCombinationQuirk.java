package androidx.camera.core.internal.compat.quirk;

import defpackage.er8;
import defpackage.f26;
import defpackage.gr8;
import defpackage.hq8;
import defpackage.lt5;
import defpackage.x53;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements f26 {
    public static final HashSet a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    public static boolean b(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() == 3) {
            Iterator it = linkedHashSet.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (it.hasNext()) {
                hq8 hq8Var = (hq8) it.next();
                if (hq8Var instanceof lt5) {
                    z = true;
                } else if (hq8Var instanceof x53) {
                    z3 = true;
                } else if (hq8Var.h.h(er8.W)) {
                    z2 = hq8Var.h.s() == gr8.f0;
                }
            }
            if (z && z2 && z3) {
                return true;
            }
        }
        return false;
    }
}
