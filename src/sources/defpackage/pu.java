package defpackage;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.work.impl.WorkDatabase;
import io.sentry.c2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import su.happ.proxyutility.ui.BaseActivity;
import su.happ.proxyutility.ui.SnackbarHostActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pu {
    public static final sf A;
    public static final m50 a = new m50(-1.0f);
    public static final m50 b = new m50(1.0f);
    public static final l50 c = new l50(-1.0f);
    public static final l50 d = new l50(1.0f);
    public static final zy0 e;
    public static final zy0 f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;
    public static final int[] k;
    public static final int[] l;
    public static final int[] m;
    public static final Object n;
    public static lr[] o;
    public static lr[] p;
    public static int[] q;
    public static final String[] r;
    public static final String[] s;
    public static final String[] t;
    public static final String[] u;
    public static final String[] v;
    public static final String[] w;
    public static final String[] x;
    public static final String[] y;
    public static final r06 z;

    static {
        new zy0(-1174483411, false, new dx0((byte) 6));
        e = new zy0(-663299267, false, new dx0((byte) 7));
        f = new zy0(-1301157603, false, new dx0((byte) 8));
        g = new int[]{52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};
        h = new int[]{40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};
        i = new int[]{12052516, 1174424, 4087752, 38672185, 20040971, 21899680, 55468344, 20105554, 66708015, 9981791};
        j = new int[]{66430571, 45040722, 4842939, 15895846, 18981244, 46308410, 4697481, 8903007, 53646190, 12474675};
        k = new int[]{56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};
        l = new int[]{45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};
        m = new int[]{23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};
        n = new Object();
        o = null;
        p = null;
        q = null;
        r = new String[]{"aa", "ab", "ace", "ach", "ada", "ady", "ae", "aeb", "af", "afh", "agq", "ain", "ak", "akk", "akz", "ale", "aln", "alt", "am", "an", "ang", "anp", "ar", "arc", "arn", "aro", "arp", "arq", "ars", "arw", "ary", "arz", "as", "asa", "ase", "ast", "av", "avk", "awa", "ay", "az", "ba", "bal", "ban", "bar", "bas", "bax", "bbc", "bbj", "be", "bej", "bem", "bew", "bez", "bfd", "bfq", "bg", "bgc", "bgn", "bho", "bi", "bik", "bin", "bjn", "bkm", "bla", "bm", "bn", "bo", "bpy", "bqi", "br", "bra", "brh", "brx", "bs", "bss", "bua", "bug", "bum", "byn", "byv", "ca", "cad", "car", "cay", "cch", "ccp", "ce", "ceb", "cgg", "ch", "chb", "chg", "chk", "chm", "chn", "cho", "chp", "chr", "chy", "ckb", "co", "cop", "cps", "cr", "crh", "cs", "csb", "cu", "cv", "cy", "da", "dak", "dar", "dav", "day", "de", "del", "den", "dgr", "din", "dje", "doi", "dra", "dsb", "dua", "dum", "dv", "dyo", "dyu", "dz", "dzg", "ebu", "ee", "efi", "egy", "eka", "el", "elx", "en", "enm", "eo", "es", "et", "eu", "ewo", "fa", "fan", "fat", "ff", "fi", "fil", "fiu", "fj", "fo", "fon", "fr", "frm", "fro", "frr", "frs", "fur", "fy", "ga", "gaa", "gay", "gba", "gd", "gem", "gez", "gil", "gl", "gmh", "gn", "goh", "gon", "gor", "got", "grb", "grc", "gsw", "gu", "guz", "gv", "gwi", "ha", "hai", "haw", "he", "hi", "hil", "him", "hit", "hmn", "ho", "hr", "hsb", "ht", "hu", "hup", "hy", "hz", "ia", "iba", "ibb", "id", "ie", "ig", "ii", "ijo", "ik", "ilo", "inc", "ine", "inh", "io", "ira", "iro", "is", "it", "iu", "ja", "jbo", "jgo", "jmc", "jpr", "jrb", "jv", "ka", "kaa", "kab", "kac", "kaj", "kam", "kar", "kaw", "kbd", "kbl", "kcg", "kde", "kea", "kfo", "kg", "kha", "khi", "kho", "khq", "ki", "kj", "kk", "kkj", "kl", "kln", "km", "kmb", "kn", "ko", "kok", "kos", "kpe", "kr", "krc", "krl", "kro", "kru", "ks", "ksb", "ksf", "ksh", "ku", "kum", "kut", "kv", "kw", "ky", "la", "lad", "lag", "lah", "lam", "lb", "lez", "lg", "li", "lkt", "ln", "lo", "lol", "loz", "lt", "lu", "lua", "lui", "lun", "luo", "lus", "luy", "lv", "mad", "maf", "mag", "mai", "mak", "man", "map", "mas", "mde", "mdf", "mdr", "men", "mer", "mfe", "mg", "mga", "mgh", "mgo", "mh", "mi", "mic", "min", "mis", "mk", "mkh", "ml", "mn", "mnc", "mni", "mno", "moh", "mos", "mr", "ms", "mt", "mua", "mul", "mun", "mus", "mwl", "mwr", "my", "mye", "myn", "myv", "na", "nah", "nai", "nap", "naq", "nb", "nd", "nds", "ne", "new", "ng", "nia", "nic", "niu", "nl", "nmg", "nn", "nnh", "no", "nog", "non", "nqo", "nr", "nso", "nub", "nus", "nv", "nwc", "ny", "nym", "nyn", "nyo", "nzi", "oc", "oj", "om", "or", "os", "osa", "ota", "oto", "pa", "paa", "pag", "pal", "pam", "pap", "pau", "peo", "phi", "phn", "pi", "pl", "pon", "pra", "pro", "ps", "pt", "qu", "raj", "rap", "rar", "rm", "rn", "ro", "roa", "rof", "rom", "ru", "rup", "rw", "rwk", "sa", "sad", "sah", "sai", "sal", "sam", "saq", "sas", "sat", "sba", "sbp", "sc", "scn", "sco", "sd", "se", "see", "seh", "sel", "sem", "ses", "sg", "sga", "sgn", "shi", "shn", "shu", "si", "sid", "sio", "sit", "sk", "sl", "sla", "sm", "sma", "smi", "smj", "smn", "sms", "sn", "snk", "so", "sog", "son", "sq", "sr", "srn", "srr", "ss", "ssa", "ssy", "st", "su", "suk", "sus", "sux", "sv", "sw", "swb", "syc", "syr", "ta", "tai", "te", "tem", "teo", "ter", "tet", "tg", "th", "ti", "tig", "tiv", "tk", "tkl", "tlh", "tli", "tmh", "tn", "to", "tog", "tpi", "tr", "trv", "ts", "tsi", "tt", "tum", "tup", "tut", "tvl", "tw", "twq", "ty", "tyv", "tzm", "udm", "ug", "uga", "uk", "umb", "und", "ur", "uz", "vai", "ve", "vi", "vo", "vot", "vun", "wa", "wae", "wak", "wal", "war", "was", "wen", "wo", "xal", "xh", "xog", "yao", "yap", "yav", "ybb", "yi", "yo", "ypk", "yue", "za", "zap", "zbl", "zen", "zh", "znd", "zu", "zun", "zxx", "zza"};
        s = new String[]{"in", "iw", "ji", "jw", "mo", "sh"};
        t = new String[]{"aar", "abk", "ace", "ach", "ada", "ady", "ave", "aeb", "afr", "afh", "agq", "ain", "aka", "akk", "akz", "ale", "aln", "alt", "amh", "arg", "ang", "anp", "ara", "arc", "arn", "aro", "arp", "arq", "ars", "arw", "ary", "arz", "asm", "asa", "ase", "ast", "ava", "avk", "awa", "aym", "aze", "bak", "bal", "ban", "bar", "bas", "bax", "bbc", "bbj", "bel", "bej", "bem", "bew", "bez", "bfd", "bfq", "bul", "bgc", "bgn", "bho", "bis", "bik", "bin", "bjn", "bkm", "bla", "bam", "ben", "bod", "bpy", "bqi", "bre", "bra", "brh", "brx", "bos", "bss", "bua", "bug", "bum", "byn", "byv", "cat", "cad", "car", "cay", "cch", "ccp", "che", "ceb", "cgg", "cha", "chb", "chg", "chk", "chm", "chn", "cho", "chp", "chr", "chy", "ckb", "cos", "cop", "cps", "cre", "crh", "ces", "csb", "chu", "chv", "cym", "dan", "dak", "dar", "dav", "day", "deu", "del", "den", "dgr", "din", "dje", "doi", "dra", "dsb", "dua", "dum", "div", "dyo", "dyu", "dzo", "dzg", "ebu", "ewe", "efi", "egy", "eka", "ell", "elx", "eng", "enm", "epo", "spa", "est", "eus", "ewo", "fas", "fan", "fat", "ful", "fin", "fil", "fiu", "fij", "fao", "fon", "fra", "frm", "fro", "frr", "frs", "fur", "fry", "gle", "gaa", "gay", "gba", "gla", "gem", "gez", "gil", "glg", "gmh", "grn", "goh", "gon", "gor", "got", "grb", "grc", "gsw", "guj", "guz", "glv", "gwi", "hau", "hai", "haw", "heb", "hin", "hil", "him", "hit", "hmn", "hmo", "hrv", "hsb", "hat", "hun", "hup", "hye", "her", "ina", "iba", "ibb", "ind", "ile", "ibo", "iii", "ijo", "ipk", "ilo", "inc", "ine", "inh", "ido", "ira", "iro", "isl", "ita", "iku", "jpn", "jbo", "jgo", "jmc", "jpr", "jrb", "jav", "kat", "kaa", "kab", "kac", "kaj", "kam", "kar", "kaw", "kbd", "kbl", "kcg", "kde", "kea", "kfo", "kon", "kha", "khi", "kho", "khq", "kik", "kua", "kaz", "kkj", "kal", "kln", "khm", "kmb", "kan", "kor", "kok", "kos", "kpe", "kau", "krc", "krl", "kro", "kru", "kas", "ksb", "ksf", "ksh", "kur", "kum", "kut", "kom", "cor", "kir", "lat", "lad", "lag", "lah", "lam", "ltz", "lez", "lug", "lim", "lkt", "lin", "lao", "lol", "loz", "lit", "lub", "lua", "lui", "lun", "luo", "lus", "luy", "lav", "mad", "maf", "mag", "mai", "mak", "man", "map", "mas", "mde", "mdf", "mdr", "men", "mer", "mfe", "mlg", "mga", "mgh", "mgo", "mah", "mri", "mic", "min", "mis", "mkd", "mkh", "mal", "mon", "mnc", "mni", "mno", "moh", "mos", "mar", "msa", "mlt", "mua", "mul", "mun", "mus", "mwl", "mwr", "mya", "mye", "myn", "myv", "nau", "nah", "nai", "nap", "naq", "nob", "nde", "nds", "nep", "new", "ndo", "nia", "nic", "niu", "nld", "nmg", "nno", "nnh", "nor", "nog", "non", "nqo", "nbl", "nso", "nub", "nus", "nav", "nwc", "nya", "nym", "nyn", "nyo", "nzi", "oci", "oji", "orm", "ori", "oss", "osa", "ota", "oto", "pan", "paa", "pag", "pal", "pam", "pap", "pau", "peo", "phi", "phn", "pli", "pol", "pon", "pra", "pro", "pus", "por", "que", "raj", "rap", "rar", "roh", "run", "ron", "roa", "rof", "rom", "rus", "rup", "kin", "rwk", "san", "sad", "sah", "sai", "sal", "sam", "saq", "sas", "sat", "sba", "sbp", "srd", "scn", "sco", "snd", "sme", "see", "seh", "sel", "sem", "ses", "sag", "sga", "sgn", "shi", "shn", "shu", "sin", "sid", "sio", "sit", "slk", "slv", "sla", "smo", "sma", "smi", "smj", "smn", "sms", "sna", "snk", "som", "sog", "son", "sqi", "srp", "srn", "srr", "ssw", "ssa", "ssy", "sot", "sun", "suk", "sus", "sux", "swe", "swa", "swb", "syc", "syr", "tam", "tai", "tel", "tem", "teo", "ter", "tet", "tgk", "tha", "tir", "tig", "tiv", "tuk", "tkl", "tlh", "tli", "tmh", "tsn", "ton", "tog", "tpi", "tur", "trv", "tso", "tsi", "tat", "tum", "tup", "tut", "tvl", "twi", "twq", "tah", "tyv", "tzm", "udm", "uig", "uga", "ukr", "umb", "und", "urd", "uzb", "vai", "ven", "vie", "vol", "vot", "vun", "wln", "wae", "wak", "wal", "war", "was", "wen", "wol", "xal", "xho", "xog", "yao", "yap", "yav", "ybb", "yid", "yor", "ypk", "yue", "zha", "zap", "zbl", "zen", "zho", "znd", "zul", "zun", "zxx", "zza"};
        u = new String[]{"ind", "heb", "yid", "jaw", "ron", "srp"};
        v = new String[]{"AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DG", "DJ", "DK", "DM", "DO", "DZ", "EA", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "IC", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KP", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "XK", "YE", "YT", "ZA", "ZM", "ZW"};
        w = new String[]{"AN", "BU", "CS", "FX", "RO", "SU", "TP", "YD", "YU", "ZR"};
        x = new String[]{"AND", "ARE", "AFG", "ATG", "AIA", "ALB", "ARM", "AGO", "ATA", "ARG", "ASM", "AUT", "AUS", "ABW", "ALA", "AZE", "BIH", "BRB", "BGD", "BEL", "BFA", "BGR", "BHR", "BDI", "BEN", "BLM", "BMU", "BRN", "BOL", "BES", "BRA", "BHS", "BTN", "BVT", "BWA", "BLR", "BLZ", "CAN", "CCK", "COD", "CAF", "COG", "CHE", "CIV", "COK", "CHL", "CMR", "CHN", "COL", "CRI", "CUB", "CPV", "CUW", "CXR", "CYP", "CZE", "DEU", "DGA", "DJI", "DNK", "DMA", "DOM", "DZA", "XEA", "ECU", "EST", "EGY", "ESH", "ERI", "ESP", "ETH", "FIN", "FJI", "FLK", "FSM", "FRO", "FRA", "GAB", "GBR", "GRD", "GEO", "GUF", "GGY", "GHA", "GIB", "GRL", "GMB", "GIN", "GLP", "GNQ", "GRC", "SGS", "GTM", "GUM", "GNB", "GUY", "HKG", "HMD", "HND", "HRV", "HTI", "HUN", "XIC", "IDN", "IRL", "ISR", "IMN", "IND", "IOT", "IRQ", "IRN", "ISL", "ITA", "JEY", "JAM", "JOR", "JPN", "KEN", "KGZ", "KHM", "KIR", "COM", "KNA", "PRK", "KOR", "KWT", "CYM", "KAZ", "LAO", "LBN", "LCA", "LIE", "LKA", "LBR", "LSO", "LTU", "LUX", "LVA", "LBY", "MAR", "MCO", "MDA", "MNE", "MAF", "MDG", "MHL", "MKD", "MLI", "MMR", "MNG", "MAC", "MNP", "MTQ", "MRT", "MSR", "MLT", "MUS", "MDV", "MWI", "MEX", "MYS", "MOZ", "NAM", "NCL", "NER", "NFK", "NGA", "NIC", "NLD", "NOR", "NPL", "NRU", "NIU", "NZL", "OMN", "PAN", "PER", "PYF", "PNG", "PHL", "PAK", "POL", "SPM", "PCN", "PRI", "PSE", "PRT", "PLW", "PRY", "QAT", "REU", "ROU", "SRB", "RUS", "RWA", "SAU", "SLB", "SYC", "SDN", "SWE", "SGP", "SHN", "SVN", "SJM", "SVK", "SLE", "SMR", "SEN", "SOM", "SUR", "SSD", "STP", "SLV", "SXM", "SYR", "SWZ", "TCA", "TCD", "ATF", "TGO", "THA", "TJK", "TKL", "TLS", "TKM", "TUN", "TON", "TUR", "TTO", "TUV", "TWN", "TZA", "UKR", "UGA", "UMI", "USA", "URY", "UZB", "VAT", "VCT", "VEN", "VGB", "VIR", "VNM", "VUT", "WLF", "WSM", "XKK", "YEM", "MYT", "ZAF", "ZMB", "ZWE"};
        y = new String[]{"ANT", "BUR", "SCG", "FXX", "ROM", "SUN", "TMP", "YMD", "YUG", "ZAR"};
        z = new r06(new w76((byte) 2));
        A = new sf(1022);
    }

    public static final void A(yv3 yv3Var) {
        md2.q.getClass();
        n22 n22Var = at4.Z;
        ArrayList arrayList = new ArrayList(xv0.Z(n22Var, 10));
        w1 w1Var = new w1(n22Var, (byte) 0);
        while (w1Var.hasNext()) {
            arrayList.add(((at4) w1Var.next()).X);
        }
    }

    public static final z47 B(yv3 yv3Var) {
        kd2 kd2Var = md2.e;
        kd2Var.getClass();
        n22 n22Var = ex4.i0;
        ArrayList arrayList = new ArrayList(xv0.Z(n22Var, 10));
        w1 w1Var = new w1(n22Var, (byte) 0);
        while (w1Var.hasNext()) {
            arrayList.add(((ex4) w1Var.next()).X);
        }
        return new z47(yv3Var, kd2Var, n22Var, arrayList);
    }

    public static void C(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static void F(z47 z47Var, z47 z47Var2, z47 z47Var3, mj0 mj0Var) {
        int[] iArr = (int[]) z47Var3.Y;
        int[] iArr2 = (int[]) z47Var3.Z;
        int[] iArr3 = (int[]) mj0Var.Y;
        int[] iArr4 = (int[]) mj0Var.Z;
        zc1.m((int[]) z47Var.Z, (int[]) z47Var.Y, iArr2, iArr);
        zc1.m((int[]) z47Var2.Z, (int[]) z47Var2.Y, iArr4, iArr3);
        zc1.a0(iArr, iArr3, iArr);
        zc1.a0(iArr2, iArr4, iArr2);
        zc1.a0((int[]) z47Var.g0, (int[]) z47Var2.g0, iArr3);
        zc1.a0(iArr3, l, iArr3);
        int[] iArr5 = (int[]) z47Var.f0;
        zc1.k(iArr5, iArr5, iArr4);
        zc1.a0(iArr4, (int[]) z47Var2.f0, iArr4);
        zc1.m(iArr2, iArr, iArr2, iArr);
        zc1.m(iArr4, iArr3, iArr4, iArr3);
        zc1.a0(iArr, iArr2, (int[]) z47Var3.g0);
        zc1.a0(iArr3, iArr4, (int[]) z47Var3.f0);
        zc1.a0(iArr, iArr3, iArr);
        zc1.a0(iArr2, iArr4, iArr2);
    }

    public static void G(y5 y5Var, z47 z47Var) {
        zc1.u(0, 0, (int[]) y5Var.Y, (int[]) z47Var.Y);
        zc1.u(0, 0, (int[]) y5Var.Z, (int[]) z47Var.Z);
        zc1.u(0, 0, (int[]) y5Var.g0, (int[]) z47Var.f0);
        zc1.a0((int[]) y5Var.f0, (int[]) y5Var.h0, (int[]) z47Var.g0);
    }

    public static void H(y5 y5Var) {
        int[] iArr = (int[]) y5Var.Y;
        int[] iArr2 = (int[]) y5Var.Z;
        int[] iArr3 = (int[]) y5Var.g0;
        int[] iArr4 = (int[]) y5Var.f0;
        int[] iArr5 = (int[]) y5Var.h0;
        zc1.k(iArr, iArr2, iArr4);
        zc1.k0(iArr, iArr);
        zc1.k0(iArr2, iArr2);
        zc1.k0(iArr3, iArr3);
        zc1.k(iArr3, iArr3, iArr3);
        zc1.m(iArr, iArr2, iArr5, iArr2);
        zc1.k0(iArr4, iArr4);
        zc1.l0(iArr5, iArr4, iArr4);
        zc1.k(iArr3, iArr2, iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = i4 + (i3 >> 26);
        int i12 = i6 + (i5 >> 26);
        int i13 = i9 + (i8 >> 26);
        int i14 = iArr[9] + (i10 >> 26);
        int i15 = (i5 & 67108863) + (i11 >> 25);
        int i16 = i7 + (i12 >> 25);
        int i17 = (i10 & 67108863) + (i13 >> 25);
        int i18 = ((i14 >> 25) * 38) + i2;
        int i19 = (i3 & 67108863) + (i18 >> 26);
        int i20 = (i8 & 67108863) + (i16 >> 26);
        iArr[0] = i18 & 67108863;
        iArr[1] = i19 & 67108863;
        iArr[2] = (i11 & 33554431) + (i19 >> 26);
        iArr[3] = i15 & 67108863;
        iArr[4] = (i12 & 33554431) + (i15 >> 26);
        iArr[5] = i16 & 67108863;
        iArr[6] = i20 & 67108863;
        iArr[7] = (i13 & 33554431) + (i20 >> 26);
        iArr[8] = i17 & 67108863;
        iArr[9] = (i14 & 33554431) + (i17 >> 26);
        zc1.a0(iArr, iArr2, iArr3);
        zc1.a0(iArr, iArr4, iArr);
        zc1.a0(iArr2, iArr5, iArr2);
    }

    public static void I(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        byte b2 = (byte) (bArr2[31] & 127);
        bArr2[31] = b2;
        bArr2[31] = (byte) (b2 | 64);
    }

    public static final String J(gk2 gk2Var) {
        gk2Var.getClass();
        List<v15> listF = gk2.f(gk2Var);
        StringBuilder sb = new StringBuilder();
        for (v15 v15Var : listF) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(K(v15Var));
        }
        return sb.toString();
    }

    public static String K(v15 v15Var) {
        v15Var.getClass();
        String strB = v15Var.b();
        strB.getClass();
        if (!cy3.a.contains(strB)) {
            for (int i2 = 0; i2 < strB.length(); i2++) {
                char cCharAt = strB.charAt(i2);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            if (strB.length() != 0 && Character.isJavaIdentifierStart(strB.codePointAt(0))) {
                return strB;
            }
        }
        return "`".concat(strB).concat("`");
    }

    public static final void L(yv3 yv3Var, ld2 ld2Var) {
        n22 n22Var = jk6.Y;
        ArrayList arrayList = new ArrayList(xv0.Z(n22Var, 10));
        w1 w1Var = new w1(n22Var, (byte) 0);
        while (w1Var.hasNext()) {
            arrayList.add(new id2(ld2Var, ((jk6) w1Var.next()).ordinal()));
        }
    }

    public static void M(SnackbarHostActivity snackbarHostActivity, int i2) {
        snackbarHostActivity.getClass();
        int i3 = zx2.B;
        CoordinatorLayout host = snackbarHostActivity.A().getSu.happ.proxyutility.dto.MetaParams.HOST java.lang.String();
        String string = snackbarHostActivity.getString(i2);
        string.getClass();
        k42.g(snackbarHostActivity, host, string, my2.Y, d02.X, i(snackbarHostActivity, 0.0f), 64);
    }

    public static void N(SnackbarHostActivity snackbarHostActivity, String str, List list, int i2) {
        if ((i2 & 2) != 0) {
            list = d02.X;
        }
        List list2 = list;
        snackbarHostActivity.getClass();
        int i3 = zx2.B;
        k42.g(snackbarHostActivity, snackbarHostActivity.A().getSu.happ.proxyutility.dto.MetaParams.HOST java.lang.String(), str, my2.Y, list2, i(snackbarHostActivity, 0.0f), 64);
    }

    public static void O(SnackbarHostActivity snackbarHostActivity, int i2) {
        int i3 = zx2.B;
        CoordinatorLayout host = snackbarHostActivity.A().getSu.happ.proxyutility.dto.MetaParams.HOST java.lang.String();
        String string = snackbarHostActivity.getString(i2);
        string.getClass();
        k42.g(snackbarHostActivity, host, string, my2.Z, null, i(snackbarHostActivity, 0.0f), 80);
    }

    public static void P(SnackbarHostActivity snackbarHostActivity, String str) {
        int i2 = zx2.B;
        k42.g(snackbarHostActivity, snackbarHostActivity.A().getSu.happ.proxyutility.dto.MetaParams.HOST java.lang.String(), str, my2.Z, null, i(snackbarHostActivity, 0.0f), 80);
    }

    public static void Q(SnackbarHostActivity snackbarHostActivity, int i2) {
        snackbarHostActivity.getClass();
        int i3 = zx2.B;
        CoordinatorLayout host = snackbarHostActivity.A().getSu.happ.proxyutility.dto.MetaParams.HOST java.lang.String();
        String string = snackbarHostActivity.getString(i2);
        string.getClass();
        k42.g(snackbarHostActivity, host, string, my2.X, null, i(snackbarHostActivity, 0.0f), 80);
    }

    public static void R(SnackbarHostActivity snackbarHostActivity, String str) {
        snackbarHostActivity.getClass();
        int i2 = zx2.B;
        k42.g(snackbarHostActivity, snackbarHostActivity.A().getSu.happ.proxyutility.dto.MetaParams.HOST java.lang.String(), str, my2.X, null, i(snackbarHostActivity, 0.0f), 80);
    }

    public static final Rect S(lf3 lf3Var) {
        return new Rect(lf3Var.a, lf3Var.b, lf3Var.c, lf3Var.d);
    }

    public static final RectF T(s86 s86Var) {
        return new RectF(s86Var.a, s86Var.b, s86Var.c, s86Var.d);
    }

    public static nl3 U(zi8 zi8Var, boolean z2, j54 j54Var, int i2) {
        boolean z3 = (i2 & 1) != 0 ? false : z2;
        boolean z4 = (i2 & 2) == 0;
        if ((i2 & 4) != 0) {
            j54Var = null;
        }
        return new nl3(zi8Var, z4, z3, j54Var != null ? w45.U(j54Var) : null, 34);
    }

    public static final s86 V(RectF rectF) {
        return new s86(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final z47 W(yv3 yv3Var) {
        kd2 kd2Var = md2.d;
        kd2Var.getClass();
        n22 n22Var = gz8.i0;
        ArrayList arrayList = new ArrayList(xv0.Z(n22Var, 10));
        w1 w1Var = new w1(n22Var, (byte) 0);
        while (w1Var.hasNext()) {
            arrayList.add(((gz8) w1Var.next()).X);
        }
        return new z47(yv3Var, kd2Var, n22Var, arrayList);
    }

    public static final void a(dr2 dr2Var, dn2 dn2Var, o87 o87Var, lp2 lp2Var, int i2) {
        dr2Var.getClass();
        dn2Var.getClass();
        lp2Var.X(-1245005652);
        y05 y05VarO = i21.o(dr2Var.d, lp2Var);
        boolean z2 = (((i2 & 14) ^ 6) > 4 && lp2Var.h(dr2Var)) || (i2 & 6) == 4;
        Object objK = lp2Var.K();
        if (z2 || objK == zz0.a) {
            d0 d0Var = new d0(1, dr2Var, dr2.class, "onUiIntent", "onUiIntent(Lsu/happ/proxyutility/feature/routing/geo_file_download/GeoFileDownloadUiIntent;)V", 0, (byte) 10);
            lp2Var.g0(d0Var);
            objK = d0Var;
        }
        int i3 = i2 >> 3;
        vr3.d(dn2Var, o87Var, false, false, false, false, jm4.U(-847890831, new mq2(dr2Var, (pv3) objK, dn2Var, y05VarO, (byte) 0), lp2Var), lp2Var, (i3 & 896) | (i3 & 14) | 12582912 | (i3 & 112), 120);
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new g8(dr2Var, dn2Var, o87Var, i2);
        }
    }

    public static final void b(kx4 kx4Var, dn2 dn2Var, lp2 lp2Var, int i2) {
        dn2Var.getClass();
        lp2Var.X(538328755);
        int i3 = (lp2Var.f(kx4Var) ? 4 : 2) | i2 | (lp2Var.h(dn2Var) ? 32 : 16);
        byte b2 = 1;
        if (lp2Var.N(i3 & 1, (i3 & 19) != 18)) {
            ox1 ox1Var = ep.z;
            kx4 kx4VarZ = os4.z(vj8.x(u15.f(kx4Var, ((dp) lp2Var.j(ox1Var)).i.b, u70.e), false, null, null, null, dn2Var, lp2Var, 31), 0.0f, 12.0f, 1);
            xr4 xr4VarC = g80.c(pz2.Z, false);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4VarZ);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, xr4VarC);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
            pn7.l(lp2Var);
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            os4.a(u28.p(q36.icon_share, lp2Var), l80.a(b.g(hx4.X, 30.0f), pz2.i0), vj8.j0(y46.logcat_share, lp2Var), ((dp) lp2Var.j(ox1Var)).h.c, lp2Var, 0, 0);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new lw2(kx4Var, dn2Var, i2, b2);
        }
    }

    public static final void c(za3 za3Var, dn2 dn2Var, o87 o87Var, lp2 lp2Var, int i2) {
        boolean z2;
        za3Var.getClass();
        dn2Var.getClass();
        lp2Var.X(786518188);
        y05 y05VarO = i21.o(za3Var.d, lp2Var);
        byte b2 = 0;
        byte b3 = 1;
        boolean z3 = (((i2 & 14) ^ 6) > 4 && lp2Var.h(za3Var)) || (i2 & 6) == 4;
        Object objK = lp2Var.K();
        Object obj = zz0.a;
        if (z3 || objK == obj) {
            Object d0Var = new d0(1, za3Var, za3.class, "onUiIntent", "onUiIntent(Lsu/happ/proxyutility/feature/app_update/IncomingUpdateUiIntent;)V", 0, (byte) 15);
            lp2Var.g0(d0Var);
            objK = d0Var;
        }
        pv3 pv3Var = (pv3) objK;
        Object obj2 = r2.f;
        Object obj3 = (gn2) pv3Var;
        int i3 = i2 << 3;
        obj2.getClass();
        obj3.getClass();
        Object obj4 = (Context) lp2Var.j(pc.b);
        boolean zH = ((((i3 & 896) ^ 384) > 256 && lp2Var.f(dn2Var)) || (i3 & 384) == 256) | lp2Var.h(obj2) | lp2Var.h(obj4) | lp2Var.f(obj3);
        Object objK2 = lp2Var.K();
        if (zH || objK2 == obj) {
            Object piVar = new pi(obj2, dn2Var, obj4, obj3, null, (byte) 11);
            lp2Var.g0(piVar);
            objK2 = piVar;
        }
        u70.j(obj2, obj4, (rn2) objK2, lp2Var);
        ja3 ja3Var = (ja3) y05VarO.getValue();
        if (ja3Var instanceof ia3) {
            z2 = true;
        } else if (ja3Var instanceof ha3) {
            z2 = ((ha3) ja3Var).b;
        } else if (ja3Var instanceof ga3) {
            z2 = ((ga3) ja3Var).c;
        } else {
            if (!(ja3Var instanceof fa3)) {
                b61.c();
                return;
            }
            z2 = ((fa3) ja3Var).a;
        }
        boolean z4 = !z2;
        boolean zF = lp2Var.f(pv3Var);
        Object objK3 = lp2Var.K();
        if (zF || objK3 == obj) {
            objK3 = new aa3(pv3Var, b2);
            lp2Var.g0(objK3);
        }
        int i4 = i2 >> 3;
        vr3.d((dn2) objK3, o87Var, z4, false, false, false, jm4.U(-614193743, new fx2(y05VarO, pv3Var, b3), lp2Var), lp2Var, (i4 & 112) | 12607488 | (i4 & 896), 96);
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new g8(za3Var, dn2Var, o87Var, i2);
        }
    }

    public static final long d(int i2) {
        long j2 = ((long) i2) << 32;
        int i3 = ax3.O;
        return j2;
    }

    public static final void e(j2 j2Var, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i2) {
        j2Var.getClass();
        gn2Var.getClass();
        lp2Var.X(-193585641);
        int i3 = i2 | (lp2Var.f(j2Var) ? 4 : 2) | (lp2Var.h(gn2Var) ? 32 : 16);
        if (lp2Var.N(i3 & 1, (i3 & 147) != 146)) {
            FillElement fillElement = b.a;
            kx4 kx4VarE = g33.e(kx4Var);
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objK = lp2Var.K();
            if (z2 || objK == zz0.a) {
                objK = new sn((Object) j2Var, (Object) gn2Var, (Object) fillElement, (byte) 19);
                lp2Var.g0(objK);
            }
            jb5.a(kx4VarE, null, 0.0f, null, null, null, null, false, null, false, (gn2) objK, lp2Var, 0, 2046);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new fh((Object) j2Var, (Object) gn2Var, kx4Var, i2, (byte) 13);
        }
    }

    public static final em6 f(float f2, float f3, float f4, float f5, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new em6(f2, f3, f4, f5, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static int g(cb0 cb0Var, boolean z2) {
        int i2 = cb0Var.Y;
        int i3 = cb0Var.Z;
        int i4 = z2 ? i3 : i2;
        if (!z2) {
            i2 = i3;
        }
        byte[][] bArr = (byte[][]) cb0Var.f0;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte b2 = -1;
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                byte b3 = z2 ? bArr[i6][i8] : bArr[i8][i6];
                if (b3 == b2) {
                    i7++;
                } else {
                    if (i7 >= 5) {
                        i5 += i7 - 2;
                    }
                    i7 = 1;
                    b2 = b3;
                }
            }
            if (i7 >= 5) {
                i5 = (i7 - 2) + i5;
            }
        }
        return i5;
    }

    public static final void h(xw8 xw8Var, xd6 xd6Var, g94 g94Var) {
        xd6Var.getClass();
        g94Var.getClass();
        pv6 pv6Var = (pv6) xw8Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (pv6Var == null || pv6Var.Z) {
            return;
        }
        pv6Var.g(xd6Var, g94Var);
        o84 o84Var = g94Var.i;
        if (o84Var == o84.Y || o84Var.compareTo(o84.f0) >= 0) {
            xd6Var.H();
        } else {
            g94Var.a(new jf1((Object) g94Var, (Object) xd6Var, (byte) 3));
        }
    }

    public static final int i(BaseActivity baseActivity, float f2) {
        baseActivity.getClass();
        Integer numValueOf = Integer.valueOf(baseActivity.J0);
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        return (numValueOf != null ? numValueOf.intValue() : (int) TypedValue.applyDimension(1, 40.0f, baseActivity.getResources().getDisplayMetrics())) + ((int) TypedValue.applyDimension(1, f2, baseActivity.getResources().getDisplayMetrics()));
    }

    public static final void j(x39 x39Var, String str) {
        a59 a59VarB;
        WorkDatabase workDatabase = x39Var.k0;
        workDatabase.getClass();
        n49 n49VarX = workDatabase.x();
        pi1 pi1VarR = workDatabase.r();
        ArrayList arrayListN = i21.N(str);
        arrayListN.addAll(w51.B(pi1VarR, str));
        ArrayList<String> arrayList = new ArrayList();
        Iterator it = arrayListN.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            u39 u39VarB = n49VarX.b((String) next);
            if (u39VarB != null ? !u39VarB.a() : false) {
                arrayList.add(next);
            }
        }
        n49 n49VarX2 = x39Var.k0.x();
        for (String str2 : arrayList) {
            n49VarX2.getClass();
            str2.getClass();
            ((Number) u15.G(n49VarX2.a, false, true, new nm7(str2, (byte) 11))).intValue();
        }
        fv5 fv5Var = x39Var.n0;
        fv5Var.getClass();
        synchronized (fv5Var.k) {
            lh4.P0().getClass();
            fv5Var.i.add(str);
            a59VarB = fv5Var.b(str);
        }
        fv5.d(a59VarB, 1);
        Iterator it2 = x39Var.m0.iterator();
        while (it2.hasNext()) {
            ((xw6) it2.next()).d(str);
        }
        x39Var.j0.getClass();
    }

    public static z47 k(z47 z47Var, bt0 bt0Var, ta6 ta6Var, int i2) {
        if ((i2 & 2) != 0) {
            ta6Var = null;
        }
        z47Var.getClass();
        return new z47((c6) z47Var.Y, ta6Var != null ? new xm0(z47Var, bt0Var, ta6Var, 0) : (ki8) z47Var.Z, x97.P(w74.Y, new c3((Object) z47Var, (Object) bt0Var, (byte) 4)));
    }

    public static final li5 l(List list) {
        ea6 ea6Var = new ea6();
        d02 d02Var = d02.X;
        ea6Var.X = new li5(d02Var, d02Var);
        ArrayList arrayList = new ArrayList();
        Iterator it = new dq4(list).iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) ((qk6) it).Y;
            if (!listIterator.hasPrevious()) {
                m(arrayList, ea6Var);
                return (li5) ea6Var.X;
            }
            li5 li5Var = (li5) listIterator.previous();
            if (li5Var.b.isEmpty()) {
                arrayList.add(li5Var.a);
            } else {
                m(arrayList, ea6Var);
                ea6Var.X = o(li5Var, (li5) ea6Var.X);
            }
        }
    }

    public static final void m(ArrayList arrayList, ea6 ea6Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        gb4 gb4VarR = i21.r();
        Iterator it = new rk6(arrayList).iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) ((qk6) it).Y;
            if (!listIterator.hasPrevious()) {
                ea6Var.X = o(new li5(i21.j(gb4VarR), d02.X), (li5) ea6Var.X);
                arrayList.clear();
                return;
            }
            gb4VarR.addAll((List) listIterator.previous());
        }
    }

    public static final li5 n(List list, ArrayList arrayList, ArrayList arrayList2, li5 li5Var) {
        List list2 = li5Var.a;
        ki5 ki5Var = (ki5) wv0.t0(list2);
        gb4 gb4VarR = i21.r();
        gb4VarR.addAll(list);
        if (arrayList == null) {
            gb4VarR.addAll(list2);
        } else if (ki5Var instanceof w75) {
            gb4VarR.add(new w75(wv0.H0(arrayList, ((w75) ki5Var).a)));
            int i2 = 1;
            int size = list2.size() - 1;
            if (1 <= size) {
                while (true) {
                    gb4VarR.add(list2.get(i2));
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            gb4VarR.add(new w75(arrayList));
            gb4VarR.addAll(list2);
        }
        gb4VarR.addAll(arrayList2);
        return new li5(i21.j(gb4VarR), li5Var.b);
    }

    public static final li5 o(li5 li5Var, li5 li5Var2) {
        List list;
        List listK;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = null;
        for (ki5 ki5Var : li5Var.a) {
            if (ki5Var instanceof w75) {
                if (arrayList3 != null) {
                    arrayList3.addAll(((w75) ki5Var).a);
                } else {
                    arrayList3 = new ArrayList(((w75) ki5Var).a);
                }
            } else if (ki5Var instanceof ul8) {
                arrayList2.add(ki5Var);
            } else {
                if (arrayList3 != null) {
                    arrayList.add(new w75(arrayList3));
                    arrayList.addAll(arrayList2);
                    arrayList2.clear();
                    arrayList3 = null;
                }
                arrayList.add(ki5Var);
            }
        }
        List list2 = li5Var.b;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            li5 li5VarO = o((li5) it.next(), li5Var2);
            if (li5VarO.a.isEmpty()) {
                listK = li5VarO.b;
                if (listK.isEmpty()) {
                    listK = i21.K(li5VarO);
                }
            } else {
                listK = i21.K(li5VarO);
            }
            bw0.d0(arrayList4, listK);
        }
        boolean zIsEmpty = arrayList4.isEmpty();
        List list3 = arrayList4;
        if (zIsEmpty) {
            if (!li5Var2.a.isEmpty()) {
                return n(arrayList, arrayList3, arrayList2, li5Var2);
            }
            list = li5Var2.b;
        }
        if ((arrayList3 != null || arrayList.isEmpty()) && (list3 == null || !list3.isEmpty())) {
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                if (wv0.t0(((li5) it2.next()).a) instanceof w75) {
                    ArrayList arrayList5 = new ArrayList(xv0.Z(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(n(d02.X, arrayList3, arrayList2, (li5) it3.next()));
                    }
                    return new li5(arrayList, arrayList5);
                }
            }
        }
        if (arrayList3 != null) {
            arrayList.add(new w75(arrayList3));
        }
        arrayList.addAll(arrayList2);
        return new li5(arrayList, list3);
    }

    public static void p(df dfVar, BlurMaskFilter blurMaskFilter, int i2) {
        long j2 = dw0.b;
        int i3 = (i2 & 8) != 0 ? 0 : 1;
        dfVar.f(j2);
        dfVar.e(3);
        dfVar.m(i3);
        dfVar.a.setMaskFilter(blurMaskFilter);
    }

    public static final z47 q(z47 z47Var, sm smVar) {
        z47Var.getClass();
        smVar.getClass();
        if (smVar.isEmpty()) {
            return z47Var;
        }
        return new z47((c6) z47Var.Y, (ki8) z47Var.Z, x97.P(w74.Y, new c3((Object) z47Var, (Object) smVar, (byte) 5)));
    }

    public static boolean r(View view, NestedScrollView nestedScrollView) {
        view.getClass();
        view.post(new sc4((Object) nestedScrollView, (Object) view, (byte) 10));
        return view.requestFocus();
    }

    public static boolean s(ScrollView scrollView, View view) {
        scrollView.getClass();
        view.getClass();
        view.post(new sc4((Object) scrollView, (Object) view, (byte) 11));
        return view.requestFocus();
    }

    public static int t(String str, String[] strArr) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (str.equals(strArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void w(nx4 nx4Var) {
        if (!((jx4) nx4Var).X.p0 || nx4Var.f() == null) {
            return;
        }
        c2.m();
    }

    public static void x(List list) throws ug1 {
        if (list.isEmpty()) {
            return;
        }
        int i2 = 0;
        do {
            try {
                ((wg1) list.get(i2)).d();
                i2++;
            } catch (ug1 e2) {
                for (int i3 = i2 - 1; i3 >= 0; i3--) {
                    ((wg1) list.get(i3)).b();
                }
                throw e2;
            }
        } while (i2 < list.size());
    }

    public static void y(z47[] z47VarArr) {
        int length = z47VarArr.length;
        int[] iArr = new int[length * 10];
        int[] iArr2 = new int[10];
        zc1.u(0, 0, (int[]) z47VarArr[0].f0, iArr2);
        zc1.u(0, 0, iArr2, iArr);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= length) {
                break;
            }
            zc1.a0(iArr2, (int[]) z47VarArr[i3].f0, iArr2);
            zc1.u(0, i3 * 10, iArr2, iArr);
            i2 = i3;
        }
        zc1.k(iArr2, iArr2, iArr2);
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[8];
        zc1.u(0, 0, iArr2, iArr3);
        zc1.d0(iArr3);
        zc1.C(0, 0, iArr3, iArr4);
        zc1.C(5, 4, iArr3, iArr4);
        mb6.P(zc1.h, iArr4, iArr4);
        zc1.y(0, 0, iArr4, iArr2);
        zc1.y(4, 5, iArr4, iArr2);
        iArr2[9] = iArr2[9] & 16777215;
        int[] iArr5 = new int[10];
        while (i2 > 0) {
            int i4 = i2 - 1;
            zc1.u(i4 * 10, 0, iArr, iArr5);
            zc1.a0(iArr5, iArr2, iArr5);
            zc1.a0(iArr2, (int[]) z47VarArr[i2].f0, iArr2);
            zc1.u(0, 0, iArr5, (int[]) z47VarArr[i2].f0);
            i2 = i4;
        }
        zc1.u(0, 0, iArr2, (int[]) z47VarArr[0].f0);
    }

    public static final boolean z(em6 em6Var) {
        long j2 = em6Var.e;
        return (j2 >>> 32) == (4294967295L & j2) && j2 == em6Var.f && j2 == em6Var.g && j2 == em6Var.h;
    }

    public abstract void D(Throwable th);

    public abstract void E(z47 z47Var);

    public abstract int u();

    public abstract int v(int i2);
}
