package defpackage;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.JavaTimeTypeAdapters;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.b;
import com.google.gson.internal.sql.a;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class su2 {
    public static final mj0 m;
    public static final JsonAdapterAnnotationTypeAdapterFactory n;
    public static final su2 o;
    public static final List p;
    public static final sj2 l = sj2.d;
    public static final int q = 1;
    public static final int r = 1;
    public static final int s = 2;
    public final Excluder a = Excluder.Z;
    public final int h = q;
    public final HashMap b = new HashMap();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean e = true;
    public sj2 f = l;
    public int i = 0;
    public final int j = r;
    public final int k = s;
    public final ArrayDeque g = new ArrayDeque();

    static {
        mj0 mj0Var = new mj0((byte) 9, Collections.EMPTY_MAP, Collections.EMPTY_LIST, false);
        m = mj0Var;
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(mj0Var);
        n = jsonAdapterAnnotationTypeAdapterFactory;
        su2 su2Var = new su2();
        o = su2Var;
        p = su2Var.a(mj0Var, jsonAdapterAnnotationTypeAdapterFactory);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List b(AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        if (abstractCollection.size() == 1) {
            return Collections.singletonList(abstractCollection instanceof List ? ((List) abstractCollection).get(0) : abstractCollection.iterator().next());
        }
        return Collections.unmodifiableList(Arrays.asList(abstractCollection.toArray()));
    }

    public final List a(mj0 mj0Var, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(b.B);
        arrayList.add(ObjectTypeAdapter.d(this.j));
        arrayList.add(this.a);
        ArrayList arrayList2 = this.c;
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            Collections.reverse(arrayList3);
            arrayList.addAll(arrayList3);
        }
        ArrayList arrayList4 = this.d;
        if (!arrayList4.isEmpty()) {
            ArrayList arrayList5 = new ArrayList(arrayList4);
            Collections.reverse(arrayList5);
            arrayList.addAll(arrayList5);
        }
        List list = a.a;
        arrayList.add(b.r);
        arrayList.add(b.g);
        arrayList.add(b.d);
        arrayList.add(b.e);
        arrayList.add(b.f);
        com.google.gson.b bVar = b.k;
        arrayList.add(b.f(Long.TYPE, Long.class, bVar));
        arrayList.add(b.f(Double.TYPE, Double.class, b.m));
        arrayList.add(b.f(Float.TYPE, Float.class, b.l));
        int i = this.k;
        arrayList.add(i == 2 ? NumberTypeAdapter.b : NumberTypeAdapter.d(i));
        arrayList.add(b.h);
        arrayList.add(b.i);
        arrayList.add(b.e(AtomicLong.class, b.a(bVar)));
        arrayList.add(b.e(AtomicLongArray.class, b.b(bVar)));
        arrayList.add(b.j);
        arrayList.add(b.n);
        arrayList.add(b.s);
        arrayList.add(b.t);
        arrayList.add(b.o);
        arrayList.add(b.p);
        arrayList.add(b.q);
        arrayList.add(b.u);
        arrayList.add(b.v);
        arrayList.add(b.x);
        arrayList.add(b.y);
        arrayList.add(b.A);
        arrayList.add(b.w);
        arrayList.add(b.b);
        arrayList.add(DefaultDateTypeAdapter.c);
        arrayList.add(b.z);
        vg8 vg8Var = null;
        try {
            com.google.gson.b bVar2 = JavaTimeTypeAdapters.a;
            ((JavaTimeTypeAdapters) ((wg8) JavaTimeTypeAdapters.class.getDeclaredConstructor(null).newInstance(null))).getClass();
            vg8Var = JavaTimeTypeAdapters.j;
        } catch (LinkageError | ReflectiveOperationException unused) {
        }
        if (vg8Var != null) {
            arrayList.add(vg8Var);
        }
        arrayList.addAll(a.a);
        arrayList.add(ArrayTypeAdapter.c);
        arrayList.add(b.a);
        arrayList.add(new CollectionTypeAdapterFactory(mj0Var));
        arrayList.add(new MapTypeAdapterFactory(mj0Var));
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(b.C);
        arrayList.add(new ReflectiveTypeAdapterFactory(mj0Var, this.h, this.a, jsonAdapterAnnotationTypeAdapterFactory, b(this.g)));
        arrayList.trimToSize();
        return Collections.unmodifiableList(arrayList);
    }

    public final void c(Type type, Object obj) {
        Objects.requireNonNull(type);
        boolean z = obj instanceof ww2;
        if (!z && !(obj instanceof yn3) && !(obj instanceof com.google.gson.b)) {
            u52.m("Class ", obj.getClass().getName(), " does not implement any supported type adapter class or interface");
            return;
        }
        if (type == Object.class) {
            u52.j(type, "Cannot override built-in adapter for ");
            return;
        }
        ArrayList arrayList = this.c;
        if (z || (obj instanceof yn3)) {
            arrayList.add(TreeTypeAdapter.e(new yi8(type), obj));
        }
        if (obj instanceof com.google.gson.b) {
            arrayList.add(b.d(new yi8(type), (com.google.gson.b) obj));
        }
    }
}
