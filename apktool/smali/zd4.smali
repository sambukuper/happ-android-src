.class public final Lzd4;
.super Lg1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lsc0;


# direct methods
.method public constructor <init>(Lsc0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzd4;->a:Lsc0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b()Lsc0;
    .locals 0

    .line 1
    iget-object p0, p0, Lzd4;->a:Lsc0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()Lh61;
    .locals 0

    .line 1
    sget-object p0, Lae4;->b:Leb3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d(Lld4;)Lh61;
    .locals 0

    .line 1
    check-cast p1, Lxd4;

    .line 2
    .line 3
    new-instance p0, Leb3;

    .line 4
    .line 5
    invoke-direct {p0}, Leb3;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Leb3;->f(Lxd4;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final f(Lh61;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Leb3;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Leb3;->i()Lxd4;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
