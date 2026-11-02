package defpackage;

import android.media.MediaCodec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h57 {
    public final Collection a;
    public final boolean b;
    public final vz7 c;
    public final vz7 d;
    public final vz7 e;
    public final vz7 f;
    public final vz7 g;

    public h57(Collection collection, boolean z) {
        this.a = collection;
        this.b = z;
        final byte b = 0;
        this.c = new vz7(new dn2(this) { // from class: g57
            public final /* synthetic */ h57 Y;

            {
                this.Y = this;
            }

            /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:98:0x0259  */
            @Override // defpackage.dn2
            public final Object invoke() {
                byte b2 = b;
                h57 h57Var = this.Y;
                switch (b2) {
                    case 0:
                        ArrayList<f57> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (hq8 hq8Var : h57Var.a) {
                            boolean z2 = h57Var.b;
                            hq8Var.getClass();
                            f57 f57Var = z2 ? hq8Var.o : hq8Var.p;
                            f57Var.getClass();
                            arrayList.add(f57Var);
                            er8 er8Var = hq8Var.h;
                            er8Var.getClass();
                            arrayList2.add(er8Var);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((f57) it.next()).g.c == 5) {
                                    hi5.j0();
                                    return e02.X;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        zx zxVar = kl7.a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (f57 f57Var2 : arrayList) {
                            if (f57Var2.g.b.X.containsKey(zxVar) && f57Var2.b().size() != 1) {
                                if (!hi5.j0()) {
                                    return linkedHashMap;
                                }
                                f57Var2.b().size();
                                return linkedHashMap;
                            }
                            if (f57Var2.g.b.X.containsKey(zxVar)) {
                                int i = 0;
                                for (f57 f57Var3 : arrayList) {
                                    if (((er8) arrayList3.get(i)).s() == gr8.h0) {
                                        List listB = f57Var3.b();
                                        listB.getClass();
                                        mb6.s("MeteringRepeating should contain a surface", !listB.isEmpty());
                                        linkedHashMap.put(f57Var3.b().get(0), 1L);
                                    } else if (f57Var3.g.b.X.containsKey(zxVar)) {
                                        List listB2 = f57Var3.b();
                                        listB2.getClass();
                                        if (!listB2.isEmpty()) {
                                            Object obj = f57Var3.b().get(0);
                                            Object objD = f57Var3.g.b.d(zxVar);
                                            objD.getClass();
                                            linkedHashMap.put(obj, objD);
                                        }
                                    }
                                    i++;
                                }
                                if (hi5.i0("CXCP")) {
                                    return linkedHashMap;
                                }
                                linkedHashMap.toString();
                                return linkedHashMap;
                            }
                        }
                        if (hi5.i0("CXCP")) {
                            return linkedHashMap;
                        }
                        linkedHashMap.toString();
                        return linkedHashMap;
                    case 1:
                        Collection<hq8> collection2 = h57Var.a;
                        ArrayList<f57> arrayList4 = new ArrayList(xv0.Z(collection2, 10));
                        for (hq8 hq8Var2 : collection2) {
                            boolean z3 = h57Var.b;
                            hq8Var2.getClass();
                            f57 f57Var4 = z3 ? hq8Var2.o : hq8Var2.p;
                            f57Var4.getClass();
                            arrayList4.add(f57Var4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (f57 f57Var5 : arrayList4) {
                            List<wg1> listB3 = f57Var5.b();
                            ym0 ym0Var = f57Var5.g;
                            for (wg1 wg1Var : listB3) {
                                qd5 qd5Var = ym0Var.b;
                                zx zxVar2 = gg0.o0;
                                if (!qd5Var.X.containsKey(zxVar2) || qd5Var.d(zxVar2) == null) {
                                    linkedHashMap2.put(wg1Var, Long.valueOf(dh3.f(wg1Var.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object objD2 = qd5Var.d(zxVar2);
                                    objD2.getClass();
                                    linkedHashMap2.put(wg1Var, objD2);
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        e57 e57Var = new e57();
                        for (hq8 hq8Var3 : h57Var.a) {
                            boolean z4 = h57Var.b;
                            hq8Var3.getClass();
                            f57 f57Var6 = z4 ? hq8Var3.o : hq8Var3.p;
                            f57Var6.getClass();
                            e57Var.a(f57Var6);
                        }
                        return e57Var;
                    case 3:
                        vz7 vz7Var = h57Var.e;
                        if (((e57) vz7Var.getValue()).c()) {
                            return ((e57) vz7Var.getValue()).b();
                        }
                        bt.i("Check failed.");
                        return null;
                    default:
                        vz7 vz7Var2 = h57Var.f;
                        if (!((e57) h57Var.e.getValue()).c()) {
                            bt.i("Check failed.");
                            return null;
                        }
                        fz fzVar = ((f57) vz7Var2.getValue()).b;
                        if (fzVar != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List listB4 = ((f57) vz7Var2.getValue()).b();
                            listB4.getClass();
                            arrayList5.addAll(listB4);
                            wg1 wg1Var2 = fzVar.a;
                            wg1Var2.getClass();
                            arrayList5.add(wg1Var2);
                            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((f57) vz7Var2.getValue()).b();
                }
            }
        });
        final byte b2 = 1;
        this.d = new vz7(new dn2(this) { // from class: g57
            public final /* synthetic */ h57 Y;

            {
                this.Y = this;
            }

            /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:98:0x0259  */
            @Override // defpackage.dn2
            public final Object invoke() {
                byte b3 = b2;
                h57 h57Var = this.Y;
                switch (b3) {
                    case 0:
                        ArrayList<f57> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (hq8 hq8Var : h57Var.a) {
                            boolean z2 = h57Var.b;
                            hq8Var.getClass();
                            f57 f57Var = z2 ? hq8Var.o : hq8Var.p;
                            f57Var.getClass();
                            arrayList.add(f57Var);
                            er8 er8Var = hq8Var.h;
                            er8Var.getClass();
                            arrayList2.add(er8Var);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((f57) it.next()).g.c == 5) {
                                    hi5.j0();
                                    return e02.X;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        zx zxVar = kl7.a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (f57 f57Var2 : arrayList) {
                            if (f57Var2.g.b.X.containsKey(zxVar) && f57Var2.b().size() != 1) {
                                if (!hi5.j0()) {
                                    return linkedHashMap;
                                }
                                f57Var2.b().size();
                                return linkedHashMap;
                            }
                            if (f57Var2.g.b.X.containsKey(zxVar)) {
                                int i = 0;
                                for (f57 f57Var3 : arrayList) {
                                    if (((er8) arrayList3.get(i)).s() == gr8.h0) {
                                        List listB = f57Var3.b();
                                        listB.getClass();
                                        mb6.s("MeteringRepeating should contain a surface", !listB.isEmpty());
                                        linkedHashMap.put(f57Var3.b().get(0), 1L);
                                    } else if (f57Var3.g.b.X.containsKey(zxVar)) {
                                        List listB2 = f57Var3.b();
                                        listB2.getClass();
                                        if (!listB2.isEmpty()) {
                                            Object obj = f57Var3.b().get(0);
                                            Object objD = f57Var3.g.b.d(zxVar);
                                            objD.getClass();
                                            linkedHashMap.put(obj, objD);
                                        }
                                    }
                                    i++;
                                }
                                if (hi5.i0("CXCP")) {
                                    return linkedHashMap;
                                }
                                linkedHashMap.toString();
                                return linkedHashMap;
                            }
                        }
                        if (hi5.i0("CXCP")) {
                            return linkedHashMap;
                        }
                        linkedHashMap.toString();
                        return linkedHashMap;
                    case 1:
                        Collection<hq8> collection2 = h57Var.a;
                        ArrayList<f57> arrayList4 = new ArrayList(xv0.Z(collection2, 10));
                        for (hq8 hq8Var2 : collection2) {
                            boolean z3 = h57Var.b;
                            hq8Var2.getClass();
                            f57 f57Var4 = z3 ? hq8Var2.o : hq8Var2.p;
                            f57Var4.getClass();
                            arrayList4.add(f57Var4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (f57 f57Var5 : arrayList4) {
                            List<wg1> listB3 = f57Var5.b();
                            ym0 ym0Var = f57Var5.g;
                            for (wg1 wg1Var : listB3) {
                                qd5 qd5Var = ym0Var.b;
                                zx zxVar2 = gg0.o0;
                                if (!qd5Var.X.containsKey(zxVar2) || qd5Var.d(zxVar2) == null) {
                                    linkedHashMap2.put(wg1Var, Long.valueOf(dh3.f(wg1Var.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object objD2 = qd5Var.d(zxVar2);
                                    objD2.getClass();
                                    linkedHashMap2.put(wg1Var, objD2);
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        e57 e57Var = new e57();
                        for (hq8 hq8Var3 : h57Var.a) {
                            boolean z4 = h57Var.b;
                            hq8Var3.getClass();
                            f57 f57Var6 = z4 ? hq8Var3.o : hq8Var3.p;
                            f57Var6.getClass();
                            e57Var.a(f57Var6);
                        }
                        return e57Var;
                    case 3:
                        vz7 vz7Var = h57Var.e;
                        if (((e57) vz7Var.getValue()).c()) {
                            return ((e57) vz7Var.getValue()).b();
                        }
                        bt.i("Check failed.");
                        return null;
                    default:
                        vz7 vz7Var2 = h57Var.f;
                        if (!((e57) h57Var.e.getValue()).c()) {
                            bt.i("Check failed.");
                            return null;
                        }
                        fz fzVar = ((f57) vz7Var2.getValue()).b;
                        if (fzVar != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List listB4 = ((f57) vz7Var2.getValue()).b();
                            listB4.getClass();
                            arrayList5.addAll(listB4);
                            wg1 wg1Var2 = fzVar.a;
                            wg1Var2.getClass();
                            arrayList5.add(wg1Var2);
                            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((f57) vz7Var2.getValue()).b();
                }
            }
        });
        final byte b3 = 2;
        this.e = new vz7(new dn2(this) { // from class: g57
            public final /* synthetic */ h57 Y;

            {
                this.Y = this;
            }

            /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:98:0x0259  */
            @Override // defpackage.dn2
            public final Object invoke() {
                byte b4 = b3;
                h57 h57Var = this.Y;
                switch (b4) {
                    case 0:
                        ArrayList<f57> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (hq8 hq8Var : h57Var.a) {
                            boolean z2 = h57Var.b;
                            hq8Var.getClass();
                            f57 f57Var = z2 ? hq8Var.o : hq8Var.p;
                            f57Var.getClass();
                            arrayList.add(f57Var);
                            er8 er8Var = hq8Var.h;
                            er8Var.getClass();
                            arrayList2.add(er8Var);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((f57) it.next()).g.c == 5) {
                                    hi5.j0();
                                    return e02.X;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        zx zxVar = kl7.a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (f57 f57Var2 : arrayList) {
                            if (f57Var2.g.b.X.containsKey(zxVar) && f57Var2.b().size() != 1) {
                                if (!hi5.j0()) {
                                    return linkedHashMap;
                                }
                                f57Var2.b().size();
                                return linkedHashMap;
                            }
                            if (f57Var2.g.b.X.containsKey(zxVar)) {
                                int i = 0;
                                for (f57 f57Var3 : arrayList) {
                                    if (((er8) arrayList3.get(i)).s() == gr8.h0) {
                                        List listB = f57Var3.b();
                                        listB.getClass();
                                        mb6.s("MeteringRepeating should contain a surface", !listB.isEmpty());
                                        linkedHashMap.put(f57Var3.b().get(0), 1L);
                                    } else if (f57Var3.g.b.X.containsKey(zxVar)) {
                                        List listB2 = f57Var3.b();
                                        listB2.getClass();
                                        if (!listB2.isEmpty()) {
                                            Object obj = f57Var3.b().get(0);
                                            Object objD = f57Var3.g.b.d(zxVar);
                                            objD.getClass();
                                            linkedHashMap.put(obj, objD);
                                        }
                                    }
                                    i++;
                                }
                                if (hi5.i0("CXCP")) {
                                    return linkedHashMap;
                                }
                                linkedHashMap.toString();
                                return linkedHashMap;
                            }
                        }
                        if (hi5.i0("CXCP")) {
                            return linkedHashMap;
                        }
                        linkedHashMap.toString();
                        return linkedHashMap;
                    case 1:
                        Collection<hq8> collection2 = h57Var.a;
                        ArrayList<f57> arrayList4 = new ArrayList(xv0.Z(collection2, 10));
                        for (hq8 hq8Var2 : collection2) {
                            boolean z3 = h57Var.b;
                            hq8Var2.getClass();
                            f57 f57Var4 = z3 ? hq8Var2.o : hq8Var2.p;
                            f57Var4.getClass();
                            arrayList4.add(f57Var4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (f57 f57Var5 : arrayList4) {
                            List<wg1> listB3 = f57Var5.b();
                            ym0 ym0Var = f57Var5.g;
                            for (wg1 wg1Var : listB3) {
                                qd5 qd5Var = ym0Var.b;
                                zx zxVar2 = gg0.o0;
                                if (!qd5Var.X.containsKey(zxVar2) || qd5Var.d(zxVar2) == null) {
                                    linkedHashMap2.put(wg1Var, Long.valueOf(dh3.f(wg1Var.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object objD2 = qd5Var.d(zxVar2);
                                    objD2.getClass();
                                    linkedHashMap2.put(wg1Var, objD2);
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        e57 e57Var = new e57();
                        for (hq8 hq8Var3 : h57Var.a) {
                            boolean z4 = h57Var.b;
                            hq8Var3.getClass();
                            f57 f57Var6 = z4 ? hq8Var3.o : hq8Var3.p;
                            f57Var6.getClass();
                            e57Var.a(f57Var6);
                        }
                        return e57Var;
                    case 3:
                        vz7 vz7Var = h57Var.e;
                        if (((e57) vz7Var.getValue()).c()) {
                            return ((e57) vz7Var.getValue()).b();
                        }
                        bt.i("Check failed.");
                        return null;
                    default:
                        vz7 vz7Var2 = h57Var.f;
                        if (!((e57) h57Var.e.getValue()).c()) {
                            bt.i("Check failed.");
                            return null;
                        }
                        fz fzVar = ((f57) vz7Var2.getValue()).b;
                        if (fzVar != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List listB4 = ((f57) vz7Var2.getValue()).b();
                            listB4.getClass();
                            arrayList5.addAll(listB4);
                            wg1 wg1Var2 = fzVar.a;
                            wg1Var2.getClass();
                            arrayList5.add(wg1Var2);
                            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((f57) vz7Var2.getValue()).b();
                }
            }
        });
        final byte b4 = 3;
        this.f = new vz7(new dn2(this) { // from class: g57
            public final /* synthetic */ h57 Y;

            {
                this.Y = this;
            }

            /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:98:0x0259  */
            @Override // defpackage.dn2
            public final Object invoke() {
                byte b5 = b4;
                h57 h57Var = this.Y;
                switch (b5) {
                    case 0:
                        ArrayList<f57> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (hq8 hq8Var : h57Var.a) {
                            boolean z2 = h57Var.b;
                            hq8Var.getClass();
                            f57 f57Var = z2 ? hq8Var.o : hq8Var.p;
                            f57Var.getClass();
                            arrayList.add(f57Var);
                            er8 er8Var = hq8Var.h;
                            er8Var.getClass();
                            arrayList2.add(er8Var);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((f57) it.next()).g.c == 5) {
                                    hi5.j0();
                                    return e02.X;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        zx zxVar = kl7.a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (f57 f57Var2 : arrayList) {
                            if (f57Var2.g.b.X.containsKey(zxVar) && f57Var2.b().size() != 1) {
                                if (!hi5.j0()) {
                                    return linkedHashMap;
                                }
                                f57Var2.b().size();
                                return linkedHashMap;
                            }
                            if (f57Var2.g.b.X.containsKey(zxVar)) {
                                int i = 0;
                                for (f57 f57Var3 : arrayList) {
                                    if (((er8) arrayList3.get(i)).s() == gr8.h0) {
                                        List listB = f57Var3.b();
                                        listB.getClass();
                                        mb6.s("MeteringRepeating should contain a surface", !listB.isEmpty());
                                        linkedHashMap.put(f57Var3.b().get(0), 1L);
                                    } else if (f57Var3.g.b.X.containsKey(zxVar)) {
                                        List listB2 = f57Var3.b();
                                        listB2.getClass();
                                        if (!listB2.isEmpty()) {
                                            Object obj = f57Var3.b().get(0);
                                            Object objD = f57Var3.g.b.d(zxVar);
                                            objD.getClass();
                                            linkedHashMap.put(obj, objD);
                                        }
                                    }
                                    i++;
                                }
                                if (hi5.i0("CXCP")) {
                                    return linkedHashMap;
                                }
                                linkedHashMap.toString();
                                return linkedHashMap;
                            }
                        }
                        if (hi5.i0("CXCP")) {
                            return linkedHashMap;
                        }
                        linkedHashMap.toString();
                        return linkedHashMap;
                    case 1:
                        Collection<hq8> collection2 = h57Var.a;
                        ArrayList<f57> arrayList4 = new ArrayList(xv0.Z(collection2, 10));
                        for (hq8 hq8Var2 : collection2) {
                            boolean z3 = h57Var.b;
                            hq8Var2.getClass();
                            f57 f57Var4 = z3 ? hq8Var2.o : hq8Var2.p;
                            f57Var4.getClass();
                            arrayList4.add(f57Var4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (f57 f57Var5 : arrayList4) {
                            List<wg1> listB3 = f57Var5.b();
                            ym0 ym0Var = f57Var5.g;
                            for (wg1 wg1Var : listB3) {
                                qd5 qd5Var = ym0Var.b;
                                zx zxVar2 = gg0.o0;
                                if (!qd5Var.X.containsKey(zxVar2) || qd5Var.d(zxVar2) == null) {
                                    linkedHashMap2.put(wg1Var, Long.valueOf(dh3.f(wg1Var.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object objD2 = qd5Var.d(zxVar2);
                                    objD2.getClass();
                                    linkedHashMap2.put(wg1Var, objD2);
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        e57 e57Var = new e57();
                        for (hq8 hq8Var3 : h57Var.a) {
                            boolean z4 = h57Var.b;
                            hq8Var3.getClass();
                            f57 f57Var6 = z4 ? hq8Var3.o : hq8Var3.p;
                            f57Var6.getClass();
                            e57Var.a(f57Var6);
                        }
                        return e57Var;
                    case 3:
                        vz7 vz7Var = h57Var.e;
                        if (((e57) vz7Var.getValue()).c()) {
                            return ((e57) vz7Var.getValue()).b();
                        }
                        bt.i("Check failed.");
                        return null;
                    default:
                        vz7 vz7Var2 = h57Var.f;
                        if (!((e57) h57Var.e.getValue()).c()) {
                            bt.i("Check failed.");
                            return null;
                        }
                        fz fzVar = ((f57) vz7Var2.getValue()).b;
                        if (fzVar != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List listB4 = ((f57) vz7Var2.getValue()).b();
                            listB4.getClass();
                            arrayList5.addAll(listB4);
                            wg1 wg1Var2 = fzVar.a;
                            wg1Var2.getClass();
                            arrayList5.add(wg1Var2);
                            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((f57) vz7Var2.getValue()).b();
                }
            }
        });
        final byte b5 = 4;
        this.g = new vz7(new dn2(this) { // from class: g57
            public final /* synthetic */ h57 Y;

            {
                this.Y = this;
            }

            /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:98:0x0259  */
            @Override // defpackage.dn2
            public final Object invoke() {
                byte b6 = b5;
                h57 h57Var = this.Y;
                switch (b6) {
                    case 0:
                        ArrayList<f57> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (hq8 hq8Var : h57Var.a) {
                            boolean z2 = h57Var.b;
                            hq8Var.getClass();
                            f57 f57Var = z2 ? hq8Var.o : hq8Var.p;
                            f57Var.getClass();
                            arrayList.add(f57Var);
                            er8 er8Var = hq8Var.h;
                            er8Var.getClass();
                            arrayList2.add(er8Var);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((f57) it.next()).g.c == 5) {
                                    hi5.j0();
                                    return e02.X;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        zx zxVar = kl7.a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (f57 f57Var2 : arrayList) {
                            if (f57Var2.g.b.X.containsKey(zxVar) && f57Var2.b().size() != 1) {
                                if (!hi5.j0()) {
                                    return linkedHashMap;
                                }
                                f57Var2.b().size();
                                return linkedHashMap;
                            }
                            if (f57Var2.g.b.X.containsKey(zxVar)) {
                                int i = 0;
                                for (f57 f57Var3 : arrayList) {
                                    if (((er8) arrayList3.get(i)).s() == gr8.h0) {
                                        List listB = f57Var3.b();
                                        listB.getClass();
                                        mb6.s("MeteringRepeating should contain a surface", !listB.isEmpty());
                                        linkedHashMap.put(f57Var3.b().get(0), 1L);
                                    } else if (f57Var3.g.b.X.containsKey(zxVar)) {
                                        List listB2 = f57Var3.b();
                                        listB2.getClass();
                                        if (!listB2.isEmpty()) {
                                            Object obj = f57Var3.b().get(0);
                                            Object objD = f57Var3.g.b.d(zxVar);
                                            objD.getClass();
                                            linkedHashMap.put(obj, objD);
                                        }
                                    }
                                    i++;
                                }
                                if (hi5.i0("CXCP")) {
                                    return linkedHashMap;
                                }
                                linkedHashMap.toString();
                                return linkedHashMap;
                            }
                        }
                        if (hi5.i0("CXCP")) {
                            return linkedHashMap;
                        }
                        linkedHashMap.toString();
                        return linkedHashMap;
                    case 1:
                        Collection<hq8> collection2 = h57Var.a;
                        ArrayList<f57> arrayList4 = new ArrayList(xv0.Z(collection2, 10));
                        for (hq8 hq8Var2 : collection2) {
                            boolean z3 = h57Var.b;
                            hq8Var2.getClass();
                            f57 f57Var4 = z3 ? hq8Var2.o : hq8Var2.p;
                            f57Var4.getClass();
                            arrayList4.add(f57Var4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (f57 f57Var5 : arrayList4) {
                            List<wg1> listB3 = f57Var5.b();
                            ym0 ym0Var = f57Var5.g;
                            for (wg1 wg1Var : listB3) {
                                qd5 qd5Var = ym0Var.b;
                                zx zxVar2 = gg0.o0;
                                if (!qd5Var.X.containsKey(zxVar2) || qd5Var.d(zxVar2) == null) {
                                    linkedHashMap2.put(wg1Var, Long.valueOf(dh3.f(wg1Var.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object objD2 = qd5Var.d(zxVar2);
                                    objD2.getClass();
                                    linkedHashMap2.put(wg1Var, objD2);
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        e57 e57Var = new e57();
                        for (hq8 hq8Var3 : h57Var.a) {
                            boolean z4 = h57Var.b;
                            hq8Var3.getClass();
                            f57 f57Var6 = z4 ? hq8Var3.o : hq8Var3.p;
                            f57Var6.getClass();
                            e57Var.a(f57Var6);
                        }
                        return e57Var;
                    case 3:
                        vz7 vz7Var = h57Var.e;
                        if (((e57) vz7Var.getValue()).c()) {
                            return ((e57) vz7Var.getValue()).b();
                        }
                        bt.i("Check failed.");
                        return null;
                    default:
                        vz7 vz7Var2 = h57Var.f;
                        if (!((e57) h57Var.e.getValue()).c()) {
                            bt.i("Check failed.");
                            return null;
                        }
                        fz fzVar = ((f57) vz7Var2.getValue()).b;
                        if (fzVar != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List listB4 = ((f57) vz7Var2.getValue()).b();
                            listB4.getClass();
                            arrayList5.addAll(listB4);
                            wg1 wg1Var2 = fzVar.a;
                            wg1Var2.getClass();
                            arrayList5.add(wg1Var2);
                            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((f57) vz7Var2.getValue()).b();
                }
            }
        });
    }

    public final void a(wg1 wg1Var) {
        q51 q51Var;
        Object next;
        f57 f57Var;
        wg1Var.getClass();
        if (hi5.i0("CXCP")) {
            wg1Var.toString();
        }
        Iterator it = this.a.iterator();
        do {
            q51Var = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            hq8 hq8Var = (hq8) next;
            hq8Var.getClass();
            f57Var = this.b ? hq8Var.o : hq8Var.p;
            f57Var.getClass();
        } while (!f57Var.b().contains(wg1Var));
        hq8 hq8Var2 = (hq8) next;
        f57 f57Var2 = hq8Var2 != null ? hq8Var2.o : null;
        nf1 nf1Var = tp1.a;
        w51.G(gv3.c(dm4.a.h0), null, null, new l40((Object) f57Var2, q51Var, (byte) 14), 3);
    }
}
