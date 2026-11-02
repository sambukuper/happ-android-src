.class public final Ly64;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lne;


# direct methods
.method public constructor <init>(Lgn2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lne;

    .line 5
    .line 6
    invoke-direct {v0}, Lne;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ly64;->a:Lne;

    .line 10
    .line 11
    invoke-interface {p1, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static a(Ly64;Ljava/lang/Object;Lzy0;)V
    .locals 5

    .line 1
    iget-object p0, p0, Ly64;->a:Lne;

    .line 2
    .line 3
    new-instance v0, Lf63;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance v1, Lvj2;

    .line 8
    .line 9
    const/16 v2, 0xc

    .line 10
    .line 11
    invoke-direct {v1, p1, v2}, Lvj2;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :goto_0
    new-instance p1, Luh3;

    .line 17
    .line 18
    const/4 v2, 0x4

    .line 19
    invoke-direct {p1, v2}, Luh3;-><init>(B)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Ljf;

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    invoke-direct {v2, p2, v3}, Ljf;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    new-instance p2, Lzy0;

    .line 29
    .line 30
    const v3, -0x331bf287

    .line 31
    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    invoke-direct {p2, v3, v4, v2}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const/16 v2, 0x8

    .line 38
    .line 39
    invoke-direct {v0, v1, p1, p2, v2}, Lf63;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v4, v0}, Lne;->a(ILf63;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method
