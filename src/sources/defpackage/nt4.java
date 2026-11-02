package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class nt4 implements Menu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public lt4 e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public CharSequence m;
    public Drawable n;
    public View o;
    public st4 v;
    public boolean x;
    public boolean l = false;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public final ArrayList t = new ArrayList();
    public final CopyOnWriteArrayList u = new CopyOnWriteArrayList();
    public boolean w = false;

    public nt4(Context context) {
        boolean zB0;
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = hw8.a;
            if (Build.VERSION.SDK_INT >= 28) {
                zB0 = en.b0(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zB0 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zB0) {
                z = true;
            }
        }
        this.d = z;
    }

    public final st4 a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            bt.q("order does not contain a valid category.");
            return null;
        }
        int i6 = (y[i5] << 16) | (65535 & i3);
        st4 st4Var = new st4(this, i, i2, i3, i6, charSequence, this.l ? 1 : 0);
        ArrayList arrayList = this.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((st4) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                arrayList.add(i4, st4Var);
                p(true);
                return st4Var;
            }
        }
        i4 = 0;
        arrayList.add(i4, st4Var);
        p(true);
        return st4Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            st4 st4VarA = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            st4VarA.setIcon(resolveInfo.loadIcon(packageManager));
            st4VarA.g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = st4VarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        st4 st4VarA = a(i, i2, i3, charSequence);
        gn7 gn7Var = new gn7(this.a, this, st4VarA);
        st4VarA.o = gn7Var;
        gn7Var.setHeaderTitle(st4VarA.e);
        return gn7Var;
    }

    public final void b(iu4 iu4Var, Context context) {
        this.u.add(new WeakReference(iu4Var));
        iu4Var.k(context, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            iu4 iu4Var = (iu4) weakReference.get();
            if (iu4Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                iu4Var.b(this, z);
            }
        }
        this.s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        st4 st4Var = this.v;
        if (st4Var != null) {
            d(st4Var);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(st4 st4Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zE = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == st4Var) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                iu4 iu4Var = (iu4) weakReference.get();
                if (iu4Var != null) {
                    zE = iu4Var.e(st4Var);
                    if (zE) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zE) {
                this.v = null;
            }
        }
        return zE;
    }

    public boolean e(nt4 nt4Var, MenuItem menuItem) {
        lt4 lt4Var = this.e;
        return lt4Var != null && lt4Var.l(nt4Var, menuItem);
    }

    public boolean f(st4 st4Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zH = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            iu4 iu4Var = (iu4) weakReference.get();
            if (iu4Var != null) {
                zH = iu4Var.h(st4Var);
                if (zH) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zH) {
            this.v = st4Var;
        }
        return zH;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            st4 st4Var = (st4) arrayList.get(i2);
            if (st4Var.a == i) {
                return st4Var;
            }
            if (st4Var.hasSubMenu() && (menuItemFindItem = st4Var.o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final st4 g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (st4) arrayList.get(0);
        }
        boolean zN = n();
        for (int i2 = 0; i2 < size; i2++) {
            st4 st4Var = (st4) arrayList.get(i2);
            char c = zN ? st4Var.j : st4Var.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zN && c == '\b' && i == 67))) {
                return st4Var;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                st4 st4Var = (st4) arrayList2.get(i2);
                if (st4Var.hasSubMenu()) {
                    st4Var.o.h(arrayList, i, keyEvent);
                }
                char c = zN ? st4Var.j : st4Var.h;
                if ((modifiers & 69647) == ((zN ? st4Var.k : st4Var.i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zN && c == '\b' && i == 67)) && st4Var.isEnabled()) {
                        arrayList.add(st4Var);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((st4) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
            boolean zD = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                iu4 iu4Var = (iu4) weakReference.get();
                if (iu4Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zD |= iu4Var.d();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (zD) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i = 0; i < size; i++) {
                    st4 st4Var = (st4) arrayListL.get(i);
                    if ((st4Var.x & 32) == 32) {
                        arrayList.add(st4Var);
                    } else {
                        arrayList2.add(st4Var);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z = this.h;
        ArrayList arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            st4 st4Var = (st4) arrayList2.get(i);
            if (st4Var.isVisible()) {
                arrayList.add(st4Var);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z) {
        if (this.p) {
            this.q = true;
            if (z) {
                this.r = true;
                return;
            }
            return;
        }
        if (z) {
            this.h = true;
            this.k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            iu4 iu4Var = (iu4) weakReference.get();
            if (iu4Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                iu4Var.i();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        st4 st4VarG = g(i, keyEvent);
        boolean zQ = st4VarG != null ? q(st4VarG, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0049  */
    /* JADX WARN: Code duplicated, block: B:33:0x0050  */
    /* JADX WARN: Code duplicated, block: B:35:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:43:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0071  */
    /* JADX WARN: Code duplicated, block: B:48:0x007a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00a4 A[SYNTHETIC] */
    public final boolean q(MenuItem menuItem, iu4 iu4Var, int i) {
        tt4 tt4Var;
        boolean zExpandActionView;
        tt4 tt4Var2;
        boolean z;
        gn7 gn7Var;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        iu4 iu4Var2;
        st4 st4Var = (st4) menuItem;
        boolean zC = false;
        if (st4Var == null || !st4Var.isEnabled()) {
            return false;
        }
        nt4 nt4Var = st4Var.n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = st4Var.p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(st4Var)) && !nt4Var.e(nt4Var, st4Var)) {
            Intent intent = st4Var.g;
            if (intent != null) {
                try {
                    nt4Var.a.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    tt4Var = st4Var.A;
                    if (tt4Var == null) {
                    }
                    zExpandActionView = false;
                    tt4Var2 = st4Var.A;
                    if (tt4Var2 == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (st4Var.e()) {
                        zExpandActionView |= st4Var.expandActionView();
                        if (zExpandActionView) {
                            c(true);
                        }
                    } else if (st4Var.hasSubMenu()) {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!st4Var.hasSubMenu()) {
                            gn7 gn7Var2 = new gn7(this.a, this, st4Var);
                            st4Var.o = gn7Var2;
                            gn7Var2.setHeaderTitle(st4Var.e);
                        }
                        gn7Var = st4Var.o;
                        if (z) {
                            tt4Var2.b.onPrepareSubMenu(gn7Var);
                        }
                        copyOnWriteArrayList = this.u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (iu4Var != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                iu4Var2 = (iu4) weakReference.get();
                                if (iu4Var2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zC) {
                                    zC = iu4Var2.c(gn7Var);
                                }
                            }
                        }
                        zExpandActionView |= zC;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    } else {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!st4Var.hasSubMenu()) {
                            gn7 gn7Var3 = new gn7(this.a, this, st4Var);
                            st4Var.o = gn7Var3;
                            gn7Var3.setHeaderTitle(st4Var.e);
                        }
                        gn7Var = st4Var.o;
                        if (z) {
                            tt4Var2.b.onPrepareSubMenu(gn7Var);
                        }
                        copyOnWriteArrayList = this.u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zC = iu4Var != null ? iu4Var.c(gn7Var) : false;
                            while (r8.hasNext()) {
                                iu4Var2 = (iu4) weakReference.get();
                                if (iu4Var2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zC) {
                                    zC = iu4Var2.c(gn7Var);
                                }
                            }
                        }
                        zExpandActionView |= zC;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                tt4Var = st4Var.A;
                if (tt4Var == null && tt4Var.b.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        tt4Var2 = st4Var.A;
        if (tt4Var2 == null && tt4Var2.b.hasSubMenu()) {
            z = true;
        } else {
            z = false;
        }
        if (st4Var.e()) {
            zExpandActionView |= st4Var.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (st4Var.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                c(false);
            }
            if (!st4Var.hasSubMenu()) {
                gn7 gn7Var4 = new gn7(this.a, this, st4Var);
                st4Var.o = gn7Var4;
                gn7Var4.setHeaderTitle(st4Var.e);
            }
            gn7Var = st4Var.o;
            if (z) {
                tt4Var2.b.onPrepareSubMenu(gn7Var);
            }
            copyOnWriteArrayList = this.u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (iu4Var != null) {
                }
                while (r8.hasNext()) {
                    iu4Var2 = (iu4) weakReference.get();
                    if (iu4Var2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zC) {
                        zC = iu4Var2.c(gn7Var);
                    }
                }
            }
            zExpandActionView |= zC;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(iu4 iu4Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            iu4 iu4Var2 = (iu4) weakReference.get();
            if (iu4Var2 == null || iu4Var2 == iu4Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((st4) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((st4) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((st4) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((gn7) item.getSubMenu()).s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            st4 st4Var = (st4) arrayList.get(i2);
            if (st4Var.b == i) {
                st4Var.x = (st4Var.x & (-5)) | (z2 ? 4 : 0);
                st4Var.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            st4 st4Var = (st4) arrayList.get(i2);
            if (st4Var.b == i) {
                st4Var.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            st4 st4Var = (st4) arrayList.get(i2);
            if (st4Var.b == i) {
                int i3 = st4Var.x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                st4Var.x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((gn7) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = this.b.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                this.n = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        p(false);
    }

    public final void v() {
        this.p = false;
        if (this.q) {
            this.q = false;
            p(this.r);
        }
    }

    public final void w() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    public nt4 k() {
        return this;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }
}
