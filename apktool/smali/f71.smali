.class public final Lf71;
.super Lu61;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final Z:Lf71;

.field public static final f0:Lnf1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lf71;

    .line 2
    .line 3
    invoke-direct {v0}, Lu61;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf71;->Z:Lf71;

    .line 7
    .line 8
    sget-object v0, Ltp1;->a:Lnf1;

    .line 9
    .line 10
    sput-object v0, Lf71;->f0:Lnf1;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b1(Ls61;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lf71;->f0:Lnf1;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    xor-int/lit8 p0, p0, 0x1

    .line 11
    .line 12
    return p0
.end method
