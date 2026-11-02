.class public final Lu45;
.super Lkb8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-static {}, Lu52;->c()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-direct {p0, v0, v1}, Lkb8;-><init>(Ljava/lang/Class;B)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lro3;Lt37;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lxw3;->e(Ljava/lang/Object;)Ljava/nio/file/Path;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/nio/file/Path;->toUri()Ljava/net/URI;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/net/URI;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p2, p0}, Lro3;->c1(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final f(Ljava/lang/Object;Lro3;Lt37;Lri8;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lxw3;->e(Ljava/lang/Object;)Ljava/nio/file/Path;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {}, Lu52;->c()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object p3, Lgr3;->i0:Lgr3;

    .line 10
    .line 11
    invoke-virtual {p4, p0, p3}, Lri8;->d(Ljava/lang/Object;Lgr3;)Lz76;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    iput-object p1, p3, Lz76;->f0:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {p4, p2, p3}, Lri8;->e(Lro3;Lz76;)Lz76;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {p0}, Ljava/nio/file/Path;->toUri()Ljava/net/URI;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/net/URI;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p2, p0}, Lro3;->c1(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p4, p2, p1}, Lri8;->f(Lro3;Lz76;)Lz76;

    .line 33
    .line 34
    .line 35
    return-void
.end method
