package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uw7 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public uw7(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        tw7 tw7Var = new tw7(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                } else {
                    kp5.t("Expecting menu, got ".concat(name));
                    return;
                }
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                kp5.t("Unexpected end of document");
                return;
            }
            Menu menu2 = tw7Var.a;
            if (eventType != i) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z2 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            tw7Var.b = 0;
                            tw7Var.c = 0;
                            tw7Var.d = 0;
                            tw7Var.e = 0;
                            tw7Var.f = true;
                            tw7Var.g = true;
                        } else if (name2.equals("item")) {
                            if (!tw7Var.h) {
                                tt4 tt4Var = tw7Var.z;
                                if (tt4Var == null || !tt4Var.b.hasSubMenu()) {
                                    tw7Var.h = true;
                                    tw7Var.b(menu2.add(tw7Var.b, tw7Var.i, tw7Var.j, tw7Var.k));
                                } else {
                                    tw7Var.h = true;
                                    tw7Var.b(menu2.addSubMenu(tw7Var.b, tw7Var.i, tw7Var.j, tw7Var.k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                    }
                }
            } else if (z2) {
                xmlPullParser2 = xmlPullParser;
            } else {
                String name3 = xmlPullParser.getName();
                boolean zEquals = name3.equals("group");
                Context context = this.c;
                if (zEquals) {
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h66.MenuGroup);
                    tw7Var.b = typedArrayObtainStyledAttributes.getResourceId(h66.MenuGroup_android_id, 0);
                    tw7Var.c = typedArrayObtainStyledAttributes.getInt(h66.MenuGroup_android_menuCategory, 0);
                    tw7Var.d = typedArrayObtainStyledAttributes.getInt(h66.MenuGroup_android_orderInCategory, 0);
                    tw7Var.e = typedArrayObtainStyledAttributes.getInt(h66.MenuGroup_android_checkableBehavior, 0);
                    tw7Var.f = typedArrayObtainStyledAttributes.getBoolean(h66.MenuGroup_android_visible, true);
                    tw7Var.g = typedArrayObtainStyledAttributes.getBoolean(h66.MenuGroup_android_enabled, true);
                    typedArrayObtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h66.MenuItem);
                    tw7Var.i = typedArrayObtainStyledAttributes2.getResourceId(h66.MenuItem_android_id, 0);
                    tw7Var.j = (typedArrayObtainStyledAttributes2.getInt(h66.MenuItem_android_menuCategory, tw7Var.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(h66.MenuItem_android_orderInCategory, tw7Var.d) & 65535);
                    tw7Var.k = typedArrayObtainStyledAttributes2.getText(h66.MenuItem_android_title);
                    tw7Var.l = typedArrayObtainStyledAttributes2.getText(h66.MenuItem_android_titleCondensed);
                    tw7Var.m = typedArrayObtainStyledAttributes2.getResourceId(h66.MenuItem_android_icon, 0);
                    String string = typedArrayObtainStyledAttributes2.getString(h66.MenuItem_android_alphabeticShortcut);
                    tw7Var.n = string == null ? (char) 0 : string.charAt(0);
                    tw7Var.o = typedArrayObtainStyledAttributes2.getInt(h66.MenuItem_alphabeticModifiers, 4096);
                    String string2 = typedArrayObtainStyledAttributes2.getString(h66.MenuItem_android_numericShortcut);
                    tw7Var.p = string2 == null ? (char) 0 : string2.charAt(0);
                    tw7Var.q = typedArrayObtainStyledAttributes2.getInt(h66.MenuItem_numericModifiers, 4096);
                    if (typedArrayObtainStyledAttributes2.hasValue(h66.MenuItem_android_checkable)) {
                        tw7Var.r = typedArrayObtainStyledAttributes2.getBoolean(h66.MenuItem_android_checkable, false) ? 1 : 0;
                    } else {
                        tw7Var.r = tw7Var.e;
                    }
                    tw7Var.s = typedArrayObtainStyledAttributes2.getBoolean(h66.MenuItem_android_checked, false);
                    tw7Var.t = typedArrayObtainStyledAttributes2.getBoolean(h66.MenuItem_android_visible, tw7Var.f);
                    tw7Var.u = typedArrayObtainStyledAttributes2.getBoolean(h66.MenuItem_android_enabled, tw7Var.g);
                    tw7Var.v = typedArrayObtainStyledAttributes2.getInt(h66.MenuItem_showAsAction, -1);
                    tw7Var.y = typedArrayObtainStyledAttributes2.getString(h66.MenuItem_android_onClick);
                    tw7Var.w = typedArrayObtainStyledAttributes2.getResourceId(h66.MenuItem_actionLayout, 0);
                    tw7Var.x = typedArrayObtainStyledAttributes2.getString(h66.MenuItem_actionViewClass);
                    String string3 = typedArrayObtainStyledAttributes2.getString(h66.MenuItem_actionProviderClass);
                    if (string3 != null && tw7Var.w == 0 && tw7Var.x == null) {
                        tw7Var.z = (tt4) tw7Var.a(string3, f, this.b);
                    } else {
                        tw7Var.z = null;
                    }
                    tw7Var.A = typedArrayObtainStyledAttributes2.getText(h66.MenuItem_contentDescription);
                    tw7Var.B = typedArrayObtainStyledAttributes2.getText(h66.MenuItem_tooltipText);
                    if (typedArrayObtainStyledAttributes2.hasValue(h66.MenuItem_iconTintMode)) {
                        tw7Var.D = dw1.c(typedArrayObtainStyledAttributes2.getInt(h66.MenuItem_iconTintMode, -1), tw7Var.D);
                    } else {
                        tw7Var.D = null;
                    }
                    if (typedArrayObtainStyledAttributes2.hasValue(h66.MenuItem_iconTint)) {
                        int i2 = h66.MenuItem_iconTint;
                        if (!typedArrayObtainStyledAttributes2.hasValue(i2) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(i2, 0)) == 0 || (colorStateList = w79.v(context, resourceId)) == null) {
                            colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(i2);
                        }
                        tw7Var.C = colorStateList;
                    } else {
                        tw7Var.C = null;
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                    tw7Var.h = false;
                } else if (name3.equals("menu")) {
                    tw7Var.h = true;
                    SubMenu subMenuAddSubMenu = menu2.addSubMenu(tw7Var.b, tw7Var.i, tw7Var.j, tw7Var.k);
                    tw7Var.b(subMenuAddSubMenu.getItem());
                    xmlPullParser2 = xmlPullParser;
                    b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                } else {
                    xmlPullParser2 = xmlPullParser;
                    str = name3;
                    z2 = true;
                }
                xmlPullParser2 = xmlPullParser;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof nt4)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof nt4) {
                    nt4 nt4Var = (nt4) menu;
                    if (!nt4Var.p) {
                        nt4Var.w();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((nt4) menu).v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((nt4) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
