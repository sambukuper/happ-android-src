package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.media.MediaCodec;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e57 extends a57 {
    public final y73 j = new y73();
    public boolean k = true;
    public final StringBuilder l = new StringBuilder();
    public boolean m = false;
    public final ArrayList n = new ArrayList();

    public final void a(f57 f57Var) {
        xm0 xm0Var = this.b;
        HashSet hashSet = (HashSet) xm0Var.f0;
        ym0 ym0Var = f57Var.g;
        qd5 qd5Var = ym0Var.b;
        int i = ym0Var.c;
        if (i != -1) {
            this.m = true;
            int i2 = xm0Var.Y;
            List list = f57.j;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
            xm0Var.Y = i;
        }
        Range rangeA = ym0Var.a();
        Range range = iz.h;
        boolean zEquals = rangeA.equals(range);
        StringBuilder sb = this.l;
        if (!zEquals) {
            k05 k05Var = (k05) xm0Var.g0;
            zx zxVar = ym0.f;
            boolean zEquals2 = ((Range) k05Var.a(zxVar, range)).equals(range);
            k05 k05Var2 = (k05) xm0Var.g0;
            if (zEquals2) {
                k05Var2.o(zxVar, rangeA);
            } else if (!((Range) k05Var2.a(zxVar, range)).equals(rangeA)) {
                this.k = false;
                String str = "Different ExpectedFrameRateRange values; current = " + ((Range) ((k05) xm0Var.g0).a(zxVar, range)) + ", new = " + rangeA;
                hi5.z0("ValidatingBuilder");
                sb.append(str);
            }
        }
        zx zxVar2 = er8.a0;
        Integer num = (Integer) qd5Var.a(zxVar2, 0);
        Objects.requireNonNull(num);
        int iIntValue = num.intValue();
        if (iIntValue != 0 && iIntValue != 0) {
            ((k05) xm0Var.g0).o(zxVar2, num);
        }
        zx zxVar3 = er8.b0;
        Integer num2 = (Integer) qd5Var.a(zxVar3, 0);
        Objects.requireNonNull(num2);
        int iIntValue2 = num2.intValue();
        if (iIntValue2 != 0 && iIntValue2 != 0) {
            ((k05) xm0Var.g0).o(zxVar3, num2);
        }
        ((a15) xm0Var.h0).a.putAll((Map) ym0Var.e.a);
        this.c.addAll(f57Var.c);
        this.d.addAll(f57Var.d);
        xm0Var.b(ym0Var.d);
        this.e.addAll(f57Var.e);
        d57 d57Var = f57Var.f;
        if (d57Var != null) {
            this.n.add(d57Var);
        }
        InputConfiguration inputConfiguration = f57Var.i;
        if (inputConfiguration != null) {
            this.g = inputConfiguration;
        }
        ArrayList arrayList = f57Var.a;
        LinkedHashSet<fz> linkedHashSet = this.a;
        linkedHashSet.addAll(arrayList);
        hashSet.addAll(Collections.unmodifiableList(ym0Var.a));
        ArrayList arrayList2 = new ArrayList();
        for (fz fzVar : linkedHashSet) {
            arrayList2.add(fzVar.a);
            Iterator it = fzVar.b.iterator();
            while (it.hasNext()) {
                arrayList2.add((wg1) it.next());
            }
        }
        if (!arrayList2.containsAll(hashSet)) {
            hi5.z0("ValidatingBuilder");
            this.k = false;
            sb.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
        }
        int i3 = f57Var.h;
        int i4 = this.h;
        if (i3 != i4 && i3 != 0 && i4 != 0) {
            hi5.z0("ValidatingBuilder");
            this.k = false;
            sb.append("Invalid configuration due to that two non-default session types are set");
        } else if (i3 != 0) {
            this.h = i3;
        }
        fz fzVar2 = f57Var.b;
        if (fzVar2 != null) {
            fz fzVar3 = this.i;
            if (fzVar3 == fzVar2 || fzVar3 == null) {
                this.i = fzVar2;
            } else {
                hi5.z0("ValidatingBuilder");
                this.k = false;
                sb.append("Invalid configuration due to that two different postview output configs are set");
            }
        }
        xm0Var.d(qd5Var);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7 A[EDGE_INSN: B:38:0x00a7->B:39:0x00c8 BREAK  A[LOOP:0: B:16:0x0035->B:48:?]] */
    public final f57 b() {
        zx zxVar;
        Range range;
        if (!this.k) {
            bt.q("Unsupported session configuration combination");
            return null;
        }
        ArrayList arrayList = new ArrayList(this.a);
        y73 y73Var = this.j;
        if (y73Var.X) {
            Collections.sort(arrayList, new cg(y73Var));
        }
        int i = this.h;
        xm0 xm0Var = this.b;
        if (i == 1 && arrayList.size() == 2 && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                wg1 wg1Var = ((fz) it.next()).a;
                wg1Var.getClass();
                if (dh3.f(wg1Var.j, MediaCodec.class)) {
                    HashSet hashSet = (HashSet) xm0Var.f0;
                    if (!hashSet.isEmpty()) {
                        Iterator it2 = hashSet.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                k05 k05Var = (k05) xm0Var.g0;
                                zxVar = ym0.f;
                                range = (Range) k05Var.a(zxVar, iz.h);
                                if (range != null) {
                                    break;
                                }
                                if (((Number) range.getUpper()).intValue() >= 120) {
                                    range = null;
                                } else {
                                    range = null;
                                }
                                if (range != null) {
                                    break;
                                }
                                Range range2 = new Range(30, range.getUpper());
                                range.toString();
                                range2.toString();
                                hi5.z0("HighSpeedFpsModifier");
                                ((k05) xm0Var.g0).o(zxVar, range2);
                                break;
                            }
                            wg1 wg1Var2 = (wg1) it2.next();
                            wg1Var2.getClass();
                            if (dh3.f(wg1Var2.j, MediaCodec.class)) {
                                break;
                            }
                        }
                    } else {
                        k05 k05Var2 = (k05) xm0Var.g0;
                        zxVar = ym0.f;
                        range = (Range) k05Var2.a(zxVar, iz.h);
                        if (range != null) {
                            break;
                        }
                        if (((Number) range.getUpper()).intValue() >= 120 || !dh3.f(range.getLower(), range.getUpper())) {
                            range = null;
                        }
                        if (range != null) {
                            break;
                        }
                        Range range3 = new Range(30, range.getUpper());
                        range.toString();
                        range3.toString();
                        hi5.z0("HighSpeedFpsModifier");
                        ((k05) xm0Var.g0).o(zxVar, range3);
                        break;
                    }
                }
            }
        }
        return new f57(arrayList, new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), xm0Var.e(), this.n.isEmpty() ? null : new t53(this, (byte) 2), this.g, this.h, this.i);
    }

    public final boolean c() {
        return this.m && this.k;
    }
}
