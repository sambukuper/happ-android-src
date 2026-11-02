.class public final Lls2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final b:Lls2;


# instance fields
.field public final a:Lra;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lra;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lra;-><init>(BZ)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lls2;

    .line 13
    .line 14
    invoke-direct {v2, v0, v1}, Lls2;-><init>(Lra;Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    sput-object v2, Lls2;->b:Lls2;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Lra;Landroid/os/Looper;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lls2;->a:Lra;

    .line 5
    .line 6
    return-void
.end method
