package defpackage;

import io.sentry.c2;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r00 implements jl2 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList m;
    public ArrayList n;
    public boolean o;
    public ArrayList p;
    public final ml2 q;
    public boolean r;
    public int s;

    public r00(ml2 ml2Var) {
        ml2Var.I();
        tk2 tk2Var = ml2Var.w;
        if (tk2Var != null) {
            tk2Var.C0.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.s = -1;
        this.q = ml2Var;
    }

    @Override // defpackage.jl2
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (ml2.K(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.q.d.add(this);
        return true;
    }

    public final void b(cm2 cm2Var) {
        this.a.add(cm2Var);
        cm2Var.d = this.b;
        cm2Var.e = this.c;
        cm2Var.f = this.d;
        cm2Var.g = this.e;
    }

    public final void c(int i) {
        if (this.g) {
            if (ml2.K(2)) {
                toString();
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                cm2 cm2Var = (cm2) arrayList.get(i2);
                qk2 qk2Var = cm2Var.b;
                if (qk2Var != null) {
                    qk2Var.u0 += i;
                    if (ml2.K(2)) {
                        Objects.toString(cm2Var.b);
                        int i3 = cm2Var.b.u0;
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            cm2 cm2Var = (cm2) arrayList.get(size);
            if (cm2Var.c) {
                if (cm2Var.a == 8) {
                    cm2Var.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = cm2Var.b.A0;
                    cm2Var.a = 2;
                    cm2Var.c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        cm2 cm2Var2 = (cm2) arrayList.get(i2);
                        if (cm2Var2.c && cm2Var2.b.A0 == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final void e() {
        f(false, true);
    }

    public final int f(boolean z, boolean z2) {
        if (this.r) {
            bt.i("commit already called");
            return 0;
        }
        if (ml2.K(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new ih4());
            h("  ", printWriter, true);
            printWriter.close();
        }
        this.r = true;
        boolean z3 = this.g;
        ml2 ml2Var = this.q;
        if (z3) {
            this.s = ml2Var.k.getAndIncrement();
        } else {
            this.s = -1;
        }
        if (z2) {
            ml2Var.y(this, z);
        }
        return this.s;
    }

    public final void g(int i, qk2 qk2Var, String str, int i2) {
        String str2 = qk2Var.Q0;
        if (str2 != null) {
            am2.c(qk2Var, str2);
        }
        Class<?> cls = qk2Var.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            om0.g("Fragment ", cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.");
            return;
        }
        if (str != null) {
            String str3 = qk2Var.B0;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(qk2Var);
                sb.append(": was ");
                bt.i(p61.n(sb, qk2Var.B0, " now ", str));
                return;
            }
            qk2Var.B0 = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + qk2Var + " with tag " + str + " to container view with no id");
            }
            int i3 = qk2Var.z0;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(qk2Var);
                int i4 = qk2Var.z0;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            qk2Var.z0 = i;
            qk2Var.A0 = i;
        }
        b(new cm2(i2, qk2Var));
        qk2Var.v0 = this.q;
    }

    public final void h(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cm2 cm2Var = (cm2) arrayList.get(i);
            switch (cm2Var.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + cm2Var.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(cm2Var.b);
            if (z) {
                if (cm2Var.d != 0 || cm2Var.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(cm2Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(cm2Var.e));
                }
                if (cm2Var.f != 0 || cm2Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(cm2Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(cm2Var.g));
                }
            }
        }
    }

    public final void i(qk2 qk2Var) {
        ml2 ml2Var = qk2Var.v0;
        if (ml2Var == null || ml2Var == this.q) {
            b(new cm2(3, qk2Var));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + qk2Var.toString() + " is already attached to a FragmentManager.");
    }

    public final void j(qk2 qk2Var, o84 o84Var) {
        ml2 ml2Var = qk2Var.v0;
        ml2 ml2Var2 = this.q;
        if (ml2Var != ml2Var2) {
            u52.j(ml2Var2, "Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            return;
        }
        if (o84Var == o84.Y && qk2Var.X > -1) {
            c2.j("Cannot set maximum Lifecycle to ", o84Var, " after the Fragment has been created");
            return;
        }
        if (o84Var == o84.X) {
            c2.j("Cannot set maximum Lifecycle to ", o84Var, ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            return;
        }
        cm2 cm2Var = new cm2();
        cm2Var.a = 10;
        cm2Var.b = qk2Var;
        cm2Var.c = false;
        cm2Var.h = qk2Var.R0;
        cm2Var.i = o84Var;
        b(cm2Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
