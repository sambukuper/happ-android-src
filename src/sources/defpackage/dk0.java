package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dk0 implements n85 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ dk0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [t6] */
    /* JADX WARN: Type inference failed for: r4v0, types: [d02] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.n85
    public final void a(Object obj) {
        ek0 ek0Var;
        ?? r1;
        jk0 jk0Var;
        h70 h70Var;
        ?? arrayList;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                if (!((ek0) this.b).l.get() || (r1 = (ek0Var = (ek0) this.b).f) == 0 || (jk0Var = ek0Var.g) == null || (h70Var = ek0Var.i) == null) {
                    return;
                }
                if (list != null) {
                    arrayList = new ArrayList(xv0.Z(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((wi0) it.next()).a());
                    }
                } else {
                    arrayList = d02.X;
                }
                try {
                    List list2 = ((ek0) this.b).k;
                    Iterable<String> iterableY0 = ((AtomicBoolean) r1.m0).get() ? d02.X : wv0.Y0(r1.c(arrayList));
                    ArrayList arrayList2 = new ArrayList(xv0.Z(iterableY0, 10));
                    for (String str : iterableY0) {
                        str.getClass();
                        arrayList2.add(z68.v(str, null, null));
                    }
                    Set setY = q57.Y(wv0.c1(list2), wv0.c1(arrayList2));
                    if (!setY.isEmpty() && h70Var.d(jk0Var.c(), setY)) {
                        hi5.z0("CameraPresencePrvdr");
                        return;
                    }
                } catch (Exception unused) {
                    hi5.z0("CameraPresencePrvdr");
                }
                try {
                    r1.k(arrayList);
                    Set<String> setH = r1.h();
                    ArrayList arrayList3 = new ArrayList(xv0.Z(setH, 10));
                    for (String str2 : setH) {
                        str2.getClass();
                        arrayList3.add(z68.v(str2, null, null));
                    }
                    if (arrayList3.equals(((ek0) this.b).k)) {
                        return;
                    }
                    ek0 ek0Var2 = (ek0) this.b;
                    List listY0 = wv0.Y0(ek0Var2.k);
                    if (arrayList3.equals(listY0)) {
                        return;
                    }
                    synchronized (ek0Var2.d) {
                        if (ek0Var2.e != null) {
                            hi5.z0("CameraPresencePrvdr");
                            ScheduledFuture scheduledFuture = ek0Var2.e;
                            scheduledFuture.getClass();
                            scheduledFuture.cancel(false);
                            ek0Var2.e = null;
                        }
                        break;
                    }
                    Set setC1 = wv0.c1(listY0);
                    Set setC2 = wv0.c1(arrayList3);
                    Set setY2 = q57.Y(setC2, setC1);
                    Set setY3 = q57.Y(setC1, setC2);
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList(xv0.Z(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(((wi0) it2.next()).a());
                    }
                    try {
                        Iterator it3 = setY3.iterator();
                        while (it3.hasNext()) {
                            ek0Var2.c(((wi0) it3.next()).a());
                        }
                        jk0 jk0Var2 = ek0Var2.g;
                        if (jk0Var2 != null) {
                            hi5.z0("CameraPresencePrvdr");
                            jk0Var2.a(arrayList5);
                            arrayList4.add(jk0Var2);
                            hi5.z0("CameraPresencePrvdr");
                        }
                        if (!ek0Var2.m.isEmpty()) {
                            ek0Var2.m.size();
                            hi5.z0("CameraPresencePrvdr");
                            for (fg3 fg3Var : ek0Var2.m) {
                                fg3Var.a(arrayList5);
                                arrayList4.add(fg3Var);
                            }
                        }
                        ek0Var2.k = arrayList3;
                        Iterator it4 = setY2.iterator();
                        while (it4.hasNext()) {
                            ek0Var2.a(((wi0) it4.next()).a());
                        }
                        ek0Var2.b(setY2, setY3);
                        return;
                    } catch (Exception unused2) {
                        hi5.z0("CameraPresencePrvdr");
                        ArrayList arrayList6 = new ArrayList(xv0.Z(listY0, 10));
                        Iterator it5 = listY0.iterator();
                        while (it5.hasNext()) {
                            arrayList6.add(((wi0) it5.next()).a());
                        }
                        Iterator it6 = new rk6(arrayList4).iterator();
                        while (true) {
                            qk6 qk6Var = (qk6) it6;
                            if (!((ListIterator) qk6Var.Y).hasPrevious()) {
                                Iterator it7 = setY3.iterator();
                                while (it7.hasNext()) {
                                    ek0Var2.a(((wi0) it7.next()).a());
                                }
                                Iterator it8 = setY2.iterator();
                                while (it8.hasNext()) {
                                    ek0Var2.c(((wi0) it8.next()).a());
                                }
                                return;
                            }
                            fg3 fg3Var2 = (fg3) ((ListIterator) qk6Var.Y).previous();
                            try {
                                fg3Var2.a(arrayList6);
                            } catch (Exception unused3) {
                                Objects.toString(fg3Var2);
                                hi5.z0("CameraPresencePrvdr");
                            }
                        }
                    }
                } catch (Exception unused4) {
                    hi5.z0("CameraPresencePrvdr");
                    return;
                }
                break;
            default:
                ((d41) this.b).accept(obj);
                return;
        }
    }

    @Override // defpackage.n85
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                th.getClass();
                ek0 ek0Var = (ek0) this.b;
                if (ek0Var.l.get()) {
                    hi5.z0("CameraPresencePrvdr");
                    bo5 bo5Var = ek0Var.h;
                    if (bo5Var != null) {
                        bo5Var.a();
                    }
                    break;
                }
                break;
            default:
                hi5.z0("ObserverToConsumerAdapter");
                break;
        }
    }
}
