package defpackage;

import androidx.constraintlayout.widget.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n31 extends m31 {
    public int A0;
    public wo0[] B0;
    public wo0[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final d30 L0;
    public ArrayList q0 = new ArrayList();
    public final lr r0 = new lr(this);
    public final ri1 s0;
    public int t0;
    public e30 u0;
    public boolean v0;
    public final ka4 w0;
    public int x0;
    public int y0;
    public int z0;

    public n31() {
        ri1 ri1Var = new ri1();
        ri1Var.a = true;
        ri1Var.b = true;
        ri1Var.e = new ArrayList();
        new ArrayList();
        ri1Var.g = null;
        ri1Var.h = new d30();
        ri1Var.f = new ArrayList();
        ri1Var.c = this;
        ri1Var.d = this;
        this.s0 = ri1Var;
        this.u0 = null;
        this.v0 = false;
        this.w0 = new ka4();
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = new wo0[4];
        this.C0 = new wo0[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new d30();
    }

    public static void V(m31 m31Var, e30 e30Var, d30 d30Var) {
        int i;
        int i2;
        if (e30Var == null) {
            return;
        }
        int i3 = m31Var.g0;
        int[] iArr = m31Var.t;
        if (i3 == 8 || (m31Var instanceof av2) || (m31Var instanceof f10)) {
            d30Var.e = 0;
            d30Var.f = 0;
            return;
        }
        int[] iArr2 = m31Var.p0;
        d30Var.a = iArr2[0];
        d30Var.b = iArr2[1];
        d30Var.c = m31Var.q();
        d30Var.d = m31Var.k();
        d30Var.i = false;
        d30Var.j = 0;
        boolean z = d30Var.a == 3;
        boolean z2 = d30Var.b == 3;
        boolean z3 = z && m31Var.W > 0.0f;
        boolean z4 = z2 && m31Var.W > 0.0f;
        if (z && m31Var.t(0) && m31Var.r == 0 && !z3) {
            d30Var.a = 2;
            if (z2 && m31Var.s == 0) {
                d30Var.a = 1;
            }
            z = false;
        }
        if (z2 && m31Var.t(1) && m31Var.s == 0 && !z4) {
            d30Var.b = 2;
            if (z && m31Var.r == 0) {
                d30Var.b = 1;
            }
            z2 = false;
        }
        if (m31Var.A()) {
            d30Var.a = 1;
            z = false;
        }
        if (m31Var.B()) {
            d30Var.b = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                d30Var.a = 1;
            } else if (!z2) {
                if (d30Var.b == 1) {
                    i2 = d30Var.d;
                } else {
                    d30Var.a = 2;
                    ((b) e30Var).b(m31Var, d30Var);
                    i2 = d30Var.f;
                }
                d30Var.a = 1;
                d30Var.c = (int) (m31Var.W * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                d30Var.b = 1;
            } else if (!z) {
                if (d30Var.a == 1) {
                    i = d30Var.c;
                } else {
                    d30Var.b = 2;
                    ((b) e30Var).b(m31Var, d30Var);
                    i = d30Var.e;
                }
                d30Var.b = 1;
                int i4 = m31Var.X;
                float f = m31Var.W;
                if (i4 == -1) {
                    d30Var.d = (int) (i / f);
                } else {
                    d30Var.d = (int) (f * i);
                }
            }
        }
        ((b) e30Var).b(m31Var, d30Var);
        m31Var.O(d30Var.e);
        m31Var.L(d30Var.f);
        m31Var.E = d30Var.h;
        m31Var.I(d30Var.g);
        d30Var.j = 0;
    }

    @Override // defpackage.m31
    public final void C() {
        this.w0.t();
        this.x0 = 0;
        this.y0 = 0;
        this.q0.clear();
        super.C();
    }

    @Override // defpackage.m31
    public final void F(lr lrVar) {
        super.F(lrVar);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((m31) this.q0.get(i)).F(lrVar);
        }
    }

    @Override // defpackage.m31
    public final void P(boolean z, boolean z2) {
        super.P(z, z2);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((m31) this.q0.get(i)).P(z, z2);
        }
    }

    public final void R(m31 m31Var, int i) {
        if (i == 0) {
            int i2 = this.z0 + 1;
            wo0[] wo0VarArr = this.C0;
            if (i2 >= wo0VarArr.length) {
                wo0VarArr = (wo0[]) Arrays.copyOf(wo0VarArr, wo0VarArr.length * 2);
                this.C0 = wo0VarArr;
            }
            int i3 = this.z0;
            wo0VarArr[i3] = new wo0(m31Var, 0, this.v0);
            this.z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.A0 + 1;
            wo0[] wo0VarArr2 = this.B0;
            if (i4 >= wo0VarArr2.length) {
                wo0VarArr2 = (wo0[]) Arrays.copyOf(wo0VarArr2, wo0VarArr2.length * 2);
                this.B0 = wo0VarArr2;
            }
            int i5 = this.A0;
            wo0VarArr2[i5] = new wo0(m31Var, 1, this.v0);
            this.A0 = i5 + 1;
        }
    }

    public final void S(ka4 ka4Var) {
        n31 n31Var;
        ka4 ka4Var2;
        boolean zW = W(64);
        b(ka4Var, zW);
        int size = this.q0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            m31 m31Var = (m31) this.q0.get(i);
            boolean[] zArr = m31Var.S;
            zArr[0] = false;
            zArr[1] = false;
            if (m31Var instanceof f10) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                m31 m31Var2 = (m31) this.q0.get(i2);
                if (m31Var2 instanceof f10) {
                    f10 f10Var = (f10) m31Var2;
                    for (int i3 = 0; i3 < f10Var.r0; i3++) {
                        m31 m31Var3 = f10Var.q0[i3];
                        if (f10Var.t0 || m31Var3.c()) {
                            int i4 = f10Var.s0;
                            if (i4 == 0 || i4 == 1) {
                                m31Var3.S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                m31Var3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            m31 m31Var4 = (m31) this.q0.get(i5);
            m31Var4.getClass();
            boolean z2 = m31Var4 instanceof ye2;
            if (z2 || (m31Var4 instanceof av2)) {
                if (z2) {
                    hashSet.add(m31Var4);
                } else {
                    m31Var4.b(ka4Var, zW);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ye2 ye2Var = (ye2) ((m31) it.next());
                for (int i6 = 0; i6 < ye2Var.r0; i6++) {
                    if (hashSet.contains(ye2Var.q0[i6])) {
                        ye2Var.b(ka4Var, zW);
                        hashSet.remove(ye2Var);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((m31) it2.next()).b(ka4Var, zW);
                }
                hashSet.clear();
            }
        }
        if (ka4.q) {
            HashSet<m31> hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                m31 m31Var5 = (m31) this.q0.get(i7);
                m31Var5.getClass();
                if (!(m31Var5 instanceof ye2) && !(m31Var5 instanceof av2)) {
                    hashSet2.add(m31Var5);
                }
            }
            n31Var = this;
            ka4Var2 = ka4Var;
            n31Var.a(this, ka4Var2, hashSet2, this.p0[0] == 2 ? 0 : 1, false);
            for (m31 m31Var6 : hashSet2) {
                km4.p(n31Var, ka4Var2, m31Var6);
                m31Var6.b(ka4Var2, zW);
            }
        } else {
            n31Var = this;
            ka4Var2 = ka4Var;
            for (int i8 = 0; i8 < size; i8++) {
                m31 m31Var7 = (m31) n31Var.q0.get(i8);
                if (m31Var7 instanceof n31) {
                    int[] iArr = m31Var7.p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        m31Var7.M(1);
                    }
                    if (i10 == 2) {
                        m31Var7.N(1);
                    }
                    m31Var7.b(ka4Var2, zW);
                    if (i9 == 2) {
                        m31Var7.M(i9);
                    }
                    if (i10 == 2) {
                        m31Var7.N(i10);
                    }
                } else {
                    km4.p(n31Var, ka4Var2, m31Var7);
                    if (!(m31Var7 instanceof ye2) && !(m31Var7 instanceof av2)) {
                        m31Var7.b(ka4Var2, zW);
                    }
                }
            }
        }
        if (n31Var.z0 > 0) {
            ch3.h(n31Var, ka4Var2, null, 0);
        }
        if (n31Var.A0 > 0) {
            ch3.h(n31Var, ka4Var2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    public final boolean T(int i, boolean z) {
        boolean z2;
        ri1 ri1Var = this.s0;
        ArrayList<k09> arrayList = (ArrayList) ri1Var.e;
        n31 n31Var = (n31) ri1Var.c;
        boolean z3 = false;
        int iJ = n31Var.j(0);
        int iJ2 = n31Var.j(1);
        int iR = n31Var.r();
        int iS = n31Var.s();
        if (z && (iJ == 2 || iJ2 == 2)) {
            for (k09 k09Var : arrayList) {
                if (k09Var.f == i && !k09Var.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && iJ == 2) {
                    n31Var.M(1);
                    n31Var.O(ri1Var.e(n31Var, 0));
                    n31Var.d.e.d(n31Var.q());
                }
            } else if (z && iJ2 == 2) {
                n31Var.N(1);
                n31Var.L(ri1Var.e(n31Var, 1));
                n31Var.e.e.d(n31Var.k());
            }
        }
        int[] iArr = n31Var.p0;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int iQ = n31Var.q() + iR;
                n31Var.d.i.d(iQ);
                n31Var.d.e.d(iQ - iR);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int iK = n31Var.k() + iS;
                n31Var.e.i.d(iK);
                n31Var.e.e.d(iK - iS);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        ri1Var.u();
        for (k09 k09Var2 : arrayList) {
            if (k09Var2.f == i && (k09Var2.b != n31Var || k09Var2.g)) {
                k09Var2.e();
            }
        }
        for (k09 k09Var3 : arrayList) {
            if (k09Var3.f == i && (z2 || k09Var3.b != n31Var)) {
                if (!k09Var3.h.j || !k09Var3.i.j || (!(k09Var3 instanceof xo0) && !k09Var3.e.j)) {
                    n31Var.M(iJ);
                    n31Var.N(iJ2);
                    return z3;
                }
            }
        }
        z3 = true;
        n31Var.M(iJ);
        n31Var.N(iJ2);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:227:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:361:0x061f  */
    /* JADX WARN: Code duplicated, block: B:375:0x064e  */
    /* JADX WARN: Code duplicated, block: B:400:0x0697  */
    /* JADX WARN: Code duplicated, block: B:405:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:412:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:415:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:417:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:421:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:424:0x06ee A[Catch: Exception -> 0x06fc, LOOP:12: B:423:0x06ec->B:424:0x06ee, LOOP_END, TryCatch #1 {Exception -> 0x06fc, blocks: (B:422:0x06e0, B:424:0x06ee, B:427:0x0703), top: B:541:0x06e0 }] */
    /* JADX WARN: Code duplicated, block: B:440:0x0735  */
    /* JADX WARN: Code duplicated, block: B:443:0x073b A[Catch: Exception -> 0x072b, TryCatch #3 {Exception -> 0x072b, blocks: (B:434:0x0724, B:441:0x0737, B:443:0x073b, B:445:0x0741, B:446:0x075b, B:448:0x075f, B:450:0x0765, B:454:0x077b, B:457:0x0786, B:459:0x078a, B:461:0x0790), top: B:545:0x0724 }] */
    /* JADX WARN: Code duplicated, block: B:448:0x075f A[Catch: Exception -> 0x072b, TryCatch #3 {Exception -> 0x072b, blocks: (B:434:0x0724, B:441:0x0737, B:443:0x073b, B:445:0x0741, B:446:0x075b, B:448:0x075f, B:450:0x0765, B:454:0x077b, B:457:0x0786, B:459:0x078a, B:461:0x0790), top: B:545:0x0724 }] */
    /* JADX WARN: Code duplicated, block: B:459:0x078a A[Catch: Exception -> 0x072b, TryCatch #3 {Exception -> 0x072b, blocks: (B:434:0x0724, B:441:0x0737, B:443:0x073b, B:445:0x0741, B:446:0x075b, B:448:0x075f, B:450:0x0765, B:454:0x077b, B:457:0x0786, B:459:0x078a, B:461:0x0790), top: B:545:0x0724 }] */
    /* JADX WARN: Code duplicated, block: B:473:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:478:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:480:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:482:0x0804  */
    /* JADX WARN: Code duplicated, block: B:484:0x0808  */
    /* JADX WARN: Code duplicated, block: B:487:0x0814  */
    /* JADX WARN: Code duplicated, block: B:489:0x081b A[LOOP:15: B:488:0x0819->B:489:0x081b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:493:0x082e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:498:0x083b A[LOOP:14: B:497:0x0839->B:498:0x083b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:501:0x0870  */
    /* JADX WARN: Code duplicated, block: B:505:0x0881  */
    /* JADX WARN: Code duplicated, block: B:510:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:511:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:514:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:515:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:517:0x08cb  */
    /* JADX WARN: Code duplicated, block: B:519:0x08d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:522:0x08da  */
    /* JADX WARN: Code duplicated, block: B:525:0x08e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:530:0x0900  */
    /* JADX WARN: Code duplicated, block: B:532:0x0904  */
    /* JADX WARN: Code duplicated, block: B:536:0x0912  */
    /* JADX WARN: Code duplicated, block: B:597:0x06d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:0x0905 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x012c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r33v0, types: [m31, n31] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v126, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v94, types: [int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v66, types: [int] */
    /* JADX WARN: Type inference failed for: r6v80, types: [int] */
    public final void U() {
        ?? r21;
        u21 u21Var;
        int i;
        boolean z;
        boolean z2;
        char c;
        boolean z3;
        int i2;
        boolean zW;
        ?? r13;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        boolean z6;
        int i5;
        boolean z7;
        int iMax;
        ?? r10;
        ?? r17;
        boolean z8;
        int iMax2;
        ?? r0;
        boolean z9;
        boolean z10;
        ?? r1;
        ?? r14;
        int i6;
        boolean z11;
        boolean z12;
        ?? r2;
        ?? r3;
        int i7;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        boolean zW2;
        int size;
        int i8;
        boolean z13;
        m31 m31Var;
        boolean z14;
        int i9;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        u21 u21Var2;
        m31 m31Var2;
        i09 i09Var;
        i09 i09Var2;
        int iB;
        int i10;
        ArrayList arrayList;
        i09 i09Var3;
        i09 i09Var4;
        boolean z15;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i11;
        boolean z16;
        boolean[] zArr = km4.h;
        this.Y = 0;
        this.Z = 0;
        this.E0 = false;
        this.F0 = false;
        int size2 = this.q0.size();
        int iMax7 = Math.max(0, q());
        int iMax8 = Math.max(0, k());
        int[] iArr = this.p0;
        int i12 = iArr[1];
        int i13 = iArr[0];
        int i14 = this.t0;
        u21 u21Var3 = this.J;
        u21 u21Var4 = this.I;
        if (i14 == 0 && km4.y(this.D0, 1)) {
            e30 e30Var = this.u0;
            int i15 = iArr[0];
            int i16 = iArr[1];
            E();
            ArrayList arrayList4 = this.q0;
            int size3 = arrayList4.size();
            for (int i17 = 0; i17 < size3; i17++) {
                ((m31) arrayList4.get(i17)).E();
            }
            boolean z17 = this.v0;
            if (i15 == 1) {
                J(0, q());
            } else {
                u21Var4.l(0);
                this.Y = 0;
            }
            int i18 = 0;
            boolean z18 = false;
            boolean z19 = false;
            while (i18 < size3) {
                int i19 = i18;
                m31 m31Var3 = (m31) arrayList4.get(i18);
                int[] iArr2 = iArr;
                if (m31Var3 instanceof av2) {
                    av2 av2Var = (av2) m31Var3;
                    z16 = z18;
                    if (av2Var.u0 == 1) {
                        int i20 = av2Var.r0;
                        if (i20 != -1) {
                            av2Var.R(i20);
                        } else if (av2Var.s0 != -1 && A()) {
                            av2Var.R(q() - av2Var.s0);
                        } else if (A()) {
                            av2Var.R((int) ((av2Var.q0 * q()) + 0.5f));
                        }
                        z16 = true;
                    }
                } else {
                    z16 = z18;
                    if ((m31Var3 instanceof f10) && ((f10) m31Var3).U() == 0) {
                        z18 = z16;
                        z19 = true;
                    }
                    i18 = i19 + 1;
                    iArr = iArr2;
                }
                z18 = z16;
                i18 = i19 + 1;
                iArr = iArr2;
            }
            r21 = iArr;
            if (z18) {
                for (int i21 = 0; i21 < size3; i21 = i11 + 1) {
                    m31 m31Var4 = (m31) arrayList4.get(i21);
                    if (m31Var4 instanceof av2) {
                        av2 av2Var2 = (av2) m31Var4;
                        i11 = i21;
                        if (av2Var2.u0 == 1) {
                            vj8.R(0, e30Var, av2Var2, z17);
                        }
                    } else {
                        i11 = i21;
                    }
                }
            }
            vj8.R(0, e30Var, this, z17);
            if (z19) {
                for (int i22 = 0; i22 < size3; i22++) {
                    m31 m31Var5 = (m31) arrayList4.get(i22);
                    if (m31Var5 instanceof f10) {
                        f10 f10Var = (f10) m31Var5;
                        if (f10Var.U() == 0 && f10Var.T()) {
                            vj8.R(1, e30Var, f10Var, z17);
                        }
                    }
                }
            }
            if (i16 == 1) {
                K(0, k());
            } else {
                u21Var3.l(0);
                this.Z = 0;
            }
            int i23 = 0;
            boolean z20 = false;
            boolean z21 = false;
            while (i23 < size3) {
                m31 m31Var6 = (m31) arrayList4.get(i23);
                int i24 = i23;
                if (m31Var6 instanceof av2) {
                    av2 av2Var3 = (av2) m31Var6;
                    if (av2Var3.u0 == 0) {
                        int i25 = av2Var3.r0;
                        if (i25 != -1) {
                            av2Var3.R(i25);
                        } else if (av2Var3.s0 != -1 && B()) {
                            av2Var3.R(k() - av2Var3.s0);
                        } else if (B()) {
                            av2Var3.R((int) ((av2Var3.q0 * k()) + 0.5f));
                        }
                        z20 = true;
                    }
                } else if ((m31Var6 instanceof f10) && ((f10) m31Var6).U() == 1) {
                    z21 = true;
                }
                i23 = i24 + 1;
            }
            if (z20) {
                for (int i26 = 0; i26 < size3; i26++) {
                    m31 m31Var7 = (m31) arrayList4.get(i26);
                    if (m31Var7 instanceof av2) {
                        av2 av2Var4 = (av2) m31Var7;
                        if (av2Var4.u0 == 0) {
                            vj8.x0(1, e30Var, av2Var4);
                        }
                    }
                }
            }
            vj8.x0(0, e30Var, this);
            if (z21) {
                for (int i27 = 0; i27 < size3; i27++) {
                    m31 m31Var8 = (m31) arrayList4.get(i27);
                    if (m31Var8 instanceof f10) {
                        f10 f10Var2 = (f10) m31Var8;
                        if (f10Var2.U() == 1 && f10Var2.T()) {
                            vj8.x0(1, e30Var, f10Var2);
                        }
                    }
                }
            }
            for (int i28 = 0; i28 < size3; i28++) {
                m31 m31Var9 = (m31) arrayList4.get(i28);
                if (m31Var9.z() && vj8.q(m31Var9)) {
                    V(m31Var9, e30Var, vj8.Z);
                    if (!(m31Var9 instanceof av2)) {
                        vj8.R(0, e30Var, m31Var9, z17);
                        vj8.x0(0, e30Var, m31Var9);
                    } else if (((av2) m31Var9).u0 == 0) {
                        vj8.x0(0, e30Var, m31Var9);
                    } else {
                        vj8.R(0, e30Var, m31Var9, z17);
                    }
                }
            }
            for (int i29 = 0; i29 < size2; i29++) {
                m31 m31Var10 = (m31) this.q0.get(i29);
                if (m31Var10.z() && !(m31Var10 instanceof av2) && !(m31Var10 instanceof f10) && !(m31Var10 instanceof ye2) && !m31Var10.F) {
                    int iJ = m31Var10.j(0);
                    int iJ2 = m31Var10.j(1);
                    if (iJ != 3 || m31Var10.r == 1 || iJ2 != 3 || m31Var10.s == 1) {
                        V(m31Var10, this.u0, new d30());
                    }
                }
            }
        } else {
            r21 = iArr;
        }
        ka4 ka4Var = this.w0;
        if (size2 > 2 && ((i13 == 2 || i12 == 2) && km4.y(this.D0, 1024))) {
            e30 e30Var2 = this.u0;
            ArrayList arrayList5 = this.q0;
            int size4 = arrayList5.size();
            int i30 = 0;
            while (true) {
                if (i30 >= size4) {
                    u21Var = u21Var4;
                    int i31 = 0;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    ArrayList arrayList11 = null;
                    while (i31 < size4) {
                        int i32 = i31;
                        m31 m31Var11 = (m31) arrayList5.get(i31);
                        ArrayList arrayList12 = arrayList6;
                        ?? r4 = r21[0];
                        ArrayList arrayList13 = arrayList7;
                        ?? r6 = r21[1];
                        ArrayList arrayList14 = arrayList8;
                        int[] iArr3 = m31Var11.p0;
                        ArrayList arrayList15 = arrayList9;
                        if (!w51.V(r4, r6, iArr3[0], iArr3[1])) {
                            V(m31Var11, e30Var2, this.L0);
                        }
                        boolean z22 = m31Var11 instanceof av2;
                        if (z22) {
                            av2 av2Var5 = (av2) m31Var11;
                            if (av2Var5.u0 == 0) {
                                arrayList8 = arrayList14 == null ? new ArrayList() : arrayList14;
                                arrayList8.add(av2Var5);
                            } else {
                                arrayList8 = arrayList14;
                            }
                            z15 = z22;
                            if (av2Var5.u0 == 1) {
                                arrayList2 = arrayList12 == null ? new ArrayList() : arrayList12;
                                arrayList2.add(av2Var5);
                            } else {
                                arrayList2 = arrayList12;
                            }
                        } else {
                            z15 = z22;
                            arrayList2 = arrayList12;
                            arrayList8 = arrayList14;
                        }
                        if (m31Var11 instanceof xz2) {
                            if (m31Var11 instanceof f10) {
                                f10 f10Var3 = (f10) m31Var11;
                                if (f10Var3.U() == 0) {
                                    arrayList3 = arrayList13 == null ? new ArrayList() : arrayList13;
                                    arrayList3.add(f10Var3);
                                } else {
                                    arrayList3 = arrayList13;
                                }
                                if (f10Var3.U() == 1) {
                                    ArrayList arrayList16 = arrayList15 == null ? new ArrayList() : arrayList15;
                                    arrayList16.add(f10Var3);
                                    arrayList15 = arrayList16;
                                }
                                arrayList7 = arrayList3;
                            } else {
                                arrayList2 = arrayList2;
                                e30Var2 = e30Var2;
                                xz2 xz2Var = (xz2) m31Var11;
                                arrayList7 = arrayList13 == null ? new ArrayList() : arrayList13;
                                arrayList7.add(xz2Var);
                                arrayList9 = arrayList15 == null ? new ArrayList() : arrayList15;
                                arrayList9.add(xz2Var);
                            }
                            if (m31Var11.I.f == null && m31Var11.K.f == null && !z15 && !(m31Var11 instanceof f10)) {
                                if (arrayList10 == null) {
                                    arrayList10 = new ArrayList();
                                }
                                ArrayList arrayList17 = arrayList10;
                                arrayList17.add(m31Var11);
                                arrayList10 = arrayList17;
                            }
                            if (m31Var11.J.f != null && m31Var11.L.f == null && m31Var11.M.f == null && !z15 && !(m31Var11 instanceof f10)) {
                                if (arrayList11 == null) {
                                    arrayList11 = new ArrayList();
                                }
                                ArrayList arrayList18 = arrayList11;
                                arrayList18.add(m31Var11);
                                arrayList11 = arrayList18;
                            }
                            i31 = i32 + 1;
                            arrayList6 = arrayList2;
                            e30Var2 = e30Var2;
                        } else {
                            arrayList7 = arrayList13;
                        }
                        arrayList9 = arrayList15;
                        if (m31Var11.I.f == null) {
                            if (arrayList10 == null) {
                                arrayList10 = new ArrayList();
                            }
                            ArrayList arrayList19 = arrayList10;
                            arrayList19.add(m31Var11);
                            arrayList10 = arrayList19;
                        }
                        if (m31Var11.J.f != null) {
                        }
                        i31 = i32 + 1;
                        arrayList6 = arrayList2;
                        e30Var2 = e30Var2;
                    }
                    ArrayList arrayList20 = arrayList6;
                    ArrayList<xz2> arrayList21 = arrayList7;
                    ArrayList arrayList22 = arrayList8;
                    ArrayList<xz2> arrayList23 = arrayList9;
                    ArrayList<i09> arrayList24 = new ArrayList();
                    if (arrayList20 != null) {
                        Iterator it = arrayList20.iterator();
                        while (it.hasNext()) {
                            w51.z((av2) it.next(), 0, arrayList24, null);
                        }
                    }
                    i09 i09Var5 = null;
                    int i33 = 0;
                    if (arrayList21 != null) {
                        for (xz2 xz2Var2 : arrayList21) {
                            i09 i09VarZ = w51.z(xz2Var2, i33, arrayList24, i09Var5);
                            xz2Var2.R(i33, i09VarZ, arrayList24);
                            i09VarZ.a(arrayList24);
                            i09Var5 = null;
                            i33 = 0;
                        }
                    }
                    HashSet hashSet = i(2).a;
                    if (hashSet != null) {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            w51.z(((u21) it2.next()).d, 0, arrayList24, null);
                        }
                    }
                    HashSet hashSet2 = i(4).a;
                    if (hashSet2 != null) {
                        Iterator it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            w51.z(((u21) it3.next()).d, 0, arrayList24, null);
                        }
                    }
                    HashSet hashSet3 = i(7).a;
                    if (hashSet3 != null) {
                        Iterator it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            w51.z(((u21) it4.next()).d, 0, arrayList24, null);
                        }
                    }
                    i09 i09Var6 = null;
                    if (arrayList10 != null) {
                        Iterator it5 = arrayList10.iterator();
                        while (it5.hasNext()) {
                            w51.z((m31) it5.next(), 0, arrayList24, null);
                        }
                    }
                    if (arrayList22 != null) {
                        Iterator it6 = arrayList22.iterator();
                        while (it6.hasNext()) {
                            w51.z((av2) it6.next(), 1, arrayList24, null);
                        }
                    }
                    int i34 = 1;
                    if (arrayList23 != null) {
                        for (xz2 xz2Var3 : arrayList23) {
                            i09 i09VarZ2 = w51.z(xz2Var3, i34, arrayList24, i09Var6);
                            xz2Var3.R(i34, i09VarZ2, arrayList24);
                            i09VarZ2.a(arrayList24);
                            i09Var6 = null;
                            i34 = 1;
                        }
                    }
                    HashSet hashSet4 = i(3).a;
                    if (hashSet4 != null) {
                        Iterator it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            w51.z(((u21) it7.next()).d, 1, arrayList24, null);
                        }
                    }
                    HashSet hashSet5 = i(6).a;
                    if (hashSet5 != null) {
                        Iterator it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            w51.z(((u21) it8.next()).d, 1, arrayList24, null);
                        }
                    }
                    HashSet hashSet6 = i(5).a;
                    if (hashSet6 != null) {
                        Iterator it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            w51.z(((u21) it9.next()).d, 1, arrayList24, null);
                        }
                    }
                    HashSet hashSet7 = i(7).a;
                    if (hashSet7 != null) {
                        Iterator it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            w51.z(((u21) it10.next()).d, 1, arrayList24, null);
                        }
                    }
                    boolean z23 = true;
                    if (arrayList11 != null) {
                        Iterator it11 = arrayList11.iterator();
                        while (it11.hasNext()) {
                            w51.z((m31) it11.next(), 1, arrayList24, null);
                        }
                    }
                    int i35 = 0;
                    while (i35 < size4) {
                        m31 m31Var12 = (m31) arrayList5.get(i35);
                        int[] iArr4 = m31Var12.p0;
                        boolean z24 = z23;
                        if (iArr4[0] == 3 && iArr4[z24 ? 1 : 0] == 3) {
                            int i36 = m31Var12.n0;
                            int size5 = arrayList24.size();
                            int i37 = 0;
                            while (true) {
                                if (i37 >= size5) {
                                    i10 = i35;
                                    arrayList = arrayList5;
                                    i09Var3 = null;
                                    break;
                                }
                                i10 = i35;
                                i09Var3 = (i09) arrayList24.get(i37);
                                arrayList = arrayList5;
                                if (i36 == i09Var3.b) {
                                    break;
                                }
                                i37++;
                                arrayList5 = arrayList;
                                i35 = i10;
                            }
                            int i38 = m31Var12.o0;
                            int size6 = arrayList24.size();
                            int i39 = 0;
                            while (true) {
                                if (i39 >= size6) {
                                    i09Var4 = null;
                                    break;
                                }
                                i09Var4 = (i09) arrayList24.get(i39);
                                if (i38 == i09Var4.b) {
                                    break;
                                } else {
                                    i39++;
                                }
                            }
                            if (i09Var3 != null && i09Var4 != null) {
                                i09Var3.c(0, i09Var4);
                                i09Var4.c = 2;
                                arrayList24.remove(i09Var3);
                            }
                        } else {
                            i10 = i35;
                            arrayList = arrayList5;
                        }
                        i35 = i10 + 1;
                        arrayList5 = arrayList;
                        z23 = true;
                    }
                    if (arrayList24.size() <= 1) {
                        break;
                    }
                    int i40 = 0;
                    if (r21[0] == 2) {
                        int i41 = 0;
                        i09Var = null;
                        for (i09 i09Var7 : arrayList24) {
                            if (i09Var7.c != 1) {
                                int iB2 = i09Var7.b(ka4Var, i40);
                                if (iB2 > i41) {
                                    i09Var = i09Var7;
                                    i41 = iB2;
                                }
                                i40 = 0;
                            }
                        }
                        if (i09Var != null) {
                            M(1);
                            O(i41);
                        } else {
                            i09Var = null;
                        }
                    } else {
                        i09Var = null;
                    }
                    if (r21[1] == 2) {
                        int i42 = 0;
                        i09Var2 = null;
                        for (i09 i09Var8 : arrayList24) {
                            if (i09Var8.c != 0 && (iB = i09Var8.b(ka4Var, 1)) > i42) {
                                i09Var2 = i09Var8;
                                i42 = iB;
                            }
                        }
                        if (i09Var2 != null) {
                            N(1);
                            L(i42);
                        } else {
                            i09Var2 = null;
                        }
                    } else {
                        i09Var2 = null;
                    }
                    if (i09Var != null || i09Var2 != null) {
                        if (i13 == 2) {
                            if (iMax7 >= q() || iMax7 <= 0) {
                                iMax7 = q();
                            } else {
                                O(iMax7);
                                this.E0 = true;
                            }
                        }
                        if (i12 == 2) {
                            if (iMax8 >= k() || iMax8 <= 0) {
                                iMax8 = k();
                            } else {
                                L(iMax8);
                                this.F0 = true;
                            }
                        }
                        i = iMax7;
                        z = true;
                        break;
                    }
                } else {
                    m31 m31Var13 = (m31) arrayList5.get(i30);
                    ?? r5 = r21[0];
                    ?? r7 = r21[1];
                    int i43 = i30;
                    int[] iArr5 = m31Var13.p0;
                    u21Var = u21Var4;
                    if (w51.V(r5, r7, iArr5[0], iArr5[1]) && !(m31Var13 instanceof ye2)) {
                        i30 = i43 + 1;
                        u21Var4 = u21Var;
                    }
                }
            }
            if (!W(64) || W(128)) {
                z2 = true;
            } else {
                z2 = false;
            }
            ka4Var.getClass();
            ka4Var.h = false;
            if (this.D0 == 0 && z2) {
                c = 1;
                ka4Var.h = true;
            } else {
                c = 1;
            }
            ArrayList arrayList25 = this.q0;
            if (r21[0] != 2 || r21[c] == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.z0 = 0;
            this.A0 = 0;
            for (i2 = 0; i2 < size2; i2++) {
                m31Var2 = (m31) this.q0.get(i2);
                if (m31Var2 instanceof n31) {
                    ((n31) m31Var2).U();
                }
            }
            zW = W(64);
            r13 = z;
            i3 = 0;
            z4 = true;
            while (z4) {
                i4 = i3 + 1;
                try {
                    ka4Var.t();
                    this.z0 = 0;
                    this.A0 = 0;
                    g(ka4Var);
                    for (i9 = 0; i9 < size2; i9++) {
                        ((m31) this.q0.get(i9)).g(ka4Var);
                    }
                    S(ka4Var);
                    try {
                        weakReference = this.G0;
                        if (weakReference != null || weakReference.get() == null) {
                            z5 = z3;
                        } else {
                            z5 = z3;
                            try {
                                ka4Var.f(ka4Var.k((u21) this.G0.get()), ka4Var.k(u21Var3), 0, 5);
                                this.G0 = null;
                            } catch (Exception e) {
                                e = e;
                                z14 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                z6 = z14;
                                if (z6) {
                                    zArr[2] = false;
                                    zW2 = W(64);
                                    Q(ka4Var, zW2);
                                    size = this.q0.size();
                                    i8 = 0;
                                    z13 = false;
                                    while (i8 < size) {
                                        m31Var = (m31) this.q0.get(i8);
                                        m31Var.Q(ka4Var, zW2);
                                        boolean z25 = zW2;
                                        int i44 = size;
                                        if (m31Var.h == -1) {
                                            z13 = true;
                                        } else {
                                            z13 = true;
                                        }
                                        i8++;
                                        zW2 = z25;
                                        size = i44;
                                        z13 = z13;
                                    }
                                    z7 = z13;
                                } else {
                                    Q(ka4Var, zW);
                                    for (i5 = 0; i5 < size2; i5++) {
                                        ((m31) this.q0.get(i5)).Q(ka4Var, zW);
                                    }
                                    z7 = false;
                                }
                                if (z5) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    for (i7 = 0; i7 < size2; i7++) {
                                        m31 m31Var14 = (m31) this.q0.get(i7);
                                        iMax4 = Math.max(iMax4, m31Var14.q() + m31Var14.Y);
                                        iMax3 = Math.max(iMax3, m31Var14.k() + m31Var14.Z);
                                    }
                                    iMax5 = Math.max(this.b0, iMax4);
                                    iMax6 = Math.max(this.c0, iMax3);
                                    r13 = r13;
                                    z7 = z7;
                                    if (i13 == 2) {
                                        r13 = r13;
                                        z7 = z7;
                                        O(iMax5);
                                        r21[0] = 2;
                                        r13 = 1;
                                        z7 = true;
                                    }
                                    if (i12 == 2) {
                                        L(iMax6);
                                        r21[1] = 2;
                                        r13 = 1;
                                        z7 = true;
                                    }
                                }
                                iMax = Math.max(this.b0, q());
                                if (iMax > q()) {
                                    O(iMax);
                                    r10 = 1;
                                    r21[0] = 1;
                                    z8 = true;
                                    r17 = 1;
                                } else {
                                    r10 = 1;
                                    r17 = r13;
                                    z8 = z7;
                                }
                                iMax2 = Math.max(this.c0, k());
                                if (iMax2 > k()) {
                                    L(iMax2);
                                    r21[r10] = r10;
                                    r3 = r10;
                                    z9 = r3 == true ? 1 : 0;
                                } else {
                                    r0 = r17;
                                }
                                if (r0 == 0) {
                                    z9 = z8;
                                    if (r21[0] == 2) {
                                        r2 = r0;
                                        z12 = z9;
                                        if (q() > i) {
                                            this.E0 = r10;
                                            r21[0] = r10;
                                            O(i);
                                            ?? r8 = r10;
                                            z12 = r8 == true ? 1 : 0;
                                            r2 = r8;
                                        }
                                    }
                                    r0 = r3;
                                    r2 = r0;
                                    r2 = r0;
                                    z12 = z9;
                                    z12 = z9;
                                    r1 = r2;
                                    r1 = r2;
                                    z10 = z12;
                                    z10 = z12;
                                    if (r21[r10] != 2) {
                                    }
                                    if (i4 > i6) {
                                        r1 = r2;
                                        z10 = z12;
                                        z11 = false;
                                    } else {
                                        r1 = r2;
                                        z10 = z12;
                                    }
                                    i3 = i4;
                                    z3 = z5;
                                    u21Var3 = u21Var3;
                                    r13 = r14;
                                    z4 = z11;
                                } else {
                                    z9 = z8;
                                    r0 = r3;
                                    r1 = r0;
                                    z10 = z9;
                                }
                                r1 = r2;
                                z10 = z12;
                                r14 = r1;
                                i6 = 8;
                                z11 = z10;
                                if (i4 > i6) {
                                    r1 = r2;
                                    z10 = z12;
                                    z11 = false;
                                } else {
                                    r1 = r2;
                                    z10 = z12;
                                }
                                i3 = i4;
                                z3 = z5;
                                u21Var3 = u21Var3;
                                r13 = r14;
                                z4 = z11;
                            }
                        }
                        weakReference2 = this.I0;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            ka4Var.f(ka4Var.k(this.L), ka4Var.k((u21) this.I0.get()), 0, 5);
                            this.I0 = null;
                        }
                        weakReference3 = this.H0;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            u21Var2 = u21Var;
                            try {
                                u21Var = u21Var2;
                                ka4Var.f(ka4Var.k((u21) this.H0.get()), ka4Var.k(u21Var2), 0, 5);
                                this.H0 = null;
                            } catch (Exception e2) {
                                e = e2;
                                u21Var = u21Var2;
                                z14 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                z6 = z14;
                                if (z6) {
                                    zArr[2] = false;
                                    zW2 = W(64);
                                    Q(ka4Var, zW2);
                                    size = this.q0.size();
                                    i8 = 0;
                                    z13 = false;
                                    while (i8 < size) {
                                        m31Var = (m31) this.q0.get(i8);
                                        m31Var.Q(ka4Var, zW2);
                                        boolean z26 = zW2;
                                        int i45 = size;
                                        if (m31Var.h == -1) {
                                            z13 = true;
                                        } else {
                                            z13 = true;
                                        }
                                        i8++;
                                        zW2 = z26;
                                        size = i45;
                                        z13 = z13;
                                    }
                                    z7 = z13;
                                } else {
                                    Q(ka4Var, zW);
                                    while (i5 < size2) {
                                        ((m31) this.q0.get(i5)).Q(ka4Var, zW);
                                    }
                                    z7 = false;
                                }
                                if (z5) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i7 < size2) {
                                        m31 m31Var15 = (m31) this.q0.get(i7);
                                        iMax4 = Math.max(iMax4, m31Var15.q() + m31Var15.Y);
                                        iMax3 = Math.max(iMax3, m31Var15.k() + m31Var15.Z);
                                    }
                                    iMax5 = Math.max(this.b0, iMax4);
                                    iMax6 = Math.max(this.c0, iMax3);
                                    r13 = r13;
                                    z7 = z7;
                                    if (i13 == 2) {
                                        r13 = r13;
                                        z7 = z7;
                                        O(iMax5);
                                        r21[0] = 2;
                                        r13 = 1;
                                        z7 = true;
                                    }
                                    if (i12 == 2) {
                                        L(iMax6);
                                        r21[1] = 2;
                                        r13 = 1;
                                        z7 = true;
                                    }
                                }
                                iMax = Math.max(this.b0, q());
                                if (iMax > q()) {
                                    O(iMax);
                                    r10 = 1;
                                    r21[0] = 1;
                                    z8 = true;
                                    r17 = 1;
                                } else {
                                    r10 = 1;
                                    r17 = r13;
                                    z8 = z7;
                                }
                                iMax2 = Math.max(this.c0, k());
                                if (iMax2 > k()) {
                                    L(iMax2);
                                    r21[r10] = r10;
                                    r3 = r10;
                                    z9 = r3 == true ? 1 : 0;
                                } else {
                                    r0 = r17;
                                }
                                if (r0 == 0) {
                                    z9 = z8;
                                    if (r21[0] == 2) {
                                        r2 = r0;
                                        z12 = z9;
                                        if (q() > i) {
                                            this.E0 = r10;
                                            r21[0] = r10;
                                            O(i);
                                            ?? r9 = r10;
                                            z12 = r9 == true ? 1 : 0;
                                            r2 = r9;
                                        }
                                    }
                                    r0 = r3;
                                    r2 = r0;
                                    r2 = r0;
                                    z12 = z9;
                                    z12 = z9;
                                    r1 = r2;
                                    r1 = r2;
                                    z10 = z12;
                                    z10 = z12;
                                    if (r21[r10] != 2) {
                                    }
                                    if (i4 > i6) {
                                        r1 = r2;
                                        z10 = z12;
                                        z11 = false;
                                    } else {
                                        r1 = r2;
                                        z10 = z12;
                                    }
                                    i3 = i4;
                                    z3 = z5;
                                    u21Var3 = u21Var3;
                                    r13 = r14;
                                    z4 = z11;
                                } else {
                                    z9 = z8;
                                    r0 = r3;
                                    r1 = r0;
                                    z10 = z9;
                                }
                                r1 = r2;
                                z10 = z12;
                                r14 = r1;
                                i6 = 8;
                                z11 = z10;
                                if (i4 > i6) {
                                    r1 = r2;
                                    z10 = z12;
                                    z11 = false;
                                } else {
                                    r1 = r2;
                                    z10 = z12;
                                }
                                i3 = i4;
                                z3 = z5;
                                u21Var3 = u21Var3;
                                r13 = r14;
                                z4 = z11;
                            }
                        }
                        weakReference4 = this.J0;
                        if (weakReference4 == null && weakReference4.get() != null) {
                            try {
                                try {
                                    ka4Var.f(ka4Var.k(this.K), ka4Var.k((u21) this.J0.get()), 0, 5);
                                    try {
                                        this.J0 = null;
                                    } catch (Exception e3) {
                                        e = e3;
                                        z14 = true;
                                        e.printStackTrace();
                                        System.out.println("EXCEPTION : " + e);
                                        z6 = z14;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    z14 = true;
                                    e.printStackTrace();
                                    System.out.println("EXCEPTION : " + e);
                                    z6 = z14;
                                    if (z6) {
                                        zArr[2] = false;
                                        zW2 = W(64);
                                        Q(ka4Var, zW2);
                                        size = this.q0.size();
                                        i8 = 0;
                                        z13 = false;
                                        while (i8 < size) {
                                            m31Var = (m31) this.q0.get(i8);
                                            m31Var.Q(ka4Var, zW2);
                                            boolean z27 = zW2;
                                            int i46 = size;
                                            if (m31Var.h == -1) {
                                                z13 = true;
                                            } else {
                                                z13 = true;
                                            }
                                            i8++;
                                            zW2 = z27;
                                            size = i46;
                                            z13 = z13;
                                        }
                                        z7 = z13;
                                    } else {
                                        Q(ka4Var, zW);
                                        while (i5 < size2) {
                                            ((m31) this.q0.get(i5)).Q(ka4Var, zW);
                                        }
                                        z7 = false;
                                    }
                                    if (z5) {
                                        iMax3 = 0;
                                        iMax4 = 0;
                                        while (i7 < size2) {
                                            m31 m31Var16 = (m31) this.q0.get(i7);
                                            iMax4 = Math.max(iMax4, m31Var16.q() + m31Var16.Y);
                                            iMax3 = Math.max(iMax3, m31Var16.k() + m31Var16.Z);
                                        }
                                        iMax5 = Math.max(this.b0, iMax4);
                                        iMax6 = Math.max(this.c0, iMax3);
                                        r13 = r13;
                                        z7 = z7;
                                        if (i13 == 2) {
                                            r13 = r13;
                                            z7 = z7;
                                            O(iMax5);
                                            r21[0] = 2;
                                            r13 = 1;
                                            z7 = true;
                                        }
                                        if (i12 == 2) {
                                            L(iMax6);
                                            r21[1] = 2;
                                            r13 = 1;
                                            z7 = true;
                                        }
                                    }
                                    iMax = Math.max(this.b0, q());
                                    if (iMax > q()) {
                                        O(iMax);
                                        r10 = 1;
                                        r21[0] = 1;
                                        z8 = true;
                                        r17 = 1;
                                    } else {
                                        r10 = 1;
                                        r17 = r13;
                                        z8 = z7;
                                    }
                                    iMax2 = Math.max(this.c0, k());
                                    if (iMax2 > k()) {
                                        L(iMax2);
                                        r21[r10] = r10;
                                        r3 = r10;
                                        z9 = r3 == true ? 1 : 0;
                                    } else {
                                        r0 = r17;
                                    }
                                    if (r0 == 0) {
                                        z9 = z8;
                                        if (r21[0] == 2) {
                                            r2 = r0;
                                            z12 = z9;
                                            if (q() > i) {
                                                this.E0 = r10;
                                                r21[0] = r10;
                                                O(i);
                                                ?? r11 = r10;
                                                z12 = r11 == true ? 1 : 0;
                                                r2 = r11;
                                            }
                                        }
                                        r0 = r3;
                                        r2 = r0;
                                        r2 = r0;
                                        z12 = z9;
                                        z12 = z9;
                                        r1 = r2;
                                        r1 = r2;
                                        z10 = z12;
                                        z10 = z12;
                                        if (r21[r10] != 2) {
                                        }
                                        if (i4 > i6) {
                                            r1 = r2;
                                            z10 = z12;
                                            z11 = false;
                                        } else {
                                            r1 = r2;
                                            z10 = z12;
                                        }
                                        i3 = i4;
                                        z3 = z5;
                                        u21Var3 = u21Var3;
                                        r13 = r14;
                                        z4 = z11;
                                    } else {
                                        z9 = z8;
                                        r0 = r3;
                                        r1 = r0;
                                        z10 = z9;
                                    }
                                    r1 = r2;
                                    z10 = z12;
                                    r14 = r1;
                                    i6 = 8;
                                    z11 = z10;
                                    if (i4 > i6) {
                                        r1 = r2;
                                        z10 = z12;
                                        z11 = false;
                                    } else {
                                        r1 = r2;
                                        z10 = z12;
                                    }
                                    i3 = i4;
                                    z3 = z5;
                                    u21Var3 = u21Var3;
                                    r13 = r14;
                                    z4 = z11;
                                }
                            } catch (Exception e5) {
                                e = e5;
                            }
                        }
                        ka4Var.p();
                        z6 = true;
                    } catch (Exception e6) {
                        e = e6;
                        z5 = z3;
                    }
                } catch (Exception e7) {
                    e = e7;
                    z5 = z3;
                    z14 = z4;
                }
                if (z6) {
                    zArr[2] = false;
                    zW2 = W(64);
                    Q(ka4Var, zW2);
                    size = this.q0.size();
                    i8 = 0;
                    z13 = false;
                    while (i8 < size) {
                        m31Var = (m31) this.q0.get(i8);
                        m31Var.Q(ka4Var, zW2);
                        boolean z28 = zW2;
                        int i47 = size;
                        if (m31Var.h == -1 || m31Var.i != -1) {
                            z13 = true;
                        }
                        i8++;
                        zW2 = z28;
                        size = i47;
                        z13 = z13;
                    }
                    z7 = z13;
                } else {
                    Q(ka4Var, zW);
                    while (i5 < size2) {
                        ((m31) this.q0.get(i5)).Q(ka4Var, zW);
                    }
                    z7 = false;
                }
                if (z5 && i4 < 8 && zArr[2]) {
                    iMax3 = 0;
                    iMax4 = 0;
                    while (i7 < size2) {
                        m31 m31Var17 = (m31) this.q0.get(i7);
                        iMax4 = Math.max(iMax4, m31Var17.q() + m31Var17.Y);
                        iMax3 = Math.max(iMax3, m31Var17.k() + m31Var17.Z);
                    }
                    iMax5 = Math.max(this.b0, iMax4);
                    iMax6 = Math.max(this.c0, iMax3);
                    r13 = r13;
                    z7 = z7;
                    if (i13 == 2 && q() < iMax5) {
                        r13 = r13;
                        z7 = z7;
                        O(iMax5);
                        r21[0] = 2;
                        r13 = 1;
                        z7 = true;
                    }
                    if (i12 == 2 && k() < iMax6) {
                        L(iMax6);
                        r21[1] = 2;
                        r13 = 1;
                        z7 = true;
                    }
                }
                iMax = Math.max(this.b0, q());
                if (iMax > q()) {
                    O(iMax);
                    r10 = 1;
                    r21[0] = 1;
                    z8 = true;
                    r17 = 1;
                } else {
                    r10 = 1;
                    r17 = r13;
                    z8 = z7;
                }
                iMax2 = Math.max(this.c0, k());
                if (iMax2 > k()) {
                    L(iMax2);
                    r21[r10] = r10;
                    r3 = r10;
                    z9 = r3 == true ? 1 : 0;
                } else {
                    r0 = r17;
                }
                if (r0 == 0) {
                    z9 = z8;
                    if (r21[0] == 2 && i > 0) {
                        r2 = r0;
                        z12 = z9;
                        if (q() > i) {
                            this.E0 = r10;
                            r21[0] = r10;
                            O(i);
                            ?? r12 = r10;
                            z12 = r12 == true ? 1 : 0;
                            r2 = r12;
                        }
                    }
                    r0 = r3;
                    r2 = r0;
                    r2 = r0;
                    z12 = z9;
                    z12 = z9;
                    r1 = r2;
                    r1 = r2;
                    z10 = z12;
                    z10 = z12;
                    if (r21[r10] != 2 && iMax8 > 0 && k() > iMax8) {
                        this.F0 = r10;
                        r21[r10] = r10;
                        L(iMax8);
                        i6 = 8;
                        r14 = 1;
                        z11 = true;
                    }
                    if (i4 > i6) {
                        r1 = r2;
                        z10 = z12;
                        z11 = false;
                    } else {
                        r1 = r2;
                        z10 = z12;
                    }
                    i3 = i4;
                    z3 = z5;
                    u21Var3 = u21Var3;
                    r13 = r14;
                    z4 = z11;
                } else {
                    z9 = z8;
                    r0 = r3;
                    r1 = r0;
                    z10 = z9;
                }
                r1 = r2;
                z10 = z12;
                r14 = r1;
                i6 = 8;
                z11 = z10;
                if (i4 > i6) {
                    r1 = r2;
                    z10 = z12;
                    z11 = false;
                } else {
                    r1 = r2;
                    z10 = z12;
                }
                i3 = i4;
                z3 = z5;
                u21Var3 = u21Var3;
                r13 = r14;
                z4 = z11;
            }
            this.q0 = arrayList25;
            if (r13 != 0) {
                r21[0] = i13;
                r21[1] = i12;
            }
            F(ka4Var.m);
        }
        u21Var = u21Var4;
        i = iMax7;
        z = false;
        if (W(64)) {
            z2 = true;
        } else {
            z2 = true;
        }
        ka4Var.getClass();
        ka4Var.h = false;
        if (this.D0 == 0) {
            c = 1;
        } else {
            c = 1;
        }
        ArrayList arrayList26 = this.q0;
        if (r21[0] != 2) {
            z3 = true;
        } else {
            z3 = true;
        }
        this.z0 = 0;
        this.A0 = 0;
        while (i2 < size2) {
            m31Var2 = (m31) this.q0.get(i2);
            if (m31Var2 instanceof n31) {
                ((n31) m31Var2).U();
            }
        }
        zW = W(64);
        r13 = z;
        i3 = 0;
        z4 = true;
        while (z4) {
            i4 = i3 + 1;
            ka4Var.t();
            this.z0 = 0;
            this.A0 = 0;
            g(ka4Var);
            while (i9 < size2) {
                ((m31) this.q0.get(i9)).g(ka4Var);
            }
            S(ka4Var);
            weakReference = this.G0;
            if (weakReference != null) {
                z5 = z3;
                weakReference2 = this.I0;
                if (weakReference2 != null) {
                    ka4Var.f(ka4Var.k(this.L), ka4Var.k((u21) this.I0.get()), 0, 5);
                    this.I0 = null;
                }
                weakReference3 = this.H0;
                if (weakReference3 != null) {
                    u21Var2 = u21Var;
                    u21Var = u21Var2;
                    ka4Var.f(ka4Var.k((u21) this.H0.get()), ka4Var.k(u21Var2), 0, 5);
                    this.H0 = null;
                }
                weakReference4 = this.J0;
                if (weakReference4 == null) {
                }
                ka4Var.p();
                z6 = true;
            } else {
                z5 = z3;
                weakReference2 = this.I0;
                if (weakReference2 != null) {
                    ka4Var.f(ka4Var.k(this.L), ka4Var.k((u21) this.I0.get()), 0, 5);
                    this.I0 = null;
                }
                weakReference3 = this.H0;
                if (weakReference3 != null) {
                    u21Var2 = u21Var;
                    u21Var = u21Var2;
                    ka4Var.f(ka4Var.k((u21) this.H0.get()), ka4Var.k(u21Var2), 0, 5);
                    this.H0 = null;
                }
                weakReference4 = this.J0;
                if (weakReference4 == null) {
                }
                ka4Var.p();
                z6 = true;
            }
            if (z6) {
                zArr[2] = false;
                zW2 = W(64);
                Q(ka4Var, zW2);
                size = this.q0.size();
                i8 = 0;
                z13 = false;
                while (i8 < size) {
                    m31Var = (m31) this.q0.get(i8);
                    m31Var.Q(ka4Var, zW2);
                    boolean z29 = zW2;
                    int i48 = size;
                    if (m31Var.h == -1) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    i8++;
                    zW2 = z29;
                    size = i48;
                    z13 = z13;
                }
                z7 = z13;
            } else {
                Q(ka4Var, zW);
                while (i5 < size2) {
                    ((m31) this.q0.get(i5)).Q(ka4Var, zW);
                }
                z7 = false;
            }
            if (z5) {
                iMax3 = 0;
                iMax4 = 0;
                while (i7 < size2) {
                    m31 m31Var18 = (m31) this.q0.get(i7);
                    iMax4 = Math.max(iMax4, m31Var18.q() + m31Var18.Y);
                    iMax3 = Math.max(iMax3, m31Var18.k() + m31Var18.Z);
                }
                iMax5 = Math.max(this.b0, iMax4);
                iMax6 = Math.max(this.c0, iMax3);
                r13 = r13;
                z7 = z7;
                if (i13 == 2) {
                    r13 = r13;
                    z7 = z7;
                    O(iMax5);
                    r21[0] = 2;
                    r13 = 1;
                    z7 = true;
                }
                if (i12 == 2) {
                    L(iMax6);
                    r21[1] = 2;
                    r13 = 1;
                    z7 = true;
                }
            }
            iMax = Math.max(this.b0, q());
            if (iMax > q()) {
                O(iMax);
                r10 = 1;
                r21[0] = 1;
                z8 = true;
                r17 = 1;
            } else {
                r10 = 1;
                r17 = r13;
                z8 = z7;
            }
            iMax2 = Math.max(this.c0, k());
            if (iMax2 > k()) {
                L(iMax2);
                r21[r10] = r10;
                r3 = r10;
                z9 = r3 == true ? 1 : 0;
            } else {
                r0 = r17;
            }
            if (r0 == 0) {
                z9 = z8;
                if (r21[0] == 2) {
                    r2 = r0;
                    z12 = z9;
                    if (q() > i) {
                        this.E0 = r10;
                        r21[0] = r10;
                        O(i);
                        ?? r15 = r10;
                        z12 = r15 == true ? 1 : 0;
                        r2 = r15;
                    }
                }
                r0 = r3;
                r2 = r0;
                r2 = r0;
                z12 = z9;
                z12 = z9;
                r1 = r2;
                r1 = r2;
                z10 = z12;
                z10 = z12;
                if (r21[r10] != 2) {
                }
                if (i4 > i6) {
                    r1 = r2;
                    z10 = z12;
                    z11 = false;
                } else {
                    r1 = r2;
                    z10 = z12;
                }
                i3 = i4;
                z3 = z5;
                u21Var3 = u21Var3;
                r13 = r14;
                z4 = z11;
            } else {
                z9 = z8;
                r0 = r3;
                r1 = r0;
                z10 = z9;
            }
            r1 = r2;
            z10 = z12;
            r14 = r1;
            i6 = 8;
            z11 = z10;
            if (i4 > i6) {
                r1 = r2;
                z10 = z12;
                z11 = false;
            } else {
                r1 = r2;
                z10 = z12;
            }
            i3 = i4;
            z3 = z5;
            u21Var3 = u21Var3;
            r13 = r14;
            z4 = z11;
        }
        this.q0 = arrayList26;
        if (r13 != 0) {
            r21[0] = i13;
            r21[1] = i12;
        }
        F(ka4Var.m);
    }

    public final boolean W(int i) {
        return (this.D0 & i) == i;
    }

    @Override // defpackage.m31
    public final void n(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        Iterator it = this.q0.iterator();
        while (it.hasNext()) {
            ((m31) it.next()).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
