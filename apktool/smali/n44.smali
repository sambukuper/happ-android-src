.class public final Ln44;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsm;


# instance fields
.field public final X:Lz47;

.field public final Y:Lvj3;

.field public final Z:Z

.field public final f0:Lvt1;


# direct methods
.method public constructor <init>(Lz47;Lvj3;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ln44;->X:Lz47;

    .line 11
    .line 12
    iput-object p2, p0, Ln44;->Y:Lvj3;

    .line 13
    .line 14
    iput-boolean p3, p0, Ln44;->Z:Z

    .line 15
    .line 16
    iget-object p1, p1, Lz47;->Y:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Lc6;

    .line 19
    .line 20
    iget-object p1, p1, Lc6;->f0:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Lve4;

    .line 23
    .line 24
    new-instance p2, Lf0;

    .line 25
    .line 26
    const/16 p3, 0x13

    .line 27
    .line 28
    invoke-direct {p2, p0, p3}, Lf0;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lve4;->c(Lgn2;)Lvt1;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Ln44;->f0:Lvt1;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final isEmpty()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ln44;->Y:Lvj3;

    .line 2
    .line 3
    invoke-interface {p0}, Lvj3;->getAnnotations()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    iget-object v0, p0, Ln44;->Y:Lvj3;

    .line 2
    .line 3
    invoke-interface {v0}, Lvj3;->getAnnotations()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-static {v1}, Lwv0;->l0(Ljava/lang/Iterable;)Lhu;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Ln44;->f0:Lvt1;

    .line 14
    .line 15
    invoke-static {v1, v2}, Lw27;->l0(Lu27;Lgn2;)Lmd8;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sget-object v2, Luj3;->a:Lv15;

    .line 20
    .line 21
    sget-object v2, Ltg7;->m:Lfk2;

    .line 22
    .line 23
    iget-object p0, p0, Ln44;->X:Lz47;

    .line 24
    .line 25
    invoke-static {v2, v0, p0}, Luj3;->a(Lfk2;Lvj3;Lz47;)Lpr5;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance v0, Lhu;

    .line 30
    .line 31
    const/4 v2, 0x5

    .line 32
    invoke-direct {v0, p0, v2}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x2

    .line 36
    new-array p0, p0, [Lu27;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    aput-object v1, p0, v2

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    aput-object v0, p0, v1

    .line 43
    .line 44
    invoke-static {p0}, Leu;->Y([Ljava/lang/Object;)Lu27;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, Lw27;->g0(Lu27;)Lsd2;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    new-instance v0, Lzx6;

    .line 53
    .line 54
    const/4 v1, 0x6

    .line 55
    invoke-direct {v0, v1}, Lzx6;-><init>(B)V

    .line 56
    .line 57
    .line 58
    new-instance v1, Lla2;

    .line 59
    .line 60
    invoke-direct {v1, p0, v2, v0}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 61
    .line 62
    .line 63
    new-instance p0, Lka2;

    .line 64
    .line 65
    invoke-direct {p0, v1}, Lka2;-><init>(Lla2;)V

    .line 66
    .line 67
    .line 68
    return-object p0
.end method

.method public final bridge k(Lfk2;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lz39;->y(Lsm;Lfk2;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final p(Lfk2;)Lgm;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ln44;->Y:Lvj3;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lvj3;->a(Lfk2;)Lja6;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    iget-object v2, p0, Ln44;->f0:Lvt1;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Lvt1;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lgm;

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-object v1

    .line 24
    :cond_1
    :goto_0
    sget-object v1, Luj3;->a:Lv15;

    .line 25
    .line 26
    iget-object p0, p0, Ln44;->X:Lz47;

    .line 27
    .line 28
    invoke-static {p1, v0, p0}, Luj3;->a(Lfk2;Lvj3;Lz47;)Lpr5;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method
