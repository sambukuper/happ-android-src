.class public final Lgg1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lxk;


# static fields
.field public static final X:Lgg1;

.field public static final Y:Lte2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lgg1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lgg1;->X:Lgg1;

    .line 7
    .line 8
    new-instance v0, Lte2;

    .line 9
    .line 10
    const/high16 v1, 0x3f800000    # 1.0f

    .line 11
    .line 12
    const v2, 0x44bb8000    # 1500.0f

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lte2;-><init>(FF)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lgg1;->Y:Lte2;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final get(I)Lne2;
    .locals 0

    .line 1
    sget-object p0, Lgg1;->Y:Lte2;

    .line 2
    .line 3
    return-object p0
.end method
