.class public final Lkv5;
.super Le1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljp0;
.implements Ln17;


# instance fields
.field public final g0:Lx90;


# direct methods
.method public constructor <init>(Ls61;Lx90;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Le1;-><init>(Ls61;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lkv5;->g0:Lx90;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Lq51;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lkv5;->g0:Lx90;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Ln17;->a(Lq51;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lkv5;->g0:Lx90;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ln17;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final iterator()Lq90;
    .locals 1

    .line 1
    iget-object p0, p0, Lkv5;->g0:Lx90;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lq90;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lq90;-><init>(Lx90;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final l(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    check-cast p1, Ljava/util/concurrent/CancellationException;

    .line 2
    .line 3
    iget-object v0, p0, Lkv5;->g0:Lx90;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, p1, v1}, Lx90;->e(Ljava/lang/Throwable;Z)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lrm3;->i(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final l0(Ljava/lang/Throwable;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lkv5;->g0:Lx90;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Lx90;->e(Ljava/lang/Throwable;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Le1;->f0:Ls61;

    .line 13
    .line 14
    invoke-static {p0, p1}, Lvr3;->F(Ls61;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final m(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lrm3;->isCancelled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    if-nez p1, :cond_1

    .line 9
    .line 10
    new-instance p1, Lcm3;

    .line 11
    .line 12
    invoke-virtual {p0}, Le1;->v()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {p1, v0, v1, p0}, Lcm3;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lrm3;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-virtual {p0, p1}, Lkv5;->l(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final m0(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ldn8;

    .line 2
    .line 3
    iget-object p0, p0, Lkv5;->g0:Lx90;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Lx90;->d(Ljava/lang/Throwable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final n()Lyr6;
    .locals 0

    .line 1
    iget-object p0, p0, Lkv5;->g0:Lx90;

    .line 2
    .line 3
    invoke-virtual {p0}, Lx90;->n()Lyr6;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final o()Lyr6;
    .locals 0

    .line 1
    iget-object p0, p0, Lkv5;->g0:Lx90;

    .line 2
    .line 3
    invoke-virtual {p0}, Lx90;->o()Lyr6;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final o0(Lf0;)V
    .locals 8

    .line 1
    iget-object v1, p0, Lkv5;->g0:Lx90;

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-wide v6, Lx90;->o0:J

    .line 7
    .line 8
    :cond_0
    sget-object v0, Liu;->a:Lsun/misc/Unsafe;

    .line 9
    .line 10
    sget-wide v2, Lx90;->o0:J

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    move-object v5, p1

    .line 14
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    invoke-virtual {v0, v1, v6, v7}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    :goto_0
    sget-object p0, Liu;->a:Lsun/misc/Unsafe;

    .line 28
    .line 29
    invoke-virtual {p0, v1, v6, v7}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    sget-object v4, Lz90;->q:Lz31;

    .line 34
    .line 35
    if-ne p0, v4, :cond_4

    .line 36
    .line 37
    sget-object v5, Lz90;->r:Lz31;

    .line 38
    .line 39
    :cond_2
    sget-object v0, Liu;->a:Lsun/misc/Unsafe;

    .line 40
    .line 41
    sget-wide v2, Lx90;->o0:J

    .line 42
    .line 43
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_3

    .line 48
    .line 49
    invoke-virtual {v1}, Lx90;->l()Ljava/lang/Throwable;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p1, p0}, Lf0;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    invoke-virtual {v0, v1, v6, v7}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-eq p0, v4, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_4
    sget-object p1, Lz90;->r:Lz31;

    .line 65
    .line 66
    if-ne p0, p1, :cond_5

    .line 67
    .line 68
    const-string p0, "Another handler was already registered and successfully invoked"

    .line 69
    .line 70
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_5
    const-string p1, "Another handler is already registered: "

    .line 75
    .line 76
    invoke-static {p0, p1}, Lb61;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final q()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lkv5;->g0:Lx90;

    .line 2
    .line 3
    invoke-virtual {p0}, Lx90;->q()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final r(Lq51;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lkv5;->g0:Lx90;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lx90;->r(Lq51;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final s(Lyw0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lkv5;->g0:Lx90;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lx90;->G(Lx90;Ls51;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
