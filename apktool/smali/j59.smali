.class public abstract Lj59;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Ls18;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ls18;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ls18;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lj59;->a:Ls18;

    .line 9
    .line 10
    return-void
.end method

.method public static a(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p0, Li59;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast p0, Li59;

    .line 7
    .line 8
    iget-object p0, p0, Li59;->a:Ljava/lang/Throwable;

    .line 9
    .line 10
    throw p0
.end method
